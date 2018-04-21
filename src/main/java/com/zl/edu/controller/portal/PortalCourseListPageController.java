package com.zl.edu.controller.portal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by user on 2018/3/2.
 */
@Controller
@RequestMapping(value = "/portal")
public class PortalCourseListPageController extends BasePortalController {

    @PostMapping("/list")
    public String list() {

        return "list";
    }
}
