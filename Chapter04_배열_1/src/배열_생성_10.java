/*
    중복없는 난수 => 3개 발생 (1~9)
    ===========================
    사용자 입력 
    3자리 입력 => 맞추는 프로그램 : 숫자 야구게임 
    힌트 
      369
      123 => 0S-1B
      346 => 1S-1B
      ==> 3S
 */

import java.util.Arrays;
import java.util.Scanner;

public class 배열_생성_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int[] com=new int[3];
		int[] user=new int[3];
		
		for(int i=0; i<com.length; i++) {
			com[i]=(int)(Math.random()*9)+1;
			
			for(int j=0; j<i; j++) {
				
				if(com[i]==com[j]) {
					i--; 
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(com));
		
		while(true) {
			
			System.out.println("세자리 정수를 입력");
			
			int input=scan.nextInt();
			
			if(input<100 || input>999) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
	
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=(input%10);

			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2]) {
				System.out.println("중복된 수는 사용할 수 없습니다");
				continue;
			}
			
			if(user[0]==0 ||user[1]==0 ||user[2]==0) {
				System.out.println("0은 사용할 수 없습니다.");
				continue;
			}
			//오류처리
			
			int s=0,b=0;
			for(int i=0; i<3; i++) {
				
				for(int j=0; j<3; j++) {
					
					if(com[i]==user[j]) {
						if(i==j) {
							s++; //같은자리
						}else {
							b++; //다른자리
						}
					}
					
				}
			}
			
			System.out.printf("Number:%d,Result:%dS-%dB\n",input,s,b);
			if(s==3) {
				System.out.println("정답입니다.");
				break;
			}
			
			
			System.out.println(Arrays.toString(user));
		}
		
	}

}
