package com.example.ribbon.ribbon.controller;

import com.example.ribbon.ribbon.service.HelloService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zuoweichen
 * @date: 07/06/2018
 * @time: 17:06
 * Copyright (C) 2018 MTDP
 * All rights reserved
 */


@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/hi")
    public String saHi(@RequestParam String name) {
        return helloService.sayHi(name);
    }
}
