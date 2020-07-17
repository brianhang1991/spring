package com.example.spring.aop.controller;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class ControllerAop {
	@Before("com.example.spring.aop.controller.test.testMethod()")
	public void beforeController(){
		log.info("test aop !!!!!!!!!!");
	}
}