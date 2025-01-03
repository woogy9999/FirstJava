/*
	
	2) 메소드가 동일
	3) 매개변수가 동일
	4) 리턴형이 동일
	5) 접근지정어 확장이 가능 / 축소하면 오류 발생
	private < default < protected < public
	=> 메소드는 다른 클래스와 연결
	---------------------- 가급적이면 public으로 사용
	클래스 / 생성자 / 메소드 => public
	멤버변수 => private(데이터 보호)
	=> 필요시에 사용이 가능 => getter/setter
	윈도우 => 보안(x) => button , TextField
	
	상위 클래스 : 상속을 내리는 클래스
				=> 하위 클래스를 제어할 권한이 없다
	하위 클래스 : 자신 + 상위 클래스를 제어 할 수 있다
			  -------------------------
			   this		super
			   	|		  |
			   자신의 객체 상위 클래스의 객체
			   

*/
package com.sist.main;


class A {

	public A() {

	}

	public A(String s) {
		System.out.println(s);
	}
}

class B extends A {

	public B(String s) {
		super(s); // 상위 클래스 메모리 할당
		// TODO Auto-generated constructor stub
	}

	public B() {
		super(); // 생략시에 자동 할당
	}

}

public class 상속_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
