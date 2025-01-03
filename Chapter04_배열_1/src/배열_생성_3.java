

//1. 정수 입력 받아서 2진법 출력

import java.util.Scanner;
public class 배열_생성_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int INDEX=32;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("0~32767사이 정수 입력:");
		int num=scan.nextInt();
		//System.out.println(Integer.toBinaryString(num));
		// 저장 공간 0,1 => 16개
		int [] binary=new int[INDEX];
		//앞에서 => index=0, 뒤에서 => index=15
		//index=0 ==> 0부터 출력  FIFO => Queue
		//index=0 ==> 15부터 출력 LIFO => Stack
		
		int index=INDEX-1;

		while(true) {
			
			binary[index]=num%2;
			num/=2;
			
			if(num==0 ) {
				break;
			}
			index--;
			
		}

		for(int i=0; i<INDEX; i++) {
			
			if( i!=0 && i%4==0) {
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		
		}
		
	
	}

}
