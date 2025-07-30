//11. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램 작성

import java.util.Scanner;
public class 문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int result=0;
		for(int i=1;i<=10;i++)
		{
		System.out.println("정수를 입력하시오");
		int num=scan.nextInt();
		if(num%2==0)
			result++;
		}
		System.out.println("입력하신 정수 중 짝수의 갯수는 : "+result);
	}

}
