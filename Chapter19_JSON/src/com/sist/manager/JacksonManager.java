package com.sist.manager;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sist.dao.EmpDAO;
import com.sist.dao.EmpVO;

public class JacksonManager {
	public String listJacksonCreate()
	{
		String json="";
		EmpDAO dao=EmpDAO.newInstance();
		List<EmpVO> list=dao.empAllData();
		
		try
		{
			ObjectMapper mapper=new ObjectMapper();
			json=mapper.writeValueAsString(list);
		}catch(Exception ex) {}
		return json;
	}
	public String voJacksonCreate(int empno)
	{
		String json="";
		EmpDAO dao=EmpDAO.newInstance();
		EmpVO vo=dao.empDetailData(empno);
		try
		{
			ObjectMapper mapper=new ObjectMapper();
			json=mapper.writeValueAsString(vo);
		}catch(Exception ex) {}
		return json;
	}
	public EmpVO jacksonVOCreate(String json)
	{
		EmpVO vo=new EmpVO();
		try
		{
			ObjectMapper mapper=new ObjectMapper();
			vo=mapper.readValue(json, EmpVO.class);
		}catch(Exception ex) {}
		return vo;
	}
	public List<EmpVO> jacksonListCreat(String json)
	{
		List<EmpVO> list=new ArrayList<EmpVO>();
		try
		{
			
			ObjectMapper mapper=new ObjectMapper();
			list=mapper.readValue(json, mapper.getTypeFactory().constructCollectionType(List.class, EmpVO.class));
		}catch(Exception ex) {}
		
		return list;
	}
}
