package com.sist.client;

import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.sist.vo.MemberVO;
public class MemberManagerForm extends JPanel{
	DefaultTableModel membermodel; // 회원목록 테이블 
	JButton check,exit; // 확인 , 취소버튼
	JScrollPane js;
	JTable membertable;
	
	public MemberManagerForm()
	{
		String[] col = {"회원번호","아이디","비밀번호","닉네임","성별","우편번호","주소","상세주소","전화번호","정보삭제"};
		String[][] row = new String[0][col.length];
		membermodel=new DefaultTableModel(row,col) {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return column !=0;
			}

			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				if(columnIndex == 9) return Boolean.class;
				return String.class;
			}
			
			
		};
		membertable=new JTable(membermodel);	
		js=new JScrollPane(membertable);
		setLayout(null);
		js.setBounds(20, 10, 1200, 500);
		add(js);
		membertable.getTableHeader().setReorderingAllowed(false);
		membertable.setRowHeight(40);
		
	}
	public void checkListener (ActionListener e)
	{
		check.addActionListener(e);
	}
	public void exitListener (ActionListener e)
	{
		exit.addActionListener(e);
	}
	public int getSelectedMemberId() {
        int row = membertable.getSelectedRow();
        return (int) membertable.getValueAt(row, 0); // 0번 열이 id_num이라고 가정
    }
	public void setTable(List<MemberVO> members)
	{
		for(int i=membermodel.getRowCount() -1 ; i >=0 ;i--)
		{
			membermodel.removeRow(i);
		}
		for(int i=0; i<members.size();i++)
		{
			MemberVO vo=new MemberVO();
			vo=members.get(i);
			Object[] data= {vo.getId_num(),vo.getLogin_id(),vo.getLogin_pwd(),vo.getNickname(),vo.getSex(),vo.getPost(),vo.getAddr1(),vo.getAddr2(),vo.getPhone(),false};
			membermodel.addRow(data);
		}
	}
}
