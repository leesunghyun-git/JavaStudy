/*
 * 	=> UpDown 게임
 * 	=> 난수 => 1~100사이
 * 	=> 사용자 입력
 * 		=> 힌트 UP
 * 			  DowN
 * 		------------------
 * 
 * 
 */
import java.util.Scanner;
public class 제어문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		/*
		 * 	반복문 => 제어 => 반복제어문
		 * 	1. 반복문 종료
		 * 	   break
		 * 	2. 특정부분을 제어
		 * 	   continue
		 * 
		 * 	for(int i=1;i<=10;i++)
		 * 	{
		 * 		if(i==5) break;
		 * 		system.out.println(i); // 1 2 3 4 	
		 * 	}
		 * 	
		 * 	\for(int i=1;i<=10;i++)
		 * 	{
		 * 		if(i==5) continue;
		 * 		system.out.println(i); // 1 2 3 4 6 7 8 9 10	
		 * 	}
		 * 	
		 * 	
		 */
		
		int answer=(int)((Math.random()*100)+1); //1~100
//		System.out.println("======= for ======");
//		for (int i=1;i<=10;i++)
//		{
//			System.out.print(i+ " ");
//		}
//		System.out.println("\n====== break ======");
//		for (int i=1;i<=10;i++)
//		{
//			if(i==5) break;
//			System.out.print(i+ " ");
//		}
//		System.out.println("\n====== continue ======");
//		for (int i=1;i<=10;i++)
//		{
//			if(i==5) continue;
//			System.out.print(i+ " ");
//		}
		for (int i=1;i<=21;i++) //무조건 => 무한루프
		{
			if(i==21)
			{
				System.err.println("You lose");
				break;
			}
			System.out.println(i+"번째 시도");
			System.out.print("1~100 사이의 정수 입력:");
			int user=scan.nextInt(); 
			if(user< 1 || user>100)
			{
				System.err.println("1~100까지의 정수만 가능");
				// 처음으로 돌아간다
				continue;
				/*
				 * 	continue
				 *  for ======= > 증가식
				 *  while ===== > 조건식
				 *   
				 *   => continue는 반드시 반복문에서만 사용이 가능
				 *   => if, switch에서는 사용이 불가능
				 *   => break
				 */
			}

				if(user>answer)
				{
					System.out.println("Down");
					continue;
				}
				else if(user<answer)
				{
					System.out.println("UP");
					continue;
				}
				else
				{
					System.err.println("축하합니다.");
					System.out.println("정답 : "+answer);
					System.out.println(i+"번만에 맞추셨습니다.");
					break;
				}
			}
			

		}
		}
		

