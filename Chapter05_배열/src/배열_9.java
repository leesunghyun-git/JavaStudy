// => 6개의 난수 => 1~45 => 중복없는 데이터
// => 고스톱
/*
 * 	1. 자바 메모리 구조 (JVM)
 * 		
 * 		=> 데이터별 묶음 : 배열
 * 		=> 단위별 묶음 : 클래스 => 구조체
 * 		=> 명령문 묶음 : 메소드
 * 		------------------------------ 클래스
 * 
 * 		---------------------
 * 		 Method Area => static
 * 		  main/사용자 정의 메소드 => 기능 (계산기 => +,-,*,/,= 5개 메소드) 
 * 		---------------------
 * 		 Heap : 배열 데이터 / 클래스 데이터
 * 		---------------------
 * 		
 * 		---------------------
 * 		
 * 		---------------------
 * 
 */

import java.util.Arrays;

public class 배열_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto=new int[6];
		int count=0;
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++)
			{
				if(lotto[i]==lotto[j])
				{
					i--;
					count++;
					break;
				}
			}
			
		}
		Arrays.sort(lotto);
		for(int i=lotto.length-1;i>=0;i--)
			System.out.print(lotto[i]+" ");
		System.out.println();
		System.out.println(count);
	}

}
