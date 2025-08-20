package com.sist.lang;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
//class Ex
//{
//	int a=10;
//	double b=10.2;
//	String c="실험";
//}
public class 라이브러리_4 extends JFrame implements ItemListener {
	JComboBox box=new JComboBox();
	// Object는 모든 데이터형을 받을 수 있다.
//	Ex a=new Ex();
//	Ex b=new Ex();
//	Ex c=new Ex();
	public 라이브러리_4()
	{
		
//		box.addItem(a); // a.toString 출력 
		box.addItem("맛집");
		box.addItem("레시피");
		box.addItem("여행"); // Object로 값을 넘김
		
		add("North",box);
		setSize(350,300);
		setVisible(true);
		box.addItemListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 라이브러리_4();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			String s=(String)box.getSelectedItem();
			System.out.println(s);
		}
	}

}
