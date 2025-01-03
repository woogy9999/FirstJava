/*
	3개의 정수를 받아서 평균/총점을 전송하는 메소드
	메소드화
*/
import java.util.*;
public class 메소드_5 {
	//절차적언어 => 한번 사용후 폐기
	
	static int userInput(int a) {
		Scanner scan=new Scanner(System.in);
		System.out.println(a+" 정수 입력:");
		int c=scan.nextInt();
		return c; 
	}
	//요청 처리 1
	static int total(int a, int b, int c) {
		
		return a+b+c;
	}
	//요청 처리 2	
	static double div(int total) {
		return total/3.0;
	}
	//출력
	static void print(int total, double avg) {
		
		System.out.println("평균:"+avg);
		System.out.println("총점:"+total);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3개의 정수 받기
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("1' 정수 입력:");
//		int a=scan.nextInt();
//		
//		System.out.println("2' 정수 입력:");
//		int b=scan.nextInt();
//		
//		System.out.println("3' 정수 입력:");
//		int c=scan.nextInt();
//		
//		double avg=(a+b+c)/3.0;
//		int total=a+b+c;
		
		int a=userInput(1);
		int b=userInput(2);
		int c=userInput(3);
		
		int total=total(a, b, c);
		double avg=div(total);
		
		print(total,avg);
		
		
	}
}
