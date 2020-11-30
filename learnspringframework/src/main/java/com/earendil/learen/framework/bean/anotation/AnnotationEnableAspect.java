package com.earendil.learen.framework.bean.anotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author: Earendil
 * @Date: 11/30/20 8:59 PM
 */
@Component
@Aspect
public class AnnotationEnableAspect {

    @Pointcut("@annotation(com.earendil.learen.framework.bean.anotation.AgeQualitifer)")
    private void pointcut() {
        System.out.println("_________show some log_____________");
    }


    @Before("pointcut()")
    public void advice() {
        System.out.println("this is advice");
    }
}
