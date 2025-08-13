package com.sist.main;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
//라이브러리 => java.lang => String,System,math...final
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.sist.commons.Commons;
// 확장
public class MainFrame extends JFrame  implements ItemListener  {
	// 시작과 동시에 기능 구현
	JComboBox box=new JComboBox();
	JLabel la=new JLabel();
	
	// has-a : 포함 클래스 => 제공하는 내용만 사용
	public MainFrame()
	{
		// South North West East Center
		/*
		 * 	==> BoraderLayout : JFame
		 *  ==> FlowLayout : 일자 배치
		 *  ==> GridLayout : 계산 , 퍼즐
		 *  ==> 사용자가 좌표 ***** => CSS
		 */	
		box.addItem("1번 이미지");
		box.addItem("2번 이미지");
		box.addItem("3번 이미지");
		Image img=Commons.getImage(new ImageIcon("c:\\JavaDev\\m1.jpg"), 800, 430);
		la.setIcon(new ImageIcon(img));
		add("North",box);
		add("Center",la);
		setSize(800,600); // JFram 의 메소드 들
		setVisible(true);
		
		box.addItemListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame mf=new MainFrame();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		// TODO Auto-generated method stub
		if(e.getSource()==box) {
			Image img=Commons.getImage(new ImageIcon("c:\\JavaDev\\m"+(box.getSelectedIndex()+1)+".jpg"), 800, 430);
		la.setIcon(new ImageIcon(img));
		}
	}

}
