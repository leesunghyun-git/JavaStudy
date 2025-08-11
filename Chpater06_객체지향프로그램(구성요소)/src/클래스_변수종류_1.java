/*
 * 
 * 	Card
 * 		= 숫자
 * 		= 종류
 * 		--------------
 * 		= width
 * 		= height
 * 		-------------- static
 * 
 * 	파일 1개
 * 	-------
 * 	class를 여러개 제작이 가능
 * 	
 * 	=> 저장명
 * 	class ClassName
 * 	public class ClassName => public이 있는 클래스
 * 	
 * 	=> public class
 * 	   ------ 한번만 사용이 가능	
 * 	=> main은 한번만 사용이 가능
 */
class Cardgame
{
	int number;
	String type;
	static int width,height;
	private int[] setCard()
	{
		int[] cardfull=new int[54];
		for(int i=0;i<cardfull.length;i++)
		{
				
		}
		return cardfull;
	}
	
}
public class 클래스_변수종류_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cardgame card1 = new Cardgame();
		card1.number=2;
		card1.type="♠";
		Cardgame card2 = new Cardgame();
		card2.number=3;
		card2.type="♥";
		System.out.println("카드번호:"+card1.number);
		System.out.println("카드이미지:"+card1.type);

		System.out.println("카드번호:"+card2.number);
		System.out.println("카드이미지:"+card2.type);
		
		Cardgame.width=350;
		Cardgame.height=550;
		
		System.out.println("Witdh:"+card1.width);
		System.out.println("Height:"+card1.height);
		
		System.out.println("Witdh:"+card2.width);
		System.out.println("Height:"+card2.height);
		/*
		 * 	static => 메모리 공간이 동일 => 공유 메모리
		 * 		=> 클래스명.변수명
		 * 	instance => 객체 생성시마다 메모리 공간이 달라진다
		 * 				-------- new
		 * 		=> 객체
		 */
		
	}

}
