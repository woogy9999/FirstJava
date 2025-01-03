import java.util.Arrays;

public class 배열_생성_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*3);
		System.out.print("컴퓨터:");
		String[] arr= {"가위","바위","보"};
		System.out.println(arr[com]);
		
//		
//		if(com==0) {
//			System.out.println("가위");
//		}else if(com==1) {
//			System.out.println("바위");
//		}else if(com==2) {
//			System.out.println("보");
//		}
//	
		
		for(String a:arr) {
			System.out.print(a+" ");
		}
		
		System.out.println(Arrays.toString(arr));
	
	}

}
