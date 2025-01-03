//1. 5명의 학생의 국어점수를 받아서 등수를 출력하는 프로그램 작성

package 문제;


import java.util.Arrays;
import java.util.Scanner;
public class 문제1 {
	public static void main(String[] args) {

		System.out.println("5명 학생의 점수를 입력하세요");
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[5];
		int arr2[]=new int[5];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i]=scan.nextInt();

		}
		
		for(int i=0; i<arr.length; i++) {
			
			arr2[i]=1;
			
			for(int j=0; j<arr.length; j++) {
				
				if(arr[i]<arr[j]) {
					arr2[i]++;
				}
			}
		}
		System.out.println(Arrays.toString(arr2));
		
	}
}
