package com.earendil.learen.framework.bean.anotation;

import java.util.Collections;
import java.util.HashSet;
import org.springframework.beans.factory.annotation.CustomAutowireConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author: Earendil
 * @Date: 11/30/20 8:40 PM
 */
@Component
public class TestCustomAutowireConfigurer {

    @Bean
    public CustomAutowireConfigurer customAutowireConfigurer() {
        CustomAutowireConfigurer customAutowireConfigurer = new CustomAutowireConfigurer();
        customAutowireConfigurer.setCustomQualifierTypes(new HashSet(Collections.singleton(AgeQualitifer.class)));
        customAutowireConfigurer.postProcessBeanFactory(new CustomerAnnotationBeanFactory());
        return customAutowireConfigurer;
    }
}
