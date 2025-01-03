package com.sist.lang;

/*
	java.lang
	=> Object / String / StringBuffer / Math / Wrapper/


	Wrapper
		=> 데이터를 쉽게 다루기 위해서 클래스화한 클래스
		=> 제네릭스 : 데이터형의 동일화 => 형 변환없이 사용
			=> Collection
		=> int => Integer : 문자열을 정수형 변환
					Integer.parseInt("10")
		   long => Long : 문자열을 long으로 변경
		   			Long.parseLong("")
		   double => Double : 문자열을 실수로 변경
		   			Double.parseDouble()
		   boolean => Boolean : 문자열을 논리형 변경
		   			Boolean.parseBoolean()
		-----------------------------------------------
		혼합이 가능
		Integer i=100; => 오토박싱
		Int ii=i => 언박싱
		--------------------------------------------------
		   			
		   			
*/

public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 135;
		int totalpage = (int) (Math.ceil(count / 10.0));
		System.out.println(totalpage);

	
	}

	
}
