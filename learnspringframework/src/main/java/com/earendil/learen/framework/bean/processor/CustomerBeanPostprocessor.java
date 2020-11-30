package com.earendil.learen.framework.bean.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * @Author: Earendil
 * @Date: 11/30/20 8:02 PM
 */
@Component
public class CustomerBeanPostprocessor implements BeanPostProcessor{


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("process after action");
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("process before action");
        return bean;
    }

}
