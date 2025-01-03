
// 4. 양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라

package 문제;

import java.util.Arrays;

public class 문제4 {

	public static void main(String[] args) {
		
		int num[]=new int[10];
		for(int i=0; i<num.length; i++) {
			
			num[i]=(int)(Math.random()*100)+1;
			if(num[i]%3==0) {
				System.out.print(num[i]+" ");
				
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(num));
	}
	
	
}
