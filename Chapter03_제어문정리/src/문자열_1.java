
import java.util.*;

public class 문자열_1 {
	public static void main(String[] args) {
		final String ID = "admin";
		final String PWD = "1234";

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("ID를 입력하세요:");
			String id = scan.next();
			System.out.print("password를 입력하세요:");
			String pwd = scan.next();
			// Scanner => 정수 nextInt();
			// 문자열 : next()
			// 실수 : nextDouble()
			// 논리 : nextBoolean()
			//IgnoreCase 사용시 대소문자 구분 안함
			//반대효과 : !를 앞부분에 
			
			if (ID.equalsIgnoreCase(id) && PWD.equals(pwd)) {
				System.out.println("로그인 되었습니다.");
				System.out.println("메인 페이지로 이동합니다.");
				break;
			}else {
				System.out.println("ID또는 Password가 틀립니다");
				System.out.println("다시 입력하세요");
			}
		}
	}
}
