package com.sgz.service.impl;

import com.sgz.bean.User;
import com.sgz.service.UserService;
import com.webmvc.annotation.Service;

@Service
public class UserServiceImpl implements UserService{

	public User say() {
		System.out.println("----UserServiceImpl----");
		User user = new User();
		user.setName("sgz");
		user.setAge(23);
		return user;
	}

}
