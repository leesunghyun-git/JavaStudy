package com.sist.manager;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.sist.dao.EmpDAO;
import com.sist.dao.EmpVO;

public class SimpleJsonManager {
	// JSON 생성 [] 
	public String jsonArrayCreate()
	{
		// DB에서 값을 가지고 온다
		EmpDAO dao=EmpDAO.newInstance();
		List<EmpVO> list=dao.empAllData();
		//[] => JSONArray
		JSONArray arr=new JSONArray();
		for(EmpVO vo:list)
		{
			JSONObject obj=new JSONObject();
			obj.put("empno", vo.getEmpno());
			obj.put("ename", vo.getEname());
			obj.put("job", vo.getJob());
			obj.put("hiredate", vo.getHiredate());
			obj.put("sal", vo.getSal());
			obj.put("deptno", vo.getDeptno());
			arr.add(obj);
		}
		
		return arr.toJSONString();
	}
	// JSON 생성 {}
	public String jsonObjectCreate(int empno)
	{
		EmpDAO dao=EmpDAO.newInstance();
		EmpVO vo=dao.empDetailData(empno);
		JSONObject obj=new JSONObject();
		obj.put("empno", vo.getEmpno());
		obj.put("ename", vo.getEname());
		obj.put("job", vo.getJob());
		obj.put("hiredate", vo.getHiredate());
		obj.put("sal", vo.getSal());
		obj.put("deptno", vo.getDeptno());
		return obj.toString();
	}
	// JSON => List
	public List<EmpVO> jsonListCreate(String json)
	{
		List<EmpVO> list=new ArrayList<>();
		
		// []
		try
		{
			JSONParser jp=new JSONParser();
			JSONArray arr=(JSONArray)jp.parse(json);
			for(int i=0;i<arr.size();i++) {
				JSONObject obj=(JSONObject)arr.get(i);
				EmpVO vo = new EmpVO();
				vo.setEmpno(Integer.parseInt(obj.get("empno").toString()));
				vo.setEname(obj.get("ename").toString());
				vo.setJob(obj.get("job").toString());
				vo.setHiredate(obj.get("hiredate").toString());
				vo.setSal(Integer.parseInt(obj.get("sal").toString()));
				vo.setDeptno(Integer.parseInt(obj.get("deptno").toString()));
				list.add(vo);
			}
			
		}catch(Exception ex) {ex.printStackTrace();}	
		return list;
		
	}
	// JSON => VO
}
