package com.sist.lang;
import java.text.*;
import java.util.Date;
public class 라이브러리_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int won=1000000000;
		DecimalFormat df=new DecimalFormat("#,###,###,###");
		System.out.println(df.format(won));
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
		/*
		 * 
		 * 	yyyy / yy
		 *  MM   / M
		 *  dd   / d
		 *  ----------
		 *  hh   / h
		 *  mm   / m
		 *  ss   / s
		 * 
		 * 
		 */
		int no=1;
		String name="홍길동";
		String sex="남자";
		String address="서울";
		String phone="010-1111-1111";
		int age=30;
		String content="홍길동입니다.";
		
		// 오라클 연동
		//
		String sql="INSERT INTO member VALUES("+no+","+name+","+sex+","+phone+","+age+")";
		System.out.println(sql);
		
		sql="INSERT INTO member VALUES({0},''{1}'',''{2}'',''{3}'',''{4}'',{5})";
		Object[] obj= {no,name,sex,address,phone,age};
		System.out.println(MessageFormat.format(sql, obj));
		
		double[] limit = {59,60,70,80,90};
		String[] grade= {"F","D","C","B","A"};
		int[] score=new int[10];
		for(int i=0;i<score.length;i++)
		{
			score[i]=(int)(Math.random()*101);
		}
		ChoiceFormat cf=new ChoiceFormat(limit,grade);
		for(int i=0;i<score.length;i++)
		{
			System.out.println(score[i]+":"+cf.format(score[i]));
			
		}
		System.out.println(-10+":"+cf.format(-10));
		/*
		 * 
		 * 
		 *	문자함수 / 숫자함수 / 날짜함수 / 변환함수 / 기타함수
		 *	  |		   |	  |		   |		|
		 *   String   Math	Calendar  Format  switch , if 
		 * 	SimpleDateFormat : 날짜 변경 => 날짜함수 (오라클)
		 * 	DecimalFormat : 숫자 변환 => 숫자함수
		 *  MessageFormat : SQL 문장 사용
		 *  ----------------------------
		 *  => 웹 : SQL (Back-End : 90%)
		 *  ----------------------------
		 */
		
	}

}
