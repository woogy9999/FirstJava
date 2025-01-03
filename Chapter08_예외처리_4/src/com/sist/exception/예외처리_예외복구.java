package com.sist.exception;

/* static => 변수, 메소드 => 컴파일시에 메모리에 저장
// instance => 변수, 메소드 => 객체가 생성이 되면 메모리에 저장
 throws : 예상되는 에러를 선언만 한다
 throw : 고의로 예외를 발생 (테스트) => 견고성 확인
*/
public class 예외처리_예외복구 {
	public void display() throws Exception {
		System.out.println(10 / 0);
	}

	public static void main(String[] args) throws Exception {
		// 인스턴스는 사용이 불가능 => 사용시에 반드시 객체 생성 후 사용

		예외처리_예외복구 a = new 예외처리_예외복구();

//		try {
//			a.display();
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		a.display();
		System.out.println("정상수행");
	}
}
