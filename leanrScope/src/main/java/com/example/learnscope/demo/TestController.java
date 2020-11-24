package com.example.learnscope.demo;

import com.example.learnscope.testScope.CustomerUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Earendil
 * @Date: 2020/10/30 6:29 PM
 */
@RestController
public class TestController {

    @Autowired
    private TestComponent testComponent;

    @Autowired
    private TestRefreshScope testRefreshScope;

    @Autowired
    private TestPublish testPublish;
    @Autowired
    private TestChangeEnvironment testChangeEnvironment;

    @GetMapping(value = "/test")
    public String getUserName() {
        testPublish.publicApplicationContext();
        Environment environment = testChangeEnvironment.getApplicationContext().getEnvironment();
        return testComponent.getTestCount();
    }
}
