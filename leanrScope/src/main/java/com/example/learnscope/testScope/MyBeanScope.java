package com.example.learnscope.testScope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

/**
 * @Author: Earendil
 * @Date: 2020/10/30 6:25 PM
 */
public class MyBeanScope implements Scope {


    public static final String SCOPE_MY = "MyBeanScope"; //@1

    @Override
    public Object get(String s, ObjectFactory<?> objectFactory) {
        CustomerUser customerUser = new CustomerUser();
        customerUser.setUserName("zuoweichen");
        return customerUser;
    }

    @Override
    public Object remove(String s) {
        return null;
    }

    @Override
    public void registerDestructionCallback(String s, Runnable runnable) {

    }

    @Override
    public Object resolveContextualObject(String s) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
