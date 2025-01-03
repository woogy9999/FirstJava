package com.sist.main; 
import com.sist.vo.*; // 라이브러리 , 사용자 정의 => 패키지가 다른 경우 import를 이용

public class SawonUserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon hong=new Sawon(1,"홍길동","개발부","대리","2021-10-10",3600);
		// 변수 => 읽기/쓰기 => 기능을 만든다
		// 초기화 => 생성자 =>변경이 불가능
		// 나머지 변경
		System.out.println("====홍길동 사원의 정보 ====");
		System.out.println("사번 : "+hong.getSabun());
		System.out.println("이름 : "+hong.getName());
		System.out.println("부서 : "+hong.getDept());
		System.out.println("직위 : "+hong.getJob());
		System.out.println("입사일 : "+hong.getRegdate());
		System.out.println("연병 : "+hong.getPay());
		
		hong.setDept("영업부"); //set은 메모리 주소값만 저장하고 있음 // hong.dept는 값을 가지고 있음.
		hong.setJob("과장");
		hong.setPay(4200);
	
	}

}
