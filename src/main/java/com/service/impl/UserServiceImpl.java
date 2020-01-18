package com.service.impl;

import com.entity.User;
import com.service.UserService;
public class UserServiceImpl implements UserService{
	@Override
	public User getUserbyName(String name) {
		User user = new User();
		user.setName(name);
		user.setAge(26);
		user.setEmail("perfectwwh@163.com");
		return user;
	}
}
