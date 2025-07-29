/*
 * 	5개의 알파벳 입력
 * 	-------
 * 	A -> a
 *  b -> B
 * 
 *
 */
import java.util.Scanner;
public class 제어문_3 {

	public static void main(String[] args) 
	throws Exception {
		// TODO Auto-generated method stub
		// 대소문자의 차이 32 => 65 97
		Scanner scan=new Scanner(System.in);
//		for(int i=0;i<=4;i++)
//		{
//			System.out.print("알파벳을 한개 입력:");
//			String temp=scan.next();
//			char c=temp.charAt(0);
//			
//			if(c>='A' && c<='Z')
//				System.out.println((char)(c+32));
//			if(c>='a' && c<='z')
//				System.out.println((char)(c-32));
//			if(!((c>='A' && c<='Z') || (c>='a' && c<='z')))
//			{
//				System.err.println("잘못된 입력, 알파벳을 입력해주세요");
//				continue;
//			}
		// 알파벳 여러개를 받아서 
		// 모든 문자를 대문자로 변경
		
		System.out.println("알파벳을 입력 : ");
//		String c=scan.nextLine();
//		System.out.println(c.toUpperCase());
//		// toUpperCase() => toLowerCase()
//		for(int i=0;i<c.length();i++)
//		{
//			char s=c.charAt(i);
//				if(s>='a' && s<='z')
//					System.out.print((char)(s-32));
//				else
//					System.out.print(s);
//					
		String c=scan.nextLine();
		int count1=0, count2=0;
		for(int i=0;i<c.length();i++)
		{
			char s=c.charAt(i);
				if(s=='A')
					count1++;
				if(s=='a')
					count2++;			
		}
		System.out.println("A의 총갯수 : "+count1);
		System.out.println("a의 총갯수 : "+count2);
		System.out.println("A와 a의 총갯수 : "+(count1+count2));
		}
}
	// 문자열을 입력을 받아서 'A' | 'a' 의 갯수 확인

