// 가급적 => 같은 기능의 변수가 3개 이상이면 => 배열
//		   다른 기능의 변수가 3개 이상이면 => 클래스 
/*
		int kor1,kor2,kor3; int[3] kor
		
		변수 여러개 ==> 일차원 배열
					=========> 이차원 배열
								========> 삼차원 
		===========================================
		1. 배열 생성
		   배열 : 연속적인 메모리 구조를 가지고 있다
		   	     ----------- 번호 (인덱스 번호)
		   인덱스 : => 항상 0번부터 순차적으로 
		   				--------------
		   				
		   배열 선언 : 
		   	데이터형[] 배열명; => 권장
		   	데이터형 배열명[]; => c/c++ 호환
		   	
		   배열 초기화		==> 데이터 메모리에 저장 : 저장하는 값
		   									---------- 초기화
		 ---------------------------
		

*/

public class 배열_생성_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 선언
		
		int arr[]=new int[5];
		//배열값 초기화
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100+1);
			//i=0~4
		}

		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
	
	
		System.out.println("=====배열값 출력=====");

		/*
			=> 출력용으로 사용 => for-each : 향상된 for문
			for(데이터형 변수 : 배열명(컬렉션))
							------------- 배열 /컬렉션만 사용이 가능
			{	-----		----배열에 선언된 데이터형과 동일
				  | 인덱스를 이용하지 않는다 => 실제 저장된 값을 순차적으로 가져옴
				  | 마지막 값을 읽어오면 자동 종료
				  | WEB의 Front의 핵심
				  | => 출력은 편한데 값 추가,변경 불가능
				  				 	   ----인덱스 번호
			}
		
			
			int[] arr={1,2,3,4,5}
			 arr(Stack)			Heap
			 						| 0x100의 첫번째 값
			 					arr[0] arr[1] [2] [3] [4]
			------				-----------------------
			0x100					1	 2     3   4   5
			------				|----------------------
								0x100
								
			int[] arr={1,2,3,4,5}
				| => 동일하거나 큰 데이터형을 사용
			
			for(int(long,double) 받는변수(a) : arr)
			 
								
								
								
								
		*/	
	}
	

}
