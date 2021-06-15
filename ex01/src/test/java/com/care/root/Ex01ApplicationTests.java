package com.care.root;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.care.root.configuration.UserTest;
import com.care.root.dao.UserDAO;
import com.care.root.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
class Ex01ApplicationTests {

	@Autowired
	UserService userService;
	@Test
	void contextLoads() {
		Assert.assertNotNull(userService); // 객체가 만들어 졌는가?
	}
	@Autowired UserDAO dao;
	@Test
	void daoTest() {
		Assert.assertNotNull(dao); //동일 경로 내에 있어야만 빈등록 가능
	}
	@Autowired UserTest userTest;
	@Test
	void userTest() {
		Assert.assertNotNull(userTest); //어노테이션으로 빈등록 해주지 않으면 널값
	}
	
}
