package com.sist.main;
/*
 * 	재사용법
 * 	  = 변경없이 재사용 => 포함 클래스 (has-a)
 *    = 변경후 재사용 => 상속 (is-a)
 *    1) 상속
 *    	 기존의 클래스 (이미 만들어진 클래스)의 모든 기능과 변수
 *    	 받아서 새로운 기능 클래스를 만든다
 *    		  -------- 확장
 *    	=> 목적
 *    	   코드 재사용 (소스 간결하다)
 *    	   신뢰성이 뛰어나다
 *    	   유지보수가 용이하다
 *    	=> 키워드 : extends
 *      => 기능 변경이 가능 => 오버라이딩
 *      => 단점 : 속도가 늦다
 *      	     상속내린 클래스 => 메모리 할당
 *      	     상속받은 클래스 => 메모리 할당
 *      		 메모리가 비대
 *      => 상속의 예외 조건
 *      	= 생성자
 *      	= static => 사용이 가능하게
 *      	** private 상속이 된다 => 접근이 불가능
 *      => 가독성이 떨어진다
 *      => 자신의 클래스 => this
 *      => 상위클래스 => super
 *      => 자바는 단일 상속만 가능하다
 *      		------- 다중 상속 가능 : 인터페이스
 *      	
 *      => 상속내린 클래스 : 부모클래스 , 슈퍼클래스 , 베이스클래스, 하위클래스
 *      => 상속받은 클래스 : 자식클래스 , 서브클래스 , 파생클래스, 하위클래스
 *      
 *      class A
 *      {
 *      	int a,b,c;
 *      }
 *      class B extends A
 *      {
 *      	// a,b,c가 있지만 보이지 않음 => 가독성이 떨어짐	
 *      }
 */
class Super
{
	static int num;
	int age;
	String name;
	public Super()
	{
		num=1;
		age=100;
		name="홍길동";
	}
	public void eat()
	{
		System.out.println("먹는다");
	}
	public void run()
	{
		System.out.println("달린다");
	}
}
class Sub extends Super
{
	public Sub() {
		super();
	}
	public void run()
	{
		System.out.println("뛴다");
	}
}
public class 재사용 {

	public static void main(String[] args) {
		/*
		 * 
		 * 	1.변수 => 선언되는 클래스
		 * 	  Super ss => ss가 가지고 있는 변수
		 *  2.메소드 => 생성자
		 *    Super ss= new Sub()
		 *    		   -------- 메소드
		 *    -------- 변수
		 *    
		 * 
		 */
		Super sp=new Super();
//		sp.num=1;
//		sp.age=30;
//		sp.name="홍길동";
		Sub sb=new Sub();
//		sb.name="심청이";
//		sb.age=25;
//		sb.num=3; // 상속받은 클래스의 static 변수를 수정해도 super 클래스의 static변수가 변경
		System.out.println("sp 넘버"+sp.num);
		System.out.println("sp 나이"+sp.age);
		System.out.println("sp 이름"+sp.name);
		System.out.println("sp 넘버"+sb.num);
		System.out.println("sp 나이"+sb.age);
		System.out.println("sp 이름"+sb.name);	
		sp.eat();
		sp.run();
		sb.run();
		sb.eat();
		
		System.out.println("================");
		Super ss=new Sub();
		// 크기 => 상속내린 클래스 > 상속받은 클래스 
		System.out.println("나이"+ss.age);
		System.out.println("이름"+ss.name);
		ss.eat();
		ss.run();
		
	}

}
