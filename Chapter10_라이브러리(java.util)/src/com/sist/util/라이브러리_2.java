package com.sist.util;

import java.util.StringTokenizer;

// StringTokenizer

/*
		1. 자른 데이터를 읽기 => nextToken()
		2. 총 자른 갯수 : counterTokens()
		3. 자른 데이터가 있는 동안 : hasMoreTokens()
			=> 영화 출연진 => , 
		4. 
		5. 
 */
public class 라이브러리_2 {
	public static void main(String[] args) {
//		String data = "현빈, 박정민, 조우진, 전여빈, 박훈, 유재명";
//		StringTokenizer st = new StringTokenizer(data, ",");
//
//		System.out.println("출연 총인원:"+st.countTokens());
//		while (st.hasMoreTokens()) {
//			System.out.println(st.nextToken().trim());
//		}

		String make = "그릭요거트 4 큰 술, 땅콩버터 1 큰 술을 고르게 섞어 줍니다.^https://recipe1.ezmember.co.kr/cache/recipe/2024/12/05/c608f60aeb98bbd3116a764c0dde400e1_m.jpg";
		StringTokenizer st = new StringTokenizer(make, "^");
		System.out.println("레시피 제작법"+st.nextToken());
		System.out.println("레시피 이미지"+st.nextToken());
	
	
	}
	
}
