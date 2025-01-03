package 문제;
//9 char 배열을 생성하여, 알파벳 A~Z까지 대입 후, 출력하시오

import java.util.Arrays;
import java.util.Collection;

public class 문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ca[] =new char[26];
		int k=0;
		
		for(char i='A'; k<26; i++) {
			
			ca[k]=i;
			k++;
		}
		System.out.println(Arrays.toString(ca));
	
	
//10. 위문제를 역순으로 출력하시오

		for(int i=25; i>=0; i--) {
			System.out.print(ca[i]+" ");
		}
	
	}

}
