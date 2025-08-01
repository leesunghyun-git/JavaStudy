import java.util.Scanner;
public class 제어문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("등급 입력(3~7):");
		int level=scan.nextInt();
		int bomb=(int)(Math.random()*10)+1;
		
		int success=0;
		
		System.out.print("💣 폭탄피하기 게임 (1~10) 사이의 정수 입력 💣 \n");
		
		while(success<level)
		{
				System.out.print("정수 입력:");
				int input=scan.nextInt();
				
				if(input<1 || input>10)
				{
					System.err.println("🚫 사용할 수 없는 숫자입니다");
					continue;
				}
				
				if(input==bomb)
				{
					System.out.println("☠️ 게임 오버");
					break; // while종료
				}
				else
				{
					System.out.println("♥ You survive");
					success++;
				}
				if(success==level)
				{
					System.out.println(" You win !!");
					break;
				}
		}
		
		
	}

}
