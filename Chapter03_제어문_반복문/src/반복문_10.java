/*
	10개의 알파벳을 추출
	사용자가 입력 > 몇번쨰 위치하고 있는지 확인
	
	D3번째 위치하고 있음 > index 구하는 방법
			=>크롤링 (웹에서 데이터 수집)
			
	=> A~Z 사이 입력 => 몇번쨰 위치

*/
import java.util.Scanner;
public class 반복문_10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳을 입력(대문자만):	");
		char c=scan.next().charAt(0);
		//Scanner는 char를 가지고 오는 것이 없다.
		//첫번째 문자를 추출하는 것 > charAt(0)
		System.out.println("c=");
		
		System.out.println("몇번째 위치:"+(c-64));
		int index=1;
		for(char ch='A'; ch<='Z'; ch++) {
			if(ch==c) {
				break;
			}
			index++;
		}
		System.out.println(c+"는"+index+"번째 위치하고 있습니다.");
	}
}
