// 10개의 임의의 정수 저장 ==> 총합 / 평균
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열선언
		int[] arr=new int[10];
		// 배열초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			System.out.print(arr[i]+" ");
		}
		// 배열의 총합 / 평균
		int sum=0;
		// for(받는 변수 : 배열명)
		for(int i:arr)
			sum+=i;
		double avg=sum/(double)arr.length;
		System.out.println();
		System.out.println("총합 :"+sum);
		System.out.println("평균 :"+avg);
	}

}
