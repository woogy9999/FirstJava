package com.sist.main;

public class test {

	static void abc() {
		int a = 1;
	}

	int dd() {
		int b = 2;
		return b;
	}

	public static void main(String[] args) {
		test t=new test();
		t.abc();
		
		abc();
		int k=t.dd();
	}
}