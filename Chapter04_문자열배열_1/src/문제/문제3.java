// 3. 크기가 10인 정수형 배열을 생성하고 여기에 0부터 9까지의 값으로 배열을 채우는 프로그램 만들기



package 문제;

import java.util.Arrays;

public class 문제3 {
	public static void main(String[] args) {
		int arr[]=new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=i;
		}
		System.out.println(Arrays.toString(arr));
	}
}
