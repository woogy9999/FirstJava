package com.sist.lib;
/*
	equals() => Object에서 객체 비교
				String => equals() 문자열 비교 => 오버라이딩 

*/

class Human{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Human(String n) {
		name=n;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Human) {
			Human s=(Human)obj;
			return name==s.name;
		}else
		{
			return false;
		}
	
	
	}
	
	
}

public class 라이브러리_Object_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1=new Human("홍길동");
		Human h2=new Human("홍길동");
		
		if(h1.equals(h2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
		
	}

}
