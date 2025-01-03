package 문제;
//3. 100 개의 난수(0~9)를 발생하여 빈도수를 구하는 프로그램을 작성하시오

import java.util.Arrays;

public class 문제3 {
	public static void main(String[] args) {

		int nan[]=new int[10];
		
		for(int i=0; i<=100; i++) {
			
			int a=(int)(Math.random()*10);
			nan[a]++;
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(nan));
	}
}
