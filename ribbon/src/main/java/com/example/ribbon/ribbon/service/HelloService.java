package com.example.ribbon.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: zuoweichen
 * @date: 07/06/2018
 * @time: 17:08
 * Copyright (C) 2018 MTDP
 * All rights reserved
 */


@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String sayHi(String name) {
        return restTemplate.getForObject("http://CLIENT1/hi?name=" + name, String.class);
    }
}
