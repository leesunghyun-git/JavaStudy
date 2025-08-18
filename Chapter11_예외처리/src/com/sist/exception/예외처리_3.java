package com.sist.exception;

/*
 * 	다중 catch사용
 * 	=> 의심되는 에러
 * 
 * 	1. 배열을 생성
 * 	2. 문자열정수 입력 => 정수로 변환 => 배열에 저장
 * 	3. 나누기 
 * 
 */
public class 예외처리_3 {
	public static void main(String[] args) {
		int a = 10, b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("런타임 에러");
		} catch (NumberFormatException e) {
			System.out.println("데이터형 에러");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 에러");
		} catch (RuntimeException e) {
			System.out.println("런타임 에러");
		} finally {
			System.out.println("프로그램 종료");
		}
		;
	}
}
