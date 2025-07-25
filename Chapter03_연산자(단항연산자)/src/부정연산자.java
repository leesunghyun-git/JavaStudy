 /*
 *  name 검색
 *  
 *  SELECT * FROM member WHERE name '%홍%'
 *  	=> 오라클로 전송
 *  	=> 결과값을 가지고 온다
 *  
 *  findByNameLike(String name)
 *  aaa()
 *  
 *  ! =>부정
 *  -- 결과값 : boolean
 *  
 *  !true => false
 *  !false => true
 *  -- 사용처 : 조건문
 *  -- 게임 : 턴 
 *  -- 여러명 => %
 *  
 *  !(예약 가능한 날)
 *  ---------------
 *  
 */
public class 부정연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck=false;
		int i=1;
		while(true)
		{
		if(i>10)
				break;
		bCheck=!bCheck;
		if(bCheck==true)
			System.out.println("사용자 ");
		else
			System.out.println("컴퓨터 ");
		i++;
		}
	}

}
