/*
 * 	이차 for문
 * 	-----------
 * 	
 * 	형식)	
 * 			 1    2| false => 종료   
 * 		for(초기값;조건식;증감식) 
 * 		{		   |			|
 * 				   | true       |
 * 				  3   4| false --
 * 							6
 * 			for(초기값;조건식;증감식)
 * 			{		  |          |
 * 					  | true     |
 * 				실행문장 -----------
 * 			}		
 * 		}
 * 		1차 for => 줄수
 * 		2차 for => 실제 내용 출력
 * 
 * 		구구단
 * 		....
 * 		
 * 				
 */
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			for(int c=0;c<=i;c++)
			System.out.print("*");
			System.out.println();
		}
		for(int i=0;i<10;i++)
		{
			for(int c=10-i;c>0;c--)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println("===== 구구단 =====");
		for(int i=1;i<10;i++)
		{
			for(int j=2;j<10;j++)
				System.out.printf("%d * %d = %d\n",i,j,i*j);
		}
		
	}

}
