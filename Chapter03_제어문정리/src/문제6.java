//사용자에게 1 ~ 9사이의 정수를 입력받아 2자리의 자연수 중 각 자리수의 합이 입력값과 동일한 수 출력하기
//입출력예) 6 => 15 24 33 42 51 60 


import java.util.Scanner;
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1~9 사이의 정수를 입력하세요");
		Scanner scan=new Scanner(System.in);
		int ja=scan.nextInt();
		int i=10;
		while(i<=99) {

			int a=i/10; //앞자리
			int b=i%10; //뒷자리
			if(a+b==ja) {
				System.out.println(i+"");
			}
			i++;
		}
	}

}
