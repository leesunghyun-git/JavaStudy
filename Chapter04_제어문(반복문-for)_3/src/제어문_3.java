// 10번 => 가위바위보 5승 1무 4패
import java.util.Scanner;
public class 제어문_3 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int win=0, draw=0, lose=0;
		for (int i=1;i<=10;i++)
		{
			System.out.println("가위 바위 보");
			System.out.print("가위 바위 보 입력 : ");
			String temp_user=scan.next();
			int user=0;
			if (temp_user.equals("가위")==true)
				user=1;
			else if(temp_user.equals("바위")==true)
				user=2;
			else if(temp_user.equals("보")==true)
				user=3;
			else
			{
				System.out.println("잘못된 입력입니다.");
				i--;
				continue;
			}
			
			int com=(int)(Math.random()*3)+1;
			// 가위=1 , 바위=2 , 보=3 
			switch (com)
			{
			case 1 -> {
				System.out.println("컴퓨터 : 가위");
			}
			case 2 -> {
				System.out.println("컴퓨터 : 바위");
			}
			case 3 -> {
				System.out.println("컴퓨터 : 보");
			}
			}
			if (user==com)
			{
				System.out.println("무승부!!!!");
				draw++;
			}
			else if(user-com==-2 || user-com==1)
			{
				System.out.println("User 승리!!!");
				win++;
			}
			else 
			{
				System.out.println("Computer 승리!!!");
				lose++;
			}
			{
				
			}
			
		}
		
		System.out.println("========= 결과값 =========");
		System.out.printf("%d승 %d무 %d패",win,draw,lose);

	}
}
