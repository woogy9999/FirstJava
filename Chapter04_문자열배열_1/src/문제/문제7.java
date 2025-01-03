//7. 임의의 문자 5개를 저장하고 정렬해서 출력하시오 
//    A C D H J
//     A C D H J
//     J H D C A




package 문제;

import java.util.Arrays;

public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr=new char[5];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i]=(char)((Math.random()*26)+65);
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]<arr[j]) {
					char temp=0;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));	
		
		for(int i=4; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
