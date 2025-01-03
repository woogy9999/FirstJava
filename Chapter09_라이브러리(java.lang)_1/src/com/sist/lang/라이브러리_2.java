package com.sist.lang;

/*
		java.lang
		1. Object 
			: 최상위 클래스 => 모든 클래스의 상위
			  ----------
			  관리하는 기능 : 객체와 관련
			  객체 소멸 
		2. String : 문자열 관리 클래스
			=> 웹에서 3대 클래스
				String / ArrayList / Integer
			=> 오라클 연동 3대 클래스
				Connection / ResultSet / Statement
			
		3. StringBuffer : 문자열 결합 => append()
		4. Math : random() / ceil()
			=> 모든 메소드가 static으로 만들어짐
			=> Math.random(). Math.ceil()
		5. System : println() / print()/ printf()
					gc(), exit() => 윈도우
		6. Wrapper : 기본형(데이터형)을 클래스화 시켜서 사용이 현리하게 믄듬
					byte ==> Byte
					short ==> Integer
					long ==> Long
					float ==> Float
					doublbe ==> Double
					char ==> Character
					boolean ==> Boolean
	
		10장
			날짜 / 문자열 자르기 / 문자열 변환 
		
 */

import java.io.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class 라이브러리_2 {
	public static void main(String[] args) {
		try {

			// ㅣlog파일 만들때 주소 사용
			long start = System.currentTimeMillis();

			FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
			int i=0; //문자를 받는 경우
			//String data=""; // 문자열 결합
			StringBuffer sb=new StringBuffer();
			// 문자열 결합의 최적화
			// 파일읽기 => 
			while((i=fr.read())!=-1) {
			//	data+=(char)i;
				sb.append((char)i);
			}
			fr.close();
			System.out.println(sb.toString());
			
			// 문자열 제어는 String
			// 문자열 결합 => StringBuffer (비동기적) 데이터 크롤링 => 쓰레드.
							// StringBuilder (동기적);
			long end=System.currentTimeMillis();
			System.out.println("걸린시간:"+(end-start));
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
