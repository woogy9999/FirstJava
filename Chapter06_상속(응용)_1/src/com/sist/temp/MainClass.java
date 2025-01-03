package com.sist.temp;

class Super {
	int a = 10;
	int b = 20;

	public Super() {
		System.out.println("Super() Call");
	}

}

class Sub extends Super {

	int a;
	int b;
	
	public void display() {
		super.a = 100;
		super.b = 200;
		this.a = 1000;
		this.b = 2000;
		System.out.println("Super:a=" + super.a);
		System.out.println("Super:b=" + super.b);
		System.out.println("This:a=" + this.a);
		System.out.println("This:a=" + this.b);
	}
}

public class MainClass {
	public static void main(String[] args) {

		Sub a=new Sub();
		a.display();
	}
}
