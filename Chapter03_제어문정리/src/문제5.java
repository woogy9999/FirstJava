//5. 사용자에게 문자열을 입력받아 모음의 개수를 출력하기 (a, e, i, o, u)

import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("영어 문자열을 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int j = 1;
		int a = 0,e=0,i=0,o=0,u=0;
		// System.out.println(str.length());
		while (j <= str.length()) {
			
			char c=str.charAt(j-1);
			if (c== 'a') {
				a++;
			} else if (c== 'e') {
				e++;
			} else if (c== 'i') {
				i++;
			} else if (c == 'o') {
				o++;
			} else if (c == 'u') {
				u++;
			}
			j++;
		}
		System.out.println("모음의 개수는 " +(a+e+i+o+u));
	}

}
