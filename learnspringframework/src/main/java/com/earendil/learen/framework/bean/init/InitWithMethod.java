package com.earendil.learen.framework.bean.init;

import org.springframework.beans.factory.InitializingBean;

/**
 * @Author: Earendil
 * @Date: 11/30/20 7:21 PM
 */
public class InitWithMethod {

    private  String initValue;

    public String getInitValue() {
        return initValue;
    }

    public void setInitValue(String initValue) {
        this.initValue = initValue;
    }

    public void init() {
        this.initValue = new String("with method");
    }


}
