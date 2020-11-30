package com.earendil.learen.framework.bean.init;

import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;

/**
 * @Author: Earendil
 * @Date: 11/30/20 7:21 PM
 */
public class InitWithAnnotation {

    private  String initValue;
    @PostConstruct
    public void doInit() {
        this.initValue = new String("has been init with annotation");
    }

    public String getInitValue() {
        return initValue;
    }

    public void setInitValue(String initValue) {
        this.initValue = initValue;
    }
}
