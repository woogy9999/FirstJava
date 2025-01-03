package 문제;
//4. 10개의 난수를 발생하여 배열에 저장한 후에 인덱스가 1인 곳의 값을 출력하시오.

import java.util.Arrays;

public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[10];
		
		for(int i=0; i<num.length; i++) {
			
			num[i]=(int)(Math.random()*10);
		}
//		System.out.println(Arrays.toString(num));
//		
//		for(int j=0; j<num.length; j++) {
//			
//			if(num[j]==1) {
//				System.out.println("1의 위치는 : "+j+" 번째 "+num[j]);
//				break;
//			}
//		}
//		
		System.out.println(Arrays.toString(num));
		System.out.println(num[1]);
//5. 위 문제 배열 중에서 최대값의 인덱스를 출력하시오. 
		int max=0;
		for(int i=0; i<num.length; i++) {
			if(num[i]>max) {
				max=num[i];
			}
			
		}
		System.out.println("max 값은 : "+max);
	}

}
