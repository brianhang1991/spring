package com.example.spring.service.impl;

import com.example.spring.entity.User;
import com.example.spring.mapper.UserDao;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public void insert(User user) {
		userDao.insert(user);
	}

	@Override
	@Cacheable(cacheNames = "user", key = "id")
	public User selectById(Integer id) {
		User user = new User();
		user.setId(234);
		user.setName("testhcy");
		return user;
	}
}
