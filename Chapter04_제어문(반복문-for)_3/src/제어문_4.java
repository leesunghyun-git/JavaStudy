/*
 * 
 * 	2차 for
 *  ---------
 *  
 *  형식)
 *  		for()
 *  		{
 *  		}
 *  		for()
 *  		{
 *  		}
 *  		
 *  		for() ==> 줄수 ==> rows
 *  		{
 *  			for() ==> 화면 출력 => cols
 *  			{
 *  				실행문장
 *  			}
 *  		}
 * 
 * 			*
 * 			**
 * 			***
 * 			****
 * 			-----------------------
 * 			i	j
 * 			줄수 별수
 * 			1	4
 * 			2	3
 * 			3	2
 * 			4	1	=> i==j => j는 i만큼만 가면	
 * 	
 * 	(1번)	*
 * 			**
 * 			***
 * 			****
 * 			
 * 	(2번)	****
 * 			***
 * 			**
 * 			*
 * 
 * 
 * 
 * 
 * 			
 * 
 * 	(3번)		*
 * 			   **
 * 			  ***
 * 			 ****
 *------------------------------
 *						줄수 공백 별
 *						 1	 3  1
 *						 2   2  2
 *						 3   1  3
 *						 4   0  4
 * 		
 * 			 ****		6줄
 * 			  ***
 *    		   **
 *         		*
 *         -----------
 *         
 *         	*		
 *         ***			
 *        *****			
 *       *******		6줄		i+j=7 j=7-i
 *        *****
 *         ***
 *          *
 *          ----------
 *          		 줄 공백 별
 *          		 1  3  1  i+j=4	k=2i-1	j=4-i 
 *          		 2  2  3		k=2i-1
 *                   3  1  5		k=2i-1
 *                   4  0  7				k= 7-2(i-4)
 *                   5  1  5  i-j=4  			  2(i-4)
 *                   6  2  3  i-j=4q				15-2i
 *                   7  3  1  i-j=4					15-2i
 *       *****
 *        ***
 *         *			6줄
 *        ***
 *       *****
 *       
 *       *   *
 *       ** **
 *       *****			6줄
 *       ** **
 *       *   *
 *       
 *         
 *         
 */
public class 제어문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("======1번======");
		System.out.println();
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		System.out.println("======2번======");
		System.out.println();
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5-i;j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		System.out.println("======3번======");
		System.out.println();
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("======4번======");
		System.out.println();
		for(int i=1;i<=4;i++)
		{	
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=5-i;j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		System.out.println("======5번======");
		System.out.println();
		for(int i=1;i<=7;i++)
		{
			if(i<4)
			{
				for(int j=1;j<=4-i;j++)
					System.out.print(" ");
				for(int k=1;k<=2*i-1;k++)
					System.out.print("*");
			}
			else
			{
				for(int j=1;j<=i-4;j++)
					System.out.print(" ");
				for(int k=1;k<=15-2*i;k++)
					System.out.print("*");
			}

			System.out.println();
		}
		System.out.println();
		System.out.println("======6번======");
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			if(i<=3)
			{
				for(int j=1;j<=i-1;j++)
					System.out.print(" ");
				for(int j=1;j<=7-2*i;j++)
					System.out.print("*");

			}
			if(i>=4)
			{
				for(int j=1;j<=5-i;j++)
					System.out.print(" ");
				for(int j=1;j<=2*i-5;j++)
					System.out.print("*");
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println("======7번======");
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			if(i<=2)
			{
				for(int j=1;j<=i;j++)
				System.out.print("*");
				for(int j=1;j<=5-2*i;j++)
					System.out.print(" ");
				for(int j=1;j<=i;j++)
					System.out.print("*");
				
			}
			else if(i==3)
				for(int j=1;j<=5;j++)
					System.out.print("*");
			else
			{
				for(int j=1;j<=6-i;j++)
					System.out.print("*");
				for(int j=1;j<=2*(i-4)+1;j++)
					System.out.print(" ");
				for(int j=1;j<=6-i;j++)
					System.out.print("*");
			}
		
		System.out.println();	
		}
	}

}
