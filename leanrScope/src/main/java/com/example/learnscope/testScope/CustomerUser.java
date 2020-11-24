package com.example.learnscope.testScope;

import java.util.UUID;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author: Earendil
 * @Date: 2020/10/30 6:26 PM
 */
@MyScope
@Component
public class CustomerUser {
    private String userName;

    public CustomerUser(String userName) {
        this.userName = userName;
    }

    public CustomerUser() {
        this.userName = UUID.randomUUID().toString();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
