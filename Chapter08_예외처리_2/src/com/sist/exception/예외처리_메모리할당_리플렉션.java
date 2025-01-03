package com.sist.exception;

import java.lang.reflect.Method;

//Class.forName("") => ClassNotFoundException
//CheckException => 반드시 예외처리 후 사용

class Movie {
	public void display() {
		System.out.println("Movie:display() Call...");
	}
}

public class 예외처리_메모리할당_리플렉션 {
	public static void main(String[] args) {
		// Movie m=new Movie();
		// m.display();

		try {
			Class clsNmae = Class.forName("com.sist.exception.Movie");
			// 클래스 정보 읽기
			Object obj = clsNmae.getDeclaredConstructor().newInstance();

			Method[] methods = clsNmae.getDeclaredMethods();
			methods[0].invoke(obj, null);
		} catch (Exception e) {
			// TODO: handle exception

		}
	}
}
