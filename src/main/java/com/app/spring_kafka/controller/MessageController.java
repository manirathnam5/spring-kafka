package com.app.spring_kafka.controller;


import com.app.spring_kafka.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/msg")
public class MessageController {

    @Autowired
    private KafkaProducer  kafkaProducer;


    public MessageController(KafkaProducer kafkaProducer){
        this.kafkaProducer = kafkaProducer;
    }


    //http:localhost:8089/v1/msg/publish?message=helloworld

    @GetMapping("/publish")
    public ResponseEntity<String>  publishMsg(@RequestParam("message") String message){
        kafkaProducer.send(message);
       return ResponseEntity.ok("Message sent to the topic");
    }

}
