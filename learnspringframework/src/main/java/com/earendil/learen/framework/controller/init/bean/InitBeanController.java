package com.earendil.learen.framework.controller.init.bean;

import com.earendil.learen.framework.bean.anotation.AnnotationComponent;
import com.earendil.learen.framework.bean.init.InitWithAnnotation;
import com.earendil.learen.framework.bean.init.InitWithInterface;
import com.earendil.learen.framework.bean.init.InitWithMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Earendil
 * @Date: 11/30/20 7:23 PM
 */
@RestController
public class InitBeanController {
    @Autowired
    private InitWithAnnotation initWithAnnotation;

    @Autowired
    private InitWithInterface initWithInterface;

    @Autowired
    private InitWithMethod initWithMethod;
    @Autowired
    private AnnotationComponent annotationComponent;

    @GetMapping("/bean")
    public String getInitWith() {
        System.out.println("request bean");
        return initWithMethod.getInitValue();
    }

    @GetMapping("/annotation")
    public String getAnnotation() {
        return annotationComponent.getsomething();
    }
}
