package com.users.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.dao.User;
import com.users.repository.UsersRepository;

@Service
public class UsersService {

	@Autowired UsersRepository repository;
	
	public User addUsers(User user) {
		return repository.save(user);
	}
	
	public List<User> fetchUser(){
		return repository.findAll();
	}
}
