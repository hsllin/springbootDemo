package com.springboot.chapter1.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haungsonglin
 * @version 2.0.0
 */
@RestController
public class Chapter1Controller {
    @RequestMapping("/hello")
    public String sayHello() {
        return "hello springboot";
    }
}
