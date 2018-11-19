package com.springboot.chapter211.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author haungsonglin
 * @version 2.0.0
 */
@Component
public class MyPropertities {
    @Value("${com.hsl.name}")
    private String name;
    @Value("${com.hsl.title}")
    private String title;
    @Value("${com.hsl.value}")
    private String value;
    @Value("${com.hsl.number")
    private String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
