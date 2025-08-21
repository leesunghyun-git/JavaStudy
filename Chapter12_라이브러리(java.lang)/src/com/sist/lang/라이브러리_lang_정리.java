package com.sist.lang;

import java.io.IOException;

/*
 * 	java.lang / java.text
 * 	---------	자바의 기본 클래스 (import 생략)
 * 	1) Object : 모든 클래스의 상속을 내리는 클래스 (최상위 클래스)
 * 				= 모든 데이터를 포함
 * 				= 모든 클래스 : extends Object
 * 			주요기능
 * 			 String toString() : 객체 메모리 주소를 리턴한다
 * 				 => 생략이 가능
 * 			 boolean equals(Object o) : 객체 비교 (주소비교)
 * 			 Object clone() : 복제 (새로운 메모리 만든다)
 * 			 void finalized() : 소멸자
 * 			 int hashCode() : 객체의 메모리 부소를 기반으로 정수형으로 만든 구분자	
 * 	2) String : 문자열을 저장하는 데이터형
 * 			사용법) ********* String s="" => 일반데이터형과 동일
 * 			      String s=new String("") => 클래스형태
 * 		    주요기능
 * 			  문자의 갯수 : length() => int length()
 * 			  문자를 있는 그대로 가지고 오기 : String toString()
 * 			  문자변환 : replace() replaceAll()
 * 					  String replace(char c1,char c2)
 * 					  String replace(String c1,String c2)
 * 					  String replaceAll(String c1,String c2)
 * 									    -----------
 * 									 	 정규식
 * 			  문자위치 찾기 : int indexOf(char c) , int indexOf(String c)
 * 						  int lastIndexOf(char c) int lastIndexOf(String c)
 * 			  문자 자르기 : substring() , split()
 * 						------------
 * 						 String substring(int b)
 * 						 String substring(int b,ina e)
 * 						 String[] split(string regex)
 * 										------------ 정규식을 이용
 * 						 => 보완 : StringTokenizer
 * 		 	  공백문자 제거 : trim() : 좌우의 공백을 제거
 * 						  String trim()
 * 			  비교 : equals() => boolean equals(String s)
 * 			  검색 : stratsWith() , endsWith() , contains()
 * 			       -------------  -----------  -----------
 * 					시작문자열 (검색)  끝문자열(확장자)  포함된 문자열
 * 			  		원형) boolean startsWith(String s)
 * 						 boolean endsWith(String s)
 * 						 boolean contains(String s)
 * 			  문자열 변환 : valueOf(기본형)
 * 						 static String valueOf
 * 
 *  3) StringBuffer / StringBuilder
 *  	비동기				동기
 *  	-----------	    ------------ 문자열 결합
 *  	=> append() : 문자열 결합
 *  			  | char , String
 *      => 문자가 많은 경우 => 문자열 결합의 최적화
 * 	4) Math : Only static
 * 			static double random() : 랜덤
 * 			static double ceil(double d) : 올림 함수
 * 	5) System : 프로그램 종료 / 메모리 해제 / 콘솔 출력
 * 		  System.exit(int a) => a=0 정상 종료
 * 		  System.gc() => 가비지 콜렉션
 * 	6) Wrapper
 * 		= Integer
 * 		= Double
 * 		= Boolean
 * 		= Long
 * 
 */
public class 라이브러리_lang_정리 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			System.out.print("키보드 입력:");
			int a=System.in.read();
			System.out.println(a);
	}

}
