package com.zl.edu.controller.portal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by user on 2018/3/1.
 */
@Controller
@RequestMapping(value = "/portal")
public class PortalIndexPageController extends BasePortalController {

    @PostMapping("/")
    public String Index(Model model) {


        List menuList = null;
        List bannerList = null;
        List contentList = null;

        model.addAttribute("menuList", menuList);
        model.addAttribute("bannerList", bannerList);
        model.addAttribute("contentList", contentList);
        return "index";
    }
}
