package de.hybris.myshoestore.facades.populators;

import de.hybris.myshoestore.core.model.CadburryModel;
import de.hybris.platform.commercefacades.user.data.CadburryData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.spockframework.util.Assert;

public class cadburryPopulator implements Populator<CadburryModel, CadburryData>
{


    @Override
    public void populate(final CadburryModel cadburryModel,final CadburryData cadburryData) throws ConversionException {
        Assert.notNull(cadburryModel,"Source cannot be Null");
        Assert.notNull(cadburryData,"Target cannot be Null");
         cadburryData.setPrice(cadburryModel.getPrice());
         cadburryData.setProducts(cadburryModel.getProducts());
         cadburryData.setQty(cadburryModel.getQty());

    }
}
