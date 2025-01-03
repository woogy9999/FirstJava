package com.sist.exam;

import java.util.*;
import java.net.*;

public class Server implements Runnable {
	private Vector<Client> waitVc = new Vector<Client>();

	private ServerSocket ss;

	public Server() {
		try {
			ss = new ServerSocket(3355);
			System.out.println("Server Start");
			// bind(ip,port) => listen() => 대기
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		new Thread(server).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Socket s = ss.accept(); // 접속시
				Client client = new Client(s);
				waitVc.add(client); // 사용자 정보
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	// 내부 클래스
	class Client extends Thread {
		private Socket s;

		public Client(Socket s) {
			this.s = s;
			System.out.println(s.getInetAddress().getHostAddress());// ip 어드레스 호출할때
			System.out.println(s.getPort());// 포트번호 출력
		}
	}
}
