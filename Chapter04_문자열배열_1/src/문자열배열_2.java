import com.sist.data.*; //사용자 정의
import java.util.Scanner;


public class 문자열배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 데이터 읽기
		String[] fdata=ArrayData.korEng;
		// 데이터 확인 / 출력
		
		Scanner scan=new Scanner(System.in);
		System.out.print("과일명을 입력 : ");
		String f=scan.next();
		
		
		for(String ff:fdata) {
			if(ff.contains(f)) {
				
			String change=ff.substring(ff.indexOf(":")+1);
			System.out.println(ff+"는(은) 영어로 "+change);

			}
		}
		
	}

}
