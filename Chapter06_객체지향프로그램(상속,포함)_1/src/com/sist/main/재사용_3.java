package com.sist.main;

import java.lang.reflect.Array;
/*
	194page
	상속 : 이미 만들어진 클래스를 재사용
		 --------------- 기존의 클래스 ( 사용자 정의, 라이브러리)
	포함 : 재사용
		 상속 / 포함
		 --	   --
				| 있는 그대로 사용
		  | 변경해서 사용
		  | 상속이 안되는 클래스 : final class
		  					 -----------
		  					 String, System, Scanner
	상속 : 상속을 내리는 클래스 : 공통으로 적용되는 내용 
		  상속을 받는 클래스 
		  	=> 유지보수가 편리하다
		  	=> 반복 제거
		  	=> 관리 용이
		  	=> 속도가 느리다
		  	=> 변경이 어렵다
		  	=> 가독성이 낮다 (소스를 볼 수 없기 때문)
		  	=> 1) 가독성 2) 최적화
		  	=> 가급적이면 상속을 하지 않음
		  		=> 웹, 모바일 
	=> 클래스를 상속 받아서 => 새로운 클래스 생성 (기존의 클래스 + 새로운 기능)
		
		예)
			공통 기능
			------ 게시판
			 글쓰기
			 상세보기
			 목록
			 수정
			 삭제
			 검색
			 
			묻고 답하기 extends 게시판
			 	답하기
			 
			답변 게시판  extends 게시판
				답변하기
			
			자유 게시판  extends 게시판 
			
			자료실  extends 게시판
			 
				다운로드 /업로드
			
			=> 소스를 줄일 수 있다
			=> 여러개 클래스 적용이 가능
			=> 필요시에는 변경해서 사용이 가능
			=> 윈도우 : 기존의 클래스 사용 => JFrame
				
*/
import java.util.*;

public class 재사용_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add(123.12);
		list.add('a');

		String name = (String) list.get(0);

		System.out.println(list.get(0));

		System.out.println(Arrays.toString(list.toArray()));
	}

}
