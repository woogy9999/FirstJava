/*
 *   1. 관련된 데이터를 묶어서 저장 => 사용 
 *      ----------
 *      | 다른 데이터형을 묶어서 관리 
 *      | 공통사용여부 , 따라 저장여부 
 *        ---------   ----------
 *        static       instance 
 *   2. 배열보다 => 클래스형을 더 많이 사용한다 
 *   3. 일반 데이터형과 동일하게 사용 => 사용자 정의 데이터형 
 *   4. 접근시 => 
 *      Student std=new Student() => 메모리 할당 
 *      ------- --- --- ---------
 *                      | 변수 초기화하는 함수 => 생성자
 *                   | 동적 메모리 할당
 *              | 객체
 *      데이터형 
 *      
 *      => 변수에 접근 방식 
 *         인스턴스 변수 => 객체명.변수명  
 *         ------- 개인마다 따라 저장 
 *         static 변수 => 클래스명.변수명 / 객체명.변수명
 *         ------- 한개의 공간에 저장 
 *         -------| 싱글턴 (클래스 객체를 한번만 사용) 
 *         
 *         *** 특별한 경우가 아니면 static 변수는 거의 없다
 *         -----------------------------------------
 *     => 객체 지향 프로그램은 클래스와 클래스의 연관관계
 *        => 다른 클래스에서 변수 / 메소드 
 *        => 자판기 
 *           사람 : 동전을 투입 
 *        -------------------------------
 *        예) 
 *            사이트 => 게시판 => 메뉴 
 *         
 */
public class 클래스_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}