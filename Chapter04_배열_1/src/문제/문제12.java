package 문제;
//12. 10개의 정수를 입력받아서 짝수의 최대값,홀수의 최대값을 출력하는 프로그램을 작성하시오

import java.util.Arrays;

public class 문제12 {
	public static void main(String[] args) {
		
		int num[] =new int[10];
		int evenmax=0,oddmax=0;
		
		for(int i=0; i<num.length; i++) {
			num[i]=(int)(Math.random()*10)+1;
		}
		
		
		for(int i=0; i<num.length; i++) {
			
			if(num[i]%2==0 && evenmax<num[i]) {  //값이 짝수 + 짝수최대값보다 클때
				
				evenmax=num[i];
				
			}else if(num[i]%2==1 && oddmax<num[i]) { //값이 홀수 + 짝수최대값보다 클때
				oddmax=num[i];
			}
			
		}
		
		System.out.println(Arrays.toString(num));

		System.out.println("evenmax :" +evenmax);
		System.out.println("oddmax :" +oddmax);
		
	}
}
