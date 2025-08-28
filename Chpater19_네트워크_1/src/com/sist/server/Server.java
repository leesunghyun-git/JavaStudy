package com.sist.server;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.Vector;

import com.sist.commons.Function;

/*
 * 	쓰레드 => 프로그램 1개에서 여러개 메소드가 동시에 호출
 * 	----- 메소드 호출
 * 	 | 접속마다 따로 서버가 동작을 한다 (멀티 쓰레드)
 * 
 * 	서버 
 * 	 1. 대기 소켓을 생성 ServerSocket
 * 	 	= bind => ip/port연결
 * 				  (ip => 전화번호 , port => 연결선)
 * 				  => 유심
 * 		= listen => 대기
 * 	 2. 접속시 처리
 * 		= 쓰레드로 처리
 * 		= accept() : 클라이언트가 접속시에만 호출
 * 		  ---------> 클라이언트 정보 저장
 * 	-------------------------------------------
 *   3. 클라이언트와 통신
 *   	cass ....
 *   --------------------
 * 
 */
public class Server implements Runnable{
	private ServerSocket ss; // 대기소켓 , 교환소켓
	private final int PORT=13579;
	// 접속자 저장 공간
	private Vector<Client> waitVC=new Vector<Client>(); 
	
	public Server()
	{
		try
		{
			ss=new ServerSocket();
			ss.setReuseAddress(true);
			ss.bind(new java.net.InetSocketAddress(PORT));
			System.out.println("Server Strart...");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	// 1. 서버가동 => 대기 상태 (접속시까지 기다린다)
	
	public static void main(String[] args) {
		
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
	// 2. 접속시에 처리 => 쓰레드로 처리
	@Override
	public void run() {
		// 쓰레드 동작을 구현하는 메소드
		try
		{	
			while(true)
			{
				Socket s=ss.accept();
				// 접속자의 IP / PORT
				Client client = new Client(s);
				// 접속자와 통신을 시작하라
				client.start();
				
			}
		}catch(Exception ex) {}
	}
	
	class Client extends Thread
	{
		String id,name,address,pos;
		Socket s;
		BufferedReader in; // 접속자 요청
		// HttpServletRequset
		OutputStream out; // 접속자 요청 처리에 대한 응답
		// HttpServletResoponse
		public Client(Socket s)
		{
			try
			{
				this.s=s;
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				out=s.getOutputStream();
			}catch(Exception ex) {}
		}
		
		public void run()
		{
			// 100|id|name|address
			try
			{
				while(true)
				{
					String msg=in.readLine(); // 클라이언트로부터 받은 값
					System.out.println("Client 전송값 =>"+msg);
					StringTokenizer st=new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					
					switch(protocol)
					{
						case Function.LOGIN:
						{
							// 정보를 받는다
							id=st.nextToken();
							name=st.nextToken();
							address=st.nextToken();
							pos="대기실";
							
							// 현재 접속되어 있는 모든 Client에 전송
							messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+pos);
							// 입장 메세지 전송
							messageAll(Function.WAWITCHAT+"|[알림 ☞]"+name+"님이 입장하셨습니다.|red");
							
							//로그인하는 사람 => 정보 받기
							// 1. 로그인창 => 대기실창으로 변경
							messageTo(Function.MYLOG+"|"+id+"|"+name);
							// 2. 이미 접속한 사람의 정보를 전송
							for(Client c:waitVC)
							{
								messageTo(Function.LOGIN+"|"+c.id+"|"+c.name+"|"+c.pos);
							}
							// 3. 개설된 방 정보 전송
							
							
							
						}
						
					}
				}
					
			}catch(Exception ex) {}
		}
		// 기능 => 전송하는 방법
		public synchronized void messageTo(String msg)
		{
			try
			{
				out.write((msg+"\n").getBytes());
			}catch(Exception ex) {}
		}
		public synchronized void messageAll(String msg)
		{
			try
			{
				for(Client client:waitVC)
				{
					client.messageTo(msg);
				}
			}catch(Exception ex) {}
		}
	}
}
