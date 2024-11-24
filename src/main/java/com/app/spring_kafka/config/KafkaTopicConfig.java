package com.app.spring_kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


 @Configuration
 public class KafkaTopicConfig {



     @Bean
     public NewTopic javaguideTopic(){
         return TopicBuilder.name("JavaVibes")
                .build();
    }



     @Bean
     public NewTopic javaVibesJsonTopic(){
         return TopicBuilder.name("JavaVibes_JSON")
                 .build();
     }

 }
