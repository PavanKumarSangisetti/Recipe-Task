package de.hybris.myshoestore.facades.converterss.impl;

import de.hybris.myshoestore.core.cadburry.service.cadburryService;
import de.hybris.myshoestore.core.model.CadburryModel;
import de.hybris.myshoestore.facades.converterss.CadburryFacade;
import de.hybris.platform.commercefacades.user.data.CadburryData;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.myshoestore.facades.populators.CadburryPostPopulator;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class CadburryFacadeImpl implements CadburryFacade
{
    public static final Logger log = Logger.getLogger(CadburryFacadeImpl.class);
    private cadburryService CadburryService;
    private ModelService modelService;
    private CadburryPostPopulator cadburryPostPopulator;
    @Resource(name="cadburryDataConverter")
    private Converter<CadburryModel,CadburryData> cadburryDataConverter;

    public CadburryPostPopulator getCadburryPostPopulator() {
        return cadburryPostPopulator;
    }

    public void setCadburryPostPopulator(CadburryPostPopulator cadburryPostPopulator) {
        this.cadburryPostPopulator = cadburryPostPopulator;
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public cadburryService getCadburryService() {
        return CadburryService;
    }

    public void setcadburryService(final cadburryService CadburryService)
    {
        this.CadburryService = CadburryService;
    }
    @Override
    public List<CadburryData> getCadburryDetails()
    {
        final List<CadburryData> products = new ArrayList<CadburryData>();
        final List<CadburryModel> model= CadburryService.getCadburryDetails();
        final List<CadburryData> Cadburrydata=cadburryDataConverter.convertAll(model);
        products.addAll(Cadburrydata);
        return products;
    }

    @Override
    public void postCadburryDetails(CadburryData cadburryData) {
        final CadburryModel cadburryModel=getModelService().create(CadburryModel.class);
        getCadburryPostPopulator().populate(cadburryData,cadburryModel);
        getCadburryService().postCadburryDetails(cadburryModel);
    }

    @Override
    public List<CadburryData> getSpecificCadburryDetails(String products) {
        log.info("****Specific Cadburry Facade****");
        final List<CadburryData> cadburryData = new ArrayList<>();
        final List<CadburryModel> model= getCadburryService().getSpecificCadburrydetails(products);
        final List<CadburryData> cadburryData1 = cadburryDataConverter.convertAll(model);
        cadburryData.addAll(cadburryData1);

        return cadburryData;
    }

    @Override
    public void removeProduct(String products) {
        log.info("*****facade Remove*****");
        getCadburryService().removeProduct(products);

    }

    @Override
    public void updateProduct(String products, double price) {
        log.info("****Update Product Facade****");
        getCadburryService().updateProduct(products,price);

    }

}
