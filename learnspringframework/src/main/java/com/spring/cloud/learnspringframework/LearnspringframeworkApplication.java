package com.spring.cloud.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com")
@RestController
public class LearnspringframeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnspringframeworkApplication.class, args);
    }


    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
