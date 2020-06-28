package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/test")
public class TestController {
	@RequestMapping("/test")
	public String testMethod(){
		return " ";
	}
}
