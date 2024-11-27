package com.app.spring_kafka.controller;

import com.app.spring_kafka.dto.User;
import com.app.spring_kafka.kafka.JsonKafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/jsonpublisher")
public class JsonMessageController {


    private JsonKafkaProducer jsonKafkaProducer;


    public JsonMessageController(JsonKafkaProducer jsonKafkaProducer){
        this.jsonKafkaProducer = jsonKafkaProducer;
    }



    //http://localhost:8089/v1/jsonpublisher/publish
    @PostMapping("/publish")
    public ResponseEntity<String> publishJsonMsg(@RequestBody User userData){

        jsonKafkaProducer.sendMessage(userData);

      return ResponseEntity.ok("Json Message is successfully published to Kafka topic  ");
    }


}
