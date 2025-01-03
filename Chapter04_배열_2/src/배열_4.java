//6개의 난수 발생 => 중복이 없는 데이터 출력 (1~45사이의 난수)
//=> 피망(고스톱) => 로직

import java.util.Arrays;

public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int lotto[]=new int[10];
		int su=0; // 난수 발생시 저장하는 변수
		boolean bCheck=false; // 중복 여부 확인
		
		for(int i=0; i<lotto.length; i++) {
			
			bCheck=true;
			while(bCheck) { //중복여부 확인
				
				su=(int)(Math.random()*45)+1;
				bCheck=false; //while만 종료
				
				for(int j=0; j<i; j++) {
					if(lotto[j]==su) { //저장된 데이터중에 난수와 같은 값이 있는지
						bCheck=true;
						break;
					}
				}
			}
			
			lotto[i]=su;
		}
//		
//		for(int i=0; i<arr.length; i++) {
//			
//			arr[i]=(int)(Math.random()*10)+1;	
//			
//			for(int j=0; j<i; j++) {
//				
//				if(arr[i]==arr[j]) {
//					i--;
//					break;
//				}
//			}
//			
//		}
		
		
		
		
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}

}
