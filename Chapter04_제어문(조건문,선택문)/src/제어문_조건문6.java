/*
 * 	1. 알파벳을 입력을 받아서 (단일 조건문) => 연산자
 * 		= 대문자
 * 		= 소문자
 * 		= 알파벳이 아님
 * 
 */
import java.util.Scanner;

public class 제어문_조건문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 입력:");
		String temp=scan.next();
		char eg=temp.charAt(0);
		
		if(eg>='A'&&eg<='Z')
			System.out.println("대문자입니다");
		if(eg>='a'&&eg<='z')
			System.out.println("소문자입니다");
//		if(eg<65 || eg>118)
		if(!(eg>='A'&&eg<='Z')&&!(eg>='a'&&eg<='z'))
			System.out.println("알파벳이 아닙니다");
	}

}
