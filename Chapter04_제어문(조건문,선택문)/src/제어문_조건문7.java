/*
 * 	점수를 입력 => 0~100사이
 * 	= 60이상이면 합격
 * 	= 60미만이면 불합격
 */
import java.util.Scanner;
public class 제어문_조건문7 {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("점수를 입력(0~100):");
		int num=scan.nextInt();
		if (num>100||num<0) {
			System.out.print("잘못된 점수 입니다, 점수 재입력:");
			num=scan.nextInt();
		}
		if (num<=100&&num>=60)
			System.out.println("합격");
		if (num<60&&num>=0)
			System.out.println("불합격");
		
	}
		
}
