package com.sist;

import java.lang.reflect.Method;
import java.util.*;
import java.lang.annotation.*;

class MyBoard {

	@RequestMapping("write")
	public void write() {
		System.out.println("글쓰기 처리");
	}

	@RequestMapping("list")
	public void list() {
		System.out.println("목록 처리");
	}

	@RequestMapping("update")
	public void update() {
		System.out.println("수정 처리");
	}

	@RequestMapping("delete")
	public void delete() {
		System.out.println("삭제 처리");
	}

	@RequestMapping("find")
	public void find() {
		System.out.println("검색 처리");
	}
}

public class Board {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("글쓰기(write),수정(update),목록(list):");
		String cmd = scan.next();

//		MyBoard m = new MyBoard(); // 클래스
//		if (cmd.equals("wirte")) {
//			m.write();
//		} else if (cmd.equals("update")) {
//			m.update();
//		} else if (cmd.equals("list")) {
//			m.list();
//		}
		Class clsName = Class.forName("com.sist.MyBoard");// 클래스 이름만 주면 메모리 할당.
		Object obj = clsName.getDeclaredConstructor().newInstance();
		Method[] methods = clsName.getDeclaredMethods();
		for (Method m : methods) {
			RequestMapping rm = m.getAnnotation(RequestMapping.class);
			if (rm.value().equals(cmd)) {
				m.invoke(obj, null);

			}
		}

	}

}
