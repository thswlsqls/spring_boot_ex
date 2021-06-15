package com.care.root.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Value("${name}")
	String name;
	public String getMessage() {
		return name;
	}
}
