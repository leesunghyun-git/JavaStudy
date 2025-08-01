/*
 * 	int =1 ;
 * 	while (i<=5)
 * {
 * 		실행문장
 * 		i++;
 * }
 * 
 * 					| false 종료
 * 	i=1 => i<=5 =======> 실행문장 => i++
 * 					| true 실행문장
 * 	i=2 => i<=5 => 실행문장 => i++
 *  i=3 => i<=5 => 실행문장 => i++
 *  i=4 => i<=5 => 실행문장 => i++
 *  i=5 => i<=5 => 실행문장 => i++
 *  i=6 => i<=6 => false 종료
 *  
 *  int i=1;
 *  do
 *  {
 *  	실행문장
 *  	i++
 *  }while(i<=5);
 *  
 *  i=1 실행문장 => i++ => i=2 i<=5
 *  i=2 실행문장 => i++ => i=3 i<=5
 *  i=3 실행문장 => i++ => i=4 i<=5
 *  i=4 실행문장 => i++ => i=5 i<=5
 *  i=5 실행문장 => i++ => i=6 i<=5
 *  					 --------- 종료
 *  
 *  
 */
public class 제어문_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i=1;i<=100;i++)
		{
			sum+=i;
		}
		System.out.println("for=>sum="+sum);
		int i=1;
		sum=0;
		while(i<=100)
		{
			sum+=i;
			i++;
		}
		System.out.println("while=>sum="+sum);
		i=1;
		sum=0;
		do
		{
			sum+=i;
			i++;
		} while(i<=100);
		System.out.println("do~while=>sum="+sum);

			
	}

}
