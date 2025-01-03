
public class 메소드_1 {

	// 1~10까지 출력하는 메소드를 구현하시오
	static void print() {
		for (int i = 0; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// 1~10까지 합을 구하는 메소드를 구현하시오

	static void sum() {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
		
			sum+=i;
		}

		System.out.println(sum);
	}
	// 1~n까지 합을 구하는 메소드를 구현하시오

	static int sum1(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
		
			sum+=i;
		}

		return sum;
	}
	
	//두 정수의 나눗셈 결과를 구하는 메소드를 구현하시오(실수)

	static double div(int a,int b) {
		double dd=(double)(a+b)/2;
		
		return dd;
	}
	
	//문자열의 소문자를 대문자로 바꾸는 메소드를 구현하시오
	static String Upper(String s) {
		
		String aa=s.toUpperCase();
		
		return aa;
	}
	static void Upp(String k) {
		
		System.out.println(k.toUpperCase());
	}
	
	//6. 문자열을 입력받아서 좌우 대칭인지 확인하는 메소드를 구현하시오
	static boolean str(String s) {
		
		char arr[]=s.toCharArray();
		
		for(int i=0; i<arr.length/2; i++) {
			
			if(arr[i]!=arr[arr.length-i-1]) {
				
				System.out.println("대칭이 아닙니다");
				return false;
			}
		}
		System.out.println("대칭입니다");
		return true;
	}
	//7. 문자열을 거꾸로 출력하는 메소드를 구현하시오

	static void rev(String s) {
		
		char arr[] =s.toCharArray();
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	//8. 학점을 구하는 메소드를 구현하시오
	
	static char score(int a) {
		
		if(a<=100 && a>=90) {
			
			return 'A';
		}else if(a<90 && a>=80) {
			
			return 'B';
		}else if(a<90 && a>=80) {
			
			return 'C';
		}else if(a<90 && a>=80) {
			
			return 'D';
		}else {
			
			return 'F';
		}
	}
	// 9 년도를 입력받아서 윤년인지 여부를 확인하는 메소드를 구현하시오

	static boolean yoon(int a) {
		
		if((a%4==0 && a%100!=00) || a%400==0) {
			System.out.println("윤년입니다.");
			return true;
		}else {
			System.out.println("윤년아닙니다.");
			return false;
		}
		
		
	}
	//10. 두수를 입력받아 큰 수를 출력하는 메소드를 구현하시오.

	static void big(int a, int b) {
		
		if(a>b) {
			System.out.println("큰수 : "+ a);
		}else {
			System.out.println("큰수 : "+ b);
		}
	}
	//11. 입력 받은 값이 짝수인지 홀숨인지 판별하는 메소드를 구현하시오

	static void oddeven(int a) {
		
		if(a%2==0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다.");
		}
	}
	
	//12. 3의 배수를 판별하는 메소드를 구현하시오

	static void three(int a) {
		
		if(a%3==0) {
			System.out.println("3의배수입니다.");
		}else {
			System.out.println("3의배수가 아닙니다");
		}
	}
	
	//13. 년,월,일을 입력받아서 요일을 구하는 메소드를 구현하시오
	
	static String cal(int a,int b,int c) {
		
		String[] arr= {"일","월","화","수","목","금","토"};
		
		int total=(a-1)*365+(a-1)/4-(a-1)/100+(a-1)/400;
		
		int lastday[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(yoon(a)) {
			lastday[1]=29;
		}else {
			lastday[1]=28;
		}
		
		for(int i=0; i<b-1; i++) {
			total+=lastday[i];
		}
		total+=c;
		int aa=total%7;
		System.out.println(arr[aa]);
		
		
		
		
		return "d";
		
	}
	//14. 메소드를 정의하여 입력받은 숫자를 거꾸로 뒤집은 쉬를 출력하는 프로그램을 작성하세요
	
	static void rev2(int a) {
		
		String aa=String.valueOf(a);
		System.out.println(new StringBuffer(aa).reverse());
		
		String a2=String.valueOf(a);
		
		for(int i=a2.length()-1; i>=0; i--) {
			System.out.print(a2.charAt(i));
		}
		
	}
	
	public static void main(String[] args) {

		print();
		sum();
		int n=5;
		System.out.println(sum1(n));
		System.out.println(div(5,2));
		System.out.println(Upper("abcd"));
		Upp("defg");
		str("ABBA");
		rev("abcde");
		int grade=score(90);
		System.out.println("학점 : " + grade);
		boolean a=yoon(2024);
		System.out.println(a);
		big(10,2);
		oddeven(45);
		three(9);
		cal(2024,12,4);
		rev2(12345);
	}
}