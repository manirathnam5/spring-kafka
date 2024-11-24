package com.app.spring_kafka;

import com.app.spring_kafka.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringKafkaApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaApplication.class, args);

		SpringApplication obj = new SpringApplication();

	}




}
