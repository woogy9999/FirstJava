package com.sist.lang;

/*

 	=> 변환 (문자열)
 	=> 데이터형의 통일화 : 제네릭스
 		<클래스형>
 		=> <Integer>
 	=> 기능이 일본형과 호환
 		Integer 1=10; int i=10
 		
 		Integer i=(int)10.5;
 */

import java.util.*;

public class 라이브러리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 진법 변환 8,2,16

		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		Integer i = scan.nextInt();

		// 8진법
		System.out.println(Integer.toOctalString(i));
		// 16진법
		System.out.println(Integer.toHexString(i));
		// 2진법
		System.out.println(Integer.toBinaryString(i));
		// 2. 범위 : 데이터형의 범위
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		System.out.println("첫번째 문자열 입력:");
		String s1 = scan.next();

		System.out.println("두번째 문자열 입력:");
		String s2 = scan.next();
		// 3. 변환 : 문자열 > 정수형

	
		System.out.println(s1+s2);
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
	}

}
