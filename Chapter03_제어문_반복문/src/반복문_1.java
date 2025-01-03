/*
	자바에서 제공하는 반복문 / 반복제어문
	=> 목록 출력
	=> 반복문의 종류
		1) for => 65page => 반복문중에 가장 많이 사용되는 제어문
			=> for / if
		2) while => 70page => 데이터베이스 / 파일읽기
		3) do~while =>75page =>  자바에서는 사용 빈도가 거의 없음.
		4) 쉬프트연산자/비트연산자/반전연산자 => 웹에서는 사용하지 않음
		
		자바/파이썬 => 데이터분석 (Numpy,Pandas,Matplotlib)
				 => Django <==>Spring
				 => ElasticSearch : NoSQL
				 	---------------google
*/
public class 반복문_1 {
	public static void main(String[] args) {
		for(int i=1; i<=20; i++) {
			System.out.println("hello java"+i);
		}
	}
}
