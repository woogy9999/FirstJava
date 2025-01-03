package com.sist.vo;

import lombok.Data;

@Data
public class SeoulVO {
	private String no;
	private String name;
	private String content;
	private String address;
	// 다른 클래스에서 사용이 가능 => 메소드 (기능 부여)
	// 캡슐화
	
}
