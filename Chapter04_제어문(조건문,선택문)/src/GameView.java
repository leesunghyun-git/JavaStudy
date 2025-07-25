import javax.swing.*; // 경량 
import java.awt.*; // Image 출력
public class GameView extends JPanel {
	Image back,cat;
	// 초기화
	int x=150;
	int y=100;
	public GameView()
	{
		// 생성자 => 변수에 대한 초기화
		back=Toolkit.getDefaultToolkit().getImage("C:\\Users\\sist123\\Desktop\\background.jpg");
		cat=Toolkit.getDefaultToolkit().getImage("C:\\Users\\sist123\\Desktop\\gif.gif");
		
	}
	public void paint(Graphics g)
	{
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
		g.drawImage(cat,x,y,200,150,this);
	}
		// TODO Auto-generated method stub


}
