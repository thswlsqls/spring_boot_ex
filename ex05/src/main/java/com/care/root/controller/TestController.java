package com.care.root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.root.service.TestService;

@Controller
public class TestController {
	@Autowired TestService service;
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("register")
	public String register(@RequestParam String email, Model model) {
		model.addAttribute("email", email);
		service.register(email);
		return "success";
	}
	
}
