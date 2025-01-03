package com.sist.main;

import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 제네릭 / 어노테이션 / 열거형/ 리플렉션
@Data
@AllArgsConstructor // 매개변수 있는 생성자
@NoArgsConstructor // 매개변수 없는 생성자
class Member {
	private int mno;
	private String name;
	private String sex;
	private String address;
	private String phone;
}

public class 제네릭_Collection_2 {
	public static void main(String[] args) {
//		ArrayList<Integer> list=new ArrayList<Integer>();
//		
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
//		ArrayList<String> list=new ArrayList<String>();
//		list.add("홍길동");
//		list.add("홍길은");
//		list.add("홍길금");
//		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		
		//사용자 정의 데이터형을 이용한 데이터 추가
		ArrayList<Member> list=new ArrayList<Member>();
		list.add(new Member(1,"홍길동","남자","서울","010-1111-1111"));
		list.add(new Member(2,"홍길은","남자","경기","010-2222-1111"));
		list.add(new Member(3,"홍길금","여자","부산","010-3333-1111"));
		list.add(new Member(4,"금길동","남자","평양","010-4444-1111"));
		list.add(new Member(5,"은길동","여자","러시아","010-5555-1111"));
		
		//회원 => 인원수
		System.out.println("회원인원 : "+list.size());
		//회원 목록 출력
		for(Member m:list) {
			System.out.println(m.getMno()+" "+m.getName());
		}
		System.out.println("서울에 사는 회원 목록");
		for(Member m:list) {
			if(m.getAddress().equals("서울")) {
				System.out.println(m.getMno()+" "+m.getAddress());
			}
		}
	}
}
