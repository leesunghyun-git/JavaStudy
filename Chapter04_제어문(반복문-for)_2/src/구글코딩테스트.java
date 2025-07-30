// 문자열을 입력을 받아서 => 좌우 대칭여부 확인
// ABBA
// 모든 문자열은 짝수
import java.util.Scanner;
public class 구글코딩테스트 {

		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			for(;;)
			{
				System.out.println("짝수개의 문자열을 입력:");
				String msg=scan.nextLine();
				boolean bCheck=true;
				if(msg.length()%2!=0)
				{
					System.out.println("잘못된 입력입니다. 짝수개의 문자열을 입력");
					continue;
				}
				else
				{
					for(int i=0;i<msg.length();i++)
					{
						char reverse=msg.charAt(msg.length()-1-i);
						if(msg.charAt(i)==reverse)
						{
							bCheck=true;
						}
						else
						{
							bCheck=false;
							break;
						}
						
					}
				}
				if (bCheck==true)
				{
					System.out.println("모든 문자열이 좌우대칭");
					break;
				}
				else
				{
					System.out.println("좌우 대칭이 아닙니다");
					continue;
				}
			}
				
		}
}
