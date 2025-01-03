package com.sist.map;

import java.lang.reflect.Member;

public class UserMain {
	public static void main(String[] args) {
		Container c=new Container();
		Model model=c.getBean("member");
		model.execute();
		
		System.out.println(model);
		model=c.getBean("food");
		System.out.println(model); //메모리 절약 => 싱글턴
		model=c.getBean("food");
		System.out.println(model); //메모리 절약 => 싱글턴
	}
}
