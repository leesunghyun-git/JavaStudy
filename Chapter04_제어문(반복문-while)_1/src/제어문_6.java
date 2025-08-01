import java.util.Scanner;

public class 제어문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("첫번째 정수 입력:");
			int num1=scan.nextInt();
			
			System.out.print("연산자 입력 (+,-,*,/): ");
			String strOp=scan.next();
			
			System.out.print("두번째 정수 입력:");
			int num2=scan.nextInt();
			
			switch(strOp)
			{
			case "+" ->
			{
				System.out.printf("%d %s %d = %d\n",num1,strOp,num2,num1+num2);
			}
			case "-" ->
			{
				System.out.printf("%d %s %d = %d\n",num1,strOp,num2,num1-num2);
			}
			case "*" ->
			{
				System.out.printf("%d %s %d = %d\n",num1,strOp,num2,num1*num2);
			}
			case "/" ->
			{	if(num2==0)
				{
					System.out.println("0으로 나눌 수 없습니다.");
				}
				else
				System.out.printf("%d %s %d = %d\n",num1,strOp,num2,num1/num2);
			}
			default ->{
				System.out.println("잘못된 연산자입니다.");
			}
			}
			System.out.print("종료할까요?(Y,y)");
			String s=scan.next();
			char c=s.charAt(0);
			if(c=='y' ||c=='Y')
			{
				System.out.println("프로그램 종료");
				break;
			}
			
		}
	}

}
