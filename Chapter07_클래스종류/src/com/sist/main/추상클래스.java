package com.sist.main;

/*
	추상클래스
		=주목적
			관련된 클래스를 모아서 한개의 객채명으로 관리
			(서로 다른 클래스를 연결해서 사용)
	

*/

import java.util.Scanner;

abstract class 도형  {
	public abstract void draw(); // 추상 메소드
	// 상속받는 클래스는 무조건 구현해서 사용

	public void colorSelect() {
		System.out.println("검정색을 사용한다!!");

	}

}

class 네모 extends 도형 {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형을 그린다");
	}

}

class 삼각형 extends 도형 {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그린다");
	}

}

class 원 extends 도형 {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그린다");
	}

}

public class 추상클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 관련된 클래스를 모아서 한개 객체명으로 제어
//		도형 a = new 네모();
//		a.draw();
//		a.colorSelect();
//
//		a = new 삼각형();
//		a.draw();
//		a.colorSelect();
//		
//		a = new 원();
//		a.draw();
//		a.colorSelect();

		Scanner scan = new Scanner(System.in);
		System.out.print(" 도형 선택 : 네모(1), 삼각형(2), 원(3) : ");
		int mode = scan.nextInt();

//		if (mode == 1) {
//			네모 a = new 네모();
//			a.colorSelect();
//			a.draw();
//		} else if (mode == 2) {
//			삼각형 a = new 삼각형();
//			a.colorSelect();
//			a.draw();
//		} else if (mode == 3) {
//			원 a = new 원();
//			a.colorSelect();
//			a.draw();
//		}

//		도형 a = null;
//		if (mode == 1) {
//			a = new 네모();
//		} else if (mode == 2) {
//			a = new 삼각형();
//		} else if (mode == 3) {
//			a = new 원();
//		}
//		a.colorSelect();
//		a.draw();

		도형[] a = { null, new 네모(), new 삼각형(), new 원() };
		a[mode].colorSelect();
		a[mode].draw();

	}
}
