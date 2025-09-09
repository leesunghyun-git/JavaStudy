package com.sist.controll;
import java.util.List;

import com.sist.client.MemberManagerForm;
import com.sist.dao.MemberDAO;
import com.sist.vo.MemberVO;
public class MemberManagerControll {
	MemberManagerForm mmf;
	MemberDAO dao;
	public MemberManagerControll(MemberManagerForm mmf)
	{
		this.mmf=mmf;
		dao=MemberDAO.newInstance();
		List<MemberVO> list=dao.memberAlldata();
		System.out.println("가져온 회원 수: " + list.size());
		mmf.setTable(list);
	}
	
	
	
}
