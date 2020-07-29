package com.example.spring.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaListener {
	@org.springframework.kafka.annotation.KafkaListener(topics = {"topic1","topic2"})
	public void sendListen(String message){
		log.info("message :" + message);
	}
}
