
//사칙연산
import java.util.Scanner;

public class 메소드_2 {

	static int plus(int a,int b) {
		int c=a+b;
		return c;
	}
	static int minus(int a,int b) {
		int c=a-b;
		return c;
	}
	static int gop(int a,int b) {
		int c=a*b;
		return c;
	}
	static String div(int a,int b) {
		String result="";
		if(b==0) {
			result="0으로 나눌 수 없습니다.";
		}else {
			result=String.valueOf(a/(double)b);
			
		}
		return result;
	}
	
	static void process() {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		System.out.print("두번째 정수 입력:");
		int num2=scan.nextInt();
		
		System.out.println("연산자 입력 :");
		String op=scan.next();
		
		if(op.equals("+")) {
			
			System.out.println(num1+"+"+num2+"="+plus(num1, num2));
			
		}else if(op.equals("-")) {
			System.out.println(num1+"-"+num2+"="+minus(num1, num2));
		}else if(op.equals("*")) {
			System.out.println(num1+"*"+num2+"="+gop(num1, num2));
		}else if(op.equals("/")) {
			System.out.println(num1+"/"+num2+"="+div(num1, num2));
		}else {
			System.out.println("사용할 수 있는 연산자가 아닙니다.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
