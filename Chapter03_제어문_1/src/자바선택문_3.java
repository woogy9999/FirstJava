// 입력 => 사칙연산

import java.util.Scanner;

public class 자바선택문_3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 지역변수 (stack)=>메모리, new 생성 (heap)개발용
		// 메소드 : 메소드Area...(static)
		System.out.print("첫번째 정수를 입력:");
		int num1 = scan.nextInt();
		// 키보드를 이용해서 정수 값 받기
		System.out.print("두번째 정수를 입력:");
		int num2 = scan.nextInt();

		System.out.println("연산자 입력(+,-,*,/):");

		switch (scan.next()) {
		case "+": // ::String
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			break;
		case "-": // ::String
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			break;
		case "*": // ::String
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
			break;
		case "/": // ::String
			if (num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			} else {
				System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
			}
			break;
		default:
			System.out.println("잘못된 연산자를 입력하였습니다.");
		}

	}
}
