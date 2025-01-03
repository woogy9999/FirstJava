/*
		1. 클래스 구조
		
		
		메소드는 사용자 정의시에는 반드시 호출
		인스턴스
			객체명.메소드(값)
			=> 다른 클래스에 사용시에는 객체를 생성한 후에 접근
			=> scan.nextInt();
		static
			=> 클래스명.메소드(값) => 자동 메모리 할당
			=> Math.random()
		
		
		2. 멤버변수
		 	멤버변수 : Heap
		 	정적변수 : MethodArea
		 	매개변수 : Stack => 메모리 자체 관리=> 자동으로 {} 사라진다
		 	
		 	public : 클래스는 필요시 모든 클래스에서 사용이 가능
		 				생성자 , 메소드
		 	static{}을 사용하는 방법 => static 변수로 배열/클래스 => 초기화시에 주로 사용
		 										------- 라이브러리 
		 							=> 블럭엔에서는 static만 초기화가 가능
		3. 생성자
		4. 메소드
		5. 접근지정어
		6. 캡슈화
		7. 패키지
		--------------------
		상속/ 포함 / 클래스 종류 (7장 추상클래스 / 인터페이스)
		 | 오버라이딩
		8장 : 예외처리
		------------------- 자바 문법
		9장 : java.lang / java.util (Collection)
		10장 : java.io / java.net / java.text
		11장 ~ 12장 => java.sql
					  -------- 오라클 연동 
		
		


*/
public class 객체지향_정리 {
	static int a=1;
	int as=2;
	static void k(){
		a=2;
	}
	void p() {
		as=4;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
