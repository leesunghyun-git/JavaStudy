package com.sist.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

/*
 * "netflix", "tving", "coupang", "wavve", "disney", "watcha", "boxoffice"
 * BX_NUM_SEQ, CP_NUM_SEQ, DN_NUM_SEQ, NF_NUM_SEQ, TV_NUM_SEQ, WC_NUM_SEQ, WV_NUM_SEQ
 * 
 * 
 */
import com.sist.vo.DataVO;
public class DataDAO{
	private static DataDAO dao;
	Connection conn;
	PreparedStatement ps;
	DAOdefault db=new DAOdefault();
	private static Map<String,String> seqmap = new HashMap<String, String>();
	static
	{
		seqmap.put("netflix", "NF_NUM_SEQ.NEXTVAL");
		seqmap.put("tving", "TV_NUM_SEQ.NEXTVAL");
		seqmap.put("coupang", "CP_NUM_SEQ.NEXTVAL");
		seqmap.put("wavve", "WV_NUM_SEQ.NEXTVAL");
		seqmap.put("disney", "DN_NUM_SEQ.NEXTVAL");
		seqmap.put("watcha", "WC_NUM_SEQ.NEXTVAL");
		seqmap.put("boxoffice", "BX_NUM_SEQ.NEXTVAL");
	}
	public static DataDAO newInstance()
	{
		if(dao==null)
			dao=new DataDAO();
		return dao;
	}
	public void insertData(DataVO vo)
	{
		try
		{
			conn=db.getConnection(conn);
				String sql="INSERT INTO OTT_CRAWLING VALUES("+seqmap.get(vo.getSite())+",?,?,?,?,?,?,?,0)";
				
				/*
				 *  vo.setSite(u);
                    vo.setRank(rank);
                    vo.setName(name);
                    vo.setScore(score);
                    vo.setContent(content);
                    vo.setCast(casts);
                    vo.setDetail(detail);
                    vo.setLink(link);
                    
					CONTENT_NO NOT NULL NUMBER        
					POSTER              CLOB          
					SCORE               VARCHAR2(30)  
					CONTENT             CLOB          
					CAST                VARCHAR2(500) 
					DETAIL              CLOB          
					IMAGE               CLOB          
					TITLE               VARCHAR2(200) 
				 */
				ps=conn.prepareStatement(sql);
				ps.setString(1,vo.getPoster());
				ps.setString(2, vo.getScore());
				ps.setString(3, vo.getContent());
				ps.setString(4, vo.getCast());
				ps.setString(5, vo.getDetail());
				ps.setString(6, vo.getImage());
				ps.setString(7, vo.getTitle());
				
				ps.executeUpdate();
				
			
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
