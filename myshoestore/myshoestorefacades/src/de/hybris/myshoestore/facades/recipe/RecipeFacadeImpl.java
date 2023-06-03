package de.hybris.myshoestore.facades.recipe;

import de.hybris.myshoestore.core.model.IngredientModel;
import de.hybris.myshoestore.core.model.RecipeModel;
import de.hybris.myshoestore.core.recipe.service.RecipeService;
import de.hybris.platform.commercefacades.user.data.IngredientsData;
import de.hybris.platform.commercefacades.user.data.RecipeData;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class RecipeFacadeImpl implements RecipeFacade{

    private RecipeService recipeService;

    public RecipeService getRecipeService() {
        return recipeService;
    }

    public void setRecipeService(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @Resource(name = "recipeDataConverter")
    private Converter<RecipeModel, RecipeData> recipeDataConverter;

    @Resource(name = "ingredientsDataConverter")
    private Converter<IngredientModel, IngredientsData> ingredientsDataConverter;


    @Override
    public List<RecipeData> getAllRecipes() {
        final List<RecipeData> products = new ArrayList<RecipeData>();
        final List<RecipeModel> model = getRecipeService().getAllRecipes();
        final List<RecipeData> recipeData = recipeDataConverter.convertAll(model);
        products.addAll(recipeData );
        return products;
    }

    @Override
    public List<IngredientsData> getAllIngredients() {
        final List<IngredientsData> products = new ArrayList<IngredientsData>();
        final List<IngredientModel> model = getRecipeService().getAllIngredients();
        final List<IngredientsData> ingredientData = ingredientsDataConverter.convertAll(model);
        products.addAll(ingredientData );
        return products;
    }
}
