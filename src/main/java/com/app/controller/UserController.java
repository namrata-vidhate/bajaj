package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.entity.User;
import com.app.repository.*;

public class UserController {
	
	@Autowired
	private UserRepository UserRepository;
//	------------------------------------------------
	@PostMapping("/bfhl")
	public User createUser(@RequestBody User user) {
		return UserRepository.save(user);
	}
	
	
	

}
