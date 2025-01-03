package com.sist.main;

/*
	Collection Framwork
	1) 다수의 데이터를 쉽고 효율적으로 처리가 가능하게 만든 
		---------
		표준화된 클래스 집합 (자바에서 지원하는 하이브러리)
		-----
	2) 자료구조 => CRUD (읽기 / 추가 / 삭제 / 수정)
	3) 배열의 단점 보완 => 고정 => 가변
		=> 동적으로 변환 ( 메모리 추가 , 삭제 자동 조절)
	4) 단점 => 모든 데이터를 저장할 수 있다
			  -------- 제어하기 어렵다 (Object)
			  | 한가지 데이터형만 저장해서 사용하는 것을 권장
			    ----------------
			    | 제네릭을 이용한다
	=> 제네릭
		1) 데이터형 통일화 ( Object => 원하는 데이터형으로 변경)
		2) 소스가 간결하다
		3) 어떤 데이터를 저장하는지 확인이 가능(명시적)
		4) 형변환이 필요없다
		5) 컬렉션에서 주로 사용
		6) 제네릭을 지정시에는 반드시 클래스형으로만 사용이 가능
		   => 기본형은 사용 할 수 없다.
			  ------------------- 자바에 지원 => Wrapper
			  Wrapper : 기본형을 클래스화 
			  형식) List<int> => X
			  	   List<Integer>
			  	   List<double> => List<Double>
			  => T / E / K / V
			  				value => Object
			  			key => 문자열
			  		element => 클래스
			  	type => 클래스
			  
			  class Box<T>
			  {
			  	T t;
			  	public void setT(T t){ this.t=t }
			  	public T getT(){ return t }
			  }
			  Box box=new Box(); => T(Object)
			  Box<String> box=new Box<String>() => T => String
			  => T가 한번에 지정된 데이터형으로 변경
			  => 사용자 정의 클래스로 변경
			  Box<Sawon> => T => Sawon
			  
			  Collection => interface
			  	 |
      ----------------------------------
		List			Set				Map
	  순서가 있다		  순서가 없음	 	Map => 인터페이스
	  (인덱스)		  데이터 중복X    key value 동시에 저장
	  데이터 중복 허용					key 중복이 없다
	  								value 중복이 가능
	  	|
	  구현된 클래스
	  ArrayList
	  	데이터베이스 : 목록
	  	  => 브라우저로 전송
	  	  => 웹
	  LinkedList
	  	  => 수정 / 삭제 / 추가시 속도가 빠름
	  	  => 일반 윈도우(게시판)
	  Vector
	  	동기화 => 네트워크
	  	=> Vector 보완한 클래스
	  		ArrayList
	  => 같은 기능을 가지고 있다
	  	-----------------------
	  	add() 추가
	  	set() 수정
	  	get() 읽기
	  	remove() 삭제
	  	--------------- CRUD
	  				Create / Read / Update / Delete
	  				추가 	읽기		수정			삭제
	 	=> 오라클 INSERT 	SELECT	UPDATE	DELETE
	 	
	 	size() 저장갯수
	 	isEmpty() 데이터 있는지 확인
	 	clear() 전체 삭제
	 	------------------
	 	addAll() 다른 List,Set에 있는 데이터 복사
	 	
	 	
	 	Set
	 	*** => HashSet
	 	 => TreeSet
	 	 1) List에 데이터중에 중복제거
	 	 	--------------------- DITINCT
	 	 2) 순서가 없다 (인덱스가 없다)
	 	 3) 데이터 중복을 허용하지 않는다
	 	    => id /장바구니
	 	       ---------- Map
	 	    => 장르 / 부서 / 직위 /
	 	 4) HashSet : 속도가 빠르다
	 	 	TreeSet : 정렬 / 검색 / 
	 	 5) 주요 메소드 
	 	 	add() : 추가
	 	 	remove() : 삭제
	 	 	clear() : 전체 삭제
	 	 	iterator() : 한번 데이터를 모아서 출력
	 	 	----------
	 	 	headSet() / tailSet() 
	 	 	-------- 최신방문 
	 	 	
	 	// => 객체 저장 => 재정의
	 	 * 
*/

import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Sawon {
	private int sabun;
	private String name;

//	public int getSabun() {
//		return sabun;
//	}
//
//	public void setSabun(int sabun) {
//		this.sabun = sabun;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Sawon(int sabun, String name) {
//		this.sabun = sabun;
//		this.name = name;
//	}

//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return (sabun + name).hashCode();
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		if(obj instanceof Sawon) {
//			Sawon s=(Sawon)obj;
//			return name.equals(s.name) && sabun==s.sabun;
//		}
//		return false;
//	}

}

public class 컬렉션_1 {
	public static void main(String[] args) {
		Sawon s1 = new Sawon(1, "홍길동");
		Sawon s2 = new Sawon(1, "홍길동");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		Set<Sawon> set = new HashSet<Sawon>();
		set.add(s1);
		set.add(s2);
		System.out.println("저장 갯수 : " + set.size());
		/*
		 * 
		 * HashSet<Sawon> set=new HashSet<Sawon>(); Set<Sawon> set=new HashSet<Sawon>();
		 * == 인터페이스 == 유연성 set=new TreeSet<Sawon>();
		 * 
		 */
	}
}
