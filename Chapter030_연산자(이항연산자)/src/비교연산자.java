/*
 * 		웹 개발
 * 		------
 * 		연산자	================> 오라클 / 자바스크립트
 * 		  ***1. 산술연산자
 * 		  2. 비교연산자
 * 		  ***3. 증감연산자
 * 		  ***4. 형변환연산자
 * 		  5. 논리연산자
 * 		  ***6. 부정연산자
 * 		  7. 대입연산자
 * 		------------------
 * 
 * 		자바 => JSP / SpringFramework / Spring-Boot 
 * 			  ---------------------------------------- 웹 라이브러리 
 * 		자바스크립트 => VueJs / ReactJs / NextJS
 * 		오라클 => MySQL / MariaDB
 * 		---------------------- CI/CD => 리눅스 명령어
 * 								----------------
 * 								1.  AWS => 우분투
 * 								2.  
 * 		--------------------------------------------
 * 		비교연산자 : 결과값 true / false 
 * 		--------
 * 				1) 정수
 * 				2) 실수
 * 				3) 문자 (문자열X)
 * 				4) 논리(boolean) 제한 => ==, !=
 * 				===> 문자열 / 날짜 => 비교가 불가능 
 * 			1. == (같다)
 * 			2. != (같지 않다)
 * 			3. < 작다
 * 			4. > 크다  =========> 왼쪽 기준 a>10 a<10
 * 			5. <= 작거나 같다
 * 			   ---- < == => 둘중  하나가 ture 면 true가 된다.
 * 				6<=6 6<6 6==6
 * 			6. >= 크거나 같다
 * 			   ---  > ==
 * 				
 * 			사용처 : 조건문 / 반복분 
 * 					if(비교연산자|논리연산자|부정연산자)
 * 					----------------------------- true / false
 * 					while(비교연산자|논리연산자|부정연산자)
 * 					{
 * 					}
 * 
 * 			(조건) && (조건)    (조건)  ||  (조건)
 *			  |		   |		|		  |
 *			   --------			 ---------
 *				   |				 |
 *				 결과값				결과값
 *			&& => 범위나 기간 포함
 *			|| => 범위나 기간 외 
 *
 *
 *------------------------------------------------------
 *	경우의수
 *	--------
 *	--------------------------------------------------
 *		(조건)(조건)			&&			||
 *	--------------------------------------------------
 *		true true			true		true
 *	--------------------------------------------------
 *		true false			false		true
 *	--------------------------------------------------
 *		false true			false		true
 *	--------------------------------------------------
 *		false false			false		false
 *	--------------------------------------------------
 *		=> 앞에 있는 조건이 true => ||은 뒤에 있는 조건을 수행하지 않는다
 *		=> 앞에 있는 조건이 false ==> &&은 뒤에 있는 조건을 수행하지 않는다
 *
 *		=> 어디부터 ~ 어디까지 => &&
 *		=> 오류 처리 
 *		1. 프로그램은 반드시 시작과 동시에 오류처리
 *			예)
 *				문자열을 받아서 좌우 대칭여부 확인하는 프로그램
 *				ABBA => 0 , lenght-1
 *		2. 범위안에 설정 ...
 *	
 *		=> &&  > ||    /우선순위가 &&가 더 빠름
 *
 *		=> 윤년여부
 *		   = 4년마다
 *		   = 100년마다 제외
 * 		   = 400년마다 
 * 			  => 2000 => 2400 
 *	
 *
 *
 *		
 *
 *
 *
 *
 */



import java.util.Scanner;
// 알파벳 한개입력 => 대문자 / 소문자
/*
 * c
 * 대문자 조건
 *  => c >='A' c<='Z'
 * 소문자 조건
 * 	=> c >='a' c<='z'
 * 
 */

public class 비교연산자 {
	public static void main(String[] args) {
		
//		int num1=10;
//		int num2=10;
//		boolean result1=(num1==num2); //true
//		boolean result2=(num1!=num2); //false
//		boolean result3=(num1<=num2); //true
//		//num1<num2 or num1==num2
//		char c1='A';
//		char c2='B';
//		boolean result4=(c1<c2);
//		// *** char 데이터형은 모든 연산이 수행되면 정수로 변환
//		// 65 < 66 
//		float f=0.1f;
//		double d=0.1;
//		boolean result5=(f==d);
//		
//		boolean b1=true;
//		boolean b2=false;
//		boolean result6=(b1==b2);
//		boolean result7=(b1!=b2);
//		
//		String s1=new String("Hello");
//		String s2="Hello";
//		String s3="Hello";
//		boolean result8=(s1==s2); //false
//		boolean result9=(s1!=s2); //true
//		boolean result10=(s2==s3); //true
//		boolean result11=(s2!=s3); //false
//		// String은 문자열 자체를비교하는것이 아닌 변수가 가진 문자열의 '주소'를 가지기 때문
//		boolean result12=(s1.equals(s2));
//							 // -------- 실제 저장된 문자열만 비교
//		
//		System.out.println("result1:"+result1);
//		System.out.println("result2:"+result2);
//		System.out.println("result3:"+result3);
//		System.out.println("result4:"+result4);
//		System.out.println("result5:"+result5);
//		System.out.println("result6:"+result6);
//		System.out.println("result7:"+result7);
//		System.out.println("result8:"+result8);
//		System.out.println("result9:"+result9);
//		System.out.println("result10:"+result10);
//		System.out.println("result11:"+result11);
//		System.out.println("result12:"+result12);
//		
//		String ss1="Hello";
//		String ss2="hello";
//		
//		boolean result13=(ss1.equals(ss2));
//		// 대소문자 구분 => 비교
//		// 로그인 처리 => id찾기 / 비밀번호 찾기
//		// id 중복체크
//		boolean result14=(!ss1.equals(ss2));
//		boolean result15=(ss1.equalsIgnoreCase(ss2));
//		// true => 대소문자 구분하지 않고 비교
//		// 검색 => AWS
//		System.out.println("result13:"+result13);
//		System.out.println("result14:"+result14);
//		System.out.println("result15:"+result15);
//		
//		// 비교연산자 => 숫자 (정수,실수), 문자 , boolean
//		// 문자열은 자체 라이브러리를 사용한다
//		
//		/*
//		 * contains() => 단어 포함 => 검색
//		 * String => 클래스 (기능==메소드) => 표준화 
//		 * ---------------
//		 * startsWith() => 시작문자열 같은 경우
//		 * endsWith() => 파일 확장자 .jpg
//		 * ----------- 서제스트 suggest 
//		 * 
//		 */
		
//		Scanner scan=new Scanner(System.in);
//		System.out.print("알파벳 한개 입력:");
//		String str=scan.next();
//		char c=str.charAt(0);
//		System.out.println("c="+c);
//		if (c>='A' && c<='Z')
//				System.out.println("대문자입니다.");
//		else if(c>='a' && c<='z')
//				System.out.println("소문자입니다");
//		else
//			System.out.println("알파뱃이 아닙니다");
		
		//효율적인 연산
		// && => (조건)&&(조건) 
		//		   | false 
		
//		int x=10;
//		int y=9;
//		boolean result=(x>y) || (++y==x);
//		System.out.println(result);
//		System.out.println(x);
//		System.out.println(y);
		
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력");
		int year=scan.nextInt();
		
		String result=(year%4==0&&year%100!=0)||(year%400==0)?"윤년입니다":"윤년이 아닙니다";  // 조건이 true 이면 "윤년입니다" 저장, false 면 "윤년이 아닙니다" 저장 
		System.out.println(result);
		
		
		
	}
	
	
}
