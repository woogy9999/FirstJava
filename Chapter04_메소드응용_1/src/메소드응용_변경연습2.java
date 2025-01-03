import java.util.Scanner;

public class 메소드응용_변경연습2 {

	static int[] ran() {

		int[] com = new int[3];
		// => 변수 => 여러개 (배열)
		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 9) + 1;
			// double random()

			for (int j = 0; j < i; j++) {
				// 중복되어 있는지 검사
				if (com[i] == com[j]) {
					i--;// 같은 정수가 있는 경우 다시 난수 발생
					break;
				}
			}
		}
		return com;
	}

	static int[] userInput() { // 3자리 확인

		int input1 = 0;
		int[] user = new int[3];
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("세자리 정수를 입력하세요>>");
			int input = scan.nextInt();
			input1 = input;
			if (input < 100 || input > 999) {
				System.out.println("세자리 정수만 입력해야 됩니다!!");
				continue;

				// continue 사용시
				// for = 증가식으로 이동
				// while = 조건식으로 이동
				// => 특정 부분을 제외
				// => 웹에서는 사용 빈도가 적다
			}
			// 3자리 정수에 잘라서 => 배열에 저장
			user[0] = input / 100; // 365/100=>3
			user[1] = (input % 100) / 10; // 365%100 => 69/10
			user[2] = input % 10;
			// => 코딩테스트 => 화폐매수 구하기 14850

			// 오류 처리 ==> 중복된 수가 없어야 된다 , 0을 사용하면 안된다
			if (user[0] == user[1] || user[1] == user[2] || user[0] == user[2]) {
				System.out.println("중복된 숫자는 사용할 수 없습니다!!");
				// 처음부터 다시 시작
				continue;
			}
			if (user[0] == 0 || user[1] == 0 || user[2] == 0) {
				System.out.println("0은 사용할 수 없습니다!!");
				continue;
			}

			return user;
		}
	}

	static int compare(int[] com, int[] user) {
		// 비교
		int s = 0, b = 0;
		/*
		 * i=0 => j=0,j=1,j=2 i=1 => j=0,j=1,j=2 i=2 => j=0,j=1,j=2
		 * 
		 */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (com[i] == user[j]) { // 같은 숫자가 있다면
					if (i == j) { // 같은 자리수
						s++;
					} else { // 다른 자리에 존재
						b++;
					}
				}
			}

		}
		hint(s, b, user);
		return s;
	}

	static boolean isend(int s) {
		// 종료 여부 확인
		if (s == 3) {
			System.out.println("Game Over!!");
			return true;
		} else {
			return false;
		}

	}

	static void hint(int s, int b, int[] user) {
		// 힌트를 제공

		System.out.println("Input Number:" + user[0] + user[1] + user[2]);
		System.out.println("===== 전광판 =====");
		System.out.print("S:");
		for (int i = 0; i < s; i++) {
			System.out.print("●");
		}
		System.out.println();
		System.out.print("B:");
		for (int i = 0; i < b; i++) {
			System.out.print("○");
		}

		System.out.println("\n================");
	}

	static void process() {
		int[] ran = ran(); // 랜덤 3자리 발생

		while (true) {
			int[] user = userInput(); // 세자리인지 중복 숫자가 있는지 확인 => 유저가 입력한 값
			int s = compare(ran, user); // 랜덤 3자리랑 유저가 입력한 값이랑 비교

			if (isend(s)) {
				System.out.println("정답입니다.");
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
