package com.example.clusterconfigclient.clusterconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClusterconfigclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClusterconfigclientApplication.class, args);
    }
}
