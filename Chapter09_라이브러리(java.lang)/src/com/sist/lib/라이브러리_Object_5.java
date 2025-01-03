package com.sist.lib;
/*
      5장 
        클래스 구성 요소 
         => 멤버변수 / 메소드 / 생성자 
         => static 
      6장 
        상속 / 포함 
         => 상속 권한 (상속받는 클래스)
      7장 
        추상클래스 => 인터페이스 
                   --------- 오버라이딩 
      8장 
        try ~ catch 
        throws 
        
      ----------------------
      9장 
       Object 
       String 
      ----------------------
 */

import java.util.Objects;


class Member2 {
	private int mno;
	private String name;

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 초기화
	public Member2(int mno, String name) {

		this.mno = mno;
		this.name = name;
	}

	public void print() {
		System.out.println("회원번호:" + mno);
		System.out.println("이름:" + name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(mno, name);
	}

	
}

public class 라이브러리_Object_5 {
	public static void main(String[] args) {
		Member2 m1 = new Member2(1, "박문수");
		Member2 m2 = new Member2(1, "박문수");
		
		System.out.println(m1);
		System.out.println(m2);
		
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
		if(m1==m2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
	}
}
