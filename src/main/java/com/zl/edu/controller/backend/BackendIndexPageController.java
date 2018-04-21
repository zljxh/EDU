package com.zl.edu.controller.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by user on 2018/3/2.
 */
@Controller
@RequestMapping("/backend")
public class BackendIndexPageController extends BaseBackendController {

    @GetMapping("/index")
    public String index() {
        return PAGE_PREFIX + "index";
    }
}
