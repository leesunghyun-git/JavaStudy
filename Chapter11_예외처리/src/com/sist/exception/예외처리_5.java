package com.sist.exception;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/*
 * 	인터페이스 : default가 없는 경우
 * 	  예) 버튼 클릭
 * 		 마우스 클릭
 * 		 이벤트는 인터페이스로 되어 있다
 * 		 
 * 
 * 		1) 버튼 / 메뉴 / 텍스트필드 엔터 
 * 		   ---------------------- ActionListener
 * 			=> actionPerformed
 * 		2) 테이블 / 트리 / 레벨 / 이미지
 * 		   ---------------------- MouseListener
 * 			=> mouseClicked()
 * 			=> mousePressed()
 * 			=> mouseReleased()
 * 			=> mouseEntered()
 * 			=> mouseExited()
 * 		3) keyboard
 * 		   ---------------------- KeyListener
 * 			=> keyTyped() => 여러개의 키를 한번에 누를때 
 * 			=> keyPressed()
 * 			=> KeyReleased()
 * 		4) combox, list
 * 		   ---------------------- itemListener
 * 			=> itemStateChanged()
 * 		
 * 		=> 동작을 하면 자동 호출
 */		
public class 예외처리_5 extends JFrame implements ActionListener,MouseListener,KeyListener, ItemListener{
	JButton b1,b2,b3;
	JTextField tf;
	JTextArea ta;
	MyEvent ev=new MyEvent();
	int[] com=new int[3];
	int[] user=new int[3];
	int s,b;
	//초기화
	// 생성자 => instance / 초기화 블록 => static {} 
	/*
	 * 
	 * 	변수
	 * 		기본형 (int , long ...)	
	 * 		참조형 : 배열 / 클래스
	 */
	public 예외처리_5()
	{
		/*
		 * 	접근 지정어 
		 * 	private : 실제 값을 저장하는 변수
		 * 		예외) 윈도우 클래스 => JButton 
		 * 	public : 생성자 / 메소드 / 클래스
		 * 			---------------------
		 * 			| 다른 크랠스와 연결	
		 */
		b1=new JButton("시작");
		b2=new JButton("전송");
		b3=new JButton("종료");
		
		tf=new JTextField(20); // NumberFormatException
		tf.setEnabled(false);
		// 웹 / 윈도우 => Only String
		// -------- 크롤링 (String)
		ta=new JTextArea();
		ta.setEditable(false);
		JScrollPane js=new JScrollPane(ta);
		
		JPanel p=new JPanel();
		p.add(tf);p.add(b1);p.add(b2);p.add(b3);
		
		add("Center",js);
		add("South",p);
		setSize(450,500);
		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		tf.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
			new 예외처리_5();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b3)
		{
			dispose(); // 메모리 회수
			System.exit(0); // 시스템 종료
		}
		else if(e.getSource()==b1)
		{
			//난수 발생
			getRand();
			tf.setEnabled(true);
			tf.requestFocus(); // TextFlied로 포커스 변경 <-- 입력창이 클릭되있음
			JOptionPane.showMessageDialog(this, "게임을 시작합니다!!");
		}
		else if(e.getSource()==tf || e.getSource()==b2)// 엔터 치거나 전송 버튼 눌렀을떄
		{
			// 입력값 읽기
			String temp=tf.getText();
			if(temp.trim().length()!=user.length)
			{
				JOptionPane.showMessageDialog(this, "세자리 정수만 입력");
				tf.setText("");
				tf.requestFocus();
				return;
			}
			
			int input=0;
			try
			{
				input=Integer.parseInt(tf.getText().trim());
			}catch(NumberFormatException ex)
			{
				setMessage("숫자만 입력 해야합니다.");
				return;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=(input%10);
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				setMessage("중복된 수는 사용할 수 없습니다.");
				return;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				setMessage("0은 사용할 수 없습니다.");
				return;
			}
			
			s=0;
			b=0;
			for(int i=0;i<com.length;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(com[i]==user[j])
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
//			setMessage("Input Number:"+input+"\nResult:\t"+s+"Strike\t"+b+"ball\n");
			ta.append("Input Number:"+input+"\nResult:\t"+s+"Strike\t"+b+"ball\n");
			tf.setText("");
			if(s==3)
			{
				int a=JOptionPane.showConfirmDialog(this,  "종료할까요?", "게임종료", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				if(a==JOptionPane.YES_OPTION)
				{
					dispose();
					System.exit(0);
				}
				else
				{
					ta.setText("");
					tf.setText("");
					getRand();
					JOptionPane.showMessageDialog(this, "새게임을 시작합니다.");
				}
			}
			
		}
	}
	public void setMessage(String msg)
	{
		JOptionPane.showMessageDialog(this, msg);
		tf.setText("");
		tf.requestFocus();
		return;
	}
	/*
	 * 	메소드
	 * 		1) 기능 => 명령문을 모아서 (한가지 수행)
	 * 		2) 재사용이 가능
	 * 		3) 다른 클래스와 통신
	 * 		4) 반복제거
	 * 		5) 구조적인 프로그램
	 * 		6)
	 * 
	 */
	public void getRand()
	{
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1; // 1~9
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
}
