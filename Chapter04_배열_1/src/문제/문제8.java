package 문제;
//8. 5개의 난수를 배열에 저장한 후에 인덱스번호 두개를 받아서 값을 교환하는 프로그램을 작성하시오


import java.util.Arrays;
import java.util.Scanner;
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[5];
		
		for(int i=0; i<num.length; i++) {
			
			num[i]=(int)(Math.random()*10);
			
		}
		System.out.println("기존 배열 값");
		System.out.println(Arrays.toString(num));
		
		System.out.println("변경하고 싶은 인덱스 번호 2개를 입력하세요 (0~4)");
		Scanner scan=new Scanner(System.in);
				
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=0;
		c=num[b];
		num[b]=num[a];
		num[a]=c;
		
		System.out.println(Arrays.toString(num));
		
		
		
	}

}
