package com.app.spring_kafka.kafka;


import com.app.spring_kafka.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {

    private Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

    private KafkaTemplate<String, User> kafkaTemplate;

    private JsonKafkaProducer(KafkaTemplate<String , User> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }


    public void sendMessage(User userData){

        LOGGER.info("Message from %s " , userData.toString());

        Message<User>  msg = MessageBuilder
                .withPayload(userData)
                .setHeader(KafkaHeaders.TOPIC,"JavaVibes_JSON")
                .build();

        kafkaTemplate.send(msg);
    }


}
