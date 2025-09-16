package com.sist.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
public class BanDAO {
	Connection conn;
	PreparedStatement ps;
	private static BanDAO dao;
	DAOdefault db=new DAOdefault();
	
	public BanDAO() {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch
		(Exception ex)
		{
			
		}
	}
	
	public static BanDAO newInstance()
	{
		if(dao==null)
			dao=new BanDAO();
		return dao;
	}
	
	public void banInsert(List<Integer> users, String reasen,int period)
	{
		try 
		{
			conn=db.getConnection(conn);
			
			String sql="INSERT INTO banlist VALUES(?,?,SYSDATE,SYSDATE+?)";
			ps=conn.prepareStatement(sql);
//			System.out.println("1번완료");
			for(int i=0;i<users.size();i++)
			{
				ps.setInt(1, users.get(i));
				ps.setString(2, reasen);
				ps.setInt(3, period);
				ps.addBatch();
			}
//			System.out.println("작업완료");
			ps.executeBatch();
			
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally 
		{
			db.disConnection(conn, ps);
		}
	}
	public void bandelete(List<Integer> user)
	{
		try
		{
			conn=db.getConnection(conn);
			String sql="DELETE banlist WHERE id_num = ?";
			ps=conn.prepareStatement(sql);
			for(int user_num : user)
			{
//				System.out.println("정지 해제할 회원번호"+user_num);
				ps.setInt(1, user_num);
				ps.addBatch();
			}
			ps.executeBatch();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			db.disConnection(conn, ps);
		}
	}
	
}
