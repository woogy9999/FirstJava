package com.sist.main;
/*
		자바에서 지원하는 라이브러리
					  ------- 프로그램에 필요한 클래스를 모아서 개발시에 사용이 가능하게 한다
		=> 라이브러리 중심 => 조립
		=> Scanner / System / String ...
		
		=> 라이브러리 
			1)	자바에서 지원
				java.lang
				java.util
				java.io
				java.sql
				java.net
				java.text
				java.lang.reflect
				-----------------------1.0
				javax.swing(X) => 한번 사용시 폐기 
				-----------------------
				=> javax.http
				=> javax.servlet.http
				-----------------------2.0
				=> org.springframework
				
			2)	외부업체 지원 : Jsoup / lombok / Spring
				=> mvnrepository.com
				=> simple-json / bson ...
			3)	사용자 정의 : 잘 만들어진 클래스 / 자주 사용하는 클래스
				=> .jar
				=> 1차 => JSP (MVC => Spring 형식) 
			
			=> clone() : 객체를 복제할 경우
				=> 객체 복사
					얕은 복사 => 같은 주소를 이용
					------
					
			
			
 */

class Student {
	private String name;
	private String phone;
	private String address;

	// 접근 가능 => 메소드
	public Student(String name, String phone, String address) {

		// 지역변수 / 매개변수
		/*
		 * 1. 지역변수 , 매개변수 찾기 2. 맴버변수 지역변수 우선 순위
		 * 
		 * 
		 * 
		 */
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("전화 : " + phone);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("전화 : " + phone);
		return super.toString();
	}
}

public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("홍길동", "010-1111-1111", "서울");
		Student s2 = new Student("심청이", "010-2222-2222", "경기도");

		
		// 객체 출력시에 => toString()을 호출한다
		// s1.print();
		System.out.println(s1);// 메모리 주소 => 묵시적
		// s2.print();
		System.out.println(s2.toString()); // => 명시적
	}

}
