package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.entity.User;
import com.app.repository.*;

@RestController
@RequestMapping("api/bfhl")
public class UserController {
	
	@Autowired
	private UserRepository UserRepository;
//	------------------------------------------------
	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return UserRepository.save(user);
	}
	
	
	

}
