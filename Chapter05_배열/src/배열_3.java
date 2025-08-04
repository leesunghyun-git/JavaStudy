import java.util.Scanner;
/*
 * 	변수 ===> 응용 연산자 ===> 응용 제어문 **
 * 			-----------------------
 * 				 |
 * 				응용 : 배열 / 메소드
 * 				-----------------
 * 				 |
 *			    응용 : 클래스
 * 
 * 
 * 
 * 
 */
public class 배열_3 {
	public static void main(String[] args)
	{	
		Scanner scan=new Scanner(System.in);
		final int ROWS=3;
		int[] kor=new int[ROWS];
		int[] eng=new int[ROWS];
		int[] math=new int[ROWS];
		int[] total=new int[ROWS];
		double[] avg=new double[ROWS];
		char[] score=new char[ROWS];
		
		// 점수 받기
		for(int i=0;i<ROWS;i++)
		{
			System.out.print((i+1)+"' 국어 입력:");
			kor[i]=scan.nextInt();
			System.out.print((i+1)+"' 수학 입력:");
			eng[i]=scan.nextInt();
			System.out.print((i+1)+"' 수학 입력:");
			math[i]=scan.nextInt();
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
			switch((int)avg[i]/10)
			{
			case 10,9 -> {
				score[i]='A';
			}
			case 8 -> {
				score[i]='B';
			}
			case 7 -> {
				score[i]='C';
			}
			case 6 -> {
				score[i]='D';
			}
			case 5 -> {
				score[i]='E';
			}
			default -> {
				score[i]='F';
			}
			}
			
		}
		for(int i=0;i<ROWS;i++)
		{
			System.out.println((i+1)+"번의 학점은:"+score[i]+"입니다.");
		}
		
	}
}
