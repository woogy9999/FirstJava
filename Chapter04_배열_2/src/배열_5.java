//6개의 난수 발생 => 중복이 없는 데이터 출력 (1~45사이의 난수)


import java.util.Arrays;

public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int lotto[]=new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			
			lotto[i]=(int)(Math.random()*45)+1;	
			
			for(int j=0; j<i; j++) {
				
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
			
		}
	
		
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}

}
