package com.sist.collection;

/*
 * 
 * 		라이브러리
 * 			Object
 * 			   clone / hashCode / equals / finalize() / toString
 * 			String
 * 			   length / equals / startsWith / endsWith / contains
 * 			   indexOf / lastIndexOf / trim / valueOf
 * 			   subString / split
 * 			StringBuffer
 * 			   append
 * 			Math
 * 			   random / ceil 
 * 			System
 * 			   System.out.println()
 * 			--------------------------- java.lang
 * 			  java.text
 * 			   SimpleDateFormat
 * 			   MessageFormat
 * 			   DecimalFormat
 * 			---------------------------- format()
 * 			java.util
 * 			   StringTokenizer
 * 				hasMroeTokens / countToken / nextToken
 * 			   Random
 * 				nextInt(int bound)필수의
 * 			   Collection
 * 				List => ArrayList
 * 				Map => HashMap
 * 				Set => HashSet
 * 			---------------------------------
 * 			   정규식 / 리플렉션 / 어노테이션
 * 		   ----------------------------------------------
 * 			기본 자바 => 데이터베이스 자바 => 웹 자바 => 스프링 자바
 * 				   J2SE					   J2EE
 * 		   ----------------------------------------------
 * 			
 * 			제네릭
 * 			----- Collection => List<RequiredDataType>
 * 									 ---------------- Java Class
 * 									 ---------------- User Defined
 * 								List<EmpVO>
 * 			제네릭을 지정 => 데이터형의 한계
 * 			List<String> : 무조건 String만 저장이 가능
 * 			add(String a) add(Object obj)
 * 			------------- String[]
 */
import java.util.ArrayList;
public class 컬렉션_1 {
	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	// List<String> list=new ArrayList<String>();
	// List<String> list=new ArrayList<>();
	list.add("사과");
	list.add("포도");
	list.add("수박");
	for (String f:list)
	{
		System.out.print(f+" ");
	}
	System.out.println();
	}
	
	// 정수 => Integer <클래스형> : Wrapper
	// 형변환 (X) , 지정값만 저장 => 리턴형도 지정된 값만 사용
	// 사용자 정의도 사용이 가능
}
