//2)	 정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 
//프로그램을 만들어라 (switch~case 사용) 


import java.util.*;
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요");
		int num1=scan.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		int num2=scan.nextInt();
		System.out.println("연산자를 입력하세요(+,-,*,/)");
		char op=scan.next().charAt(0);
		
		switch(op) {
		case '+' :
			System.out.println("num1 + num2 ="+ (num1+num2));
			break;
		case '-' :
			System.out.println("num1 - num2 ="+ (num1-num2));
			break;
		case '*' :
			System.out.println("num1 * num2 ="+ (num1*num2));
			break;
		case '/' :
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}else {
				System.out.println("num1 / num2 ="+	(num1/num2));
			}
			break;
		}
	}

}
