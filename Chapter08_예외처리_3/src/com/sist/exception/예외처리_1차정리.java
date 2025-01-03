package com.sist.exception;

public class 예외처리_1차정리 {
	public void display() throws Exception{
		System.out.println(10/0);
	}
	public static void main(String[] args) throws Exception {
		예외처리_1차정리 a=new 예외처리_1차정리();
		
		a.display();
	}
}
