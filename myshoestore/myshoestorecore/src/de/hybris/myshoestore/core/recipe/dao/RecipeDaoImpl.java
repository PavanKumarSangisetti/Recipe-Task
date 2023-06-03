package de.hybris.myshoestore.core.recipe.dao;

import de.hybris.myshoestore.core.model.IngredientModel;
import de.hybris.myshoestore.core.model.RecipeModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

public class RecipeDaoImpl implements RecipeDao{

    private FlexibleSearchService flexibleSearchService;

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    @Override
    public List<RecipeModel> getAllRecipes() {
        final String query = "SELECT {PK} FROM {Recipe}";
        final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query.toString());
        final SearchResult searchResult = getFlexibleSearchService().search(searchQuery);
        return searchResult.getResult();
    }

    @Override
    public List<IngredientModel> getAllIngredients() {
        final String query = "SELECT {PK} FROM {Ingredient}";
        final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query.toString());
        final SearchResult searchResult = getFlexibleSearchService().search(searchQuery);
        return searchResult.getResult();
    }
}
