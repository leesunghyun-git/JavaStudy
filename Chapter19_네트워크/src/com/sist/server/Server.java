package com.sist.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;
import java.util.Vector;

/*
 * 	1. 접근 관련 => 접속자를 관리 => 교환스켓
 * 	2. 접속자와 실제 통신 담당
 * 	  ------------------ 접속자마다 따로 생성
 * 						 -------------- 쓰레드
 * 	3. 접속자를 관리 => 저장 => 쓰레드에서 사용
 * 
 * 	=> 멤버클래스
 * 		class Server
 * 		{
 * 			Vector vec=new Vector() => 공유
 * 
 * 
 * 		}
 * 		class Client extends Thread
 * 		{
 * 			Server server=new Server()
 * 			server.vec...
 * 		}
 * 
 * 		순서
 * 		 1. bind  => 개통
 * 		 2. listener => 대기상태
 * 		 ------------------------ 생성자에서 처리
 * 		 3. accept() => vec에 저장
 * 		 			    thread생성 => 통신 시작 명령
 * 			   | 전화가 옴 : 발신자 처리
 * 		
 * 
 * 
 */
public class Server implements Runnable {
	// 접속을 담당하는 소켓
	private ServerSocket ss;
	private final int PORT = 13579;
	// 저장공간
	private Vector<Client> waitVc = new Vector<Client>();

	public Server() {
		try {
			ss = new ServerSocket();
			// bind /listen
			ss.setReuseAddress(true);
			ss.bind(new java.net.InetSocketAddress(PORT));
			System.out.println("Server Start...");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void stopServer() {
		try {
			if (ss != null && !ss.isClosed()) {
				ss.close(); // 포트 해제
				System.out.println("Server Stopped...");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Server server = new Server();
		new Thread(server).start();
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (true) {
			String str = scan.next();
			if (str.equals("close")) {
				server.stopServer();
				break; // 루프 종료 → main 끝남
			}
		}
		scan.close();

	}

	@Override
	public void run() {
		// 접속시에 처리

		try {
			while (true) {
				Socket s = ss.accept();
				Client client = new Client(s);
				waitVc.add(client);
				client.start();
			}
		} catch (SocketException set) {
			System.out.println("서버 종료");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	// 통신을 담당하는 쓰레드

	class Client extends Thread {
		Socket s; // 연결 기기 => 핸드폰
		OutputStream out; // 송신 ==> write
		BufferedReader in; // 수신 ==> read

		public Client(Socket s) {
			try {
				this.s = s;
				out = s.getOutputStream();
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		public void run() {
			try {
				while (true) {
					// 클라이언트가 전송한 채팅 문자열 받기
					String msg = in.readLine();
					for (Client c : waitVc) {
						c.out.write((msg + "\n").getBytes());
					}
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

	}

}
