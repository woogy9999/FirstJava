package 문제;

import java.util.Arrays;

//6. int[] num = { 94, 85, 95, 88, 90 };다음 배열에서 최대값,최소값을 출력하는 프로그램을 작성하시오

public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 94, 85, 95, 88, 90 };
		int max=num[0];
		int min=num[0];
		
		for(int i=0; i<num.length; i++) {
			
			if(max<num[i]) {
				max=num[i];
			}
			if(min>num[i]) {
				min=num[i];
			}
			
			
		}
		System.out.println(Arrays.toString(num));
		System.out.println("max : "+ max);
		System.out.println("min : "+ min);
		
	}

}
