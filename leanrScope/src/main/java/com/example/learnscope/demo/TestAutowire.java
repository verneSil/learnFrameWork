package com.example.learnscope.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @Author: Earendil
 * @Date: 2020/10/30 6:45 PM
 */
@Component
@RefreshScope
public class TestAutowire {

    @Value(value = "${nihao}")
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
