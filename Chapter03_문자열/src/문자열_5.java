//1. 대소문자가 있는 문자열을 입력 받아서
// 대문자는 소문자로 소문자는 대문자 변경
// 예) abdDeF => ABDdEf
//2. 문자열을 입력 받아서 역순으로 출력하는 프로그램 작성
// 예) abcde =>edcba

// toString() : 객체의 주소 => 오버라이딩
import java.util.Scanner;
public class 문자열_5 {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자열 입력하세요");
		Scanner scan = new Scanner(System.in);
		String abc=scan.next();
		String ch="";
		System.out.println("변경 전 : "+abc);
		for(int i=0; i<abc.length(); i++){
		
			char c=abc.charAt(i);
			
			
			if(c>='A' && c<='Z') {
				//ch+=(char)(c+32);
				
				ch+=Character.toLowerCase(c);
			}else if(c>='a' && c<='z') {
				ch+=Character.toUpperCase(c);
			}
			
		}
		
		System.out.println("변경 후 : "+ch);
		
		System.out.println("2.문자열 입력하세요");
		
		String str2=scan.next();
		for(int i=str2.length()-1; i>=0; i--) {
			System.out.print(str2.charAt(i));
		}
		System.out.println(new StringBuffer(str2).reverse());
	}
}
