package de.hybris.myshoestore.storefront.controllers.pages;

import de.hybris.myshoestore.core.form.CadburryForm;
import de.hybris.myshoestore.facades.converterss.CadburryFacade;
import de.hybris.myshoestore.storefront.controllers.ControllerConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.commercefacades.user.data.CadburryData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
@Controller
@RequestMapping(value="/new")
public class CadburryController extends AbstractPageController
{
    @Autowired
    private CadburryFacade cadburryFacade;
    private static final String REDIRECT_TO_CADBURRY= REDIRECT_PREFIX+"/cadburry/cadburry";
    public static final Logger log = Logger.getLogger(CadburryController.class);

    @RequestMapping(value="/cadburry", method= RequestMethod.GET)
    public String getCaburryDetails(final Model model) throws CMSItemNotFoundException
    {
        final List<CadburryData> cadburryData = cadburryFacade.getCadburryDetails();

        model.addAttribute("cadburryData",cadburryData);

        storeCmsPageInModel(model,getContentPageForLabelOrId("cadburry"));
        setUpMetaDataForContentPage(model,getContentPageForLabelOrId("cadburry"));

        return ControllerConstants.Views.Pages.Product.cadburryDetails;


    }


    @RequestMapping(value="/create-cadburry", method=RequestMethod.GET)
    public String createCadburry(final Model model) throws CMSItemNotFoundException
    {
        final CadburryForm cadburryForm = getPreparedCadburryForm();
        model.addAttribute("cadburryForm",new CadburryForm());
        final ContentPageModel createCadburryPage = getContentPageForLabelOrId("create-cadburry");
        storeCmsPageInModel(model, createCadburryPage);
        setUpMetaDataForContentPage(model, createCadburryPage);
        return ControllerConstants.Views.Pages.Product.CreateCadburry;
    }




    @RequestMapping(value="/create-cadburry", method=RequestMethod.POST)
    public String createCadburry(final CadburryForm cadburryForm, final BindingResult bindingResult, final Model model, final RedirectAttributes redirectAttributes) throws CMSItemNotFoundException
    {
        if(bindingResult.hasErrors())
        {
            GlobalMessages.addErrorMessage(model, "form.global.error");
            final ContentPageModel createCadburry= getContentPageForLabelOrId("create-cadburry");
            storeCmsPageInModel(model,createCadburry);
            setUpMetaDataForContentPage(model,createCadburry);
            return getViewForPage(model);

        }
        String returnAction = REDIRECT_TO_CADBURRY;
        final CadburryData cadburryData = new CadburryData();
        cadburryData.setQty(cadburryForm.getQty());
        cadburryData.setPrice(cadburryForm.getPrice());
        cadburryData.setProducts(cadburryForm.getProducts());

        model.addAttribute("cadburryForm", new CadburryForm());

        final ContentPageModel createCadburryPage = getContentPageForLabelOrId("create-cadburry");
        storeCmsPageInModel(model, createCadburryPage);
        setUpMetaDataForContentPage(model,createCadburryPage);

        getCadburryFacade().postCadburryDetails(cadburryData);
        GlobalMessages.addFlashMessage(redirectAttributes, GlobalMessages.CONF_MESSAGES_HOLDER,"CREATED CADBURRY PRODUCT",null);
        return returnAction;
    }

    protected CadburryForm getPreparedCadburryForm()
    {
        final CadburryForm cadburryForm = new CadburryForm();
        cadburryForm.setQty(100);
        cadburryForm.setPrice(382);
        cadburryForm.setProducts("silk");
        return cadburryForm;
    }

    public CadburryFacade getCadburryFacade()

    {
        return cadburryFacade;
    }

    public void setCadburryFacade(final CadburryFacade cadburryFacade)
    {
        this.cadburryFacade = cadburryFacade;
    }


    //Update remove

    @RequestMapping(value = "/updateCadburry", method = RequestMethod.GET)
    public String updateCadburry(final Model model) throws CMSItemNotFoundException
    {
        log.info("######## UPDATE CONTROLLER ########");
        model.addAttribute("cadburryForm", new CadburryForm());
        final ContentPageModel updateCadburryContentPage = getContentPageForLabelOrId("updateCadburry");
        storeCmsPageInModel(model, updateCadburryContentPage);
        setUpMetaDataForContentPage(model, updateCadburryContentPage);
        return ControllerConstants.Views.Pages.Product.updateCadburry;
    }

    @RequestMapping(value = "/updateCadburry", method = RequestMethod.POST)
    public String updateCadburryPricr(final CadburryForm cadburryForm, final BindingResult bindingResult, final Model model,
                final RedirectAttributes redirectAttributes) throws CMSItemNotFoundException
    {
        log.info("######## Update Controller ########");
        if(cadburryForm.getProducts() == null)
        {
            GlobalMessages.addFlashMessage(redirectAttributes, GlobalMessages.ERROR_MESSAGES_HOLDER, "Please Enter PRODUCT NAME", null);
            return REDIRECT_PREFIX + "updateCadburry";
        }

        if(getCadburryFacade().getSpecificCadburryDetails(cadburryForm.getProducts()).isEmpty())
        {
            GlobalMessages.addFlashMessage(redirectAttributes, GlobalMessages.ERROR_MESSAGES_HOLDER, "Product Not Found", null);
            return REDIRECT_PREFIX + "updateCadburry";
        }
        if (bindingResult.hasErrors())
        {
            GlobalMessages.addErrorMessage(model, "form.global.error");
            final ContentPageModel updateProducts = getContentPageForLabelOrId("updateCadburry");
            storeCmsPageInModel(model,updateProducts );
            setUpMetaDataForContentPage(model, updateProducts);
            return getViewForPage(model);
        }
        String returnAction = REDIRECT_TO_CADBURRY;

        final List <CadburryData> cadburryData = cadburryFacade.getSpecificCadburryDetails(cadburryForm.getProducts());

        model.addAttribute("cadburryForm", new CadburryForm());

        final ContentPageModel updateProducts = getContentPageForLabelOrId("updateCadburry");
        storeCmsPageInModel(model, updateProducts);
        setUpMetaDataForContentPage(model, updateProducts);


        getCadburryFacade().updateProduct(cadburryForm.getProducts(),cadburryForm.getPrice());
        GlobalMessages.addFlashMessage(redirectAttributes, GlobalMessages.CONF_MESSAGES_HOLDER,"Product Updated", null);
        return returnAction;
    }


    //DELETE********************************
    @RequestMapping(value = "/myCadburry", method = RequestMethod.GET)
    public String getAllCadburryDetails(final Model model) throws CMSItemNotFoundException
    {
        log.info("######## DELETE ########");
        final List <CadburryData> cadburryData= cadburryFacade.getCadburryDetails();
        model.addAttribute("cadburryData", cadburryData);
        storeCmsPageInModel(model, getContentPageForLabelOrId("myCadburry"));
        setUpMetaDataForContentPage(model, getContentPageForLabelOrId("myCadburry"));
        log.info("******END OF DELETE****");
        return ControllerConstants.Views.Pages.Product.myCadburry;

    }

    @RequestMapping(value="/deleteproduct/{products}",method=RequestMethod.POST)
    public String removeProduct(@PathVariable final String products, final RedirectAttributes redirectAttributes) throws CMSItemNotFoundException
    {
        log.info("***** DELETE PRODUCT****");
        String returnAction = REDIRECT_TO_CADBURRY;
        getCadburryFacade().removeProduct(products);
        GlobalMessages.addFlashMessage(redirectAttributes, GlobalMessages.CONF_MESSAGES_HOLDER,"PRODUCT DELETED "+ products +" ",null);
        return  returnAction;
    }



}
