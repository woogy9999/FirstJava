//1~100까지의 합	=> 67page
public class 반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; // 누적변수 => 초기값은 0, 누적곱=> 초기값 1
		int odd = 0, even = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i; // sum=sum+i;

			System.out.println("sum" + sum + ",i=" + i);

			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}

		}
		System.out.println("1~100까지의 총합:" + sum);
		System.out.println("1~100까지의 짝수합" + even);
		System.out.println("1~100까지의 홀수합:" + odd);

	}

}
