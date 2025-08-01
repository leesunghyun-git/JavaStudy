import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class 프로젝트_1 extends JFrame {
	public 프로젝트_1()
	{
		setSize(1280, 960);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		}catch(Exception e) {}
		new 프로젝트_1();
	}

}
