/*
	문자열 분리 / 자르기 / 변경 / 찾기
	=charAt(int index)
	

*/
// 사용자의 문자열 입력값을 받아서 => a A가 몇개인지 확인
import java.util.Scanner;
public class 문자열_4 {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub String data="Hello Java";
		 * System.out.println("첫번째 문자:"+data.charAt(0));
		 * System.out.println("마지막 문자:"+data.charAt(data.length()-1));
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 입력:");
		String data="";
		while(true) {
			System.out.print("문자열 입력:");
			data=scan.nextLine();
			if(data.length()%2==0) {
				break;
			}else {
				System.out.println("문자 개수가 짝수여야 합니다");
			}
		}
		boolean bCheck=true;
		int j=data.length()-1;
		for(int i=0; i<data.length()/2; i++) {
			char s=data.charAt(i);
			char e=data.charAt(j);
			System.out.println(s+""+e);
			if(s!=e) {
				bCheck=false;
				break;
			}
			j--;
		}
		System.out.println("======결과값=====");
		if(bCheck==true) {
			System.out.println(data+"는 좌우 대칭입니다.");
		}else {
			System.out.println(data+"는 좌우 대칭이 아닙니다.");
		}
		/*		int count=0;
			for(int j=0; j<data.length(); j++) {
			
			char ch=data.charAt(i);
			//System.out.println(ch);
			if(ch=='a' || ch=='A') {
				count++;
			}
			
			
			
		}
		System.out.println("a나 A의 갯수:"+count);
		*/
		
	}

}
