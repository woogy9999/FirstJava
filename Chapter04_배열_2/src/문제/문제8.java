//8. arr 배열 중에서 인덱스가 1인 곳의 값을 출력해보자.
//  int[] arr = { 10, 20, 30, 50, 3, 60, -3 };  


//9.  arr 배열 중에서 값이 60인 곳의 인덱스를 출력해보자. 
// int[] arr = { 10, 20, 30, 50, 3, 60, -3 };  

package 문제;

public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] arr= {10,20,30,50,3,60,-3};
		
		System.out.println(arr[1]);
			
		for(int i=0; i<arr.length; i++) {  //9번
			
			if(arr[i]==60) {
				System.out.println("인덱스 번호는 "+ i);
				break;
			}
			
		}
		// 지역변수 => 블럭변수 => 메모리에서 사라진다.
		// {}=> 메모리 자체에서 관리
		//      ---------Stack : 지역변수 / 매개변수
	}

}
