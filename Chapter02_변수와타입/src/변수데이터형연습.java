import java.util.*; //라이브러리 읽기
public class 변수데이터형연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력값을 받아서 저장후 처리 => 저장공간 : 변수
		Scanner scan=new Scanner(System.in);
		// new => 메모리에 저장 / System.in 키보드 입력값
		System.out.print("국어 입력:");
		int kor=scan.nextInt();
		
		System.out.print("영어 입력:");
		int eng=scan.nextInt();
		
		System.out.print("수학 입력:");
		int math=scan.nextInt();
		
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+math);
		//총점 출력
		//평균 출력
		int total=kor+eng+math;
		double avg=total/3.0;
		System.out.println("총 점수:"+total);
		System.out.printf("평균:%.2f\n",avg);
		if (avg>=95) {
			System.out.println("학점: A+");
		} else if (avg>=90) {
			System.out.println("학점: A0");
		} else if (avg>=85) {
			System.out.println("학점: A-");
		} else if (avg>=80) {
			System.out.println("학점: B+");
		} else {
			System.out.println("학점: B");
		}
											
	
	}

}
