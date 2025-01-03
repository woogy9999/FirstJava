package com.sist.execute2;



class Sub{
	// Objext => 모든 메소드 사용이 가능
	// Sub sub=new Sub(), Object obj=new Sub()
	int a= 10;
	public void display() {
		System.out.println("Sub...");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("Sub....");
		return "";
	}
	
	
	
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj=new Sub();
		Sub ss=new Sub();
		
		
		// 상위 클래스는 하위 클래스의 추가된 메소드, 변수에 접근이 불가능
		
	}

}
