package com.earendil.learen.framework.bean.anotation;

import java.lang.reflect.AnnotatedType;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @Author: Earendil
 * @Date: 11/30/20 8:44 PM
 */
public class CustomerAnnotationBeanFactory extends DefaultListableBeanFactory {

    @Override
    public <T> T getBean(Class<T> requiredType) throws BeansException {
        T bean = this.getBean(requiredType, (Object[]) null);
        AnnotatedType[] annotatedInterfaces = bean.getClass().getAnnotatedInterfaces();
        for (AnnotatedType annotatedInterface : annotatedInterfaces) {
            System.out.println("~~~~");
        }
        return bean;
    }
}
