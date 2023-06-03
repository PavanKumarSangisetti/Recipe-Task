package de.hybris.myshoestore.core.job;

import de.hybris.myshoestore.core.model.HLOrderExportCronJobModel;
import de.hybris.myshoestore.core.newcronjob.dao.service.HLAccessDataService;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.media.MediaService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class HLOrderExportJob extends AbstractJobPerformable<HLOrderExportCronJobModel> {

    private static final Logger LOGGER = Logger.getLogger(HLOrderExportJob.class);
    private static final SimpleDateFormat SDF= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" );

    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss'.csv'";
    private static final String DELIMITER=",";
    private static final String LINE_SEPARATOR="\n";
    @Resource
    private HLAccessDataService hLAccessDataService;
    @Resource
    private MediaService mediaService;

    @Override
    public PerformResult perform(HLOrderExportCronJobModel hlOrderExportModel) {
        if(null == hlOrderExportModel.getDateExport()){
            LOGGER.info("Missing field data: DateExport => process data for current day: {}");
            hlOrderExportModel.setDateExport(new Date());
        }
        try {

            List<OrderModel> orders = hLAccessDataService.getOrderDataByDate(hlOrderExportModel.getDateExport());


            String csvFileName = "OrderExport_" + (new SimpleDateFormat(DATE_FORMAT).format(hlOrderExportModel.getDateExport()));
            File file = generateCSV(csvFileName, orders);


            saveData(file, csvFileName, hlOrderExportModel);

        } catch (Exception ex){
            LOGGER.error("Error when processing export order data: {}", ex);
            return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);
        }
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    private void saveData(File file, String fileName, HLOrderExportCronJobModel hlOrderExportModel)
    {
        MediaModel mediaModel =null;
       try{
           mediaModel = mediaService.getMedia(fileName);
       }catch(UnknownIdentifierException ex){
          LOGGER.info("File {} is not existed. ");
           mediaModel = modelService.create(MediaModel.class);
           mediaModel.setCode(fileName);
           mediaModel.setRealFileName(fileName);
           mediaModel.setMime("txt/csv");
           modelService.save(mediaModel);

       }


        try(InputStream fileInputStream = new FileInputStream(file)) {
            mediaService.setStreamForMedia(mediaModel, fileInputStream);
        }catch(IOException e) {
            LOGGER.error("File is not found {}", e);
        }

            Collection<MediaModel> existingMedias =hlOrderExportModel.getExportMedia();
            List<MediaModel> newMedias= new ArrayList<>();
            if(CollectionUtils.isNotEmpty(existingMedias))
            {
                newMedias.addAll(existingMedias);
            }
            newMedias.add(mediaModel);

            hlOrderExportModel.setExportMedia(newMedias);
            modelService.save(hlOrderExportModel);

        }

    private File generateCSV(String fileName, List<OrderModel> orders) throws IOException
    {
        final String outputDir=System.getProperty("java.io.tmpdir");
        final String filePath=outputDir+"/"+ fileName;

        final File dir =new File(outputDir);

        if (!dir.exists())
        {
            dir.mkdirs();
        }

        final File csvFile=new File(filePath);
        csvFile.createNewFile();

        LOGGER.info("Csv file is created at: " + csvFile.getAbsolutePath());
        if(CollectionUtils.isNotEmpty(orders))
        {
            try(final FileWriter writer= new FileWriter(csvFile, StandardCharsets.UTF_8))
            {
                writerHeader(csvFile,writer);
                for (OrderModel model:orders)
                {
                    writer.write(model.getCode());
                    writer.write(DELIMITER);
                    writer.write(model.getUser().getUid());
                    writer.write(DELIMITER);
                    writer.write(String.valueOf(model.getTotalPrice()));
                    writer.write(DELIMITER);
                    writer.write(SDF.format(model.getModifiedtime()));
                    writer.write(LINE_SEPARATOR);

                }
            } catch (IOException ex)
            {
                LOGGER.error("Error when generate csv file: {}",ex);
            }
        }
        return csvFile;


    }

    private void writerHeader(File csvFile, FileWriter writer) throws IOException
    {
        writer.write("Code");
        writer.write(DELIMITER);
        writer.write("User ID");
        writer.write(DELIMITER);
        writer.write("Total Price");
        writer.write(DELIMITER);
        writer.write("Modified Time");
        writer.write(LINE_SEPARATOR);
    }
}
