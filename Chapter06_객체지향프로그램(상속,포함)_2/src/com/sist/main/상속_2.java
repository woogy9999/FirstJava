package com.sist.main;

/*

	메소드 오버리이딩 => 메소드의 기능 변경 => 유지보수
	--------------------------------------
	오버라이딩 조건
	1. 상속 => 상속받은 메소드를 변경해서 사용
*/

class Animal {
	int a = 10;

	public void run() {
		System.out.println("걷는다");
	}
}

class Dog extends Animal {
	int a = 20;

	public void run() {
		System.out.println("4발로 걷는다");
	}
}

class Human extends Animal {
	int a = 30;

	public void run() {
		System.out.println("2발로 걷는다");
	}
	
	
}

public class 상속_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani = new Dog();
		System.out.println(ani.a);
		ani.run();
		ani = new Human();
		System.out.println(ani.a);
		ani.run();

	}

}
