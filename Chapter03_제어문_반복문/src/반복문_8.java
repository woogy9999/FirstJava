//10개의 정수를 추출해서 최소값, 최대값을 구하는 프로그램
// 1~100까지의 난수

public class 반복문_8 {
	public static void main(String[] args) {
		int min = 100, max = 1, count = 0;
		for (int i = 1; i <= 10; i++) {

			int x = (int) (Math.random() * 100) + 1;

			if (x > max) {
				max = x;
			}
			if (x < min) {
				min = x;
			}
			if (x % 3 == 0) {
				count++;
			}
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("최소값은 " + min);
		System.out.println("최대값은 " + max);
		System.out.println("3의배수의 개수는 " + count);
	}
}
