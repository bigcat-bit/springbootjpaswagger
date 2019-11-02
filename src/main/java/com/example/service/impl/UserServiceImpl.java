package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repo.UserDao;
import com.example.service.IUserService;
@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserDao userDao;
	
	public User addUser(User user) {
		return userDao.save(user);
		
	}
	
	public List<User> getUsers(){
		
		return userDao.findAll();
		
	}
	public User getUserByUserId(Long userid) {
		return userDao.getOne(userid);
	}
		
	
}
