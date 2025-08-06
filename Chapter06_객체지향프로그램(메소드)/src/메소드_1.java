/*
 * 
 * 	국어 영어 수학 점수를 입력을 받아서
 * 	총점 / 평균 / 학점 출력
 */

import java.util.Scanner;

public class 메소드_1 {
	int input (String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(msg);
		int num=scan.nextInt();
		return num;
	}
	int total (int score1,int score2,int score3)
	{
		return score1+score2+score3;
	}
	double avg (int total)
	{
		return total/3.0;
	}
	char score (double avg)
	{	
		char score;
		switch((int)(avg/10))
		{
		case 10,9 -> {
			score='A';
		}
		case 8 -> {
			score='B';
		}
		case 7 -> {
			score='C';
		}
		case 6 -> {
			score='D';
		}
		default -> {
			score='F';
		}
		}
		return score;
	
	}
	void process()
	{	
		int kor=input("국어 점수 입력:");
		int eng=input("영학 점수 입력:");
		int math=input("수어 점수 입력:");
		int total=total(kor,eng,math);
		double avg=avg(total);
		char score=score(avg);
		System.out.println("============ 결과값 ==========");
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.println("학점:"+score);
	}

	public static void main(String[] args) {
		메소드_1 a = new 메소드_1();
		a.process();
	}

}
