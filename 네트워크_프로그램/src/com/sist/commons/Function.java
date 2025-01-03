package com.sist.commons;

// 서버 = 클라이너트가 공통 사용
// 내부 프로토콜  서버/클라이너트의 약속
/*
 * 
 */
public class Function {
	public static final int LOGIN=100; //  먼저 로그인한 사람 처리
	public static final int MYLOG=110; // 로그인하는 사람
	public static final int WAITCHAT=200;
	public static final int END=900;    // 남아있는 사람
	public static final int MYEND=910; // 나가는 사람 처리
	// 모든 처리는 서버에서 명령을 내린다
	
	
	/*
		 웹=> Oracle (SQL) => TCP=> IP/PORT
		 --  ------
		 |		  |
		 
	 */
	
}
