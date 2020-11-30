package com.earendil.learen.framework.bean.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Earendil
 * @Date: 11/30/20 7:22 PM
 */
@Configuration()
public class BeanConfiguration {

    @Bean()
    public InitWithAnnotation initWithAnnotation() {
        return new InitWithAnnotation();
    }

    @Bean
    public InitWithInterface initWithInterface() {
        return new InitWithInterface();
    }

    @Bean(initMethod = "init")
    public InitWithMethod initWithMethod() {
        return new InitWithMethod();
    }
}
