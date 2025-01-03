package com.sist.exam;

import javax.swing.*;
import java.awt.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;

// tf => 입력후에 데이터를 => 서버
// 서버에서 들어오는 데이터를 읽기 => ta
// 단방향 => 양방향
// => 쓰레드 
/*
	Vue  / React
	양방향 /	단방향

*/
public class Client extends JFrame implements ActionListener,Runnable {
	JButton b1, b2;
	JTextField tf, tf2;
	JTextArea ta;

	public Client() {
		b1 = new JButton("접속");
		b2 = new JButton("종료");
		tf = new JTextField();
		tf2 = new JTextField(10);
		ta = new JTextArea();
		ta.setEditable(false);
		JScrollPane js = new JScrollPane(ta);
		setLayout(null);
		JPanel p = new JPanel();
		p.add(tf2);
		p.add(b1);
		p.add(b2);

		p.setBounds(10, 15, 450, 35);
		add(p);

		js.setBounds(10, 55, 450, 300);

		add(js);

		tf.setBounds(10, 260, 450, 30);
		add(tf);

		setSize(490, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		b1.addActionListener(this);
		
	}

	public static void main(String[] args) {
		new Client();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			try {
				
				Socket s=new Socket("localhost",3355);
			} catch (Exception ex) {
				
				
			}
		}else {
			
		}
	}
}
