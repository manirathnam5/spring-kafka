package com.app.spring_kafka.kafka;

import com.app.spring_kafka.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

   private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

   @KafkaListener(topics = "JavaVibes_JSON", groupId = "myGroup")
   public void consumer(User user){

   LOGGER.info(String.format("JSON Message received  -> %s" , user.toString()));

   }

}
