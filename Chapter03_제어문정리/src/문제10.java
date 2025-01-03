//10. 사용자에게 문자열 3개를 입력받아
//길이값의 합을 출력하고, 가장 긴 문자열을 출력하기


import java.util.Scanner;
public class 문제10 {
	public static void main(String[] args) {
		System.out.println("문자열 3개를 입력하세요");
		Scanner scan=new Scanner(System.in);
		int i=1, sum=0, num1=0;
		while(i<=3) {
			String st=scan.nextLine();
			
			if(num1<st.length()) {
				num1=st.length();
			}
			sum+=st.length();
			i++;
		}
		System.out.println("길이의 합은 : "+sum);
		System.out.println("가장 긴 문자열은 : "+num1);
	}
}
