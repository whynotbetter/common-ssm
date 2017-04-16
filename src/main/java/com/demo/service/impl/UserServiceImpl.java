package com.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.User;
import com.demo.dao.UserMapper;
import com.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserById(int userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

}
