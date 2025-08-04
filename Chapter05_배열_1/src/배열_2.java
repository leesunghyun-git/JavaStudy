// 10개의 임의의 정수를 10개 받아서 최대값 , 최소값
// 데이터가 많은 경우 => 반복문 => 배열
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		int max=0, max_num=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			System.out.print(arr[i]+" ");
			if(max<arr[i])
			{
				max=arr[i];
				max_num=i;
			}
			//최대값이 있는 위치의 인덱스를 구하시오
		}
		System.out.println();
		System.out.println(max);
		System.out.println(max_num);
		// 5번쨰와 6번쨰의 값을 출력 => 차이확인
		System.out.printf("%d - %d = %d\n",arr[4],arr[5],arr[4]-arr[5]);
	}
	
}
