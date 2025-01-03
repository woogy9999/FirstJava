package com.sist.main;

import javax.swing.*;
import javax.swing.table.*;

public class MusicUserMain extends JFrame {
	JTabbedPane tp;
	MusicListPanel mlp = new MusicListPanel();
	MusicFindPanel mfp = new MusicFindPanel();
	MusicDetailPanel mdp = new MusicDetailPanel();

	public MusicUserMain() {
		tp = new JTabbedPane();
		tp.addTab("뮤직목록", mlp);
		tp.addTab("뮤직검색", mfp);
		tp.addTab("상세보기", mdp);
		tp.setTabPlacement(JTabbedPane.NORTH);
		// 윈도우에 추가
		add("Center", tp);

		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MusicUserMain();
	}

}
