package com.sist.exception;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
	1. 이벤트 처리 

*/
public class 숫자야구게임 extends JFrame implements ActionListener {
	JTextArea ta; // 힌트 출력
	JTextField tf;
	JButton b1, b2;

	int[] com = new int[3];
	int[] user = new int[3];

	// 초기화 => 생성자 , 초기화 블록
	public 숫자야구게임() {
		ta = new JTextArea();
		JScrollPane js = new JScrollPane(ta);
		ta.setEditable(false); // 편집방지
		tf = new JTextField(10);
		tf.setEditable(false); // 비활성화
		b1 = new JButton("시작");
		b2 = new JButton("종료");

		// 배치
		JPanel p = new JPanel();
		p.add(tf);
		p.add(b1);
		p.add(b2);

		add("Center", js);
		add("South", p);
		setSize(350, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 이벤트 등록
		b1.addActionListener(this);
		// 자신이 가지고 있는 actionPerformd();
		// 마우스 => addMouseListener()
		b2.addActionListener(this);
		tf.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 숫자야구게임();

	}

	public void getRand() {
		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 9) + 1;

			for (int j = 0; j < i; j++) {

				if (com[i] == com[j]) {
					i--; // 원래 인덱스로 돌려줌
					break;
				}
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b2) { // b2 버튼을 클릭했다면

			int sel = JOptionPane.showConfirmDialog(this, "종료할까요?", "종료", JOptionPane.YES_NO_OPTION);

			if (sel == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		} else if (e.getSource() == b1) {
			getRand();
			tf.setEditable(true);
			tf.requestFocus();
			b1.setEnabled(false);
		} else if (e.getSource() == tf) {
			try {
				// 입력된 데이터 읽기
				String str = tf.getText();
				int input = Integer.parseInt(str);

				if (input < 100 || input > 999) {
					JOptionPane.showMessageDialog(this, "3자리 정수만 입력");
					tf.setText("");
					tf.requestFocus();
					return;// 메소드 종료
				}
				user[0] = input / 100;
				user[1] = (input % 100) / 10;
				user[2] = input % 10;

				if (user[0] == user[1] || user[1] == user[2] || user[0] == user[2]) {
					JOptionPane.showMessageDialog(this, "중복 수는 사용할 수 없습니다");
					tf.setText("");
					tf.requestFocus();
					return;// 메소드 종료
				}
				if (user[0] == 0 || user[1] == 0 || user[2] == 0) {
					JOptionPane.showMessageDialog(this, "0은 사용할 수 없습니다.");
					tf.setText("");
					tf.requestFocus();
					return;// 메소드 종료
				}

				// 비교
				int s = 0, b = 0;
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {

						if (com[i] == user[j]) {
							if (i == j) {
								s++;
							} else {
								b++;
							}
						}
					}
				}
				String hint = "Input Number : " + input + ",Result: " + s + "S-" + b + "B\n";

				ta.append(hint);
				
				if(s==3) {// 종료 여부 확인 
					JOptionPane.showMessageDialog(this, "프로그램을 종료합니다");
					System.exit(0);
				}
				tf.setText("");
				tf.requestFocus();
				// 3자리가 아닌 경우 처리
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(this, "세자리 정수만 입력해야 됩니다.");
				tf.setText("");
				tf.requestFocus();
				// 예외복구 => RuntimeException
				// 예외처리가 없어도 가능 (UnCheck)
				// 필요에 의해 처리
				// => UnCheckException
			}
		}
	}

}
