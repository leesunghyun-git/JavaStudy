// 조건문
/*
 * 	선택 조건문 : true / false 나눠서 작업
 * 	변수 / 연산자 / 제어문 / 메소드 
 * 	------------------------------ 웹에서 사용
 * 								   -- 120000
 * 
 * 	정수를 입력을 받아서
 * 	11 22 33 ... => 같은 수 / 다른 수입니다.
 * 
 */
import java.util.Scanner;
public class 제어문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("두자리 정수를 입력 :");
		int num=scan.nextInt();
		
		// 오류처리
		if (num>=10 && num<=99)
		{
				//정상적으로 입력이 된 경우 => 중첩 조건문
				if(num%11==0)
					System.out.println("같은 수 입니다");
				else
					System.out.println("다른 수 입니다");
		}
		else
		System.out.println("잘못된 입력입니다!!");
	}

}
