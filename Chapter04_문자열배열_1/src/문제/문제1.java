//1. (1차배열)1번 학생 100점 2번 학생 90점 3번학생 85점이다. 점수를 score 배열 변수에 저장하고 
//1) 아래와 같이 출력하시오.
//1번 학생 : 100점  
//2번 학생 : 90점  
//3번 학생 : 85점  


package 문제;

public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[]= {100,90,85};
		int sum=0;
		for(int i=0; i<score.length; i++) {
			System.out.print(i+1+" 번 학생 : "+score[i]);
			System.out.println();
			sum+=score[i];
		}
		//2) 학생들의 총점을 출력하시오.

		System.out.println("학생들의 총점 : "+sum);
	}

}
