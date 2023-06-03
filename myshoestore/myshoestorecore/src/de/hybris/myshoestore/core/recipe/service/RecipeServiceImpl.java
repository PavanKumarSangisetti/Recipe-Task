package de.hybris.myshoestore.core.recipe.service;

import de.hybris.myshoestore.core.model.IngredientModel;
import de.hybris.myshoestore.core.model.RecipeModel;
import de.hybris.myshoestore.core.recipe.dao.RecipeDao;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class RecipeServiceImpl implements RecipeService{

    private RecipeDao recipeDao;

    public RecipeDao getRecipeDao() {
        return recipeDao;
    }

    @Required
    public void setRecipeDao(final RecipeDao recipeDao) {
        this.recipeDao = recipeDao;
    }

    @Override
    public List<RecipeModel> getAllRecipes() {
        return recipeDao.getAllRecipes() ;
    }

    @Override
    public List<IngredientModel> getAllIngredients() {
        return recipeDao.getAllIngredients();
    }
}
