package 문제;
//6. 10개의 난수를 배열 안의 모든 값을 더하고, 총합과 평균을 출력하시오.

import java.util.Arrays;

public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[10];
		double sum=0;
		double avg=0.0;
		for(int i=0; i<num.length; i++) {
			
			num[i]=(int)(Math.random()*10);
			sum+=num[i];
		
		}
		
		avg=sum/10;
		
		System.out.println("총 합은 : "+sum);
		System.out.printf("평균 값은 : %.2f",avg);
	}

}
