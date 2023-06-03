package de.hybris.myshoestore.core.cadburry.dao.impl;

import de.hybris.myshoestore.core.cadburry.dao.CadburryDao;
import de.hybris.myshoestore.core.model.CadburryModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;




import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

public class CadburryDaoImpl implements CadburryDao
{
    private static final Logger Log = Logger.getLogger(CadburryDaoImpl.class);
    private FlexibleSearchService flexibleSearchService;
    private ModelService modelService;

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
    {
        this.flexibleSearchService = flexibleSearchService;
    }

    @Override
    public List<CadburryModel> getCadburryDetails() {
        final String query="SELECT {PK} FROM {Cadburry}";
        final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query.toString());
        final SearchResult<CadburryModel> searchResult =  flexibleSearchService.search(searchQuery);
        return searchResult.getResult();
    }

    @Override
    public void postCadburryDetails(CadburryModel cadburryModel)
    {
        Log.info("*******CADBURRY POST***********");
        getModelService().save(cadburryModel);
    }

    @Override
    public List<CadburryModel> getSpecificCadburryDetails(String products) {
        Log.info("*******CADBURRY DAO IMPL***********");
        final Map<String, Object> params= new HashMap<String,Object>();
        final String query = "SELECT {PK} FROM {Cadburry} WHERE {products}=?products";
        params.put("products",products);
        final FlexibleSearchQuery serchQuery = new FlexibleSearchQuery(query.toString());
        serchQuery.addQueryParameters(params);
        final SearchResult searchResult = getFlexibleSearchService().search(serchQuery);
        return searchResult.getResult() ==null ? Collections.emptyList():searchResult.getResult();
    }

    @Override
    public void updateProduct(String products, double price) {
        Log.info("*************CADBURRY UPDATE DAO IMPL*************");
        validateParameterNotNull(price, "PRICE CAN'T BE EMPTY");
        for (CadburryModel cadburry: getSpecificCadburryDetails(products))
        {
            if (cadburry.getProducts().equals(products))
            {
                getModelService().setAttributeValue(cadburry,"Price", price);
                getModelService().save(cadburry);
                getModelService().refresh(cadburry);
            }
        }

    }

    @Override
    public void removeProduct(List<CadburryModel> cadburry) {
        Log.info("****** REMOVE PRODUCT DAO IMPL");
        validateParameterNotNull(cadburry,"Cadburry model cannot be Null!!!");
        getModelService().removeAll(cadburry);
    }
}
