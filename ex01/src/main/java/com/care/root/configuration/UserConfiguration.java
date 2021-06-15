package com.care.root.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {
	@Bean
	public UserTest userTest() {
		return new UserTest();
	}
}
//<bean id="userTest" class="com.care.root.configuration.UserTest">
