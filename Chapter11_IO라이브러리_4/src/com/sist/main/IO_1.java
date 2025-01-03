package com.sist.main;

import java.io.Serializable;
/*
 	객체 단위로 저장
 	------------
 	네트워크 / 일반 프로그램을 설정
 	------
 	1. 값 형식 데이터
 	   int / float / char ... 스택에 저장 직접 접근이 가능
 	2. 참조 형식 데이터
 	   객체 => 주소만 저장 => 실제 데이터는 Heap에 저장
 	=> 네트워크 전송
 	   값 자체를 저장후에 전송
 	   => 실제 값을 저장후에 전송
 	=> 다른 프로그램 : CSV / JSON => 자체에서 값을 저장된 상태에서 전송
 	
	참조 => 값 : 시리얼라이즈 (직렬화)
			=> implements Serialize
	=> 값을 받을 경우에는 다시 => 참조형으로 저장 (역직렬화)
			=> ObjectOutputStream / ObjectInputStream 사용
			=> 원상 복구가 가능
	=> 초창기에는 많이 사용 => 오라클 
	
	직렬화


*/
import java.util.*;
import java.io.*;
// 객체의 실제값을 스택(실제 저장 값) => 다른 컴퓨터로 전송
// 직렬화 => 빅데이터 분석 => 하둡 => 파이썬 (넘파일 , 판다스)

// => 지하철 혼잡도 , 날씨 예측 , 범죄 예측 , 자동차 리필
// => data.go.kr : 공공포털
// => 최종 프로그램 : 스프링 <==> 장고 (웹연동)
// => 채팅 => NodeJS

/*
	Heap => 병렬 방식
			-------
			-------
			-------
			------- 객체의 실제값 저장
	Stack => 직렬
			----------------------
			|	|	|	|	|	|
			----------------------
			
			병렬 => 직렬 (직렬화)
			직렬 => 병렬 (역직렬화)
	
			100|id|pwd|name|
 */
class Sawon implements Serializable {
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private int pay;

	public int getSabun() {
		return sabun;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public Sawon(int sabun, String name, String dept, String job, int pay) {
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.pay = pay;
	}

	// 디폴트 생성자
	public Sawon() {

	}
	// 값을 저장

}

public class IO_1 {
	public static void main(String[] args) {
		List<Sawon> list = new ArrayList<Sawon>();
		// Object=> 데이터를 모아서 저장이 가능
		list.add(new Sawon(1, "홍길동", "개발부", "사원", 5200));
		list.add(new Sawon(2, "가나다", "영업부", "과장", 9200));
		list.add(new Sawon(3, "라마바", "인사부", "부장", 13200));
		list.add(new Sawon(4, "사아자", "총무부", "이사", 33200));
		list.add(new Sawon(5, "차카파", "기획부", "회장", 23200));
		ObjectOutputStream oos = null;
		try {
			File file = new File("c:\\java_data\\sawon_info.txt");
			if (!file.exists()) { // 파일이 없다면
				file.createNewFile(); // 파일을 만든다
			}
			FileOutputStream fos=new FileOutputStream(file);
			
			oos=new ObjectOutputStream(fos);
			
			//저장
			oos.writeObject(list);
			System.out.println("객체 단위 저장 완료!~");
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				oos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
