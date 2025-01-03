/*

	1. 변수 = 한개만 저장하는 공간 , 변경이 가능
		   =>1. 메모리 저장 , 2. 값 읽기 , 3. 수정이 가능
	   --- 
	   1) 지역변수 : 메소드안에서 선언되는 변수
	   2) 멤버변수
	   3) 공유변수
	   -----------------------------------------
	   => 변수를 저장하기 위해서는 반드시 필요한 내용
	      -------------------------------------
	   		메모리 크기 결정 / 클래스 (JVM에서 크기를 모른다)
	   							--------------
	   							| new => 새로운 메모리 생성
	   	 기본형
	   	 ----
	   	 정수 : byte(1byte), int(4byte), long(8byte) 
	   	 		-128~127	-21억4천 ~ 21억4천 /그이상
	   	 실수 : double(8byte) =>소수점 15자리 이상
	   	 논리 : boolean(1byte) => true/false
	   	 문자 : char(2byte)	=> 0~65535	
		---------------------------------------
		참조형 : 배열 / 클래스 (***String,Integer,ArrayList)
			  오라클 : Connection / Statement / ResultSet
	   							
	   							
	   							
	   메모리 저장
	   --------------------------------------
	   MethodArea : Method / static (공유변수)
	   --------------------------------------
	   Stack : 메모리 자체에서 관리 => 지역변수
	   		   {}이 종료가 된 경우 사라짐
	   --------------------------------------
	   Heap : 실제 데이터 공간 : 클래스/배열
	   		  자동으로 해제되지 않는다 => 개발자가 처리
	   		  new / delete: => 가비지 컬렉션 
	   		  				   자동 메모리 회수
	   		  => 메모리 저장
	   		  	--------- 확인 int malloc() => new
	   		  			  해제 free() => delete
	   --------------------------------------
	   
	   --------------------------------------


*/

class A{
	int a,b,c,d,e;
}



public class 자바1_3_정리 {
	//맴버변수 => 자동 초기화
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 지역변수 => 초기화가 안된다
		
		String s1="hello";
		String s2="hello"; // 문자여 자체가 메모리 주소
		String s3=new String("hello");
		if(s1==s3) {
			System.out.println("동일");
		}else {
			System.out.println("동일하지 않음");
		}
		System.out.println(s3);
		System.out.println(s2);
		/*
		 * A a=new A();
		 * 
		 * for(int i=1; i<=100; i++) { System.out.println("a="+a); }
		 */
	}

}
