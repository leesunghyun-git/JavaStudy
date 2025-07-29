/*
 * 		어디서부터 어디까지 반목횟수(증가/감소)
 * 			 1 	  2		4
 * 		for(초기값;조건식;증감식)
 * 		{		
 * 			반복 수행 문장	3
 * 		}
 * 		1-2-3-4
 * 		  2-3-4
 * 		  2-3-4
 * 		  .......> 2의 조건식 false면 종료
 * 		
 * 		=> 반복 횟수가 있다
 * 		=> Front-End : for => Back-End : while
 * 		---------------------------------------------
 * 							  | 이차 for문
 * 							   --------------- 알고리즘
 * 								구구단 / 페이징
 * 										 | 1차 for
 * 								 | 2차 for
 * 		-----------------------------------------------
 * 		
 * 		=> 1~100 => 합 / 짝수합 / 홀수합
 */
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,even=0,odd=0,sum3=0,sum5=0,sum7=0;
		for (int i=1;i<=100;i++)
		{
			sum+=i;
			if(i%2==0)
			{
				even+=i;
			}
			else
				odd+=i;
			if(i%3==0)
				sum3+=i;
			if(i%5==0)
				sum5+=i;
			if(i%7==0)
				sum7+=i;
			
		} // i는 메모리에서 사라진다 => 지역변수
		System.out.println("1~100까지 총합 :"+sum);
		System.out.println("짝수합 :"+even);
		System.out.println("홀수합 :"+odd);
		System.out.println("3의 배수합 :"+sum3);
		System.out.println("5의 배수합 :"+sum5);
		System.out.println("7의 배수합 :"+sum7);
		
	}
	
	// 3의 배수합, 5의 배수, 7의 배수

}
