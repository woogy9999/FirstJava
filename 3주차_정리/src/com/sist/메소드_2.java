package com.sist;

import java.util.*;

import javax.net.ssl.SSLContext;

import java.io.*; // 파일 , 네트워크 전송 : 읽기/쓰기
// Input / Output => io => 반드시 예외처리

public class 메소드_2 {
	static String seoulData; // 자동 초기화 => null
	// 초기화 (자동) => 초기화 블럭

	static {
		try {

			FileReader fr = new FileReader("c:\\javaDev\\seoul_location.txt");
			int i = 0;
			StringBuffer sb = new StringBuffer();
			while ((i = fr.read()) != -1) {

				sb.append((char) i);

			}

			seoulData = sb.toString();
			fr.close();
		} catch (Exception ex) {
		}
	}
	

	static void menu() {
		System.out.println("===========메뉴==========");
		System.out.println("1. 명소 목록"); // 페이징
		System.out.println("2. 명소 상세보기");
		System.out.println("3. 명소 검색(명소명)");
		System.out.println("4. 명소 검색(주소)");
		System.out.println("5. 종료");
		System.out.println("========================");

	}

	static void seoulList(int page) {

		String[] seoul = seoulData.split("\n");
		int i = 0;
		int j = 0;
		final int ROWSIZE = 20;
		int seoulNo = (page * ROWSIZE) - ROWSIZE;

		for (String s : seoul) {
			if (j < 20 && i >= seoulNo) {

				String[] md = s.split("\\|");
				System.out.println(md[0] + "." + md[1]);
				j++;
			}
			i++;
		}

	}

	// 상세보기 => 데이터
	static void seoulDetail(int seoulNo) {
		String[] movie = seoulData.split("\n");
		// 영화 정보 전체 => \n
		for (String s : movie) {
			// 영화 한개 => 정보 => |
			String[] info = s.split("\\|");
			// info[0] => String
			/*
			 * String int | |===> valueOf int String ---- parseInt()
			 */
			if (info[0].equals(String.valueOf(seoulNo))) {
				System.out.println("명소:" + info[1]);
				System.out.println("소개:" + info[2]);
				System.out.println("주소:" + info[3]);

				break;
			}
		}
	}

	static String[] find(int type, String findData) {

		// 확인 => 검색된 갯수?
		String[] datas = seoulData.split("\n");
		int count = 0;
		for (String seoul : datas) {

			String[] sd = seoul.split("\\|");
			String ss = "";
			if (type == 1) {
				ss = sd[1];
			} else {
				ss = sd[3];
			}

			if (ss.contains(findData)) {
				// System.out.println(sd[1]+"--"+sd[3]);
				count++;
			}

		}
		String[] data = new String[count]; // 동적으로 처리된다.
		int i = 0;
		for (String seoul : datas) {

			String[] sd = seoul.split("\\|");
			String ss = "";
			if (type == 1) {
				ss = sd[1];
			} else {
				ss = sd[3];
			}

			if (ss.contains(findData)) {
				// System.out.println(sd[1]+"--"+sd[3]);
				data[i] = sd[1] + "--" + sd[3];
				i++;
			}

		}
		return data;
	}

	// 조립
	static void process() {

		Scanner scan = new Scanner(System.in);
		while (true) {

			menu();
			System.out.print("메뉴 선택:");
			int m = scan.nextInt();
			switch (m) {
			case 5:
				System.out.println("프로그램 종료!!");
				System.exit(0);// 0=> 정상 종료 -1:비정상 종료
			case 1:
				// 고민 => 데이터를 받아서 출력, 메소드 안에서 출력
				System.out.println("페이지 입력 : ");
				int page = scan.nextInt();
				seoulList(page);
				break;
			case 2:
				System.out.print("명소 선택(1~273):");
				int no = scan.nextInt();
				seoulDetail(no);
				break;
			case 3:
			case 4:
				System.out.print("명소(1),주소(2):");
				int type = scan.nextInt();
				System.out.print("검색어 입력:");
				String fd = scan.next();
				String[] ss = find(type, fd);
				for (String s : ss) {
					if (s != null)
						System.out.println(s);
				}
				break;
			}
		}
	}

	// 시작 => 자동 호출 메소드 => 전체 프로젝트에 한개 이상 main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
