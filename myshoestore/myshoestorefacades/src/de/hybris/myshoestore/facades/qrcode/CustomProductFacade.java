package de.hybris.myshoestore.facades.qrcode;

import de.hybris.platform.basecommerce.enums.BarcodeType;
import de.hybris.platform.cmsfacades.data.MediaData;
import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.product.impl.DefaultProductFacade;
import de.hybris.platform.core.model.media.MediaModel;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.deeplink.model.media.BarcodeMediaModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.media.MediaService;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;

public class CustomProductFacade extends DefaultProductFacade<ProductModel> {
    private static final Logger LOG = Logger.getLogger(CustomProductFacade.class);

    @Resource(name = "mediaService")
    MediaService mediaService;

    @Resource(name = "mediaModelConverter")
    Converter<MediaModel, MediaData> mediaModelConverter;

    @Override
    public ProductData getProductForCodeAndOptions(final String code, final Collection<ProductOption> options) {
        final ProductModel productModel = getProductService().getProductForCode(code);

        try {
            if (null == productModel.getProductQRCode()) {

             // final BufferedImage QRImage = this.generateQRCodeImage("https://localhost:9002/myshoestorestorefront/en/USD/p/" + code);
                LOG.info("finished generateQRCodeImage  ");
                final String filePath = "productQRCode.png";
                final int size = 125;
                final File qrFile = new File(filePath);

                final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
              // ImageIO.write(QRImage, "png", outputStream); // Passing: ​(RenderedImage im, String formatName, OutputStream output)
                final InputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
                LOG.info("Created Input stream  ");
                final BarcodeMediaModel barcodeMediaModel = getModelService().create(BarcodeMediaModel.class);
                barcodeMediaModel.setCatalogVersion(productModel.getCatalogVersion());
                barcodeMediaModel.setCode("productQRCode" + productModel.getCode());
                barcodeMediaModel.setRealFileName("productQRCode" + productModel.getCode() + ".png");
                barcodeMediaModel.setBarcodeText("https://localhost:9002/myshoestorestorefront/en/USD/p/" + code);
                barcodeMediaModel.setBarcodeType(BarcodeType.QR);
                getModelService().save(barcodeMediaModel);
                getModelService().refresh(barcodeMediaModel);
                mediaService.setStreamForMedia(barcodeMediaModel, inputStream);

                final Collection<BarcodeMediaModel> barcodeMediaList = new ArrayList<>();
                barcodeMediaList.add(barcodeMediaModel);

                productModel.setProductQRCode(barcodeMediaModel);
                getModelService().saveAll(barcodeMediaModel, productModel);


                LOG.info("Created Barcode media model in  product ");
            }

        } catch (final Exception e) {
            e.printStackTrace();
        }
        final ProductData productData = getProductConverter().convert(productModel);
        final MediaData mediaData = mediaModelConverter.convert(productModel.getProductQRCode());
        productData.setProductQRCode(String.valueOf(mediaData));
        if (options != null) {
            getProductConfiguredPopulator().populate(productModel, productData, options);
        }

        return productData;
    }

  /*public static BufferedImage generateQRCodeImage(final String barcodeText) throws Exception {
        LOG.info("Inside generateQRCodeImage  ");
        final QRCodeWriter barcodeWriter = new QRCodeWriter();
        final BitMatrix bitMatrix = barcodeWriter.encode(barcodeText, BarcodeFormat.QR_CODE, 200, 200);

        return MatrixToImageWriter.toBufferedImage(bitMatrix);

    }*/
}









