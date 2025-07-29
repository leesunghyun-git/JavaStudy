/*
 * 	for : 반복문 => 가장많이 사용되는 반복문
 * 		=> 향상된 for : for-each구문 (웹에서 주로 사용)
 * 		=> 배열 / 컬렉션
 * 
 * 
 * 	형식)
 * 		for(초기값;조건식;증감식)
 * 		{
 * 			반복 수행문장 ==> 같은 형식 출력이 있는 경우
 * 		}	
 * 
 * 		1. 초기값 : 시작점 => int i=1
 * 						  char c='A'
 * 			=> 배열 / 컬렉션 => 0
 * 		2. 조건식 : 끝점 : i<=10 i<=100
 * 		3. 증감식 : ++ , -- , += , -=
 * 
 * 		동작			  false면 종료
 * 					  |
 * 				①---->②<-------④
 * 		for(①초기값;②조건식;③증감식)
 * 		{			 	  ↑
 * 				    | true
 * 			반복수행문장 ④
 * 		}
 * 
 * 		반복문의 사용처
 * 		1. 모든 목록 (상품 , 맛집, 노래 ...)
 * 		2. 서버 구동 => 무한루프
 * 		3. 게임 => 총알
 * 		4. 무한 스크롤
 * 		5. 페이징
 * 		=> 제어 => if => break,continue
 */
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] names= {"홍길동","심청이","김두한","박문수","강감찬"};
//		for(int i=0;i<names.length;i++)
//				System.out.println(names[i]);
//		System.out.println("==========");
//		// 
//		for(String name:names)
//			System.out.println(name);
//		
	for(int i=1;i<=10;i++)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	for(int i=10;i>=1;i--)
		System.out.print(i+" ");
	}
	

}
