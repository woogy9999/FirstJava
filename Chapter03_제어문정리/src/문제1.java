//1. 구구단 중 원하는 단수 입력 받아 결과를 출력하기

import java.util.Scanner;

public class 문제1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 구구단 단수를 입력 : ");
		int dan=scan.nextInt();
		int i=1;
		while(i<=9){
			
			System.out.println(dan+"x"+i+"="+(dan*i));
			i++;
			
		}
	}
}
