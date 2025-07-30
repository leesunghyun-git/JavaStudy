//6. 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.




import java.util.Scanner;
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("두개의 정수 입력:");
		int num1=scan.nextInt(), num2=scan.nextInt();
		int start=0,end=0;
		if (num1>num2)
		{
			start=num2;
			end=num1;
		}
		else
		{
			start=num1;
			end=num2;
		}
	int anwser=1;
		for(int i=start;i<=end;i++)
		{
			anwser=anwser*i;
		}
	System.out.println("결과 : "+anwser);
		
	}

}
