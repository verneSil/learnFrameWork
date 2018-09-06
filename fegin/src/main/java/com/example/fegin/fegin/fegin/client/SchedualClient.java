package com.example.fegin.fegin.fegin.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: zuoweichen
 * @date: 07/06/2018
 * @time: 17:24
 * Copyright (C) 2018 MTDP
 * All rights reserved
 */


@FeignClient(value = "client1")
public interface SchedualClient {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOn(@RequestParam(value = "name")String name);
}
