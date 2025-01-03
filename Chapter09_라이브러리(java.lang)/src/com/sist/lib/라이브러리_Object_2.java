package com.sist.lib;
/*
 	finalize() => 소멸자 함수 => 객체가 메모리에서 해제 => 자동 호출
 	
 */

class Sawon // extends Object 모든 클래스는 Object를 상속하고 있음
{

	private int sabun;
	private String name;

	public Sawon() {
		sabun = 1;
		name = "홍길동";
		System.out.println("객체 생성 = 초기화 완료");

	}

	public void print() {
		System.out.println("사번 : " + sabun);
		System.out.println("이름 : " + name);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("사원 객체 소멸: Heap에서 사라진다");
	}

	// 소멸 여부 확인

}

public class 라이브러리_Object_2 {

	public static void main(String[] args) {
		Sawon sa = new Sawon();
		sa.print();
		sa = null;
		// 직접 해제
		System.gc(); // 가비지 컬렉션 호출 

	
	}
}
