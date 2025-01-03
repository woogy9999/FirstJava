package com.sist.execute;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// = A=1,B=2,C=3,D=4
		Scanner scan = new Scanner(System.in);
		System.out.println("A(1),B(2),C(3),D(4):");
		int select = scan.nextInt();
		
		// 모든 클래스는 Object 클래스이다
		I[] i = { null, new A(), new B(), new C(), new D() };
		i[select].execute();
		
//		if (select == 1) {
//			A a = new A();
//			a.execute();
//		} else if (select == 2) {
//			B b = new B();
//			b.execute();
//
//		} else if (select == 3) {
//			C c = new C();
//			c.execute();
//		} else if (select == 3) {
//			D d = new D();
//			d.execute();
//		}

	}

}
