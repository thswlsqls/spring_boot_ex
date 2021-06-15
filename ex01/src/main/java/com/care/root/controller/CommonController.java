package com.care.root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.care.root.service.UserService;

@RestController
public class CommonController {
	@Autowired
	UserService us;
	@GetMapping("getmessage")
	public String getMessage() {
		return us.getMessage();
	}
	@RequestMapping("/")
	public String root_test() {
		return "안녕하세요";
	}
	
	
}
