package com.example.learnscope.demo;

import com.example.learnscope.testScope.CustomerUser;
import com.example.learnscope.testScope.MyBeanScope;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: Earendil
 * @Date: 2020/10/30 6:33 PM
 */
@Component
public class CustomerBeanPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        configurableListableBeanFactory.registerScope("MyBeanScope", new MyBeanScope());
        configurableListableBeanFactory.createBean(CustomerUser.class);
    }
}
