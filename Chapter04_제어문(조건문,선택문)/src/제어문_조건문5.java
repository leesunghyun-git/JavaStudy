/*
 * 	국어	영어	수학	점수	입력
 * 	----------
 * 	평균 출력, 총점 출력, 학점 출력
 * 
 * 	학점기준
 * 	100~
 * 
 */
import java.util.Scanner;
public class 제어문_조건문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 점수 입력:");
		int kor=scan.nextInt();
		System.out.print("영어 점수 입력:");
		int eng=scan.nextInt();
		System.out.print("수학 점수 입력:");
		int math=scan.nextInt();
		
		int total=kor+eng+math;
		double avg=total/3.0;
		
		System.out.printf("평균 : %.2f\n",avg);
		System.out.println("총점 : "+total);
		
		if (avg>=90)
			System.out.println("학점 : A");
		if (avg>=80&&avg<90)
			System.out.println("학점 : B");
		if (avg>=70&&avg<80)
			System.out.println("학점 : C");
		if (avg>=60&&avg<70)
			System.out.println("학점 : D");
		if (avg<60)	
			System.out.println("학점 : F");
		
	}

}
