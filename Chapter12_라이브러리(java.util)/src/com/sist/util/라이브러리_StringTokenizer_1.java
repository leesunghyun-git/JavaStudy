package com.sist.util;
/*
 * 	util : 유용한 클래스의 집합
 * 	 *** 1) StringTokenizer 문자 분해
 * 	 *** 2) Collection
 * 		List형 => 순서를 가지고 있다 (인덱스) , 데이터 중복을 허용
 * 			  => 데이터베이스 (비동기)
 * 			   |	네트워크의 접속자 저장(동기)
 * 			   |	  |
 * 		ArrayList , Vector , LinkedList , Queue
 * 		Set형 => 순서가 없다, 데이터 중복을 허용하지 않는다 
 * 		HashSet , TreeSet
 * 		Map형 => 순서가 없다 , (키,값) 쌍으로 되어 있다
 * 		HashMap , Hashtable
 * 		--------------------------------------------
 *   3) Date / Calendar : 날짜 관련
 *   
 *   StringTokenizer : 구분자별로 문자열을 나눠주는 역할 
 *   	1) 생성자 => 구분
 *   	2) countTokens() 분리한 단어별
 *   	3) hasMoreTokents : 루프 사용시 (반복문)
 *   	   => 분리된 단어가 몇개인지 모르는 경우
 *   	   => 갯수가 명확하지 않는 경우
 *   	4) 분리된 단어를 읽어올때
 *   	   nextToken();
 */
import java.util.StringTokenizer;
public class 라이브러리_StringTokenizer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String colors="red,green,yellow,white,black,blue,purple,magenta,pink";
		StringTokenizer st=new StringTokenizer(colors,",");
		System.out.println(st.countTokens());
		
//		for (int i=0;i<st.countTokens();i++)
//		{
//			System.out.println(i+1+"' 색상:"+st.nextToken());
//		}
		
		int i=1;
		while(st.hasMoreTokens())
		{
			System.out.println(i+"' 색상:"+st.nextToken());
			i++;
		}
	}

}
