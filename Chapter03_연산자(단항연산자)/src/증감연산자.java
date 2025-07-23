/* 81page
 * 
 *  증감연산자 => 제어문(반복문)
 *  				  |
 *  			 	게임 => 총알 발사 
 *  				비행기 => 자동 이동 
 *  ++ , --
 *  --- ---
 *  	 | 1 감소
 *   | 1 증가
 *   
 *   1) 전치 연산자
 *   	++a : 1증가 
 *   	-- 먼저 증가하고 다른 연산 수행
 *   2) 후치 연산자
 *   	a++	: 1증가	
 *       -- 다른 연산 수행 나중에 증가	
 *       
 *   예)
 *   	int a=10;
 *   	int b=++a;
 *   	
 *   	a=11 , b=11
 *   	  
 *   	int a=10;
 *   	int b=a++;
 *   
 *   	a=11 , b=10
 *   	
 *  	int a=10;
 *  	int b=++a + ++a; 
 *  
 *   	a=12 , b=23
 *   	
 *   	int a=10;
 *   	int b=a++ + a++;
 *   	
 *   	a=12 , b=21
 *   
 *   	int a=10
 *   	int b=++a + a++
 *   
 *   	a= 12 , b = 22
 *   
 *   	int a=10
 *   	int b=++a + a++ + ++a + a++
 *   		   11   11
 *   				11     13
 *   					   13   13
 *   
 *   	a=14 , b=48
 *   
 *   	int a=10;
 *   	int b=a++ + a++ + ++a + a++
 *   			
 *   	a=14 , b=47 
 *   
 *   
 *   	int a=10;
 *   	int b=a++ + --a + a-- + a++;
 *                         
 *   	a=10 , b= 39
 *   
 *   	int a=10;
 *   	int b=a-- + a -- + --a + --a;
 *   		   10    9      7     6 
 *   	a=6 , b= 32
 *   
 *   	
 *   
 */
public class 증감연산자 {
	public static void main(String[] args) {
//		int a=10;
//		int b=++a + ++a;
//		System.out.println(b);
//		int a1=10;
//		int b1=a1++ + a1++;
//		System.out.println(b1);
//		int a2=10;
//		int b2=++a2;
//		int b3=a2++;
//		System.out.println("a2="+a2+"\tb2="+b2+"\tb3=");
		
		int a=10;
		int b=++a;
		a=10;
		b=a++;
		System.out.println("a="+a+"\tb="+b);
		
		a=10;
		b=++a + ++a;
		System.out.println("a="+a+"\tb="+b);
		
		a=10;
		b=a++ + a++;
		System.out.println("a="+a+"\tb="+b);
		
		a=10;
		b=--a;
		System.out.println("a="+a+"\tb="+b);
		
		a=10;
		b=a--;
		System.out.println("a="+a+"\tb="+b);
		
		a=10;
		a++;
		a--;
		--a;
		++a;
		a++;
		System.out.println("a="+a);
		
		a++;
		a++;
		a--;
		System.out.println("a="+a);	
		
		/*
		 * 	double d=123456.78;
		 * 	int i=123456;
		 * 	int a=(int)((d-i)*100);
		 * 	
		 */
		
		double d=123456.78;
		int i=123456;
		double j=d-i;
		int a1=(int)((d-i)*100);
		System.out.println(j);
		System.out.println(a1);
		
		char c='A';
		char c1=c++;
		System.out.println(c);
		System.out.println(c1);
		
		
		 
	}
	/*
	 *  ++ , -- => 무조건 1개증가 /1개감소
	 *  int a=10;
	 *  int b=a++;
	 *  	----
	 *  	b에 a값 대입
	 *  	   -- a에 1을 증가
	 *  int a=10;
	 *  int b=++a;
	 *  	  --
	 *  	 a에 1을 증가
	 *  	 ----
	 *  	b에 a값을 대입
	 * 
	 */
}
