package com.care.root.service;

import java.util.ArrayList;

import org.springframework.hateoas.Link;
import org.springframework.stereotype.Service;

import com.care.root.dto.HateoasDTO;

@Service
public class HateoasService {
	
	ArrayList<HateoasDTO> users;
	public ArrayList<HateoasDTO> getUserList(){
		HateoasDTO u01 = new HateoasDTO("1", "홍길동", "산골짜기");
		HateoasDTO u02 = new HateoasDTO("2", "고길동", "마포구");
		HateoasDTO u03 = new HateoasDTO("3", "이기자", "운동장");
		users = new ArrayList<HateoasDTO>();
		users.add(u01);
		users.add(u02);
		users.add(u03);
		return users;
	}
	
	public HateoasDTO getUser(String id) {
		HateoasDTO dto = null;
		for(HateoasDTO d : users) {
			if(id.equals(d.getUserId())) {
				return d;
			}
		}
		return null;
	}
	public HateoasDTO getHateoas() {
		HateoasDTO url = new HateoasDTO();
		url.setName("홍");
		url.setAddr("개시판");
		url.setUserId("멤버");
		
		Link link = Link.of("http://localhost:8080/");
		url.add(link.withSelfRel()); // 기본 경로 self

		link = Link.of("http://localhost:8080/board/"+url.getAddr());
		url.add(link.withRel("board")); //경로 이동 board
	
		link = Link.of("http://localhost:8080/member/");
		url.add(link.withRel("member")); //경로 이동 member
		
		return url;
	}
}
