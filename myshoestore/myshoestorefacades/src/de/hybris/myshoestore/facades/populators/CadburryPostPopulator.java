package de.hybris.myshoestore.facades.populators;

import de.hybris.myshoestore.core.model.CadburryModel;
import de.hybris.platform.commercefacades.user.data.CadburryData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.apache.log4j.Logger;
import org.springframework.util.Assert;

public class CadburryPostPopulator implements Populator<CadburryData, CadburryModel>
{
    public static final Logger Log = Logger.getLogger(CadburryPostPopulator.class);
    @Override
    public void populate(CadburryData cadburryData, CadburryModel cadburryModel) throws ConversionException
    {
        Log.info("*****CADBURRY POST POPULATOR*****");
        Assert.notNull(cadburryData,"Source cannot be Null");
        Assert.notNull(cadburryModel,"Target cannot be Null");
        cadburryModel.setPrice(cadburryData.getPrice());
        cadburryModel.setProducts(cadburryData.getProducts());
        cadburryModel.setQty(cadburryData.getQty());


    }
}
