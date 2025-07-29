// 알파벳 출력 => ABCD~Z => 가 ~ 힣
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
//		for(int i=1;i<=10;i+=2)
//		{
//			System.out.print(i);
//			
//		}
		for(char c='가';c<='힣';c++)
		{
			System.out.print(c);
			count++;
		}
		System.out.println();
		System.out.println(count);
		
		
		// 알파벳 => 'A' , 'a' ...
		/*
		 * 			  1 ->   2      | false면 종료
		 * 		for(시작값 ; 어디까지(조건문) ; 증가식)<----
		 * 			{		 | true                 |
		 * 				반복 수행문 3 ------------------
		 * 			}
		 * 
		 * 		1 => 2 = 3 = 4 
		 * 			 2 = 3 = 4
		 * 			 ....
		 *           .....
		 *           2번이 false면 종료
		 *           	
		 *       int i=1 i<=5 i++
		 *       	System.out.println(i)
		 *       
		 *       i=1 => i<=5 System.out.println(i) i++
		 *       i=2 => i<=5 System.out.println(i) i++
		 *       i=3 => i<=5 System.out.println(i) i++
		 *       i=4 => i<=5 System.out.println(i) i++
		 *       i=5 => i<=5 System.out.println(i) i++
		 *       i=6 => i<=5 <-- false => for 종료
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 	반복문
		 * 		for : 반복 횟수가 지정된 경우
		 * 			  ------------
		 * 		while : 반복 횟수가 없는 경우
		 * 			    ----------
		 * 		======================================= 한번도 수행이 안되는 경우도 있다 (조건이 안맞는 경우) ==> 선조건
		 * 					
		 * 		do~while : 무조건 한번 이상 수행
		 * 			==> 후조건 
		 * 		
		 * 		do
		 * 		{
		 * 			반복문장
		 * 		}while(조건)
		 * 
		 * 		
		 * 		
		 */
	}
	
	
	
	
	
	
	
	
}
