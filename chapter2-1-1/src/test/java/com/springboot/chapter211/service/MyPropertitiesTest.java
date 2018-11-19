package com.springboot.chapter211.service;

import com.springboot.chapter211.web.WebController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author haungsonglin
 * @version 2.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MyPropertitiesTest {
    private MockMvc mockMvc;
    private static final Logger LOG = LoggerFactory.getLogger(MyPropertitiesTest.class);

    @Autowired
    private MyPropertities propertities;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new WebController()).build();
    }

    @Test
    public void getName() throws Exception {
       Assert.assertEquals("hsl",propertities.getName());
    }

    @Test
    public void getTitle() {
        Assert.assertEquals("title", propertities.getTitle());
    }

    @Test
    public void getValue() {
        LOG.info(propertities.getValue());
    }

    @Test
    public void getNumber() {
        LOG.info(propertities.getNumber());
    }
}