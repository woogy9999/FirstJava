package com.sist.main;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class BoardDelete extends JPanel	 {
	JButton b1,b2;
	JPasswordField pf;
	JLabel titleLa,la;

	public BoardDelete(){
		
		titleLa=new JLabel("삭제하기",JLabel.CENTER);
		titleLa.setFont(new Font("맑은고딕",Font.BOLD,300));
		setLayout(null);
		titleLa.setBounds(10,15,620,50);
		add(titleLa);
		
		la=new JLabel("비밀번호");
		pf=new JPasswordField();
		b1=new JButton("삭제");
		b2=new JButton("삭제");
		
		//배치
		la.setBounds(230,75,80,30);
		pf.setBounds(315,75,150,30);
		JPanel p=new JPanel();
		p.add(b1); p.add(b2);
		
		p.setBounds(230,115,235,35);
		add(p);
		add(la);
		add(pf);
	}

}
