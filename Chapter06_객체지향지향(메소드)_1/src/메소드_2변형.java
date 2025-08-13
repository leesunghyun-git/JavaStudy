import java.util.Scanner;
public class 메소드_2변형 {
	Scanner scan = new Scanner(System.in);
	private int total=1;
	private String[] weekdays = {"일","월","화","수","목","금","토"};
	private int[] lastDay= {
			31, 28, 31,
			30, 31, 30,
			31, 31, 30,
			31, 30, 31};
	private int week;
	
	public int input(String msg)
	{
		System.out.print(msg);
		int num=scan.nextInt();
		return num;
	}
	public void setTotal(int year, int month) {
		total+=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
		
		if ((year%4==0 && year%100!=100)||(year%400==0))
			lastDay[1]=29;
		for(int i=0;i<month-1;i++)
		{
			total+=lastDay[i];
		}
		week=total%7;
	}
	public void show(int year, int month, int day) {
		System.out.printf("\t\t%4d년 %2d월\n\n",year,month);
		for(String s:weekdays)
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
			

			if(week==0)
				System.err.printf("%2d\t",i);
			else
				System.out.printf("%2d\t",i);
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
			
		}
	}
	public void process() {
		int year=input("년도 입력:");
		int month=input("월 입력:");
		int day=input("일 입력:");
		setTotal(year,month);
		show(year,month,day);
		scan.close();
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		메소드_2변형 cal=new 메소드_2변형();
		cal.process();
		
	}

}
