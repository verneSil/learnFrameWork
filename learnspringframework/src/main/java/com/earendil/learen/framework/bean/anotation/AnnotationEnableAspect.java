package com.earendil.learen.framework.bean.anotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author: Earendil
 * @Date: 11/30/20 8:59 PM
 */
@Aspect
@Component
public class AnnotationEnableAspect {

//    @Pointcut("execution (* com.earendil.learen.framework.bean.anotation.AnnotationComponent.getsomething())")
//    public void controllerAspect() {
//    }

//    @Before("execution (* com.earendil.learen.framework.bean.anotation.AnnotationComponent.getsomething())")
//    public void advice( ) {
//        System.out.println("this is advice");
//    }

//    @Around("execution (* com.earendil.learen.framework.bean.anotation.AnnotationComponent.getsomething())")
//    public Object doArount(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("sssssssss");
//        return joinPoint.proceed();
//
//    }

    @Pointcut("@annotation(com.earendil.learen.framework.bean.anotation.AgeQualitifer)")
    public void annotetionAspect() {
        System.out.println("get annotation");
    }


    @Before("annotetionAspect()")
    public void doAnnotation() {
        System.out.println("do aspect annotation");
    }



}
