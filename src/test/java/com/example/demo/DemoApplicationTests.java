package com.example.demo;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.entity.User;
import com.example.service.IUserService;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private IUserService userService;
	
	
	@Test
	public void testUserById() {
		User user = (User)userService.getUserByUserId(1L);
		assertThat(user.getId()).isEqualTo(1);
	}
}
