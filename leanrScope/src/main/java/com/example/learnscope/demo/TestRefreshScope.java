package com.example.learnscope.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @Author: Earendil
 * @Date: 2020/11/2 11:47 AM
 */
@ConfigurationProperties(prefix = "test1")
public class TestRefreshScope {
    private String testValue;

    public String getTestValue() {
        return testValue;
    }

    public void setTestValue(String testValue) {
        this.testValue = testValue;
    }
}
