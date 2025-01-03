/*
	10개의 정수를 임의로 추출 (1~100) => max, min
	=> max의 위치 / min의 위치

*/

import java.util.Arrays;

public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num[]=new int[10];
	//	int max=0,min=100;


for(int i=0; i<num.length; i++) {
			num[i]=(int)(Math.random()*100)+1;
			
		}
	
		int max=num[0];
		int min=num[0];
		
		for(int i:num) {
			 
			if(max<i) {
				max=i;
			}
			if(min>i) {
				min=i;
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		int maxIndex=0;
		int minIndex=0;
		
		
		for(int i=0; i<num.length; i++) {
			
			if(num[i]==max) {
				maxIndex=i;
			}
			if(num[i]==min) {
				minIndex=i;
			}
		}
		System.out.println(Arrays.toString(num));
		System.out.println("max값의 인덱스 : "+maxIndex);
		System.out.println("min값의 인덱스 : "+minIndex);
	}

}
