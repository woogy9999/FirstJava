// 점수를 입력받아서 학점 출력


public class 자바제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수 발생 => Math.random() =>0.0~0.99 => 0~100
		int score=(int)(Math.random()*101);
		System.out.println("score"+score);
		/*
		 * 변수 => 초기화
		 * 초기화=> 명시적인 초기화
		 * 			int a=10;
		 * => 난수 : 컴퓨터가 임의의 수를 추출
		 * 		Math.random()
		 * => 입력 : scan.nextInt()
		 * => 파일 읽기/ 데이터베이스...
		 * 자바 => 기본 문법 / 프로그램의 순서
		 *  최종 => 네트워크 : 게임
		 *	       *** 데이터베이스 : 웹 ==> 조별 프로젝트
		 *59page
		 */
		if(score>=90) {
			System.out.println(score+"점은 A등급입니다");
		}else if(score>=80){
			System.out.println(score+"점은 B등급입니다");
		}else if(score>=70){
			System.out.println(score+"점은 C등급입니다");
		}else if(score>=60){
			System.out.println(score+"점은 D등급입니다");
		}else{
			System.out.println(score+"점은 F등급입니다");
		}
	}

}
