//3)	 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
public class 문제3 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("2+4+6+....100까지의 정수의 합은 "+sum);
	}
}
