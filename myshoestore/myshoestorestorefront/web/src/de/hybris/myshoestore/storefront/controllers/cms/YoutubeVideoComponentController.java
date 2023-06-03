package de.hybris.myshoestore.storefront.controllers.cms;

import de.hybris.myshoestore.core.model.components.YoutubeVideoComponentModel;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.cms.AbstractCMSComponentController;


import org.apache.commons.lang3.BooleanUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
@Scope("tenant")
@Controller("YoutubeVideoComponentController")
@RequestMapping("/view/YoutubeVideoComponentController")
public class YoutubeVideoComponentController extends AbstractCMSComponentController<YoutubeVideoComponentModel> {
    @Override
    protected void fillModel(HttpServletRequest request, Model model, YoutubeVideoComponentModel component) {
        model.addAttribute("width", component.getWidth());
        model.addAttribute("height", component.getHeight());
        model.addAttribute("videoId", component.getVideoId());

        model.addAttribute("autoPlay", BooleanUtils.toBoolean(component.getAutoPlay()) ? 1 : 0);
        model.addAttribute("showControls", BooleanUtils.toBoolean(component.getShowControls()) ? 1 : 0);
    }

    @Override
    protected String getView(YoutubeVideoComponentModel component) {
        return null;
    }
}
