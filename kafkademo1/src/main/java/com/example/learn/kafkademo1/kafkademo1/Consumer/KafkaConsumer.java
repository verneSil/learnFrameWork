package com.example.learn.kafkademo1.kafkademo1.Consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @KafkaListener(topics = {"test100"},group = "test")
    public void listen(ConsumerRecord<?, ?> record) {
        System.out.printf("offset = %d,key =%s,value=%s\n", record.offset(), record.key(), record.value());
    }
}
