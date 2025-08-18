package com.sist.ast;
import java.util.Calendar;
public class MainClass {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		// 추상 클래스는 메모리 할당이 불가 (new 사용 금지)
		// TODO Auto-generated method stub
		/*
		 * 	추상 클래스
		 * 	------------
		 * 	1. 각 사이트의 공통적으로 사용되는 데이터
		 * 	2. 기능 : 공통적인 기능
		 * 		=> 다른 내용을 구현 : 추상 메소드
		 * 							=> 선안만 된다
		 * 							=> 반드시 상속을 받아서 처리
		 * 				=> 상속시 따로따로 구현
		 * 		=> 같은 내용을 구현 : 일반 메소드
		 * 
		 * 	형식)
		 * 		public abstract class ClassName
		 * 		{
		 * 			// 선언된 메소드 : 기능은 같은데 구현ㅇ하는 내용이 다른 경우
		 * 			public abstract 리턴형 메소드명(매개변수...);
		 * 			=> 반드시 구현을 해야 한다
		 * 			// 구현된 메소드
		 * 			public 리턴형 메소드(매개변수...)
		 * 			{
		 * 			
		 * 			}
		 *
		 * 			
		 * 		}
		 */
			MusicClass mc=new Melon();
			mc.musicFind("노래");
			mc.musicAllData();
			mc.musicPrint();
			
			mc=new GenieMusic();
			mc.musicAllData();
			mc.musicFind("노래");
			mc.musicPrint();
			
	}

}
