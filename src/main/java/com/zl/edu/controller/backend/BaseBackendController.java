package com.zl.edu.controller.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by user on 2018/3/1.
 */
@Controller
public class BaseBackendController {
    protected final static String  PAGE_PREFIX="backend/";
    public HttpServletRequest getReuest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }
}
