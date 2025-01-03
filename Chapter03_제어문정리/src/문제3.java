//3.  1~100사이 정수 중에서 4의 배수이거나 7의 배수인 정수를 출력하기

public class 문제3 {
	public static void main(String[] args) {
		int i=1;
		
		while(i<=100) {
			
			if(i%4==0 || i%7==0) {
				System.out.print(i+" ");
			}
			i++;
		}
	}
}
