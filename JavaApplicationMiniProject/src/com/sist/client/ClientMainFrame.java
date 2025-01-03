package com.sist.client;

import javax.swing.*;

//								상속 => 재사용 => 변경
public class ClientMainFrame extends JFrame {
	MenuForm mf = new MenuForm();// 포함 클래스 => 있는 그대로 사용
	ControlPanel cp = new ControlPanel();

	public ClientMainFrame() {
		setLayout(null); // 사용자 정의
		mf.setBounds(350, 20, 800, 50);
		add(mf);
		cp.setBounds(10, 90, 1470, 770);
		add(cp);
		setSize(1500, 900);
		setVisible(true);
	}

	public static void main(String[] args) {

		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");

		} catch (Exception ex) {
			// TODO: handle exception
		}
		new ClientMainFrame();

	}
}
