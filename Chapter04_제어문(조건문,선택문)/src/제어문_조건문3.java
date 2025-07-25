// 사용자 정수 2 => 연산자 1
import java.util.Scanner;
public class 제어문_조건문3 {
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수를 입력:");
		int num1=scan.nextInt();
		System.out.print("두번째 정수를 입력:");
		int num2=scan.nextInt();
		System.out.println("연산자를 선택(+,-,*,/):");
		String temp=scan.next();
		//     ---- char 변환
		char op=temp.charAt(0);
		// 첫번째 문자 => char변환
		// 자바에서 사용하는 문자열은 	0번부터 시작한다
		
		System.out.println("========== 결과 ===========");
		
		if(op=='+')
			System.out.printf("%d %c %d = %d\n",num1,op,num2,num1+num2);
		if(op=='-')
			System.out.printf("%d %c %d = %d\n",num1,op,num2,num1-num2);
		if(op=='*')
			System.out.printf("%d %c %d = %d\n",num1,op,num2,num1*num2);
		if(op=='/')
			if(num2==0)
			{
				System.out.println("0으로 나눌 수 없습니다.");
				System.out.print("두번째 정수를 재입력:");
				num2=scan.nextInt();
			}
				System.out.printf("%d %c %d = %.2f\n",num1,op,num2,num1/(double)num2);
		
	}
}
