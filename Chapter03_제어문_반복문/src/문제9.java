//9)	 1~10 사이의 숫자 중 3의 배수를 제외하고 출력하라 (continue 사용)
public class 문제9 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=10; i++) {
			if(i%3!=0) {
				sum+=i;

			}
		}
		System.out.println(sum);
	}
}
