package com.red.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * 监听器
 */
@Component
public class Listener {

    @KafkaListener(topics = {"topic1", "topic2"})
    public void listen(String data) {
        System.out.println(data);
    }
}
