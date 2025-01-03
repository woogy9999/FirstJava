package com.sist.exception;

/*
	변수 => 데이터형
	연산자 / 제어문
	배열 => 1차원
	클래스 /객체 생성 / 메소드
	상속	  / 오버라이딩
	인터페이스
	라이브러리 => 조립
		=> Collection / IO
	------------------------- 웹
	==12장 필수 (오라클)
	
	8장 예외처리 
	
	목적 : 사전에 에러를 방지하는 목적
		  우선시 => if
		  -------> 처리가 어려운 경우 : 예외처리 사용 
		  => 비정상 종료를 방지하고 정상상태 유지
		  => 예외처리 => 에러 발생시 에러를 건너뛴다
		     ------ if
		     
	에러발생
	  사용자 => 잘못된 입력 => 유효성 검사 => if(javascript)
	  개발자 => 실수 => 배열 인덱스 , 정수 변환, 형변환
	  -------------------------------------------
	  		컴파일			   인터프리터
	  A.java =======> A.class =======> 화면 출력
	  		  javac			   java
	 			|				 |
	 		   에러				에러
	 		   				   ------예외처리
	 		   				   실시간 에러
	 		   				   RuntimeException
	 		   				   => 경우에 따라 예외처리
	 		  확인) 컴파일시에 반드시 예외처리가 필요
	 	=> CheckException : 필수적으로 예외처리
	 		= IO(파일입출력)
	 		  IOException 
	 		= 네트워크 (서버 => URL, IP)
	 		  MalformedURLexception
	 		= SQL (데이터베이스)
	 		  SQLException
	 		= 쓰레드
	 		  InterruptedExcetion
	 	=> UnCheckException : 필요시에만 예외처리 ==> 
	 	   배열범위 초과 / 정수 변환 / 0으로 나누는 경우
	 	   객체가 null / 클래스 형변환...
	 	  
	 	  
	 	1) 사전에 차단 ( 우선시 => if) => 예외처리
	 	2) 에러
	 		=에러 => 소스상에서 수정이 불가
	 				메모리 부족, 이클립스
	 				치명적 에러 => 처리가 불가능
	 				
	 		=예외처리 => 소스상에서 수정이 가능 에러
	 		예) 파일읽기 => 경로명/ 파일명 다른 경우
	 		  데이터베이스 => SQL 문장 틀린 경우
	 		  크롤링 => URL 주소가 다른 경우 
	 		  배열 인덱스가 틀린 경우
	    3) 예외처리 방법
	    	= 예외복구 : try ~ catch
	    			  ----   ----- 예외가 발생시 처리 복구
	    			  정상수행
	    	= 예외회피 (떠맡기기) : throws
	    	= 임의 발생 => 견고한 프로그램 여부 확인
	    	= 지원하지 않는 예외 : 사용자 정의 예외처리
	    	  --------------
	    	  		public class MyException extends Exception
	    	  		{
	    	  		}
	    	 예외처리를 하는 경우
	    	 ---------------- 예외가 많이 예상되는 경우
	    	 catch를 여러개 사용이 가능
	    	 --------------------- 순서가 존재
	    	 
	    	 문자열 => 정수로 변경후에 배열에 저장 => 나눈값을 출력
	    	 
	    	 => 사전에 에러방지 => 에러 예상하면서 소스코딩.
	    	 
	    	
	 		  ClassNotFoundException
	 		  InterrutedException
	 		  MalformedUR
	 		   
	 		   
	 		   
*/
public class 예외처리_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(10);

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
