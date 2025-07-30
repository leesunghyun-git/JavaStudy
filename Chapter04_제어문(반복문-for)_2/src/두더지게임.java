import java.util.Scanner;
public class 두더지게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int score=0;
		
		final int ROUNDS=10;
		
		System.out.println("😎😎😎😎😎 두더지 게임을 시작합니다 😎😎😎😎😎");
		System.out.println("1~9 사이의 정수를 입력해서 두더지 잡기");
		System.out.println("게임은 "+ROUNDS+"라운드입니다");
		
		for(int i=1;i<=ROUNDS;i++)
		{
			int mole=(int)(Math.random()*9)+1;
			System.out.print("ROUND "+i+" : 두더지가 등장하였습니다.");
			System.out.print("어디에 있는지 찾아보세요(1~9):");
			int user=scan.nextInt();
			if(user<1 || user>9)
			{
				System.out.println("잘못된 입력입니다. 다시 입력하시오");
				continue;
			}
			if (mole==user)
			{
				score+=10;
				System.out.println("두더지를 잡았습니다!!👍");
			}
			else 
			{
				System.out.println("저런 놓치셨네요");
				System.out.println("두더지는 "+mole+"번에 있었습니다.");
			}
			if (i!=ROUNDS)
				System.out.println("Next Round");
		}
		System.out.println("게임 종료 총 점수는 "+score+"점 입니다!!");
	}

}
