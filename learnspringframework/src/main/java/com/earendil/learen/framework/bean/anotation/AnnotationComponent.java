package com.earendil.learen.framework.bean.anotation;

import org.springframework.stereotype.Component;

/**
 * @Author: Earendil
 * @Date: 11/30/20 8:51 PM
 */
@Component
public class AnnotationComponent {
    @AgeQualitifer
    public String getsomething() {
        return "some thing";
    }
}
