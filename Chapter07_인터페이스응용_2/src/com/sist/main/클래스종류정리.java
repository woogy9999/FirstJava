package com.sist.main;
/*
 *   응용 (X) 
 *   -------
 *   => 목적
 *       => 추상클래스 / 인터페이스 => 같은 기능 
 *                    --------
 *                    | 추상클래스의 기능 보완 
 *                    | 기능별로 모아서 처리 
 *                      -----
 *                      = 윈도우 이벤트 처리
 *                      = Collection 
 *                        1) 순서가 있다 , 중복 데이터 저장 허용 
 *                           List => ArrayList/LinkedList/Stack
 *                                                 |
 *                                                Queue
 *                        2) 순서가 없다 , 중복 데이터 저장을 허용하지 않는다
 *                           Set => TreeSet / HashSet
 *                        3) 키,값을 동시에 저장 , 키 중복이 없다 , 값을 중복이 가능 
 *                           Map => HashMap , Hashtable 
 *                       = 기능별 분리 
 *                       = 데이터베이스 
 *                         = Connection / Statement / ResultSet 
 *                       = 네트워크 연결 
 *                         = Socket 
 *                       = 쓰레드 
 *                         = Thread => run()
 *                -------------------------- 라이브러리 
 *                사용자 정의 => 인터페이스 , 추상 클래스 
 *                          => 공통으로 적용되는 기능 
 *                          => 웹 : 사용자 요청 받기 
 *                                 처리 결과값 보내기 
 *                 | 관련된 클래스 모아서 관리 
 *                   -------------------- 인터페이스 
 *                   
 *   => 형식 
 *   => 기능 : 상속 / 형변환 / 오버라이딩 
 *            ---------------------
 *   => 업체 (스프링 가능,데이터베이스,JavaScript) 
 *           | 자바포함 JSP 포함    | Jquery,NodeJS, VueJS..
 *   
 *   => 상속 
 *      --- 기존의 클래스의 기능을 받아서 재사용 
 *      --- 추상클래스 : extends => 단일 상속
 *      --- 인터페이스 : implements => 다중 상속
 *                                  -------- 윈도우 
 *      --- MVC구조를 만드는 경우 => 인터페이스 => 어노테이션 
 *      --- 라이브러리에서 지원하는 인터페이스를 주로 사용 
 *          ---------------
 *          | 기능 처리가 여러개인 경우
 *            CGV / 롯데시네마 / 메가박스 => 기능 구현 (선언)
 *          | 기능 설계 => 개발속도가 빠르다 
 *            -------
 *   => 상속시에 메모리 할당 
 *      => 상속받은 클래스만 이용 
 *         class A
 *         class B extends A
 *         
 *         => B b=new B();
 *      => 상속내리는 클래스 이용 
 *         class A
 *         class B extends A
 *         A a=new B(); => 추상클래스 / 인터페이스 
 *                         ------------------
 *                         | 자신의 생성자를 이용해서 메모리 할당이 불가능 
 *         => 클래스가 미완성이기 때문에 메모리 할당을 할 수 없다 
 *                   -----
 *                   | 메소드가 구현이 안된 상태 
 *      => 상속 : extends 
 *         => 제외 : static / 초기화블럭 / 생성자 
 *      => 상속 
 *         상속을 받은 내용을 그대로 사용 / 변경해서 사용 
 *         *** 변경 (오버라이딩) 
 *         오버라이딩 => 추상 클래스 / 인터페이스 
 *         --------
 *         1) 상속 
 *         2) 메소드 , 리턴형 , 매개변수 동일 
 *         3) 접근지정어는 확장만 할 수 있다 
 *         => 클래스간의 크기 
 *         ---------------------------------
 *            상속내린 클래스 > 상속받은 클래스 is-a
 *            클래스안에 클래스 포함하는 경우   has-a
 *         ---------------------------------   
 *         
 *         class A
 *         class B   => 비교 불가능 
 *         
 *         class A
 *         class B extends A  ==> A>B 상속
 *         
 *         class A
 *         {
 *         }
 *         class B
 *         {
 *             A a=new A();  ==> B>A 포함 
 *         }
 *         
 *         
 *         class String extends Object
 *         class StringBuffer extends Object
 *         
 *         instanceof => 클래스와 클래스의 크기를 비교할때 사용하는 연산자
 *         ---------- 예외처리에 주로 사용 
 *         
 *            Object
 *              |
 *         -------------
 *         |            |
 *       String      StringBuffer
 *       
 *             동물
 *              |
 *         ------------
 *         |          |
 *        말          소
 *        
 *   1) 형식
 *      추상클래스 => 클래스는 public 
 *      [접근지정어] abstract class ClassName
 *      {
 *          ---------------------
 *          변수 / 생성자 
 *          ---------------------
 *           구현된 메소드 
 *          ---------------------
 *           ***
 *           선언된 메소드 : 추상 메소드 
 *           public abstract 리턴형 메소드명(매개변수..);
 *                  --------
 *           => 클래스마다 공통으로 사용되는 기능 
 *              => 구현이 다른경우에 처리 
 *              1) 게시판 
 *                 목록 출력 
 *                 => 일반 게시판 => 문자열 
 *                 => 갤러리 게시판 => 이미지
 *                 => 자료실  => 파일 다운로드 
 *          ---------------------
 *      }
 *      
 *      인터페이스 
 *       => 공통적인 기능만 설정 
 *       => ---------- 프로그램마다 구현이 다른 경우 
 *          => 목록 => 상세보기 
 *                    (댓글) => 예약 , 찜하기 , 좋아요 ...
 *             레시피 / 맛집 / 여행지 
 *          => SQL문장 
 *       => 구성 요소 
 *       public interface 인터페이스명
 *       {
 *          --------------------
 *            변수 => 상수형변수만 사용 
 *            (public static final) 데이터형 변수=값;
 *            -------------------
 *             생략을 하면 자동 추가
 *             
 *             int a=10;
 *          --------------------
 *            선언된 메소드 
 *            (public abstract) 리턴형 메소드명(매개변수);
 *            ---------------
 *             생략이 가능 => 자동 추가
 *             
 *            public 리턴형 메소드명(매개변수..);
 *                  |
 *                 abstract
 *          --------------------
 *            (public) default 리턴형 메소드명(매개변수)
 *            {
 *            }
 *          --------------------
 *            (public) static 리턴형 메소드명(매개변수)
 *            {
 *            }
 *          --------------------
 *          *** 인터페이스는 구성요소가 public이다 
 *              only public 
 *       }
 *       
 *       *** 서로다른 클래스 여러개 묶어서 한개의 이름으로 제어할 때 
 *           주로 사용 
 *       *** 인터페이스는 여러개 상속이 가능 (다중 상속) 
 */
public class 클래스종류정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Object obj=new Object();
        String str="";
        StringBuffer sb=new StringBuffer();
        
        if(obj instanceof Object)
        {
        	System.out.println("obj는 Object클래스 객체");
        }
        if(str instanceof Object)
        {
        	System.out.println("OK");
        }
        if(sb instanceof Object)
        {
        	System.out.println("OK");
        }
        if(obj instanceof String)
        {
        	System.out.println("OK");
        }
		/*
		 * if(sb instanceof String) { System.out.println("OK"); }
		 */
	}

}