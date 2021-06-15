package com.care.root.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import com.care.root.producer.MessageProducer;

@Service
public class TestService {

	@Autowired MessageProducer mp;
	public void runner(String message) {
		StopWatch s = new StopWatch();
		s.start();
		mp.send(message);
		s.stop();
		System.out.println("처리 시간 : "+ s.getTotalTimeSeconds() + "초 걸림");
	}
}
