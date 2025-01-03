/*
	자바에서 제공하는 제어문
	잘 짠 프로그램 : 
	1. 가독성 
	2.최적화 
	3.유지보수 
	4. 공통모듈 =>AOP/인터셉트 
	->반복을 최대한 제거

	=반복제어문장
	 =break : 반복을 종료시에 사용 => switch, 반복문에서 사용
	 =continue : 특정 부분을 제외시에 사용 => 반복문에서만 사용이 가능

*/
public class 제어문정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				
				if((i+j==6)||(i==j)) {
					System.out.print("★");
				}else {
					System.out.print("☆");
				}
			}
			System.out.println();
		}
	}

}
