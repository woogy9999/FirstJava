import java.util.Scanner;

public class asdasd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력:");
		int year = scan.nextInt();

		System.out.print("월 입력:");
		int month = scan.nextInt();

		int total = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;

		int lastday[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {

			lastday[1] = 29;
		} else {
			lastday[1] = 28;
		}

		for (int i = 0; i < month - 1; i++) {
			total += lastday[i];
		}

		char c[] = { '일', '월', '화', '수', '목', '금', '토' };
		for (char cc : c) {
			System.out.printf(cc + "\t");
		}

		int week = total % 7;
		System.out.println();
		for (int i = 1; i < lastday[month]; i++) {

			if (i == 1) {
				for (int j = 0; j < week; j++) {
					System.out.print("\t");
				}
			}

			System.out.printf("%2d\t", i);
			week++;
			if (week == 7) {

				System.out.println();
				week = 0;
			}

		}

	}

}
