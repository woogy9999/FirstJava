import java.util.Arrays;

public class 배열_생성_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alph= {'A','B','C','D','E'};
		/*
			
		
		
		
		*/
		for(char c:alph) {
			System.out.print(c+" ");
		}
		System.out.println();
		alph[1]='K';
		alph[4]='M';
		

		for(char c:alph) {
			System.out.print(c+" ");
		}
		
		System.out.println(Arrays.toString(alph)); //한번에 배열 출력
	}

}
