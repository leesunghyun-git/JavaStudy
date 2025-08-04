/*
 * 	1. 데이터 저장
 * 	   = 변수 : 한개만 저장이 가능
 * 	   = 배열 : 같은 종류의 데이터를 여러개 저장이 가능
 * 	   ***= 클래스 : 관련된 다른 데이터형을 모아서 저장
 * 		 ------ 영화 정보 / 맛집 정보 ... (상세보기)
 * 	
 * 
 * 
 */
import java.util.Scanner;
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10개의 정수를 저장
		// 배열 => 같은 종류의 데이터가 3개 이상 있으면



		Scanner	scan=new Scanner(System.in);
		int[] kor=new int[3];
		int[] rank=new int[3];
		for(int i=0;i<kor.length;i++)
		{
			System.out.print((i+1)+"' 국어 점수 입력:");
			kor[i]=scan.nextInt();
		}
		for(int i=0;i<kor.length;i++)
		{
			rank[i]=1;
			for(int j=0;j<kor.length;j++)
			{
				if(kor[i]<kor[j])
					rank[i]++;
			}
		}
		
		System.out.println("====== 결과값 ======");
		for(int i=0;i<kor.length;i++) {
			System.out.printf("%-5d \n",kor[i]);
			System.out.printf("%d의 등수는 %d\n",i+1,rank[i]);	
		}
	}

}
