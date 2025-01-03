package com.sist.main;
/*
	java.lang/ java.util / java.io
	java.text / java.net / javax.http.servlet
							----------------- JSP(웹)
	1. java.net 
	   = Thread
	   = Network => WebServer(작동하는 과정)
	     | 웹 / 오라클 
	       --------- 서버가 이미 제작
	     | URL / URLEncoder 
	       http://localhost:8080/main/main.jsp
	       ----------------------------------- URL
	       						 ------------- URI
	       						 ---- ContextPath
	       						 ---- 구분자 : 파일명
	       						 ---- 네트워크 => 구분자
	       						 	  내부 프로토콜을 사용
	       						 	  ---------------
	       						 	  | 서버와 클라이언트만 확인
	       						 	  | 문자열 / 정수
	=> C/S => Client / Server
	 		  ------	------
	 		  |				|
	 		  -------|-------
	 		  	  Socket => 전화기 (ip/port)
	 		  	  				   |   |
	 		  	  			   		 연결선
	 		  	  			   전화번호 
	 		  	  port => 0~65535
	 		  	  		  -------
	 		  	  		  이미 사용중인 port(0~1023)
	 		  	  		  8080 / 4000 / 1521 / 1433
	 					  3306 (MySQL)
	 					  웹 => 80 (생략이 가능)
	 			  => 서버는 지정 / 클라이언트는 자동 생성
	 			  	
		1.쓰레드
		  => 프로그램 (프로세스)
		  			| 컴퓨터의 성능을 높이기 위해 여러개의 애플리케이션을 동시에 실행
		  									-----------------------
		  									| 메소드 이용 => run()
		  									| 비행기 / 총알 
		  									| 음악 / 걷기 
		  									| 문서편집 / 인쇄
		  									| 동시에 실행되는 것이 아니다
		  									  ---------------------
		  									  | 시분할 
		  => 쓰레드 동작에 필요한 데이터(X)
		  	 => 프로세스 => 데이터를 가지고 있다.
		  	    		  ----------------
		  	    		  | 쓰레드는 프로세스가 가지고 있는 데이터를 공유
		 => 쓰레드 사용 방법
		 	1) 쓰레드 상속 => 멀티쓰레드
		 		class A extends Thread
		 	2) 인터페이스 구현 => 윈도우
		 		class a implements Runnable
		 				-------------------
		 				run()
		 	3) 사용처
		 		서버 / IO(단방향 => 양방향) => 입출력
		 			  client => 서버로 요청 / 서버로부터 응답
		 			  						-----------
		 			  						
		 	
		 => 쓰레드 생명 주기
		 	new Thread()
		 	쓰레드 생성
		 	=> 쓰레드 이름
		 		Thread-0
		 		=> 필요시에는 변경이 가능
		 	=> 쓰레드의 우선순위 결정
		 	   => 0~10
		 	   => MIN / MAX / NORM
		 	   				  ----  5(중간 순위)
		 	   => 컴퓨터마다 다르다
		 	   
		 	   | start() => 프로세스가 가지고 있는 데이터 공유
		 	Runnable => 동작
		 	   => 동작 정의 => run()
		 	   |
		 	일시정지 => 
		 => 쓰레드 => 디폴트 (비동기) => 필요하면 동기로 바꿀 수 있음
		 => 네트워크 동기화
		 
		  			
*/

class MyThread extends Thread{
	
	// 동작 => 한가지 일만 수행 
	public void run() {
		for(int i=1; i<=100; i++) {
			
			try {
				Thread.sleep(100);
			System.out.println(getName()+":"+i);
			//System.out.println(Thread.currentThread()+":"+i);
			}catch(Exception e) {
				
			}
		}
	}
}

public class 네트워크_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread m1=new MyThread();

		MyThread m2=new MyThread();

		MyThread m3=new MyThread();

		MyThread m4=new MyThread();

		MyThread m5=new MyThread();
		
		
		m1.setName("홍길동");
		m2.setName("가나다");
		m3.setName("심청이");
		m4.setName("라마바");
		m5.setName("아자차");
		
		// 쓰레드 우선순위
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MIN_PRIORITY);
		m3.setPriority(Thread.MAX_PRIORITY);
		m4.setPriority(Thread.MIN_PRIORITY);
		m5.setPriority(Thread.MIN_PRIORITY);
		
		// 동작을 해라 => 명령 => run()
		m1.start(); // run() 호출
		m2.start();
		m3.start();
		m4.start();
		m5.start();
	}

}
