package com.example.config.client.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zuoweichen
 * @date: 12/06/2018
 * @time: 20:07
 * Copyright (C) 2018 MTDP
 * All rights reserved
 */


@RestController
public class HelloController {
    @Value("${foo}")
    String foo;
    @RequestMapping(value = "/hi")
    public String hi() {
        return foo;
    }
}
