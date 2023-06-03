package de.hybris.myshoestore.storefront.controllers.cms;


import de.hybris.myshoestore.core.model.CustomBannerOffersComponentModel;
import de.hybris.myshoestore.storefront.controllers.ControllerConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.cms.AbstractCMSComponentController;
import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
@Controller("CustomBannerOffersComponentController")
@Scope("tenant")
@RequestMapping(value = ControllerConstants.Actions.Cms.CustomBannerOffersComponent)
public class CustomBannerOffersComponentController extends AbstractCMSComponentController<CustomBannerOffersComponentModel> {

    @Override
    protected void fillModel(HttpServletRequest request, Model model, CustomBannerOffersComponentModel component) {

        model.addAttribute("offerImageLinks", component.getOfferImageLink());

        model.addAttribute("offerImage", component.getOfferImage());

        model.addAttribute("headerText", component.getHeadrerText());

        model.addAttribute("footerText", component.getFooterText());

    }

    @Override
    protected String getView(CustomBannerOffersComponentModel component) {
        return ControllerConstants.Views.Cms.ComponentPrefix + StringUtils.lowerCase(getTypeCode(component));
    }
}
