package de.hybris.myshoestore.core.recipe.dao;

import de.hybris.myshoestore.core.model.IngredientModel;
import de.hybris.myshoestore.core.model.RecipeModel;

import java.util.List;

public interface RecipeDao {


    public List<RecipeModel> getAllRecipes();

    public List<IngredientModel> getAllIngredients();

}
