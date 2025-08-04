package 문제;
import java.util.Scanner;
public class 별찍기7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<2*n-1;i++)
		{
			if(i<=n)
			{
			for(int j=n;j>=i;j--)
				System.out.print(" ");
			for(int j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.println();
			}
			else
			{
			for(int j=n;j<=i;j++)
				System.out.print(" ");
			for(int j=1;j<=2*n-i;j++)
				System.out.print("*");
			System.out.println();
			}
		}
	}

}
