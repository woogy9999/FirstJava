/*
	***1)length()
	*
	***indexOf : 찾는 문자의 첫번쨰 문자 번호 추출 => 대소문자 구분
	*
	***lastIndexOf : 뒤에서부터 요청된 문자의 인덱스
	원형 => int lastIndexOf(char c)
		   int lastIndexOf(String s)
		   =>URL / 파일경로 / 확장자 
		   
		   예) String msg="Hello Java"
		      			  0123456789
		      int len=msg.indexOf('a'); =>7
		      int len=msg.lastIndexOf('a'); =>9
		      
	익숙하게 만들어야함.
	
	검색 관련
	***contains() : 포함 문자 => 오라클에서는 %검색어%
	=> 일반 검색기
	-----------------------------------------
	원형)
		boolean contains(String s)
						---------
						포함된 문자
						|포함된 경우 : true
						|포함이 안된 경우 : false
		=> 사용되는 제어문 : if
		=> 정규식 
		// 제목 / 내용 / 가수명 / 출연진
	-----------------------------------------
	서제스트 : 자동 완성기
	 => 네이버 / 구글 => 완성기 => 쿠키(저장해서 뿌려주거나, 구글 API를 가져올 수 있음)
	 						 ---- 타켓형 광고
	----------------------
	startsWith / endsWith
	    |			|
	    		끝나는 문자열이 같은 경우 
	 시작하는 문자열이 같은 경우 =>자음 (오라클 => Procedure(오라클 함수))
	---------------------------------------------------------
	원형)
		***boolean startsWith(String s)
			   			   --------- 문자열 시작
			=> 웹에서 방문한 맛집 (쿠키)
				food_1 food_2
			=> 검색기
			
		*** 공백
		boolean endsWIth(String s)
						 --------- 문자열 끝
	--------------------------------------------------------- 
	변환
	replace() =>문자/문자열 변환
	---------------------------------------------------------
	원형
		String replace(char old,char new)
		String replace(String old,String new)
	---------------------------------------------------------
		String msg="Hello Java"
		String s=msg.replace('a','b')
		s=Hello Jbvb"
		String s=msg.replace("Java","Oracle");
		s="Hello Oracle"
		
		raplaceAll() => 전체 변경
	---------------------------------------------------------
		String replaceAll(string regex,String s)
						  ---------------------
						  패턴을 적용해서 변경
						  ----------
						  정규식
	=> [0-9]{1,3}\\,[0-9]{1,3}\\,[0-9]{1,3}\\,[0-9]{1,3}
		ip => 모든
		198.63.11.1
		맛있는 맜있고 맛있니 => 맛있* (* => 한글자 이상 들어온다)
	---------------------------------------------------------
	***8) trim() : 좌우의 공백만 제거
	---------------------------------------------------------
	=>입력여부 => 데이터를 자르는 경우에 공백을 제거
	원형
	String trim()
	
	String msg=" Hello Java " ;
	String s=msg.trim()
	 => s="Hello Java"
	 ---------------------------------------------------------
	
	
 9)	toUpperCase() : 대문자 변환
	toLowerCase() : 소문자 변환
	---------------------------------------------------------
	원형)
		String toUpperCase()
		String toLowerCase()
		
	예) String msg="Java"
	   String s=msg.toUpperCase()
	   		  s="JAVA"
	   String s=msg.toUpperCase()
	   		  s="java"
	   		  
	   		  
	 ***10)valueOf ==> 모든 데이터형을 문자열로 변환
	 ---------------------------------------------------------
	 원형)
	 	중복메소드 정의 =>메소드명이 동일
	 	 String valueOf(int i)
	 	 String valueOf(char i)
	 	 String valueOf(boolean i)
	 	 String valueOf(double i)
	 	 String valueOf(float i)
	 	 String valueOf(byte i)
	 	 String valueOf(char[] i)
		=>static으로 제작 => 공통적인
		  --------- 변수선언 없이 클래스명으로 접근 가능
		  String.valueOf()
		  => Math.random()
		  Scanner scan=new
	 ---------------------------------------------------------
	 ***substring() : 문자열 자르기
	 ---------------------------------------------------------
	 원형)
	 	String substring(int begin)
	 		begin부터 마지막 문자열까지 자르기
	 		예)
	 		   String s="aaa.java";
	 		   String ext=s.substring(4); => java
	 		   		=>indexOf,lastIndexOf
	 	String substring(int begin,int end)
	 			String s="Hello Java";
	 			=>중간에 자르는 경우 (어디서 어디까지)
	 			=>s.substring(2,5)
								-- 미포함
								=> end-1
				전화번호 : 010-1111-1111
						000-000
	 ---------------------------------------------------------
	 ***split() : 단어별 구분
	 -------------------------------------------
	 원형)
	 	String[] split(String regex)
	 	== 1|제목|출연|상영일...
	 -------------------------------------------
	13) format() : 변환
	 -------------------------------------------
	 원형)
	 	String format(String s,Object obj...)
	 	//가변 매개변수 => 원하는 갯수만큼 사용이 가능
	 	format("%d %d %d",10,20,30)
	 	=> %.2f (소수점 이하 두자리)
	 	
	 	
	 ------------------------------------------
	 ***14) equals() : ==(저장된 문자열을 비교)
	 -------------------------------------------
	 원형)
	 
	 	boolean equals(String s)
	 	=>로그인처리, 아이디 찾기
*/
import java.util.*;
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String msg="Hello Java"; //int len=msg.indexOf("Java"); // 없는 문자일 경우 -1반환.
		 * //System.out.println(len); if(msg.contains("va")) {
		 * System.out.println("포함되어 있습니다"); }else{
		 * System.out.println("포함되지 않는 문자열입니다."); }
		 */
		
		/*
		 * String msg=" Hello Java"; if(msg.trim().startsWith("Hello")) {
		 * System.out.println("yes");
		 * 
		 * }else { System.out.println("No"); }
		 */


//		String[] data= {
//				"자바와 JSP",
//				"혼자 배우는 자바",
//				"스프링과 자바",
//				"자바의 정석",
//				"자바 기초",
//				"스프링 부트와 자바"
//		};
//		Scanner scan=new Scanner(System.in);
//		System.out.println("검색어 입력");
//		String fd=scan.next();
//	
//		for(String d:data) {
//			
//			if(d.endsWith(fd)) {
//				System.out.println(d);
//			}
//		}
//	
		int a=10;
		int b=20;
		String k="abc";
		System.out.println(a+b);
		System.out.println(String.valueOf(a)+String.valueOf(b));
		System.out.println((char)a+(char)b);
		System.out.println(k.startsWith("b"));
		System.out.println("여기까지");
		System.out.println(k.toString());
	}

}
