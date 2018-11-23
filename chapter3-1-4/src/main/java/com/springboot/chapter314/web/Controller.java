package com.springboot.chapter314.web;

import com.springboot.chapter314.exception.MyException;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haungsonglin
 * @version 2.0.0
 */
@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/hello")
    public String syaHello() throws Exception {
        throw new Exception("发生错误！");
    }

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误！");
    }
    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return "index";
    }
}
