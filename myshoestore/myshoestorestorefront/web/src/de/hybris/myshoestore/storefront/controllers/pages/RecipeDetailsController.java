package de.hybris.myshoestore.storefront.controllers.pages;

import de.hybris.myshoestore.facades.recipe.RecipeFacade;
import de.hybris.myshoestore.storefront.controllers.ControllerConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.commercefacades.user.data.IngredientsData;
import de.hybris.platform.commercefacades.user.data.RecipeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@Controller
@RequestMapping(value = "/recipe")
public class RecipeDetailsController extends AbstractPageController {
    @Autowired
    private RecipeFacade recipeFacade;

    public RecipeFacade getRecipeFacade() {
        return recipeFacade;
    }

    public void setRecipeFacade(RecipeFacade recipeFacade) {
        this.recipeFacade = recipeFacade;
    }


    private static final String UPDATE_OLD_PASSWORD_CMS_PAGE = "recipeDetails";
    private static final String UPDATE_OLD_PASSWORD_CMS_PAGES = "ingrediantsDetails";


    @RequestMapping(value="/recipeDetails", method= RequestMethod.GET)
    public String getAllRecipesDetails(final Model model) throws CMSItemNotFoundException
    {
        final List<RecipeData> recipeData = recipeFacade.getAllRecipes();

        model.addAttribute("recipeData", recipeData );

        storeCmsPageInModel(model, getContentPageForLabelOrId(UPDATE_OLD_PASSWORD_CMS_PAGE));
        setUpMetaDataForContentPage(model, getContentPageForLabelOrId(UPDATE_OLD_PASSWORD_CMS_PAGE));

        return ControllerConstants.Views.Pages.Product.recipeDetails;

    }

    @RequestMapping(value="/ingredientsDetails", method= RequestMethod.GET)
    public String getAllIngrediantsDetails(final Model model) throws CMSItemNotFoundException
    {
        final List<IngredientsData> IngrediantsData = recipeFacade.getAllIngredients();

        model.addAttribute("IngrediantsData", IngrediantsData );

        storeCmsPageInModel(model, getContentPageForLabelOrId(UPDATE_OLD_PASSWORD_CMS_PAGES));
        setUpMetaDataForContentPage(model, getContentPageForLabelOrId(UPDATE_OLD_PASSWORD_CMS_PAGES));

        return ControllerConstants.Views.Pages.Product.ingrediantsDetails;

    }

}
