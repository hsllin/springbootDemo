package com.springboot.chapter212;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author haungsonglin
 * @version 2.0.0
 */
@ConfigurationProperties
public class Information {
    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
