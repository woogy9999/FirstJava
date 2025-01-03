

/*
**변수 / 연산자 /제어문 => 기본
**메소드 /객체지향 프로그램
**제어문 => 연산자가 응용
** ----배열
*		---메소드
*			---클래스
*
*	1.제어문
*	  조건문 : 사용자가 요청에 맞게 처리=> 필요하면 수행=> 건너뛴다
*			=================
*			검색 , 상세보기 , 로그인, 아이디 중복체크 . . .
*		= 단일 조건문 : 독립문장으로 실행
*		형식)
*			if(조건문) => 조건문에 사용되는 연산자
*						=================
*						부정연산자(!), 비교연산자(==,!=,<,>,<=,>=)
*						논리연산자(&&,||) =>반드시 true/false
*			{
*				조건문  true일때 실행하는 문장
*			}
*			=> 조건이 true면 문장 실행, false가 되면 건너뛴다.
*			=> 54page
*
*			55page 중첩 if문
*			if(조건문)
*			{
*				
*	  선택문 
*	  반복문
* 	  반복제어문



*/

import java.util.Scanner;

public class 자바제어문 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		// 반드시 new를 동적 메모리 할당
		// 자바 > 자동 메무리 회수 : 가비지컬렉션
		System.out.print("첫번쨰 정수 입력:");
		int num1=scan.nextInt();
		
		System.out.print("두번쨰 정수 입력:");
		int num2=scan.nextInt();

		System.out.print("연산자 입력(+,=,*,/):");
		char op=scan.next().charAt(0);
		//맨처음 문자를 읽는 경우에 사용 =charAt()
		//문자열은 0번부터 시작
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		System.out.println("op="+op);
		
		if(op=='+') {
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		}else if(op=='-') {
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		}else if(op=='*') {
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		}else if(op=='/') {
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다");
			}else {
				System.out.println(num1+"/"+num2+"="+(num1/num2));
			}
		}else {
			System.out.println("사용하지 않는 연산자를 입력하셨습니다.");
		}
	}
}




