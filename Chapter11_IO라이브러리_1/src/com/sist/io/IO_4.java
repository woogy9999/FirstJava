package com.sist.io;

import java.io.File;

import com.sist.model.*;
import java.util.*;

public class IO_4 {
	public static void main(String[] args) {

		Container c = new Container();
		Scanner scan = new Scanner(System.in);
		System.out.println("클래스 호출 :");
		String cmd = scan.next();

		I i = c.getBean(cmd); // 클래스를 모아서 정리 =Map
		i.execute();
		// 한개의 클래스로 통일 =인터페이스
	}
}
