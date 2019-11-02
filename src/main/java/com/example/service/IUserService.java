package com.example.service;

import java.util.List;

import com.example.entity.User;

public interface IUserService {
	public User addUser(User user);
	public List<User> getUsers();
	public User getUserByUserId(Long userid);
	
	
	
}
