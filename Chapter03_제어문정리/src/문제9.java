//9. 사용자가 입력한 5개의 정수 중 가장 큰 값을 출력하기

import java.util.Scanner;
public class 문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("5개의 정수를 입력하세요");
		Scanner scan=new Scanner(System.in);
		
		int max=0;
		int i=1;
		while(i<=5) {
			int num=scan.nextInt();
				
			if(num>max) {
				max=num;
			}
			i++;
		}
		System.out.println("가장 큰 정수는 "+max);
	}

}
