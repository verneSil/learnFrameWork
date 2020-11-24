package com.example.learnscope.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @Author: Earendil
 * @Date: 2020/11/11 7:57 PM
 */
@RefreshScope
@Component
public class TestComponent {

    @Value(value = "${testCount:1}")
    private  String testCount;

    public String getTestCount() {
        return testCount;
    }
}
