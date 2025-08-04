/*
 * 	문자열 => String : 1,2,3,4 프로젝트
 * 					 --------------- 사용하는 변수/배열/클래스
 * 									 여기에 사용되는 데이터형 85%
 * 	= 문자여러개를 동시에 저장
 *    String == char[]
 *    	 | ==> 쉽게 제어할 수 있다. 
 * 		
 * 	제어하는 기능
 * 	1. 변환
 * 		toUpperCase() = 대문자 변환
 * 		toLowerCase() = 소문자 변환
 * 		---------------------------- 검색
 * 		*****valueOf() --- 모든 데이터형을 문자열 변환
 * 		valueOf(10) => "10"
 * 
 * 		String[] split(String del)
 * 		
 * 		공백문자 제거 => 유효성 검사
 * 		String trim() => 좌우 공백 제거
 * 		
 * 		문자열 결합
 * 		String concat(String s) ***** 사용빈도가 거의 없다
 * 		+ "ABC" + "DEF" ==> 
 * 		  "ABC".concat("DEF") ==> MySQL
 * 	3. 변경
 * 		replace(char c1,char c2)
 * 		replace(String s1,String s2)
 * 	
 * 		String ss="Hello Java";
 * 		ss.replace('a','b');
 * 				=> Hello Jbvb
 * 		ss.replace("Java","Oracle")
 * 				=> Hello Oracle
 * 
 *  	String replaceALL(대상문자(문자열), 문자열)
 *  4. 찾기
 *  	char charAt(int index) => 문자한개 추출
 *  	int indexOf(char)		
 *  	int lastindexOf(char)
 *  	
 *  5. 비교
 *  	boolean equals(String s)
 *  	 => 대소문자 구분
 *  		로그인 처리 / 아이디 중복 체크
 *  	boolean equalsIgnoreCase(String s)
 *  	 => 대소문자 구분없이
 *  	    검색
 *  	boolean startsWith(String s)
 *  	 => 시작문자열이 같은지 확인 : 대소문자 구분
 *  	    자동완성기
 *  		=> 쿠키 저장 => 시작문자열이 같은 경우
 *  		
 *  	boolean endsWith(String s)
 * 		=> 끝나는 문자열이 같은 경우 : 대소문자 구분
 * 		compareTo()
 * 
 * 
 */

import java.util.Arrays;

public class 문자열배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char[] ch= {'a','B','c','d','E','k'};
//		for(int i=0;i<ch.length;i++)
//		{
//			if(ch[i]>='a' && ch[i]<='z')
//				ch[i]=(char)(ch[i]-32);
//			System.out.print(ch[i]+" ");
//		}
//		System.out.println(Arrays.toString(ch));
//		int[] arr= {1,2,3,4,5}; 
//		System.out.println(Arrays.toString(arr));
//		int[] arr2=arr;
//		System.out.println(Arrays.toString(arr2));
//		arr2[0]=100;
//		arr2[1]=200;
//		System.out.println(Arrays.toString(arr));
		String str1="Hello";
		String str2="Java";
		int res=str2.compareTo(str2); // 문자 비교 => 0 => 정렬
		System.out.println(res);
		
		int aa=100;
		int bb=200;
		aa=bb;
		bb=aa;
		
	}

}
