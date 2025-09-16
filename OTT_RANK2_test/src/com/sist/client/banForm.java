package com.sist.client;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class banForm extends JFrame{
	JComboBox<String> selectday;
	JButton save,exit;
	JTextField user_list;
	JTextArea reason;
	JLabel la1,la2,la3; // la1= 유저명단 , la2=사유 , la3= 기간 
	
	public banForm(){
		selectday=new JComboBox<String>();
		user_list=new JTextField();
		reason=new JTextArea();
		selectday.addItem("3일");
		selectday.addItem("5일");
		selectday.addItem("10일");
		selectday.addItem("15일");
		selectday.addItem("30일");
		save= new JButton("저장");
		exit= new JButton("취소");
		la1= new JLabel();
		la2= new JLabel();
		la3= new JLabel();
		la1.setText("선택된 회원");
		la2.setText("정지 사유");
		la3.setText("정지 기간");
		setLayout(null);
		la1.setBounds(20, 10, 80, 35);
		user_list.setBounds(105, 10, 270, 35);
		add(user_list);
		add(la1);
		user_list.setEditable(false);
		la2.setBounds(20,50,80,35);
		reason.setBounds(105, 50, 270, 250);
		add(la2);
		add(reason);
		la3.setBounds(20, 305, 80, 35);
		selectday.setBounds(105, 305, 100, 35);
		add(la3);
		add(selectday);
		save.setBounds(210, 360, 80, 40);
		exit.setBounds(300, 360, 80, 40);
		add(save);
		add(exit);
		setSize(400,450);

	}
	
	
}