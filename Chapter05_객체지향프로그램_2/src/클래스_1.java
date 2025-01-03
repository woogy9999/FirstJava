/*
	객체 지향 프로그램(OOP)
	-----------------
	1. 독립적으로 작동이 가능하게 실행
	   -----------
	   1) 변수 2) 메소드 => 모아서 연결
	   					--------- 객체
	   					--------- 설계 => 클래스
	   					
	   => 기계 : 부품 (객체) = 조립 (객체를 조합)
						   --- 재사용
	   => 부품 (컴포넌트) => 컴포넌트 여러개를 묶어서 조립
	   					 ---------------------
	   					 | 컨테이너
	   					 
	2. 변수가 많거나 소스가 길어지면 => 분석, 수정하기 어렵다.
	   => 보완
	   => 동일한 목적이나 기능을 수행하는 변수나 메소드 
		  한개의 파일을 제작(객체)
		  객체끼리 상호 통신(메소드) 전체 프로그램
		  ------------------------------
		  예)
		  	 컴퓨터
		  	 	CPU / 하드디스크 / 그래픽 카드 / 메모리 ...
		  	 	-----------------------------------
		  	 	| 메인보드 (조립)
		  	 	
	객체지향 프로그램 특징
	1. 회원관련 ... 사용자 데이터 보안 (데이터 보호)
		=> 캡슐화 / 정보은닉화
		=> 접근 지정어 (제어어)
		    public / protected / private / default
	
	2. 사이트 => 커뮤니티 (공지사항 , 묻고답하기, 자유게시판...)
		=> 재사용 : 필요시에는 수정, 추가
			--- 상속 / 포함
			 	---	  ---
			 	  	   | 있는 그대로 사용
			 	 | 메소드 변경 (기능)
			extends : 확장된 클래스 ...
    3. 재사용 => 수정 , 요청에 따른 추가 기능
    					| 오버로딩 (new)
    			(오버라이딩 => 기존의 기능 변경 => 상속 modify)
     => 상속 : 중복제거 => 메모리를 효율적으로 사용
     			단점) 속도가 느려진다 / 영향력이 크다
     					=> 스프링에서는 사용빈도가 거의 없다.
     
     1) 용어 
      	객체
      	클래스
      	멤버변수
      	공유변수
      	생성자
      	메소드
     -----------------------------------
     클래스 => 객체를 사용하기 위한 설계
     형식)
      		[접근 지정어][제어어] class className
      		{
      			--------------------------
      			객체 생성시마다 따로 메모리에 저장되는 변수
      			---------- new 생성자()
      			=> 멤버변수 :Heap => 다른 데이터형을 모아서 저장
      			메모리 공간을 한개만 만들어서 공유
      			=> 공유변수 => static
      			-------- 영화목록 / 음악목록/ 회원관리
      			-------- 오라클 (static) => 공유할 목적
      			--------------------------
      			변수에 초기화 => 생성자
      			--------- 없는 경우 (생성자를 생략)
      			*** 생성자가 없는 경우에는 컴파일러가 자동으로 생성
      			생성자가 없는 경우에는 컴파일러가 자동으로 생성

      		
      		}
     

*/
import java.util.Arrays;
class Member
{	//자동으로 초기화 된다
	/*
	 * 	int = 0
	 *  long = 0L
	 *  String = null
	 *  boolean = false
	 *  double = 0.0
	 *  
	 * 	=> 필요시 명시적 초기화
	 *  String id="hong";	
	 *  => 명시적 초기화가 불가능
	 *  	=> 구현해서 처리 (
	 *  	=> 쿠키 읽기 => 초기화
	 *  	=> 파일 읽기
	 *  	=> 데이터베이스 연동
	 *  	=> 생성자 / 초기화블럭
	 *  => 클래스 블럭에서는 선언만 가능
	 */
	String id;
	String name;
	// 생성자가 추가



}

class MemberSystem{
	static Member[] members=new Member[10];

}
public class 클래스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberSystem ms1=new MemberSystem();
		ms1.members[0]=new Member();
		ms1.members[0].id="home";
		ms1.members[0].name="홍길동";
		
		System.out.println("아이디:"+ms1.members[0].id);
		System.out.println("이름:"+ms1.members[0].name);
//
//		System.out.println("아이디:"+Arrays.toString(ms1.members));
//		System.out.println("이름:"+ms1.members[1].name);
		MemberSystem ms2=new MemberSystem();
		System.out.println("아이디:"+ms2.members[0].id);
		System.out.println("이름:"+ms1.members[0].name);

	}

}
