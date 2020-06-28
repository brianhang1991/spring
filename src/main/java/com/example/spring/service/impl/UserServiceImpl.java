package com.example.spring.service.impl;

import com.example.spring.entity.User;
import com.example.spring.mapper.UserDao;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
	public User selectById(Integer id) {
		return userDao.selectById(id);
	}
}
