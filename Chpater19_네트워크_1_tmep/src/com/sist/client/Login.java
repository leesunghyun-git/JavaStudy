package com.sist.client;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JPanel {
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2,b3;
	
	public Login()
	{
		// 초기화 / 배치
		setLayout(null);
		la1=new JLabel("ID",JLabel.CENTER);
		la2=new JLabel("PWD",JLabel.CENTER);
		tf=new JTextField();
		pf=new JPasswordField();
		b1=new JButton("로그인");
		b2=new JButton("회원가입");
		b3=new JButton("취소");
		
		la1.setBounds(210, 220, 60, 30);
		tf.setBounds(275, 220, 150, 30);
		la2.setBounds(210, 255, 60, 30);
		pf.setBounds(275, 255, 150, 30);
		add(la1);add(tf);
		add(la2);add(pf);
		
		JPanel p=new JPanel();
		p.add(b1);p.add(b2);p.add(b3);
		p.setBounds(210,290,270,35);
		add(p);
	}


}
