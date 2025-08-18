package com.sist.exception;

public class 예외처리_2 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		// 에러 의심
		try {
		System.out.println(4);
		System.out.println(5);
		System.out.println(6/0); // catch로 이동
		System.out.println(7);
		} catch (Exception e)
		{
			System.out.println("0으로 나눌 수 없다");
		}
		System.out.println(9);
		System.out.println(10);
	}
}
