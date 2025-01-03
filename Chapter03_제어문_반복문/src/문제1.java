//1)	100점 만점으로 성적을 입력 받아 90~100이면 A
//,80~89이면 B,70~79이면 C, 60~69이면 D, 60점 이하면 F를 출력하라 (switch~case 사용)


import java.util.Scanner;
public class 문제1 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan=new Scanner(System.in);
		int score=scan.nextInt();
		score=score/10;
		switch(score) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			
		}
	}
}
