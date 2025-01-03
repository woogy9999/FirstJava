package com.sist.music;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

/*
	ActionListener => actionPerformed()
	
	같은 클래스 여러개 (배열) ArrayList
	다른 클래스 여러개 (인터페이스) 

*/

public class MusicMainWindow extends JFrame implements ActionListener{
	String[] names = { "Top 50", "가요", "POP", "OST", "트롯", "JAZZ", "CLASSIC" };
	JButton[] btns = new JButton[7];
	JTable table;
	DefaultTableModel model;
	/*
	 * => 클래스 : 다른 클래스 사용가능 => 생성자 : 다른 클래스 사용가능 => 멤버변수 : 자신 클래스에서만 사용 ------- 기본형
	 * / 클래스 / 배열 => 메소드 : 다른 클래스와 통신
	 * 
	 */

	// 초기화
	public MusicMainWindow() {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1, 7));
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton(names[i]);
			p.add(btns[i]);
			btns[i].addActionListener(this);
		}

		add("North", p);
		String[] col = { "곡명", "가수명", "앨범" };
		String[][] row = new String[0][3];
		model = new DefaultTableModel(row, col);
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table);

		table.setRowHeight(35);
		table.getTableHeader().setBackground(Color.orange);
		table.setShowVerticalLines(false);
		table.setShowHorizontalLines(true);

		add("Center", js);
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

//		String[] temp= {"aaaaa","bbbbb","ccccc"};
//		model.addRow(temp);
//		model.addRow(temp);
//		model.addRow(temp);
//		
		display(1);
	}

	// 출력
	public void display(int type) {
		
		//한번을 지우고 시작
		for(int i=model.getRowCount()-1;i>=0; i--) {
			model.removeRow(i);
		}
		MusicSystem ms = new MusicSystem();
		MusicVO[] music = ms.musicData(type);
		for (MusicVO vo : music) {
			String[] data = { vo.getTitle(), vo.getSinger(), vo.getAlbum(),};
			model.addRow(data);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MusicMainWindow();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<btns.length; i++) {
			if(e.getSource()==btns[i]) {
				display(i+1);
				break;
			}
		}
		
		
		
	}

}
