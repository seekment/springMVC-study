package com.yang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

/**
 * @ClassName HelloController
 * @Author yang
 * @Description //TODO
 * @Date 22/07/29 1:17
 * @Version v1.0
 **/

@Controller
public class HelloController {

    @RequestMapping("/hello3")
    public String hello(Model model){
        // 封装数据
        model.addAttribute("msg","hello , springMVCAnotation!");
        return "hello";
    }
}
