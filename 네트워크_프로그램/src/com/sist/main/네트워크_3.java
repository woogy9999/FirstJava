package com.sist.main;

/*
		네트워크 서버
		----------
		1. 접속을 받는 클래스 : 접속처리 (대기소켓)
		2. 통신을 담당하는 클래스 : 각 클라이언트 따로 통신
		   ----------------------------------------
		   | 쓰레드 이용
		     -------- 접속을 받는 클래스의 모든 데이터 공유
		class Server
		{	
			// 사용자 정보 => ip/port
			class Client extends Thread
			{
				ip/port를 이용해서 통신
			}
		}
		
		사용자 => client
		사용자 => client

		=> 서버 동작
		  => bind() ====> 개통(ip,port)
		  => listen()		  ------- ip는 반드시 고정
		     => 접속을 기다린다(대기)
		  => accept()		  ------- port 고정
		  	 => 접속을 하면 => 클라이언트 정보 저장
		  => 통신			  ------- AWS
		  	 => 통신이 가능하게 연결 (Socket)
		  
		  서버		클라이언트
		   | 			|
		 read()		  write()
		   |			|
		 write()	  read()
		 
		 서버 : ServerSocket : 대기 소켓 => 접속자 관리
		 ---------------------- 서버에만 존재
		 통신 : Socket => 서버에서는 클라이언트의 정보
		 				 클라이언트에서는 서버 정보를 가지고 있다
		 				 		반드시 클라이언트당 1개씩 담당 쓰레드 이용
		
 */


public class 네트워크_3 {
	public static void main(String[] args) {

	}
}
