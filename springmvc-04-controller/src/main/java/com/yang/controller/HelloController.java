package com.yang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloController
 * @Author yang
 * @Description //TODO
 * @Date 22/07/29 1:17
 * @Version v1.0
 **/

@Controller
public class HelloController {

    @RequestMapping("/h3/{a}/{b}")
    public String hello(Model model, @PathVariable int a, @PathVariable int b){
        // 封装数据
        model.addAttribute("msg","hello , springMVCAnotation! "+ a + b);
        return "hello";
    }

    @RequestMapping("/h3")
    public String hello2(Model model, @PathVariable int a, @PathVariable int b){
        // 封装数据
        model.addAttribute("msg","hello , springMVCAnotation! ");
        return "hello";
    }
}
