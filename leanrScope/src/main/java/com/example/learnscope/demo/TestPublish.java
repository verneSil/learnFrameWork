package com.example.learnscope.demo;

import java.util.HashMap;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.cloud.endpoint.event.RefreshEvent;
import org.springframework.cloud.endpoint.event.RefreshEventListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author: Earendil
 * @Date: 2020/10/30 6:49 PM
 */
@Component
public class TestPublish implements ApplicationContextAware, ApplicationEventPublisherAware {

    private ApplicationContext applicationContext;
    private static int count = 1;
    ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    private RefreshEventListener refresh;

//    private String testValue;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void publicApplicationContext() {

        ConfigurableEnvironment environment = (ConfigurableEnvironment) applicationContext.getEnvironment();
        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("testCount", String.valueOf(count++));
        PropertySource propertySource = new MapPropertySource("myPropertyResource", objectObjectHashMap);

        environment.getPropertySources().addLast(propertySource);
        EnvironmentChangeEvent environmentChangeEvent = new EnvironmentChangeEvent(objectObjectHashMap.keySet());
        this.applicationEventPublisher.publishEvent(environmentChangeEvent);
        // 下面这句和上面的效果相同
//        applicationContext.publishEvent(environmentChangeEvent);
        refresh.handle(new RefreshEvent("event", environmentChangeEvent, "event"));

    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
