package com.example.spring.controller.kafka;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
@Slf4j
@RequestMapping(value = "/kafka")
public class KafkaController {
//	private KafkaTemplate<Object,Object> kafkaTemplate;
//	@RequestMapping("/sendGet/{message}")
//	public String sendGet(@PathVariable String message){
//		kafkaTemplate.send("topic1","topic1:" + message);
//		kafkaTemplate.send("topic2","topic2:" + message);
//		return message;
//	}
//
//	@PostMapping("/send")
//	public String send(@RequestParam String message){
//		log.info("message = " + message);
//		kafkaTemplate.send("topic1","topic1:" + message);
//		kafkaTemplate.send("topic2","topic2:" + message);
//		return message;
//	}
}
