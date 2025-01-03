package com.sist.exception;

import java.util.Scanner;

public class 예외처리_일괄발생_1 {
	public static void main(String[] args) {

		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("국어 점수 입력:");
			int kor = scan.nextInt();
			if (kor < 0 || kor > 100) {

				// 잘못된 입력 => 직접처리
				// catch를 불러올 수 있다
				throw new IllegalArgumentException("정수는 0이상 100 이하만 가능합니다.");

				// catch로 이동
				// throw => 필요시에 의해 catch를 호출할 수 있다.
				// 아래는 코딩이 불가능하다
			}

		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
