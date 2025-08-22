package com.sist.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *  정규식 : 문자의 패턴을 만드는 과정
 *  	  ------------------- 
 *  => [] => 한개의 문자 [a] => [abc] a,b,c
 *  							a|b|c
 *  	  => [abcd...z] => [a-z] 
 *  	  => [ABCD...Z] => [A-Z]
 *  	  => 알파벳 전체
 *  		 [a-zA-Z] =>contains
 *  	  => 알파벳 시작
 *  		^[a-zA-Z] => startsWith	
 * 		  => 1234A
 * 			 [a-zA-Z]$
 * 		  => 1234 홍길동...
 * 			 [^a-zA-Z] => 알파벳을 제외한
 * 		----------------------------------
 * 		 숫자 [0-9] 숫자전체
 * 		 한글 [가-힣] 한글전체
 * 		 [] => ^(시작과 제외) $(끝문자)
 * 		---------------------------------
 * 		[0-9] => \d =======================> \D => 숫자가 아닌
 * 				 \s => 공백	===============> \S => 공백이 아닌
 * 				 \w => [a-zA-Z]   =========> \W => 특수문자
 * 				 --- 한개의 알파벳 / 한개의 숫자 
 * 		맛있고 맛있다 맛있는  ...
 * 		맛있+
 * 		+ : 1개 이상
 * 		짜 짜다 짜고 짜니...
 * 		짜*
 * 		* : 0개 이상
 * 		ㅎㅎ ㅋㅋ 
 * 		. : 임의의 한 글자
 * 		? : 0이나 1개
 * 		{n} => n번 반복 => \d{4] => 1234 숫자 4개 반복
 * 		{n,} => n번 이상 반복 => a{2,} => aa aaa aaaa...
 * 		{n,m} => n~m번 반복 => a{2,4} aa aaa aaaa
 * 		=> 정규식 : 검색 => 자바스크립트 , 오라클
 * 
 * 		EN IN KN
 * 		WHERE ename LIKE '%EN%' OR ename '%IN%' OR ename LIKE '%KN%'
 * 		WHERE REGEXP_LIKE(ename , 'EN|IN|KE')
 * 
 * 		 () => 그룹 => (ab)+ => abab
 * 		----------------------------------------------------
 * 		table
 * 		  |
 * 		 tr
 * 		  |
 * 	---------------
 * 	|			  |
 * th 			 td
 * 		(tr)+
 * 		(th|td)+ => loose.dtd <!DOCTYPE html>
 * 	
 * 		예) ip 
 * 			211.238.142.124
 * 						--- 1~3 => 255
 *   				--- 1~3
 * 				--- 1~3
 * 			--- 1~3
 * 			127.0.0.1
 * 			211 63.64.1
 * 
 * 			[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
 * 			\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}
 * 			
 * 			실제 => 특수문자 => \\
 */
public class 라이브러리_정규식표현법 {
	public static void main(String[] args) {
		String[] ips= {
				"211.238.142.124",
				"127.0.0.1",
				"010.1111.1111",
				"1234.1235",
				"111.111.111.0"
		};
		String s="\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
		Pattern ip = Pattern.compile(s);
		for(int i=0;i<ips.length;i++)
		{
			Matcher m=ip.matcher(ips[i]);
			if(m.find()) //true/false
			System.out.println(ips[i]);
		}
	}
}
