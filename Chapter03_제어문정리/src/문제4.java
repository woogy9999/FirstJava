//4. 1~100사이 정수중에서 일의 자리 수가 3 또는 6 또는 9인 정수를 출력하기

public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 100) {
			if ((i % 10 == 3) || (i % 10 == 6) || (i % 10 == 9)) {
				System.out.print(i + " ");
			}
			i++;
		}
	}

}
