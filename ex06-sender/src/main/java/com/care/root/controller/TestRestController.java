package com.care.root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.care.root.service.TestService;

@RestController
public class TestRestController {
	@Autowired
	TestService ts;
	@GetMapping("test/{message}") //사용자에게 페이지를 바로 응답한다. 메일을 보내는 업무는 래빗 엠큐를 경유하여(문자열을 전송하여, 이것을 받는) reciever 서버에게 위임한다
	public String test(@PathVariable String message) {
		ts.runner(message);
		return "돌려주는 값 : " + message;
	}
}
//즉 (레빗엠큐와) 또 다른 서버를 사용하여 논블록킹 방식을 구현할 수 있다.