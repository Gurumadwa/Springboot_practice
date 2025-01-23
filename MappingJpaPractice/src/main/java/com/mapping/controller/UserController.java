package com.mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.entity.User;
import com.mapping.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/save-user")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
}
