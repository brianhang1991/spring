package com.example.spring.service;

import com.example.spring.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
	public void insert(User user);
	public User selectById(Integer id);
}
