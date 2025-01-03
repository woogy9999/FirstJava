package com.sist.map;

/*

	주요사용처
	웹 => 90% 정도가 Map형식을 사용
	--
	사용자가 보내준 데이터 정보
	HttpServletRequest
	=> request.setAttribute("key","value")
	 => ?id=admin
	브라우저로 보내는 정보
	 HttpServletResponse
	  response.serAttribute("key",Object)
	브라우저에 저장하는 정보
	 Cookie
	 	new Cookie(key,value)
	서버에 저장하는 정보
	 HttpSession
	 	session.setAttribute("id","hong")
	 	
	 => 스프링 
	 	key, 객체 => Factory 패턴
	 	=> 클래스 관리자 (생명주기)
	 => MyBatis
	 	key,SQL
	 => 주요 메소드
	 	clear() : 전체 삭제 
	 	get(): 데이터 읽기 => get(key)
	 	put() : 데이터 저장
	 	isEmpty() : 데이터 존재여부 확인
	 	size() : 저장 갯수
	 	keySet() : 키값 전체를 가지고 온다
	 	values() : 값 전체를 가지고 온다
	 	
*/

// 간단한 장바구니
import java.util.*;

public class Map_1 {
	public static void main(String[] args) {

		String[] data = { "사과", "배", "수박", "귤", "참외", "메론", "바나나" };

		Map<String, Integer> cart = new HashMap<String, Integer>();

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("===== 과일 목록 ====");
			System.out.println("1.사과");
			System.out.println("2.배");
			System.out.println("3.수박");
			System.out.println("4.귤");
			System.out.println("5.참외");
			System.out.println("6.메론");
			System.out.println("7.바나나");
			System.out.println("9.종료");
			System.out.println("==================");
			System.out.print("과일 선택:");
			int f = scan.nextInt();
			if (f == 9) {
				break;
			}
			cart.put("f_" + f, f);
			// --------- 중복이 안되게 만든다
		}
		// 장바구니 종료
		if (cart.isEmpty()) {
			System.out.println("장바구니가 비어있습니다.");

		} else {
			System.out.println("장바구니에 담긴 갯수 :" + cart.size());
			for (String key : cart.keySet()) {
				// ketSet => 등록된 모든 키를 읽어온다
				int value = cart.get(key);
				System.out.println(data[value - 1]);
			}
		}

	}
}
