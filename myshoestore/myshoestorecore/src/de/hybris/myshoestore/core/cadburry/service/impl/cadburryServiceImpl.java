package de.hybris.myshoestore.core.cadburry.service.impl;

import de.hybris.myshoestore.core.cadburry.dao.CadburryDao;
import de.hybris.myshoestore.core.cadburry.service.cadburryService;
import de.hybris.myshoestore.core.model.CadburryModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;


import java.util.List;

public class cadburryServiceImpl implements cadburryService
{
    public static final Logger Log= Logger.getLogger(cadburryServiceImpl.class);

    private CadburryDao cadburryDao;

    public CadburryDao getCadburryDao() {
        return cadburryDao;
    }

    @Required
    public void setCadburryDao(final CadburryDao cadburryDao)
    {
        this.cadburryDao = cadburryDao;
    }

    @Override
    public List<CadburryModel> getCadburryDetails() {


        return cadburryDao.getCadburryDetails();
    }

    @Override
    public void postCadburryDetails(CadburryModel cadburryModel) {
        Log.info("**** POST CADBURRY SERVICE*****");
        getCadburryDao().postCadburryDetails(cadburryModel);
    }

    @Override
    public List<CadburryModel> getSpecificCadburrydetails(String products) {
        Log.info("****GET SPECIFIC CADBURRY SERVICE******");
        return cadburryDao.getSpecificCadburryDetails(products);
    }

    @Override
    public void updateProduct(String products, Double price) {
        Log.info("**** UPDATE CADBURRY SERVICE*****");
        getCadburryDao().updateProduct(products,price);
    }

    @Override
    public void removeProduct(String products) {
        Log.info("****REMOVEE PRODUCT*****");
        List<CadburryModel>  cadburryModel=getSpecificCadburrydetails(products);
        getCadburryDao().removeProduct(cadburryModel);
    }
}




//    INSERT_UPDATE Cadburry;products[unique=true];price;qty;
//        ;Fuse;40;4
//        ;Oreo;50;5
//        ;Gems;10;11
//        ;Silk;150;6
