//package 문제;
//import java.util.Scanner;
//public class 별찍기7 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		int n=scan.nextInt();
//		for(int i=1;i<=2*n-1;i++)
//		{
//			if(i<=n)
//			{
//			for(int j=n;j>=i;j--)
//				System.out.print(" ");
//			for(int j=1;j<=2*i-1;j++)
//				System.out.print("*");
//			System.out.println();
//			}
//			else
//			{
//			for(int j=0;j<=i-n;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=2*n-1;j>=2*(i-n)+1;j--)
//			{		
//				System.out.print("*");
//			}
//			System.out.println();
//			}
//		}
//
//	
//	}
//}

package 문제;
import java.util.Scanner;

public class 별찍기7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i= 1; i<= 2*n-1;i++)
        {
        	if (i <= n)
        	{
        		for (int j= 0; j<n-i;j++)
        			System.out.print(" ");
        		for (int j= 0; j<2*i-1;j++)
        			System.out.print("*");
        		System.out.println();
        	}
        	else
        	{
        		for (int j=0;j<i-n;j++)
        			System.out.print(" ");
        		for (int j=0;j<2*(2*n-i)-1;j++)
        			System.out.print("*");
        		System.out.println();
        	}
//        for (int i = 1; i <= 2 * n - 1; i++) {
//            int starCount;
//            int spaceCount;
//
//            if (i <= n) {
//                spaceCount = n - i;
//                starCount = 2 * i - 1;
//            } else {
//                spaceCount = i - n;
//                starCount = 2 * (2 * n - i) - 1;
//            }
//
//            for (int j = 0; j < spaceCount; j++)
//                System.out.print(" ");
//            for (int j = 0; j < starCount; j++)
//                System.out.print("*");
//            System.out.println();
        }
    }
}