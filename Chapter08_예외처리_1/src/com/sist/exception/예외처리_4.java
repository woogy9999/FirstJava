package com.sist.exception;

import java.util.Scanner;

public class 예외처리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[2];
		try {

			System.out.print("첫번째 정수 입력 : ");
			String s1 = scan.next();
			System.out.print("두번째 정수 입력 : ");
			String s2 = scan.next();

			arr[0]=Integer.parseInt(s1);
			arr[1]=Integer.parseInt(s2);
			int result = arr[0] / arr[1];
			System.out.println("result" + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			//System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (ArithmeticException e) {
			// TODO: handle exception
			//System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO: handle exception
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("정상 수행");
	}

}
