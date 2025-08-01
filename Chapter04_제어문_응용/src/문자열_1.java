/*
 * 
 * 		문자열
 * 		----- 자바
 * 		String => 데이터형 / 클래스형 (기능=>메소드)
 * 		=> 사용법
 * 		   String 변수명="문자"
 * 						---- 제한이 없다
 * 		예) 회원 정보
 * 			---------- id,pwd,name,email,address,phoen,post
 * 					   content ...... birthday ......
 * 
 * 			게시판 정보
 * 			  no name subject content pwd redgate hit
 * 		--> 제공하는 기능
 * 			메소드
 * 		변환
 * 		 toUpperCase() : 대문자로 변환
 * 		 toLowerCase() : 소문자로 변환
 * 		---------------------------------(사용빈도가 없다) 한글중심
 * 		 ********* valueOf() : 모든 데이터형을 문자열로 변환
 * 				   웹 / 윈도우 => 모든 데이터형 String
 * 			       valuseOf(10) => "10"
 * 
 * 		비교
 * 		equals() => 실제 문자열 비교
 * 		contains() => 문자열 포함 여부
 * 		startsWith() => 시작문자열 비교
 * 		endsWith() => 끝문자열 비교 => 확장자
 * 		검색
 * 		Hello Java!!
 * 		12345 67891011
 * 	    int indexOf("A")  => Hello J'a'va!! => 7
 * 		int indexOf("Java") => 6
 * 		=> 앞	
 * 		lastIndexOf("a") => Hello Jav'a'!! => 9
 * 		=> 뒤
 * 		제어
 * 		substring(1,5) : 문자를 자르기
 * 				   end-1 (맨 마지막은 하나를 제외해서 자름 (자르고싶은 부분+1 해야함))
 * 		split() => 문자별 자르기
 * 		trim() => 공백문자 제거 
 * 	  ----------------------------------------------------
 *    
 * 		
 * 
 */
// substring
import java.util.*;
import java.io.*;
public class 문자열_1 {
	
	public static void main(String[] args)
	{
		String msg="Hello Java";
		// 1. 문자의 갯수 => " " => 문자
		// => length() -> int
		int leng=msg.length();
		System.out.println("문자 갯수:"+leng);
		//2. 자르기
		String cut=msg.substring(msg.indexOf("H"),msg.lastIndexOf(" "));
		System.out.println(cut);
		System.out.println(msg.indexOf("H"));
		System.out.println(msg.lastIndexOf(" "));
		String name="문자열_1.java";
		String cut_name=name.substring(name.lastIndexOf(".")+1);
		System.out.println(cut_name);
		
//		File dir=new File("C:\\javaDev");
//		File[] lists=dir.listFiles();
//		for(File f:lists)
//		{
//			if(f.isFile())
//			{
//				String ss=f.getName();
//				System.out.println(ss);
//				System.out.println(ss.substring(ss.lastIndexOf(".")+1));
//				System.out.println();
//			}
//		}
		String msg1="                           Hello Java!!                      ";
		System.out.println(msg1.length());
		String ss=msg1.trim();
		System.out.println(ss.length());
		// trim() => 공백문자 제거 => 좌우
		// trim() => 어디서 => 검색 / 로그인 / 아이디중복체크
		// 액션 | ㅁㅁㅁ | ㅁㅁㅁㅁ 
		// 서울시 마포구 서교동 
		// => 지역 확인 
		
		String msg2="Java Oracle HTML CSS JavaScript JSP JQuery Ajax SpringFramwork VueJS SpringBoot Git GitAction Docker Docker-Compose Jenkins React Next TypeScript MSA Chatting NodeJs";
		System.out.println("\n\n\n");
		Scanner scan=new Scanner(System.in);
		System.out.print("단어 입력:");
		String d=scan.next();
		String[] datas=msg2.split(" ");
		for(String data:datas) // 향상된 for문 java 1.5 버전
		{
			//System.out.println(data);
//			if(data.endsWith(d)) System.out.println(data);
//			if(data.contains(d))
//			if(data.equals(d)) ==> 대소문자 구분
			if(data.equalsIgnoreCase(d))
			{
				System.out.println(data);
			}
		}
	}

}
