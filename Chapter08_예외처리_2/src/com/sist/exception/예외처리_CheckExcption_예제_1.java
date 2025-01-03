package com.sist.exception;

import java.util.Arrays;

public class 예외처리_CheckExcption_예제_1 {
	public static void main(String[] args) {
		try {
			int[] lotto = new int[6];
			for (int i = 0; i < lotto.length; i++) {
				lotto[i]=(int)(Math.random()*45)+1;
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			
			Arrays.sort(lotto);
			
			for(int i:lotto) {
				Thread.sleep(1000);
				System.out.println(i+" ");
				
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("프로그램 종료");
		}
	}

}
