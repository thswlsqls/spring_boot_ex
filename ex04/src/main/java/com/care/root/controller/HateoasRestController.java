package com.care.root.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.care.root.dto.HateoasDTO;
import com.care.root.service.HateoasService;

@RestController //페이지가 아니라, 데이터를 돌려준다
public class HateoasRestController {
	@Autowired
	HateoasService hs;
	@RequestMapping(value="users", produces="application/json; charset=utf-8")
	@ResponseBody  //페이지가 아니라, 데이터로 돌려준다
	public List<HateoasDTO> getUser(){
		List<HateoasDTO> users = hs.getUserList();
		return users;
	}
	@GetMapping("user/{id}")
	public HateoasDTO getUser(@PathVariable String id) {
		return hs.getUser(id);
	}
//	@GetMapping("users") //쿼리스트링으로 id=3과 같이 넘겨주었을 경우
//	public HateoasDTO getUser(@RequestParam String id) {
//		return hs.getUser(id);
//	}
	@RequestMapping("gethateoas")
	public HateoasDTO getHateoas() {
		return hs.getHateoas();
	}
	
	
}
