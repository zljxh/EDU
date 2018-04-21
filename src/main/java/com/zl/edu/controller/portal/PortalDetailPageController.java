package com.zl.edu.controller.portal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by user on 2018/3/2.
 */
@Controller
@RequestMapping(value = "/portal")
public class PortalDetailPageController extends BasePortalController {

    @PostMapping("/detail")
    public String detail(Integer courseid) {
        //course详细内容
        //course介绍

        //侧边：1老是介绍，2学生介绍，3课程推荐

        return "detail";
    }
}
