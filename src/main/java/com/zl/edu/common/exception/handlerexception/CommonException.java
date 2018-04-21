package com.zl.edu.common.exception.handlerexception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by user on 2018/3/1.
 */

@Slf4j
@Component
public class CommonException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        ModelAndView mv=new ModelAndView();
        MappingJackson2JsonView view=new MappingJackson2JsonView();
        mv.setView(view);
        mv.addObject("code",0);
        mv.addObject("msg","系统错误");
        log.error("CommonException error url :{} errorMessage :{}",httpServletRequest.getRequestURI(),e);
        return mv;
    }
}
