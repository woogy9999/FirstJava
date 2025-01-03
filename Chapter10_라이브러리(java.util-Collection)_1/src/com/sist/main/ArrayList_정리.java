package com.sist.main;

/*


	순차적으로 출력하는 방법
		iterator()
		listIterator
		=> 출력이 어려운 경우
	=> Set => 복사가 가능
	
	==> ArrayList
	단순한 목록형 데이터를 관리하기 용이
	-------------------데이터베이스 (오라클)


 */

import java.util.*;

public class ArrayList_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("박문수");
		list.add("심청이");
		list.add("강감찬");
		list.add("가나다");
		list.add("심청이");
		list.add("강감찬");
		list.add("카타파");
		list.add("박문수");
		// 중복된 데이터 첨부가 가능

		for (String name : list) {
			System.out.println(name);
		}
		System.out.println("=======복사=====");
//		ArrayList<String> list2 = new ArrayList<String>();
//		list2.addAll(list);
//		
//		for(String name:list2) {
//			System.out.println(name);
//		}

		
		// 코딩 테스트 
		Set set = new HashSet();  //Set 은 중복을 허용하지 않음
		set.addAll(list);
		// 중복을 허용하지 않는다 => 순차적(X) 관리하기 어렵다
		// Set(중복 제거 ) => ArrayList로 이동
		

		ArrayList<String> list2 = new ArrayList<String>();
		list2.addAll(set);
		for (String name : list2) {
			System.out.println(name);
		}
	}

}
