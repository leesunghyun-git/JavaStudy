/*
 *  	산술연산자
 *  		=> 자동형변환
 *  			1) 큰 데이터형으로 변경후 연산
 *  				10+10.5
 *  				--
 *  				10.0
 *  				----------- 20.5
 *  				int + char
 *  					  -----
 *  					   int변환
 *  				----------- int
 *  				double + char
 *  						----
 *  						double변환
 *  				------------ double
 *				2) int이하 데이터형 (byte,char,short)
 *					연산시에 결과값 => int
 *					char + char = int
 *  				short + byte = int
 *  				byte + byte = int
 *  	 		3) +,- 보다 * , / , % 우선순위
 *  				3+5*2 => 13
 *  				  
 *  
 *  		
 *  					
 *  	  + : 덧셈 , 문자열결합
 *  				------ String
 *  			=> 산술규칙
 *  			=> 7+"7"+7 => "777"
 *  			=> 7+7+"7"+7+7 => "14777"
 *  			   ---
 *  				1
 *  				------
 *  				  2
 *  				   -----
 *  					 3
 *  					  ------
 *  						 4
 *  	  -	: 뺼셈 
 *        * : 곱하기 
 *        -------- 7+"7"*10 => 오류
 *        / : 나누기
 *        		1) 정수/정수=정수 5/2=2 10/3=3
 *        					  5/2.0=2.5 , 10/3.0 = 3.333333
 *        		2) 0으로 나누면 오류
 *        % : 나누고 나머지 => 배수, 여러명 턴
 *        	  5%2 = 1
 *  		  -5%2 = -1
 *  		  -5%-2 = -1
 *  		  5%-2 = 1
 *  	   		=> 결과값은 항상 왼쪽 부호와 동일
 *        -------------------------- 문자열 연산이되면 안된다
 *        
 *        연산처리
 *        ------- 자동형변환 / 복잡한 계산은 ()
 *        ------- 오버플로우 
 *        340  
 *        	  256 128 64 32 16 8 4 2 1(0)
 * 			   1   0   1 0   1 0 1 0 0
 * 				   --------------------
 * 					  64 +  16  + 4 = 84
 * 			
 */
import java.util.Scanner;
public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=369;
//		int a1=a/100;
//		int a2=(a%100)/10;
//		int a3=(a%10);
//		System.out.printf("%2d%2d%2d",a1,a2,a3);
//		Scanner scan=new Scanner(System.in);
//		System.out.print("첫번째 정수:");
//		int num1=scan.nextInt();
//		System.out.print("두번째 정수:");
//		int num2=scan.nextInt();
//		
//		System.out.println("======== 결과 =======");
//		System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
//		System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
//		System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
//		System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
//		System.out.printf("%d%%%d=%d\n",num1,num2,num1%num2);
		
		Scanner scan=new Scanner(System.in);
		System.out.print("단어 입력:");
		String s=scan.nextLine();
//		String s2=scan.next();
//		String s3=scan.next();
//		
		System.out.println("========== 결과 ======== ");
		System.out.println(s);

	}

}
