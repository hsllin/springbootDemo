package com.springboot.chapter312.web;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author haungsonglin
 * @version 2.0.0
 */
@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/index")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("host", "http://localhost:8080");
        return "index";
    }
}
