package com.sist.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/*
 * 					 요청
 * 				  연결 : Socket	 => Connection
 * 				  송수신 : OutputStream 
 * 						 BufferedReader
 * 						---------------- PreparedStatsment
 * 					  요청
 * 	EmpDAO(Client) ========> 오라클 (서버)
 * 				   <========   |
 *                    응답 	   |
 *                    		 저장 기능 INSERT
 *                    		 검색 기능 SELECT
 *                      	 수정 기능 UPDATE
 *                      	 삭제 기능 DELETE
 */	
public class EmpDAO {
	private Connection conn;
	private PreparedStatement ps;
	// URL => 오라클
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	/*
	 * 	폴더 => 데이터베이스(XE)
	 *  파일 => 테이블 (TABLE)
	 * 
	 */
	// 한번 사용 => 싱글턴
	private static EmpDAO dao;
	// 1. 드라이버 등록 => 한번만 수행 (수행자)
	
	// 3. 해제
	// 4. 싱글턴
	// ------------------------- 기본 : 기능 (1) => 메소드 , 기능 (여러개) => 클래스
	public EmpDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {ex.printStackTrace();}
	}
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception ex) {}
	}
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close(); 
			if(conn!=null) conn.close();
		}catch(Exception ex) {}
		
	}
	public static EmpDAO newInstance()
	{
		if(dao ==null)
			dao = new EmpDAO();
		return dao;
	}
	public List<EmpVO> empAllData()
	{
		List<EmpVO> list = new ArrayList<>();
		try
		{
			getConnection();
			String sql="SELECT empno,ename,job,TO_CHAR(hiredate,'YYYY-MM-DD'),sal,deptno FROM EMP";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				EmpVO vo=new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getString(4));
				vo.setSal(rs.getInt(5));
				vo.setDeptno(rs.getInt(6));
				list.add(vo);
			}
			rs.close();
		}catch (Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return list;
	}
	public EmpVO empDetailData(int empno) {
		EmpVO vo=new EmpVO();
		String sql="SELECT empno,ename,job,TO_CHAR(hiredate,'YYYY-MM-DD'),sal,deptno FROM emp WHERE empno="+empno;
		try
		{
			getConnection();
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			vo.setEmpno(rs.getInt(1));
			vo.setEname(rs.getString(2));
			vo.setJob(rs.getString(3));
			vo.setHiredate(rs.getString(4));
			vo.setSal(rs.getInt(5));
			vo.setDeptno(rs.getInt(6));
			rs.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return vo;
				
	}

}
