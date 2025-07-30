/*
 * 
 * 		★★★★★
 * 		★★★★★
 * 		★★★★★
 * 		★★★★★
 * 		★★★★★
 * 
 * 	#234
 *  1#34
 *  12#4
 *  123#
 *  
 *  
 *  ABCD
 *  EFGH
 *  IJKL
 *  MNOP
 */
public class 제어문_2 {

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
				{
					if(j==i)
					{
						System.out.print("#");
						
					}
					else
						System.out.print(j);
				}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(char c=(char)(4*(i-1)+65);c<=(4*(i-1)+68);c++)
				System.out.print(c);
			System.out.println();
		}
		/*
		 * 		ABCD
		 * 		ABCD
		 * 		ABCD
		 * 		ABCD
		 * 
		 */
		
		for(int i=1;i<=4;i++)
		{
			for (char c='A';c<='D';c++)
				System.out.print(c);
			System.out.println();
		}
		
	}
}

