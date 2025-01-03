/*
	메소드 호출 => 매개변수
	1) Call By value
		=>값만 전송
	2) Call By Reference
		---------------
		주소 : 배열 / 클래스
		---------------
		클래스중에 제외 : String (일반 데이터형)
		
		=>주소값 전송
		
		
*/
public class 메소드_6 {
	//Call By value => 값만 전송 => 복사본
	static void swap(int a,int b) {
		
		System.out.println("swap메소드에 진입... =>2");
		System.out.println("사용자가 요청한 값 =>3");
		System.out.println("swap=> 변경 전:");
		System.out.println("a="+a);//4
		System.out.println("b="+b);//5
		System.out.println("swap메소드 요청 완료 =>6");
		int temp=a;
		a=b;
		b=temp;
		System.out.println("swap=> 변경 후:");
		System.out.println("a="+a);//4
		System.out.println("b="+b);//5
		System.out.println("swap메소드 요청 완료 =>6");
		
	}
	// 시작 = 종료 = 자동호출
	// 사용자 정의는 자동 호출이 안된다.
	// Trace => 디버깅 => F6
	public static void main(String[] args) {
		
		System.out.println("main 시작 =>1");
		int a=10;
		int b=20;
		System.out.println("main => 변경 전:");
		System.out.println("a="+a);//4
		System.out.println("b="+b);//5
		swap(a,b);

		System.out.println("swap=> 변경 후:");
		System.out.println("a="+a);//4
		System.out.println("b="+b);//5
		System.out.println("main 종료 => 프로그램 종료 =>7");
	}
}
