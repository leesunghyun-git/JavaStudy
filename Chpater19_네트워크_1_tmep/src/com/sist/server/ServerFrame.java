package com.sist.server;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class ServerFrame extends JFrame implements ActionListener{
	JButton start,end,textbox;
	JLabel lb;
	Server server;
	
	public ServerFrame()
	{		
		start=new JButton("서버구동");
		end=new JButton("서버종료");
		lb=new JLabel("채팅 프로그램");
		JPanel p=new JPanel();
		p.add(start);
		p.add(end);
		setSize(400,300); 
		setVisible(true);
		setLayout(null);
		lb.setBounds(150, 20, 100, 50);
		p.setBounds(10, 200, 370, 180);
		add(lb); add(p);
		start.addActionListener(this);
		end.addActionListener(this);
		
		
		
		addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                if (server != null) {
                	server.stopServer(); // 서버 종료 메소드
                }
                System.exit(0); // 프로그램 종료
            }
        });
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==start)
		{
			if(server==null)
			{
				server = new Server();
			new Thread(server).start();
			}
			else
				JOptionPane.showMessageDialog(this, "서버가 이미 실행 중입니다.");
		}
		else if(e.getSource()==end)
		{
			if(server!=null)
			{
			server.stopServer();
			server=null;
			}
		}
	}
	
	public static void main(String[] args) {
		ServerFrame sf=new ServerFrame();
		
	}
}

