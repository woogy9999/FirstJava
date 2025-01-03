package 문제;

import java.util.Arrays;

//7. 10개의 난수를 배열에 저장 후에 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력하시오

public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[10];
		
		for(int i=0; i<num.length; i++) {
			
			num[i]=(int)(Math.random()*10);
		}
		
		System.out.println("전체 배열");
		System.out.println(Arrays.toString(num));
		for(int i=0; i<num.length; i++) {
			
			if(i!=3) {
				System.out.print(num[i]+" ");
			}
		}
	}

}
