/*
 * 	인덱스 : 0번 부터 => 값 지정의 위치 구분
 * 	=> 반복문
 * 	   : 데이터값 초기화 , 값 변경시
 * 	   : 출력만 처리 =>for-each
 * 					--------- 웹 데이터를 브라우저에 출력
 * 	     map => js(for-each)
 * 
 * 		
 */
// => 초기화 
//  검색 => 갯수 => 배열 생성
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		int max=1;
		int min=100;
		for(int i=0;i<arr.length;i++)
		{
			// 갯수보다 인덱스가 1개 작다
			// 배열의 크기를 ㅂ초과하면 오류 발생
			// ArrayIndexOutOfBoundsException
			arr[i]=(int)(Math.random()*100)+1;
//			System.out.print(arr[i]+" ");
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
			
		}
		for(int i:arr)// 출력형식
		{
			// i는 인덱스번호가 아니고 => 실제 저장 값 읽기
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("max="+max);
		System.out.println("min="+min);
	}

}
