package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.IUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
@Api(tags = "User Interface")
public class UserController {
	@Autowired
	private IUserService userService;
	
	@ApiOperation("add User interface")
    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
    	return userService.addUser(user);
       
    }
	@ApiOperation("get User by userid")
    @GetMapping("/find/{id}")
    public User findById(@PathVariable("id") Long id) {
    	return userService.getUserByUserId(id);
       
    }
	@ApiOperation("get User List")
    @GetMapping("/find/List")
    public List<User> findList() {
    	return userService.getUsers();
       
    }
    
}
