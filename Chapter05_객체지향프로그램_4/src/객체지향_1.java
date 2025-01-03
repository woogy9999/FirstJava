


/*
 	객체를 만들때 사용하는 키워드 (설계)
 	-----------------------클래스
 	메모리에 저장 후 사용
 	-----------인스턴스
 	118page
 	=> 객체에 대한 설계
 	=> 클래스의 구성요소
 	class ClassName
 	{
 		----------
 		멤버변수
 		----------
 		생성자
 		----------
 		메소드
 		----------
 	}
 	
 	=> 1) 메소드 2)접근지정어 3)상속 4)포함
 	   5) 클래스의 종류 (추상클래스 , 인터페이스)
 	=> 예외처리 => 라이브러리 (Collection,IO,SQL,netWork)
 	=> 프로젝트 / 오라클 => 시작 크롤링
 	=> 브라우저 
 	=> 서버연결 => JSP 1차
 	=> 스프링 (2차) => 파이썬(데이터분석,ElasticSearch)
 	=> 개인 => 최신기술 => 취업목적
 	=> AWS => 리눅스 기반 => 운영체제를 빌려서 사용 (1년 무료)
 	=>옵션(MSA=>Cloud=>CI/CD)
 	 
 	 
 	 
 	 생성자 : 변수에 대한 초기화 담당, 시작과 동시에 처리 기능
 	 		=> 생략이 가능
 	 			---------> 컴파일러에 의해 자동으로 추가
 	 						매개 변수가 없는 생성자 (디폴트 생성자)
 	 		=> 특징
 	 			1) 클래스명과 동일한다
 	 			2) 리턴형이 존재하지 않는다
 	 			3) void:리턴형 => 결과값이 없는 경우
 	 			
 	 			 
*/
class A
{
	void disp(int a)
	{
		System.out.println("idsp() Call"+a);
	}
}
public class 객체지향_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa=new A();
		aa.disp(100);
		A bb=new A();
		bb.disp(10);
	}

}
