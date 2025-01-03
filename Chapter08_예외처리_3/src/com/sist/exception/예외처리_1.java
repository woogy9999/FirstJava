package com.sist.exception;

public class 예외처리_1 {
//	public int div(int a, int b) throws ArithmeticException {
//		return a / b;
//	}
//
//	public void print() {
//		int c = div(10, 0);
//	}
	
	
	public void display() throws Exception, ClassNotFoundException {
		System.out.println("display call...");
	}

	// check => 호출시에는 반드시 예외처리를 하고 사용한다.
	// uncheck => throws문장을 사용하지 않는다.
	// 1. try ~ catch

	public void print() {
		try {
			display();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void print2() {
		try {
			display();

		} catch (Throwable e) {
			// TODO: handle exception
		}
	}

	// 3 throws
	public void print3() throws Exception, ClassNotFoundException {
		display();
	}
	
	//4. throws
	
	public void print4() throws Exception{
		display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
