package com.example.spring.aop.controller;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class test {
	@Pointcut("execution(* testMethod(..))")
	public void testMethod(){
		log.info("this is method !!!!!!!!");
	}
}
