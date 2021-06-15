package com.care.root.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HateoasController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("hateoas")
	public String hateoas() {
		return "hateoas";
	}
}
