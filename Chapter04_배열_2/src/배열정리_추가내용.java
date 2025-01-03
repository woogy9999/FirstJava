/*
	배열 복사
	=얕은 복사 (Call By Reference) => 주소에 의한 참조
			=> 같은 메모리를 이용
	=깊은 복사 => 새로운 배열 생성 (메모리 공간이 따로 생성) 


*/
public class 배열정리_추가내용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		int[] arr_copy=arr.clone(); //clone => 값을 복사하여 새로운 배열 생성 => 깊은 복사 => 아바타 =< adapter
		System.out.println("arr="+arr);
		
		System.out.println("arr_copy"+arr_copy);
	
		arr_copy[0]=100;
		arr_copy[1]=200;
		arr_copy[2]=300;
		arr_copy[3]=400;
		arr_copy[4]=500;
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i:arr_copy) {
			System.out.print(i+" ");
		}
	}

}
