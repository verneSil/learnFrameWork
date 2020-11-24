package com.example.learnscope.testScope;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

/**
 * @Author: Earendil
 * @Date: 2020/10/30 6:24 PM
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Scope("MyBeanScope")
public @interface MyScope {
    ScopedProxyMode proxyMode() default ScopedProxyMode.TARGET_CLASS;//@2
}
