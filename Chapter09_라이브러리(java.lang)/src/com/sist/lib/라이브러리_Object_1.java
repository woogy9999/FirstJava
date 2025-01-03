package com.sist.lib;

/*
		1. 모든 클래스에 상속을 내린다ㅏ.
		2. Object는 가장 큰 데이터형 => 모든 데이터 값을 받을 수 있다.
		3. 모든 객체가 사용할 수 있는 기능을 제공
		4. java.lang => Object외에 다른 클래스는 final이다
								  -------------------
								  상속을 받아서 변경이 불가능
								  
		5. Object
		   ------
		   	finalize()/clone()/toString()/hashCode()/equals()
		   	-------------------------------------------------
		   	
		   상속
		   ---
		   | 상위 클래스는 하위 클래스에 추가된 메소드, 변수는 접근이 불가능
		    => 오버라이딩된 변수 / 메소드만 사용이 가능
		    
		    toString() : 문자열 변환 / 객체의 정보 확인
		    ---------- 멤버변수 확인 => 오버라이딩
		    						 --------
		    						 상위 클래스로 객체를 선언
		    						 => 오버라이딩된 메소드 호출이 가능
		  
		    						 
		   class A
		   class B extends A
		   
		   A a=new B() => 동적 바인딩
		       -------
		       A가 가지고 있는 메소드 => 오버라이딩된 메소드 호출
		       				----- 주소
			-A가 가지고 있는 변수 : 주소가 없다
			
			*일반 변수는 주소가 없고 / 메소드는 주소가 있음
			=> 정적 바인딩
*/

import java.awt.event.*;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 라이브러리_Object_1 extends JFrame implements ItemListener {
	JComboBox box = new JComboBox();
	JLabel la = new JLabel();

	public 라이브러리_Object_1() {

		box.addItem("홍길동:남자");
		box.addItem("심청이:여자");
		box.addItem("이소룡:남자");
		box.addItem("김영희:여자");

		setLayout(null);

		box.setBounds(10, 15, 100, 35);
		add(box);

		la.setBounds(10, 100, 300, 35);
		add(la);

		setSize(400, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Object는 출력은 가능 => 문자열 제어 불가능
		// => Object => 매개변수 , Object => 리턴형
		// 사용시에는 반드시 형변환
		box.addItemListener(this);

	}

	public static void main(String[] args) {
		new 라이브러리_Object_1();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == box) {
			// Object obj=box.getSelectedItem();

			// String obj=(String)box.getSelectedItem(); =같은거임
//			String obj = box.getSelectedItem().toString();
//			String[] datas = obj.split(":");
//
//			la.setText("이름:" + datas[0] + ",성별:" + datas[1]);
		}
	}
}
