/*
 * 	(type)
 * 
 *  (char) 65 => 'A'
 *  (int) 10.5 => 10
 *  (double)10 => 10.0
 *  
 *  큰 데이터형을 작은 데이터형으로 변경
 *  ---------- --------- DownCasting
 *  
 *  => 연산자
 *  	(int)(10.5+10.5)
 *  		 ------------- 최우선 순위
 * 					| => 21
 * 		(int)10.5+10.5 = 20.5
 * 	   ----------
 * 			  10+10.5 = 20.5
 * 
 * 		(int)10.5+(int)10.5 => 20
 * 
 * 	=> 형변환 : 객체 지향에서 많이 나온다 (클래스)
 * 		
 * 
 */

// 초기값 => 임의의 지정 , 입력값 , 난수
public class 형변환연산자 {
	
	public static void main(String[] args) {
		
		System.out.println((int)(10.5+10.5));
		char rand=(char)((Math.random()*26)+65);
		System.out.println(rand);
			
		
	}
}
