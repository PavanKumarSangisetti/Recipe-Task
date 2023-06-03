package de.hybris.myshoestore.facades.populators;

import de.hybris.myshoestore.core.model.RecipeModel;
import de.hybris.platform.commercefacades.user.data.RecipeData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class RecipeDataPopulator implements Populator<RecipeModel, RecipeData> {
    @Override
    public void populate(RecipeModel source, RecipeData target) throws ConversionException {


        target.setCode(source.getCode());
        target.setTitle(source.getTitle());
        target.setDescription(source.getDescription());
    }
}
