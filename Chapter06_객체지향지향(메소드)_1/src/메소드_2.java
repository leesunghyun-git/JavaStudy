// 달력 => 메소드 => 전역변수 => 요일 (1일자)
import java.util.Scanner;
public class 메소드_2 {
/*	
 * 	1. 입력 받기
 * 	2. 1년 1월 1일 ~ 입력달의 1일 => 총 날수
 * 	   ================================
 * 	3. 총날수 % 7 => 요일
 *  4. 요일 => 해당 마지막날까지 출력
 * 
 * 	=> 메소드 : 기능 분리 / 다음 재사용
 * 		: 윤년 여부
 * 		==================
 * 		1. 반복구간 => 메소드 : 공통모듈
 * 		2. 기능별 분리
 * 		3. 순차적으로 메소드 호출
 * 		---------------------
 *
 */
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		System.out.print("월 입력:");
		int month=scan.nextInt();
		System.out.print("일 입력:");
		int day=scan.nextInt();
		
		int total=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;	
		int[] lastDay= {
				31, 28, 31,
				30, 31, 30,
				31, 31, 30,
				31, 30, 31};
		if ((year%4==0 && year%100!=100)||(year%400==0))
			lastDay[1]=29;
		for(int i=0;i<month-1;i++)
		{
			total+=lastDay[i];
		}
		
		// +1 => 각달의 1일자 확인
		total++;
		
		int week=total%7;
		String[] strWeek= {
		 "일", "월","화","수","목","금","토"
		};
		System.out.printf("\t\t%4d년 %2d월\n\n",year,month);
		for(String s:strWeek)
		{
			System.out.printf(s+"\t");
		}
		System.out.println();
		for(int i=1;i<=lastDay[month-1];i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				System.out.print("\t");
			}
			if(i==day)
			System.err.printf("%2d\t",i);
			else System.out.printf("%2d\t",i);
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
			
		}
		
	}

}
