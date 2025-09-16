package com.sist.controll;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import com.sist.client.MemberManagerForm;
import com.sist.client.banForm;
import com.sist.dao.MemberDAO;
import com.sist.vo.MemberVO;
public class MemberManagerControll implements ActionListener{
	MemberManagerForm mmf;
	MemberDAO dao;
	banForm bf=new banForm();
	BanControll bc=new BanControll(bf,this);
	private static Map<String, String> tgmap = new HashMap<String, String>();
	static {
		tgmap.put("회원목록", "Id_num");
		tgmap.put("아이디", "Login_Id");
		tgmap.put("비밀번호", "Login_pwd");
		tgmap.put("이름", "name");
		tgmap.put("닉네임", "Nickname");
		tgmap.put("성별", "SEX");
		tgmap.put("우편번호", "Post");
		tgmap.put("주소", "Addr1");
		tgmap.put("상세주소", "Addr2");
		tgmap.put("전화번호", "phone");
		tgmap.put("권한", "rule");

	}
	public MemberManagerControll(MemberManagerForm mmf)
	{

		this.mmf=mmf;
		dao=MemberDAO.newInstance();
		List<MemberVO> list=dao.memberAlldata();
		setTable(list);
		mmf.getCheck().addActionListener(this);
		mmf.getExit().addActionListener(this);
		mmf.getInsert().addActionListener(this);
		mmf.getDelete().addActionListener(this);
		mmf.getSelect().addActionListener(this);
		mmf.getBan().addActionListener(this);
		mmf.getSearch().addActionListener(this);
		bf.getSave().addActionListener(this);
	} 
	public void setTable(List<MemberVO> members) 
	{
		for(int i=mmf.getMembermodel().getRowCount() -1 ; i >=0 ;i--)
		{
			mmf.getMembermodel().removeRow(i);
		}
		for(int i=0; i<members.size();i++)
		{
			MemberVO vo=new MemberVO();
			vo=members.get(i);
			Object[] data= {vo.getId_num(),vo.getLogin_id(),vo.getLogin_pwd(),vo.getName(),vo.getNickname(),vo.getSex(),vo.getPost(),vo.getAddr1(),vo.getAddr2(),vo.getPhone(),vo.getBandate(),false};
			mmf.getMembermodel().addRow(data);
		}
	}
	
	public List<Integer> selectRow() { // 체크박스가 선택된 row 줄을 모아서 list return 
		List<Integer> selectrow = new ArrayList<Integer>();
		for(int i=0 ; i<mmf.getMembermodel().getRowCount();i++)
		{
			boolean check = (Boolean)mmf.getMembermodel().getValueAt(i, 11);
			if(check)
			{
				selectrow.add(i);
			}
		}
		return selectrow;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mmf.getCheck())
		{
			
		}
		else if(e.getSource()==mmf.getExit())
		{
			
		}
		else if(e.getSource()==mmf.getInsert())
		{
			
		}
		else if(e.getSource()==mmf.getDelete())
		{
			
		}
		else if(e.getSource()==mmf.getBan())
		{
			
			List<Integer> selectednum=selectRow();
			if(selectednum.size()!=0)
			{
				String users_num="";
				String users="";
				
				for(int i=0;i<selectednum.size();i++)
				{
					if(!mmf.getMembermodel().getValueAt(selectednum.get(i),10).toString().equals(" "))
					{
//						System.out.println(mmf.getMembermodel().getValueAt(selectednum.get(i),10).toString());
						JOptionPane.showMessageDialog(mmf, "해당 유저는 이미 정지 상태입니다.");
						for(int j=0;j<mmf.getMembermodel().getRowCount();j++)
						{
							mmf.getMembermodel().setValueAt(false, j, 11);
						}
						return;
					}
					String temp1=mmf.getMembermodel().getValueAt(selectednum.get(i), 0).toString();
					String temp2=mmf.getMembermodel().getValueAt(selectednum.get(i), 1).toString();
					if(users.equals(""))
					{
						users=temp2;
					}
					else
					{
						users=users+","+temp2;
					}
					if(users_num.equals(""))
					{
						users_num=temp1;
					}
					else
					{
						users_num=users_num+","+temp1;
					}
				}
				bf.getUser_number().setText(users_num);
				bf.getUser_list().setText(users);
				bf.setVisible(true);
			}
			else
			{
				JOptionPane.showMessageDialog(mmf, "선택된 목록이 없습니다.");
			}
		}
		else if(e.getSource()==mmf.getSelect() || e.getSource()==mmf.getSearch())
		{
			String tag;
			switch (mmf.getTag().getSelectedItem().toString())
			{
				case "아이디" : 
					tag="Login_id";
					break;
				case "닉네임" :
					tag="NICKNAME";
					break;
				case "이름" :
					tag="name";
					break;
				default:
					tag = "Login_id";
			}
			String keyword=mmf.getSearch().getText();
			List<MemberVO> list=dao.keywordSearch(tag, keyword);
			System.out.println("가져온 회원 목록:"+list.size());
			setTable(list);
		}
		else if(e.getSource()==bf.getSave())
		{
			
		}
		
	}
	
	
	

	
}
