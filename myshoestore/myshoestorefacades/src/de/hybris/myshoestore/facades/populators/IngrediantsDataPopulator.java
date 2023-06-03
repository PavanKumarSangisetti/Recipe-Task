package de.hybris.myshoestore.facades.populators;

import de.hybris.myshoestore.core.model.IngredientModel;
import de.hybris.platform.commercefacades.user.data.IngredientsData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class IngrediantsDataPopulator implements Populator<IngredientModel, IngredientsData> {
    @Override
    public void populate(IngredientModel source, IngredientsData target) throws ConversionException {



        target.setName(source.getName());
        target.setUnits(source.getUnits());
        target.setQuantity(String.valueOf(source.getQuantity()));


    }
}
