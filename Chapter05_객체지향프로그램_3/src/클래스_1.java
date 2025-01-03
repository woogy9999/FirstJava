/*
 * 		구성요소
 * 		=> 멤버변수
 * 			| 공통으로 사용하는 변수여부 (static)
 * 			| 정보 전체 /데이터 관리 => 오라클 (static)
 * 									| 공유된 데이터
 * 		=> 생성자 / 초기화 블럭
 * 		   ----- 생략이 가능 / 오라클 연동 (드라이버 등록)
 * 				 윈도우의 레이아웃
 * 				 웹 => 자동 로그인
 * 		static 블럭 : MyBatis 연동
 		=> 활용 => 메소드 ***
 					|다른 클래스 연동 (메세지)
 					|기능 처리 => 재사용
 					
 		1. 메소드 형식
 			[접근지정어][제어어] 리턴형 메소드명(매개변수...)
 										|0이상 => 여러개 사용이 가능
 								  | 변수 => 식별자
 								  	=> 소문자로 시작
 								  	=> 약간의 의미만 부여
 								  	=> 두개의 단어를 이용
 								  		파일 이름을 가지고 온다
 								  			 	--------
 								  	   getFileName() => 헝거리식 표기법
 								  	   get_file_name()
 								  	   _temp() => 임시 메소드 (테스트용)
 							| 사용자 요청한 결과값
 							  반드시 한개값만 설정
 							  - 없는 경우에는 void
 							  - 기본형 / 배열 / 클래스
 						=> static : 공통으로 적용되는 메소드
 						=> final : 종단 메소드 => 확장 , 변경이 불가능
 						=> abstract : 선언만 할때
 							--------
 							프로그램에 맞게 구현해서 사용
 							=> 버튼 => click();
 							=> 추상클래스 / 인터페이스
 							
 			=> 다른 클래스와 연결 => 공개 (public)
 			| public /protected/ private/ default
 											| 같은 폴더 안에서만 사용
 									| 자신의 클래스 영역에서만 사용 (은닉화)
 						| 같은 폴더(패키지)
 				|		  상속받은 클래스
 			 모든 클래스 사용이 가능
 			 
 		2. 메소드 호출
 		3. 메소드 종류
 */
public class 클래스_1 {
	public static void main(String[] args) {
		
	}
}
