package com.srping.core.session03.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.srping.core.session03.mvc.model.User;
import com.srping.core.session03.mvc.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	public void appendUser(User user) {
		System.out.println("Controller - append user: " + user);
		userService.addUser(user);
	}

}
