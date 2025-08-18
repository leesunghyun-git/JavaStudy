package com.sist.main;
import java.util.Scanner;

class 동물
{
	public void run() {
		System.out.println("달린다");
	}
}
class 개 extends 동물
{
	public void run() {
		System.out.println("개가 달린다");
	}
}
class 소 extends 동물
{
	public void run() {
		System.out.println("소가 달린다");
	}
}
class 말 extends 동물
{
	public void run() {
		System.out.println("말가 달린다");
	}
}
/*
 * 	1. 모든 클래스는 Object로부터 상속을 받는다.
 * 	   Object => 최상위 클래스
 * 	2. 상속을 받는 경우에는
 * 		=> 메모리를 통으로 가지고 온다
 * 		=> 상속받은 모든 클래스 => 상속내린 클래스로 제어
 * 				동물
 * 				 |
 * 		  ---------------
 * 		  |      |      | ...
 * 		  개     소      말      
 * 		=> 관련된 여러개의 클래스를 한개 객체로 제어
 *  3. 
 * 
 * 
 */
class Super1
{
	int age=30;
	String name="홍길동";
	public void eat(){
		System.out.println("냠냠쩝쩝");
	}
	public void run() {
		System.out.println("달리기");
	}
}
class Sub1 extends Super1
{
	String home="서울";
	public Sub1()
	{
		name="심청이";
	}
	public void run()
	{
		System.out.println("뛰다");
	}
	public void stop()
	{
		System.out.println("멈췄다");
	}
}
public class 재사용_3 {

	public static void main(String[] args) {
		
		  Super1 sp=new Super1(); 
		  Sub1 sb=new Sub1(); 
		  Super1 ss=new Sub1();
		  System.out.println("=== Super1 sp=new Super1() 의 결과 ===");
		  System.out.println("sp의 나이:"+sp.age); 
		  System.out.println("sp의 이름:"+sp.name);
		  sp.run(); 
		  sp.eat(); 
		  System.out.println("=== Sub1 sb=new Sub1() 의 결과 ===");
		  System.out.println("sb의 나이:"+sb.age);
		  System.out.println("sb의 이름:"+sb.name); 
		  System.out.println("sb의 집:"+sb.home);
		  sb.run(); 
		  sb.eat(); 
		  sb.stop(); 
		  System.out.println("=== Super1 ss=new Sub1() 의 결과 ===");
		  System.out.println("ss의 나이:"+ss.age);
		  System.out.println("ss의 이름:"+ss.name); 
//		  System.out.println("ss의 집:"+ss.home);
		  ss.run(); 
		  ss.eat(); 
//		  ss.stop();
		 
		Scanner scan=new Scanner(System.in);
		System.out.print("동물 이름 입력:");
		String name=scan.next();
		동물 ani=null;
		switch (name)
		{
		case "개": ani=new 개(); ani.run(); break; // 동적바인딩 => new => 메소드 주소 변경
		case "소": ani=new 소(); ani.run(); break;
		case "말": ani=new 말(); ani.run(); break;
		
		}

	}

}
