package com.springboot.chapter212;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author haungsonglin
 * @version 2.0.0
 */
@ConfigurationProperties(prefix = "com.dingjust")
public class User {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
