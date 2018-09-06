package com.example.fegin.fegin.fegin.controller;

import com.example.fegin.fegin.fegin.client.SchedualClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zuoweichen
 * @date: 07/06/2018
 * @time: 17:26
 * Copyright (C) 2018 MTDP
 * All rights reserved
 */


@RestController
public class HiController {
    @Autowired
    private SchedualClient schedualClient;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualClient.sayHiFromClientOn(name);
    }
}
