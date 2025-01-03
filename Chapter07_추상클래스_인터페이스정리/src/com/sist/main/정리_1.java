package com.sist.main;

/*
	7장 =클래스 종류 (추상클래스/인터페이스)
		=> 형식, 사용처
	추상클래스
		=> 구현이 안된 메소드를 가지고 있다.
		=> 객체를 직접 생성이 불가능
		=> 사용시에는 상속을 받은 하위 클래스에서 확장해서 사용
		=> 역할 / 필요성 
		   상속을 통해서 코드를 재사용 => 강제로 메소드 구현을 하는 역할
		   							------------------------
		   							확장성 / 유지보수가 용이
		   확장성 => 상속을 받아서 오버라이딩 기법을 사용한다
							   -------
							  기능 변경 => 매소드 변경
		   형식)
		   public abstract class Classname
		   {
		   	   --------------------------
		   	   변수
		   	   	  멤버변수(인스턴스 변수)
		   	   	  정적변수(static 변수)
		   	   --------------------------
		   	   생성자 : 
		   	   			=> 있는 그대로 사용이 가능
		   	   --------------------------
		   	   미구현 메소드 : 상속시에 강제로 구현
		   	   --------------------------
		   => 관련이 있는 클래스 여러개를 모아서 관리
		   	  기능이 비슷한 클래스
		   	  ----------------------웹(Model)
		   	  Model => 사용자 요청처리=> 결과값 브라우저로 전송
		   	  => 소스가 간결하다 (조건문 없이 사용이 가능)
		   	  =>  Map클래스를 이용해서 클래스를 싱클턴으로 처리
		   	  	  --------- 메모리 절약
	인터페이스 : 추상클래스의 단점을 보완한 클래스의 일종
	-------- 자바에서 객체가 어떻게 행동해야 (동작) 정의한 타입
		   	  => 주로 메소드만 사용한다
		   }수정없이 고정해야 한다
		   
		   
		   추상클래스
		   상속 => 단일 상속만 가능 => 확장 (extends)
		   
		   인터페이스
		   상속 => 다중 상속이 가능 => 메소드 구현 (implements)
		   
		 => 인터페이스 ======> 언터페이스
		 		implements
		 	인터페이스 => 클래스
		 	클래스====> 인터네이스)=> 사용이 불가능
		 => 다중상속 => 윈도우 / 네트워크
		    => 웹에서는 주로 단일 상속
		      
			clss C -implements A,B
			*** 관련된 클래스 여러개르 묶어서 인터페이스ㅗㅗㅗㅗ
		 
		
		  	
		   
*/
interface I {
	public void aaa();
	// 기능 추가
	//public void bbb();
	//public
	default void ccc() {
		
	}
	static void ddd() {
		
	}
}

class A implements I {

	@Override
	public void aaa() {
		// TODO Auto-generated method stub

	}

	
}

class B implements I {

	@Override
	public void aaa() {
		// TODO Auto-generated method stub

	}
}

class C implements I {

	@Override
	public void aaa() {
		// TODO Auto-generated method stub

	}
}

public class 정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
