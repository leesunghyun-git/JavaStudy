// 사원 => Emp 
// 		  empno , ename , job, mgr, hiredate , sal , comm , deptno
// 14

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
// 확장
/*
 *  1. 확장을 해서 새로운 클래스 => 상속
 *  2. 있는 그대로 사용 => 포함
 *  3. 공통으로 사용되는 기능
 *  	=> 패키지 : 기능을 모아서 관리
 *  			 -------------- 공통 모듈
 *  4. 시작과 동시에 처리하는 내용 : 생성자
 *     ------------------- 데이터베이스 드라이버 등록
 *     					   네트워크 서버 구동
 *  웹에서는 명시적인 초기화가 많다
 *  	  -----------
 *  	  int page=1 / String fd=""
 */
public class MainClass {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@211.238.142.124:1521:XE";
		Connection con=DriverManager.getConnection(url,"hr","happy");
		String sql="SELECT empno,ename,job,sal,deptno FROM emp";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		int empno=0,sal=0,deptno=0;
		String ename="",job="";
		while(rs.next())
		{
			empno=rs.getInt(1);
			ename=rs.getString(2);
			job=rs.getNString(3);
			sal=rs.getInt(4);
			deptno=rs.getInt(5);
			
		}
		System.out.println("사번:"+empno);
		System.out.println("이름:"+ename);
		System.out.println("직위:"+job);
		System.out.println("급여:"+sal);
		System.out.println("부서번호:"+deptno);
		

	}

}
