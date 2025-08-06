/*
 * 
 * 		 | 한개만 존재 => 배열 / 클래스 
 * 		리턴형 메소드명(매개변수...) => 선언부
 * 		{			--------- 데이터묶음 (매개변수 3개 이상)
 * 			구현부				 |배열 / 클래스 
 * 		}
 * 		
 * 		메소드를 가지고 있으면 클래스 
 * 		=> 일반 데이터형 / 클래스 형 (String)	
 * 
 * 			메소드명
 * 		-----------------
 *  요청값
 * 	==>		매개변수
 * 			-----
 * 			처리 ========> 결과값 / 자체처리
 * 		-----------------		   |
 * 								 void
 * 
 * 	----------------------------------------------------
 * 		int disp(int a,int b) // 선언만된 구현이 없는 메소드 => 추상메소드 => 추상메소드의 모음 = 인터페이스
 * 		{
 * 			
 * 		} // 메모리에 저장 
 * 		int a=10;
 * 		int b=20;
 * 		int c=30;
 * 		
 * 		LIFO  	/ 	FIFO
 * 					----
 * 
 * 		메소드
 * 		----- call stack
 * 		void main()
 * 		{
 * 			aaa()
 * 		}
 * 		void aaa()
 * 		{
 * 			bbb()
 * 		}
 * 		void bbb()
 * 		{
 * 			ccc()
 * 		}
 * 		void ccc()
 * 		{
 * 			ddd()
 * 		}
 * 		void ddd()
 * 		{
 * 		}
 */

import java.lang.reflect.Method;

class A
{
	void aaa()
	{
		
	}
	void bbb()
	{
		
	}
	void ccc()
	{
		
	}
	void ddd()
	{
		
	}
}
public class 메소드_4 {
	

	public static void main(String[] args) {
		try
		{
			Class clsName=Class.forName("A");
			Object obj=clsName.getDeclaredConstructor().newInstance();
			Method[] methods=clsName.getDeclaredMethods();
			for(Method A:methods)
			{
				System.out.println(A);
			}
		}catch(Exception ex) {}

	}

}
