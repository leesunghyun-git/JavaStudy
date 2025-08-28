package com.sist.client;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;

import com.sist.dao.MemberDAO;
import com.sist.dao.MemberVO;
import com.sist.dao.ZipcodeVO;
// login ==> "100|id|pwd\n" => string => login.jsp?id=aaa&pwd=1234 
public class ClientMainForm extends JFrame
implements ActionListener,MouseListener{
	CardLayout card=new CardLayout();
	Login login = new Login();
	JoinForm join =new JoinForm();
	PostFindForm post=new PostFindForm();
	WaitRoom wait=new WaitRoom();
	// LOGIN / JOIN / WAIT / ROOM
	public ClientMainForm()
	{
		setLayout(card);
		add("login",login);
		add("wait",wait);
		add("join",join);
		
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		login.b3.addActionListener(this);
		login.tf.addActionListener(this);
		login.pf.addActionListener(this);
		
		join.b1.addActionListener(this);
		join.b2.addActionListener(this);
		join.b3.addActionListener(this);
		join.b4.addActionListener(this);
		
		post.b1.addActionListener(this);
		post.b2.addActionListener(this);
		post.tf.addActionListener(this);
		post.table.addMouseListener(this);
		
		wait.tf.addActionListener(this);
	}
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		} catch (Exception e) {
		}
		new ClientMainForm();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b1 || e.getSource()==login.tf || e.getSource()==login.pf)
		{
			String id=login.tf.getText();
			if(id.trim().length()<1)
			{
				JOptionPane.showMessageDialog(this,"ID를 입력하세요");
				login.tf.requestFocus();
				return;
			}
			String pwd=String.valueOf(login.pf.getPassword());
			if(pwd.trim().length()<1)
			{
				JOptionPane.showMessageDialog(this,"PWD를 입력하세요");
				login.pf.requestFocus();
				return;
			}
			
			MemberDAO dao=MemberDAO.newInstence();
			MemberVO vo=dao.memberLogin(id, pwd);
			if(vo.getMsg().equals("NOID"))
			{
				JOptionPane.showMessageDialog(this,"없는 아이디이거나 아이디가 다릅니다.");
				login.tf.setText("");
				login.pf.setText("");
				login.tf.requestFocus();
				return;
			}
			else if(vo.getMsg().equals("WRONGPWD"))
			{
				JOptionPane.showMessageDialog(this,"잘못 입력된 패스워드입니다.");
				login.pf.setText("");
				login.pf.requestFocus();
				return;
			}
			else
			{
				//서버 연결
				JOptionPane.showMessageDialog(this,"로그인되었습니다.");
				setTitle(vo.getName());
				card.show(getContentPane(), "wait");
				
			}
			
			
		}
		else if(e.getSource()==login.b2)
		{
			card.show(getContentPane(), "join");
		}
		else if(e.getSource()==login.b3)
		{
			dispose();
			System.exit(0);
		}
		else if(e.getSource()==join.b1)
		{
			
		}
		else if(e.getSource()==join.b2)
		{
			post.tf.setText("");
			for(int i=post.model.getRowCount()-1;i>=0;i--)
			{
				post.model.removeRow(i);
			}
			post.setVisible(true);
		}
		else if(e.getSource()==join.b3)
		{
			String id=join.tf1.getText();
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this,"아이디를 입력해주세요");
				join.tf1.requestFocus();
				return;
			}
			String pwd=String.valueOf(join.pf.getPassword());
			if(pwd.length()<1)
			{
				JOptionPane.showMessageDialog(this,"비밀번호를 입력해주세요");
				join.pf.requestFocus();
				return;
			}
			String name=join.tf2.getText();
			if(name.length()<1)
			{
				JOptionPane.showMessageDialog(this,"이름을 입력해주세요");
				join.tf2.requestFocus();
				return;
			}
			String postInput=join.tf3.getText();
			if(postInput.length()<1)
			{
				JOptionPane.showMessageDialog(this,"우편번호를 검색하세요");
				join.b2.requestFocus();
				return;
			}
			String addr1=join.tf4.getText();
			String addr2=join.tf5.getText();
			MemberVO vo=new MemberVO();
			
			vo.setId(id);
			vo.setPwd(pwd);
			vo.setName(name);
			vo.setPost(postInput);
			vo.setAddr1(addr1);
			vo.setAddr2(addr2);
			MemberDAO dao=MemberDAO.newInstence();
			int res=dao.memberJoin(vo);
			
			if(res==0)
			{
				JOptionPane.showMessageDialog(this, "회원 가입에 실패하였습니다.\n"
						+ "다시 시도해주세요");
				card.show(getContentPane(), "login");	
			}
			else
			{
				JOptionPane.showMessageDialog(this, "회원가입을 축하합니다!!\n"
						+ "로그인창으로 이동합니다.");
				card.show(getContentPane(), "login");			
			}
			
		}
		else if(e.getSource()==join.b4)
		{
			card.show(getContentPane(), "login");
		}
		else if(e.getSource()==post.b1 || e.getSource()==post.tf)
		{
			String dong =post.tf.getText();	
			if(dong.length()<1)
			{
				JOptionPane.showMessageDialog(post, "동/읍/면을 입력하세요");
				post.tf.requestFocus();
				return;
			}
			MemberDAO dao=MemberDAO.newInstence();
			List<ZipcodeVO> list=dao.postFind(dong);
			// 입력시
			if(list.size()>0)
			{
				
				for(int i=post.model.getRowCount()-1;i>=0;i--)
				{
					post.model.removeRow(i);
				}
				
				for(ZipcodeVO vo:list)
				{
					String[] data= {
							vo.getZipcode(),vo.getAddress()
					};
					post.model.addRow(data);
				}
			}
			else
			{
				JOptionPane.showMessageDialog(post, "검색결과가 없습니다.");
				post.tf.setText("");
				post.tf.requestFocus();
			}
			
		}
		else if(e.getSource()==post.b2)
		{
			post.setVisible(false);
			
		}
		else if(e.getSource()==wait.tf)
		{
			String msg=wait.tf.getText();
			if(msg.length()<1)
			{
				return;
			}
			String color=wait.box.getSelectedItem().toString();
			initStyle();
			append(msg,color);
			wait.tf.setText("");
		}
		
		
		
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==post.table)
		{
			if(e.getClickCount()==2)
			{
				int row=post.table.getSelectedRow();
				String zip=post.model.getValueAt(row, 0).toString();
				String addr=post.model.getValueAt(row, 1).toString();
				join.tf3.setText(zip);
				join.tf4.setText(addr);
				post.setVisible(false);
				
			}
		}
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
	// 공통 적용
	public void initStyle()
	   {
		   Style green=wait.pane.addStyle("green", null);
		   StyleConstants.setForeground(green, Color.green);
		   
		   Style yellow=wait.pane.addStyle("yellow", null);
		   StyleConstants.setForeground(yellow, Color.yellow);
		   
		   Style blue=wait.pane.addStyle("blue", null);
		   StyleConstants.setForeground(blue, Color.blue);
		   
		   Style pink=wait.pane.addStyle("pink", null);
		   StyleConstants.setForeground(pink, Color.pink);
		   
		   Style cyan=wait.pane.addStyle("cyan", null);
		   StyleConstants.setForeground(cyan, Color.cyan);
		   
		   Style magenta=wait.pane.addStyle("magenta", null);
		   StyleConstants.setForeground(magenta, Color.magenta);
	       
		   Style red=wait.pane.addStyle("red", null);
		   StyleConstants.setForeground(red, Color.red);
		   
	   }
	   public void append(String msg,String color)
	   {
		   try
		   {
			   Document doc=wait.pane.getDocument();
			   doc.insertString(doc.getLength(), msg+"\n",
					   wait.pane.getStyle(color));
		   }catch(Exception ex){}
	   }
}
