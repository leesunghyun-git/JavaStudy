package com.sist.exception;

import java.io.IOException;

/*
 * 	간접 처리 : throws 
 * 		=> 예외회피 => 컴파일 통과를 위해 시스템에 알려준다
 * 		   => 예외 떠맡기기
 * 			  ---------
 * 			   처리 => 메소드 호출시에 처리 (개발자)
 * 			   애매한 상태
 * 			  --------- 에러가 예측이 안되는 상태
 * 			  --------- 메소드 처리
 * 						=> 소스량이 많다
 * 
 * 	형식 )
 * 		public void display() throws 예외처리클래스,예외처리클래스,예외처리클래스...
 * 								     -----------------------------------
 * 		public void aaa() throws 예외처리클래스,예외처리클래스,예외처리클래스... => Exception
 *		 {
 *			display();
 *		 } 
 */

public class 예외처리_5 {

	public static void display() throws NumberFormatException, ArrayIndexOutOfBoundsException, 
	
	
	
	
	NullPointerException, IOException , Throwable {
		System.out.println("display call...");
	}

	public static void main(String[] args) throws Throwable {
		display();
//		try {
//			Thread.sleep(0);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		try
//		{
//			System.out.println(10/0);
//		} catch(ArithmeticException ex)
//		{
//			ex.printStackTrace();
//			System.out.println("오류");
//		}
	}

}
