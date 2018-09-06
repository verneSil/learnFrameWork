package com.example.zuuldemo.zuuldemo.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import sun.misc.Request;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:
 * @author: zuoweichen
 * @date: 08/06/2018
 * @time: 17:25
 * Copyright (C) 2018 MTDP
 * All rights reserved
 */

@Component
public class CustomerFilter extends ZuulFilter {

    private static Logger LOGGER= LoggerFactory.getLogger(CustomerFilter.class);
    @Override
    public String filterType() {
        return "type";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }


    @Override
    public Object run() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        LOGGER.info("请求:  %s >>> %s" + request.getMethod() + request.getRequestURL());
        Object accesToken = request.getParameter("token");
        if (accesToken == null) {
            return null;
        }
        return new String ();
    }

}
