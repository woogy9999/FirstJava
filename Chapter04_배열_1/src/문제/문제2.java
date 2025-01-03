package 문제;

import java.util.Arrays;

//2. 10개의 임의의 정수를 받아서 최대값,최소값(난수)  구하는 프로그램 작성


public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[10];
		int max=0,min=100;
		for(int i=0; i<num.length; i++) {
			num[i]=(int)(Math.random()*10);

			if(num[i]<min) {
				min=num[i];
			}

			if(num[i]>max) {
				max=num[i];
			}
		}
		
		System.out.println(Arrays.toString(num));
		
		System.out.println("최소값은 : "+ min + " 최대값은 : " + max);
		
	}

}
