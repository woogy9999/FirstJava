package com.sist.exception;

public class 예외처리_2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			try {
				int r = (int) (Math.random() * 3);
				int a = 1 / r;
				System.out.println("i=" + i + ",a" + a);

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
