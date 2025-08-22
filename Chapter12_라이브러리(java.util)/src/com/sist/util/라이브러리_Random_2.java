package com.sist.util;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.StringTokenizer;
// Random() => 임의의 예약일 ... 게임
// 데이터를 문자열로 묶은 경우 => 단어별 구분
// 필요시 => 정수변경
public class 라이브러리_Random_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		// 오라클 => HH , hh 구분안함 => HH24 , HH 
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-M-d");
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-M-d HH:mm:ss");
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-M-d hh:mm:ss");
		System.out.println(sdf2.format(date));
		System.out.println(sdf3.format(date));
		String today=sdf.format(date);
		StringTokenizer st=new StringTokenizer(today,"-");
		String year=st.nextToken();
		String month=st.nextToken();
		int day=Integer.parseInt(st.nextToken());
		Random r=new Random();
		int[] reserve=new int[r.nextInt(10)+11]; // 11~20
		for(int i=0;i<reserve.length;i++)
		{
			reserve[i]=r.nextInt(31)+1;
			for(int j=0;j<i;j++)
			{
				if(reserve[i]==reserve[j])
				{
					i--;
					break;
				}
			}
		}
		Arrays.sort(reserve);
		System.out.println(Arrays.toString(reserve));
		System.out.println("예약 가능한 날");
		for(int i:reserve)
		{
			if(day<=i)
				System.out.print(i+" ");
		}
	}	

}
