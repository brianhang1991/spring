package com.example.spring.service;

import com.example.spring.Application;
import com.example.spring.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@Slf4j
public class TestUserServiceImpl {

	@Autowired
	private UserService userService;

	@Test
	public void testInsert(){
		User user = new User();
		user.setId(1);
		user.setName("hcy");
		userService.insert(user);
		log.info("insert finish !!!!");
	}

	@Test
	public void testSelectById(){
		log.info("name of user is = " + userService.selectById(1).getName());
	}
}
