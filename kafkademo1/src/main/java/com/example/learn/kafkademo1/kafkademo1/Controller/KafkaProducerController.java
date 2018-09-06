package com.example.learn.kafkademo1.kafkademo1.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerController {
    protected static final Logger logger = LoggerFactory.getLogger(KafkaProducerController.class);
    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public String sendKafka(String message) {
        try {
            logger.info("kafka的消息={}", message);
            kafkaTemplate.send("test100", "key111", message);
            logger.info("发送kafka成功.");
            return "succss";
        } catch (Exception e) {
            logger.error("发送kafka失败", e);
            return "success";
        }
    }
}
