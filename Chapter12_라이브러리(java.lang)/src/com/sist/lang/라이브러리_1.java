package com.sist.lang;
/*
 * 	1. 라이브러리 => 자바에서 지원하는 클래스의 집합
 *     = java.lang : import 생략 가능
 *     	***= Object
 *     	***= String
 *     	= StringBuffer
 *     	= Math
 *      = System	
 *      = Wrapper
 *         ***= Integer => int
 *         ***= Double => double
 *         = Byte, Short 
 *         = Boolean => boolean
 *         = Float => float 
 *     = java.util
 *     	 = StringTokenized
 *     	 = *** Date / Calendar
 *       = Collection
 *         *** List / Set / Map
 *     = java.io
 *     	 = 파일입출력
 *     	   FileInputStream / FileReader
 *     	   FileOutputStream / FileWriter
 *     	   BufferedReader / BufferedWriter
 *     = java.net	
 *     	 = URLEncoder
 *       = URL
 *       = Socket
 *     = java.sql
 *       = Connection
 *       = PreparedStatement
 *     = java.text
 *       = MessageFormat
 *       = DecimalFormat
 *       = ChoiceFormat 
 *       
 *   ------------------------------------------
 *    ***= 어노테이션
 *    **= 람다식
 *    **= 리플렉션
 *    *= 정규식
 *   ------------------------------------------
 *    Collection *X100000000000000000000000000000
 *   ------------------------------------------
 *    Thread / 네트워크 / 데이터베이스
 *       
 *       
 *  Object : 모든 클래스의 상위 클래스 
 *  				   --------
 *  				   라이브러리 / 사용자 정의 => Object로부터 상속을 받는다
 *  1) 주요 기능
 *     ***= finalize() : 소멸자 함수
 *     ***= clone() : 복제
 *       ---------
 *       git clone repository 주소
 *     ***= equals : 객체 비교
 *     = getClass() : 클래스의 정보 / 객체 생성
 *     ***= toString() : 문자열 변환
 *     **= hashCode()
 *     ---------------------- 모든 클래스에 사용이 가능하게 내장
 *   2) 모든클래스의 상위 클래스
 *   	-------- 클래스를 리턴하는 메소드가 있는 경우 (Object)
 *      -------- 형변환
 *     
 *   class A
 *   {
 *   		O X
 *   }
 *   class B extends A
 *   {
 *   		// O X
 *   		P H K M N
 *   }
 *   
 *   A a=new A(); ==> O X
 *   B b=new B(); ==> O X P H K M N
 *   A c=new B(); ==> O X
 *             
 */

class Sawon implements Cloneable
{
	String name;
	String sex;
	public Sawon()
	{
		name="홍길동";
		sex="남자";
		
	}
	public void print()
	{
		System.out.println("이름:"+name);
		System.out.println("성별:"+sex);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
class Member
{
	int mno=10;
}
public class 라이브러리_1 /*extends Object*/{
	public static void getMno(Member m)
	{
		// m=mm
		m.mno=100; // 배열 (주소) => 예외 : String (Call By Value)	
	}
	public 라이브러리_1() {
		
	}
	public void aaa() {}
	public void bbb() {}
	public void ccc() {}
	public void ddd() {}
	public void eee() {}
	
	
	@Override
	// ===> 메소드 호출시에 예외처리를 한 후에 사용
	public boolean equals(Object obj) {
		System.out.println(obj.toString()+" 비교");
		return super.equals(obj);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Object obj=new 라이브러리_1();
			obj.equals(obj);
			Sawon hong=new Sawon();
			hong.print(); 
			hong.name="박문수";
			hong.sex="남자";
			System.out.println(hong.toString());
			Sawon shim;
			try {
			shim=(Sawon)hong.clone(); // 깊은 복사 => 새로운 메모리에 똑같은 내용 복사
			// prototype				 초기값이 같은 메모리 => 복사 => 새로운 메모리에 생성
			shim.name="심청이";
			shim.sex="여자";
			shim.print();	
			System.out.println(shim.toString());
			Sawon kim=shim; // 얕은 복사  => 같은 주소를 가지고 다른 변수명만 가짐
							// Call by Reference : 주소 참조
			System.out.println(kim.toString());
			kim.name="김두한";
			kim.sex="남자";
			shim.print();
			
			}catch(CloneNotSupportedException ex)
			{
				
			}
			hong.print();
			
			Member mm=new Member();
			getMno(mm); //m=mm => 같은 메모리 제어
			System.out.println(mm.mno);
			
	}

}
