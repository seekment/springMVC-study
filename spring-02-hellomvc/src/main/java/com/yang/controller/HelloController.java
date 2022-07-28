package com.yang.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName HelloController
 * @Author yang
 * @Description //TODO
 * @Date 22/07/28 9:43
 * @Version v1.0
 **/


public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        ModelAndView modelAndView = new ModelAndView();
        String result = "业务结果";
        modelAndView.addObject(result);

        // 跳转到test.jsp页面
        modelAndView.setViewName("test");
        return null;
    }


}
