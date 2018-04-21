package com.zl.edu.controller.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by user on 2018/3/2.
 */
@Controller
@RequestMapping("/backend")
public class BackendCourseListPageController extends BaseBackendController {

    @PostMapping("/list")
    public String list(){
        return PAGE_PREFIX+"list";
    }
}
