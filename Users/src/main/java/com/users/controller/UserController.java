package com.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.users.dao.User;
import com.users.service.UsersService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired UsersService usersService; 
	
	@PostMapping
	public User saveUser(@RequestBody User user) {
		return usersService.addUsers(user);
	}
	
	@GetMapping
	public List<User> getAllUsers(){
		return usersService.fetchUser();
	}
}
