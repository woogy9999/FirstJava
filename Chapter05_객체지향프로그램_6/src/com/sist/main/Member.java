package com.sist.main;

public class Member {
	String name;
	String id;
	String password;
	int age;

	public Member(String name, String id) {
		this.name=name;
		this.id=id;
	}

	public static void main(String[] args) {
		Member m=new Member("a", "b");
		System.out.println(m.name);
		System.out.println(m.id);
	}

}
