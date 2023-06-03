package de.hybris.myshoestore.core.recipe.service;

import de.hybris.myshoestore.core.model.IngredientModel;
import de.hybris.myshoestore.core.model.RecipeModel;

import java.util.List;

public interface RecipeService {

    public List<RecipeModel> getAllRecipes();

    public List<IngredientModel> getAllIngredients();
}
