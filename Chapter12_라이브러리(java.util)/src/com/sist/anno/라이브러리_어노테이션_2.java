package com.sist.anno;
import java.lang.reflect.Method;
import java.util.Scanner;
/*
 *  1. 특별한 형태의 인터페이스 
 * 	2. 어노테이션의 종류
 * 	   표준 어노테이션 : 자바에서 제공
 * 	   라이브러리 어노테이션 : lombok , spring 
 * 	   메타 어노테이션 : 어노테이션을 만드는 경우
 * 	   ----------- @Retention
 * 					   사용 범위
 * 					   컴파일시에만 사용
 * 						 CLASS / SOURCE
 * 					   런타임까지 사용
 * 						 RUNTIME ==> 프로그램 종료시까지
 * 				   @Target
 * 					  TYPE   : 클래스 구분
 * 				 	  METHOD : 메소드 구분
 * 					  FIELD  : 변수 구분
 * 	   사용자 정의 : 개발자가 만든다
 * 		 		 ------------ 	스프링 (필수)
 * 				 => 어노테이션명은 마음대로
 * 
 * 
 * 	    
 */
class Service
{
	@MyAnno("login.do")
	public void login()
	{
		System.out.println("로그인 요청");
	}
	@MyAnno("join")
	public void join()
	{
		System.out.println("회원가입");
	}
	@MyAnno("logout")
	public void logout()
	{
		System.out.println("로그 아웃");
	}
	@MyAnno("list")
	public void list()
	{
		System.out.println("목록 출력");
	}
	@MyAnno("detail")
	public void detail()
	{
		System.out.println("상세보기 출력");
	}
}

public class 라이브러리_어노테이션_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Service s = new Service();
		Scanner scan = new Scanner(System.in);
		System.out.print("입력(login,join,logout):");
		String user=scan.next();
		
		Class cls=Class.forName("com.sist.anno.Service");
		// 클래스의 모든 정보 수집
		Object obj=cls.getDeclaredConstructor().newInstance();
		// 동적 객체 생성 => Service s=new Service()
		// 메소드 제어
		Method[] method=cls.getDeclaredMethods();
		for(Method m:method)
		{
//			String name=m.getName();
//			System.out.println(name);
//			if(name.equals(user))
//			{
//				m.invoke(obj, null);
//				break;
//			}
//			System.out.println(m.getName());
			MyAnno my=m.getAnnotation(MyAnno.class); // 어노테이션이 붙어있는것을 가져옴
			if(my.value().equals(user)) // 	
			{
				m.invoke(obj, null);
				break;
			}
		}
		int[][] queries = {{0,3},{1,2},{1,4}};
		System.out.println(queries.length);
		System.out.println(queries[0][1]);
		
		
		
	}

}
