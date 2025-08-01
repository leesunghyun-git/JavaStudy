// 종료 시점 
import java.util.Scanner;
public class 제어문_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("q를 입력하면 종료합니다:");
			String input=scan.next();
			if(input.equals("q"))
			{
				System.out.println("while 종료");
				break;
			}
			
					
			
		}
		String input="";
		do
		{
			System.out.println("q를 입력하면 종료");
			input=scan.next();
		}while(!input.equals("q"));
		System.out.println("do~while=> 종료");
	}

}
