package com.sist.json;

import java.util.List;

import com.sist.dao.EmpVO;
import com.sist.manager.JacksonManager;
public class Json_1 {

	public static void main(String[] args) {
//		SimpleJsonManager sj=new SimpleJsonManager();
//		String json;
//		json=sj.jsonArrayCreate();
//		System.out.println(json);
		
		
//		File file=new File("c:\\JavaDev\\FoodJson.txt");
//		try
//		{
//			file.createNewFile()
//		}catch(Exception ex) {}
//		List<EmpVO> list=sj.jsonListCreate(json);
//		for(EmpVO vo:list)
//		{
//			System.out.println(vo.getEmpno()+" "+vo.getEname()+" "+vo.getJob()+" "
//					+vo.getHiredate()+" "+vo.getSal()+" "+vo.getDeptno());
//		}
		JacksonManager jm=new JacksonManager();
		String json
		=jm.listJacksonCreate();
//		System.out.println(json);
//		json=jm.voJacksonCreate(7900);
//		System.out.println(json);
//		EmpVO vo=jm.jacksonVOCreate(json);
//		System.out.println(vo.getEmpno()+" "+vo.getEname()+" "+vo.getJob()+" "
//				+vo.getHiredate()+" "+vo.getSal()+" "+vo.getDeptno());
		List<EmpVO> list=jm.jacksonListCreat(json);
		for(EmpVO vo:list)
		{
			System.out.println(vo.getEmpno()+" "+vo.getEname()+" "+vo.getJob()+" "
					+vo.getHiredate()+" "+vo.getSal()+" "+vo.getDeptno());
		}
		// 객체 => JSON => 자바 => 자바스크립트
		// JSON => 객체 => 
		
	}

}
