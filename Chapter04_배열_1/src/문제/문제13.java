package 문제;

import java.util.Arrays;

//13.3명의 학생에 대한 국어,영어,수학 점수를 입력받아서 저장후에 총점,평균,등수를 구하고 
// 국어점수 총점,영어점수 총점,수학점수의 총점을 구해서 출력하는 프로그램을 작성하시오
public class 문제13 {
	public static void main(String[] args) {
		
		int kor[]=new int[3];
		int eng[]=new int[3];
		int math[]=new int[3];
		
		double koravg=0,engavg=0,mathavg=0;
		double korsum=0,engsum=0,mathsum=0;
		
		for(int i=0; i<kor.length; i++) {
			
			kor[i]=(int)(Math.random()*100)+1;
			eng[i]=(int)(Math.random()*100)+1;
			math[i]=(int)(Math.random()*100)+1;

			korsum+=kor[i];
			engsum+=eng[i];
			mathsum+=math[i];
			
			
		}
		
		koravg= korsum/3;
		engavg= engsum/3;
		mathavg= mathsum/3;
		
		System.out.println("국어 총점: " + korsum +" 영어 총점 : "+engsum +" 수학 총점 : "+mathsum +" ");
		System.out.printf("국어 평균: %.2f 영어 평균 : %.2f 수학 평균 : %.2f \n",koravg,engavg,mathavg);
		System.out.println(Arrays.toString(kor));
		
		
	}
}
