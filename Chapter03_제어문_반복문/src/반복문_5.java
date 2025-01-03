//1~100 사이의 3의배수 합 , 5의 배수 합, 7의 배수합
public class 반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int three = 0;
		int five = 0;
		int seven = 0;
		for (int i = 1; i <= 100; i++) {
			//else if 를 하게 되면 중복 되기때문에 그냥 if문을 사용해야함.
			if (i % 3 == 0) {
				three += i;
			}
			if (i % 5 == 0) {
				five += i;
			}
			if (i % 7 == 0) {
				seven += i;
			}
		}

		System.out.println("1~100 까지 3의 배수의 합은 :" + three);
		System.out.println("1~100 까지 5의 배수의 합은 :" + five);
		System.out.println("1~100 까지 7의 배수의 합은 :" + seven);

	}

}
