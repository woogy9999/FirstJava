
import java.util.Arrays;

public class 배열응용_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr=new char[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(char)((Math.random()*26)+65);
		}
		System.out.println("정렬 전 : ");
		for(char c: arr) {
			System.out.print(c+" ");
		}
		System.out.println("\n정렬 후: ");
		
		for(int i=0; i<arr.length-1; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]<arr[j]) {

					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println((i+1)+"Round"+Arrays.toString(arr));
		}
		for(char i:arr) {
			System.out.print(i+" ");
		}
	}

}
