package com.example.spring.aop;

import com.example.spring.aop.controller.test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestAop {
	@Autowired
	private test t;

	@Test
	public void test(){
		t.testMethod();
	}
}
