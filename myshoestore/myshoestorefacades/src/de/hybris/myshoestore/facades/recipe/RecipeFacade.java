package de.hybris.myshoestore.facades.recipe;

import de.hybris.platform.commercefacades.user.data.IngredientsData;
import de.hybris.platform.commercefacades.user.data.RecipeData;

import java.util.List;

public interface RecipeFacade {

    public List<RecipeData> getAllRecipes();

    public List<IngredientsData> getAllIngredients();

}
