package com.example.learn.kafkademo1.kafkademo1;

import org.springframework.kafka.annotation.KafkaListener;

import java.util.concurrent.CountDownLatch;

public class KafkaCustomerListener {
    private final CountDownLatch latch1 = new CountDownLatch(1);

    @KafkaListener(topics = "test")
    public void listen1(String foo) {
        this.latch1.countDown();
    }
}
