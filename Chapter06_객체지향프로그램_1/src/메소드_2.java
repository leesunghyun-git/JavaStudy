/*
 * 
 * 
 * 
 * 
 * 
 * 	=> react / vue / next
 * 	=> Oracle / MySQL
 * 
 *  
 */
// 리턴형 받기 => 기본형 / 배열 / 클래스  (상세보기)
// 사칙연산
import java.util.Scanner;
public class 메소드_2 {
	static int a;
	static int b;
	static int input(String msg)
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.print(msg);
		return scan.nextInt();
	}
	static int plus(int a,int b)
	{
		return a+b;
	}
	static int minus(int a,int b)
	{
		return a-b;
	}
	static int mul(int a,int b)
	{
		return a*b;
	}
	static String div(int a,int b)
	{
		// 자체 출력 void 
		if(b==0) return "0으로 나눌 수 없습니다";
		else return String.valueOf(a/(double)b);
	}
	static void process()
	{
		a=input("첫번째 정수 입력:");
		b=input("두번째 정수 입력:");
		Scanner scan=new Scanner(System.in);
		System.out.print("연산자 입력(+,-,*,/)");
		switch(scan.next())
		{
		case "+" -> {
			int c=plus(a,b);
			System.out.printf("%d + %d = %d\n",a,b,c);
		}
		case "-" -> {
			int c=minus(a,b);
			System.out.printf("%d - %d = %d\n",a,b,c);
		}
		case "*" -> {
			int c=mul(a,b);
			System.out.printf("%d * %d = %d\n",a,b,c);
		}
		case "/" -> {
			System.out.println(div(a,b));;
		}
		}
	}
	
	public static void main(String[] args) {
		process();
	}

}
