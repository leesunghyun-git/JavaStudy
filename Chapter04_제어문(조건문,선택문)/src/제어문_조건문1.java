 // => 컴퓨터와 가위 바위 보
/*
 * 		경우의수
 * 		컴퓨터 (가위 0)
 * 			= 사용자 (가위)
 * 			= 사용자 (바위)
 * 			= 사용자 (보)
 * 		컴퓨터 (바위 1)
 * 			= 사용자 (가위)
 * 			= 사용자 (바위)
 * 			= 사용자 (보)
 * 		컴퓨터 (보 2)
 * 			= 사용자 (가위)
 * 			= 사용자 (바위)
 * 			= 사용자 (보)
 * 
 * 
 */
import java.util.Scanner;
public class 제어문_조건문1 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0),바위(1),보(2):");
		int user=scan.nextInt();
		if(user>2)
		{
			System.out.print("다시 입력하십시오:");
			user=scan.nextInt();
		}
		int com=(int)(Math.random()*3);
		if(com==0)
				System.out.println("컴퓨터:가위");
		if(com==1)
			System.out.println("컴퓨터:바위");
		if(com==2)
			System.out.println("컴퓨터:보");
		if(user==0)
			System.out.println("사용자:가위");
		if(user==1)
			System.out.println("사용자:바위");
		if(user==2)
			System.out.println("사용자:보");
		
		// 결과값  -1,2 : 1,=2 : 0
		System.out.println("======== 결과 ========= ");
		int result=com-user;
			if(result==-1 || result==2)
					System.out.println("User Win!!");
			if(result==1 || result==-2)
				System.out.println("User Lose");
			if(result==0)
				System.out.println("Draw");
//		if(com==0) //가위
//		{
//			if(user==0)	//0
//				System.out.println("비겼다");
//			if(user==1) //-1
//				System.out.println("User Win");
//			if(user==2)	// -2
//				System.out.println("User lose");
//		}
//		if(com==1) //바위
//		{
//			if(user==1) //0
//				System.out.println("비겼다");
//			if(user==2) //-1
//				System.out.println("User Win");
//			if(user==0) //1
//				System.out.println("User lose");
//		}
//		if(com==2) //보
//		{
//			if(user==2) // 0
//				System.out.println("비겼다");
//			if(user==0) // 2
//				System.out.println("User Win");
//			if(user==1) // 1
//				System.out.println("User lose");
//		}
			


		
		
		
	}
}
