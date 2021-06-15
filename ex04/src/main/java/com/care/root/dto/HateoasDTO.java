package com.care.root.dto;

import org.springframework.hateoas.RepresentationModel;

public class HateoasDTO extends RepresentationModel<HateoasDTO>{
	private String userId;
	private String name;
	private String addr;
	
	public HateoasDTO() {}
	public HateoasDTO(String userId, String name, String addr) {
		this.userId = userId;
		this.name = name;
		this.addr = addr;
		
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
