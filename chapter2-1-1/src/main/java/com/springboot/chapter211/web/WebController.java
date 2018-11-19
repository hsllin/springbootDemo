package com.springboot.chapter211.web;

import com.springboot.chapter211.service.MyPropertities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haungsonglin
 * @version 2.0.0
 */
@RestController
public class WebController {
    @Autowired
    private MyPropertities propertities;

    @RequestMapping("/name")
    public String getName() {
        return propertities.getName();
    }
}
