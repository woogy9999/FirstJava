//한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라

import java.util.*;
public class 문제6 {
	public static void main(String[] args) {
		int sum=0;
		System.out.println("한개의 정수를 입력하세요");
		Scanner scan=new Scanner(System.in);

		int num=scan.nextInt();
		for(int i=1; i<=num;i++) {
			sum+=i;
		}
		System.out.println("1부터 입력 받은 정수까지의 합은 "+sum);
	}
}
