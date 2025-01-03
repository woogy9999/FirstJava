package com.sist.lib;
/*
	객체 복제
	= 같은 메모리 주소 사용 (같이 사용) => 얕은 복사
	A a=new A()
	A b=a    => 주소 참조
	
	= 다른 메모리 주소 사용 (따라 사용 ) => 깊은 복사
	A a=new A()
	A b=a.clone() => 새로운 메모리 생성
	
 */

class Member {

	private int mno;
	private String name;

	public Member(int mno, String name) {
		this.mno = mno;
		this.name = name;
	}

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

	// 메모리를 통째로 복사해서 새로운 메모리에 저장
	// 스프링 => prototype
	// 디자인패턴 => prototype 패턴
	// GOF패턴 => 23가지
	// 8=> 컴바운드패턴

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	// 오버라이딩 => clone() => 재정의

	public void print() {
		System.out.println("회원번호:" + mno);
		System.out.println("이름:" + name);

	}
	
	
}

public class 라이브러리_Object_3 {
	public static void main(String[] args) throws Exception{
		// 얕은 복사 => 두개의 객체를 한개 주소에서 처리
		Member m1 = new Member(1, "홍길동");
//		m1.print();
//		Member m2 = m1;
//		m2.print();
//		m2.setMno(3);
//		m2.setName("박문수");
//		m2.print();
//		m1.print();
//		// 객체가 가지고 있는 주소가 같으면 => 같은 메모리를 제어
//		System.out.println("m1:"+m1);
//		System.out.println("m2:"+m2);
//		
		
		Member m2=(Member)m1.clone();
		m2.print();
		System.out.println("m1:"+m1);
		System.out.println("m2:"+m2);
		m2.setMno(3);
		m2.setName("박문수");
		m2.print();
	}
}
