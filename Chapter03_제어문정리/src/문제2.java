//2. 1~100사이 정수 중에서 8의 배수 출력하기

public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=100) {
			if(i%8==0) {
				System.out.print(i+" ");
			}
			i++;
		}
	}

}
