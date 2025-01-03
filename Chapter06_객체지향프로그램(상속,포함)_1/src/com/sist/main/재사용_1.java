package com.sist.main;

/*
 		 Object
 			↑
 		    A = super
 			↑
 			B = sub => this, super
 			
 	*** 상속을 내리는 클래스 => 상속받은 클래스의 변수, 메소드 제어 불가능
 		----------------- this.super
 		super => 자바의 모든 클래스는 Object상속을 받는다
 	*** 상속을 받은 클래스는 상속내린 클래스 제어 가능
 	
 	
 	
 	Class B
 	{
 		int a,b;
 	}
 	Class A extends B{
 		(int a,b)
 		int c,d;
 	}
 	
 		
 		=> 201page
 		1) 단일 상속 => 수정가능 (변수 오버라이딩, 메소드 오버라이딩)
 		2) 상속 : extends : 한개만 가용이 가능
 		3) 상속을 두개이상 받는 경우
 			class A
 			class B 
 			class C extends A,B => 오류

 			class A
 			class B extends A
 			class C extends B => 오류
 			
 			=> 여러개를 받는 방법 => 클래스는 기존
 			--------------- 인터페이스
 			
 			상속을 받아서 메모리 할당
 			1) 상위 클래스 (상속 내린 클래스)
 			2) 하위 클래스 (상속 받은 클래스)
 			=> 속도가 느려진다
 			=> 영향력이 많이 존재
 			=> 공통점을 추출 
 		
 */

class Sawon // extends Object 가 생략된거임
{

	public Sawon() {
		System.out.println("객체 생성 성공");
	}

	public void display() {
		System.out.println("사원 객체 활용");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("객체 소멸");
	}

}

public class 재사용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon sa = new Sawon();
		sa.display();
		sa = null;
		System.gc(); // 메모리를 회수해라..
	}

}
