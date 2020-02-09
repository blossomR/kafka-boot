package com.red.kafka;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Controller {

    @Autowired
    private KafkaTemplate  kafkaTemplate;

    @GetMapping("/send/{messge}")
    public String send(@PathVariable String messge) {
        kafkaTemplate.send("topic1", "topci1:" + messge);
        kafkaTemplate.send("topic2", "topci2:" + messge);
        return messge;
    }
}
