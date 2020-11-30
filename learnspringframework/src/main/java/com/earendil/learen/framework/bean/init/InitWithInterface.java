package com.earendil.learen.framework.bean.init;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Author: Earendil
 * @Date: 11/30/20 7:21 PM
 */
public class InitWithInterface implements InitializingBean {

    private  String initValue;

    public String getInitValue() {
        return initValue;
    }

    public void setInitValue(String initValue) {
        this.initValue = initValue;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.initValue = new String("has been init with interface");
    }
}
