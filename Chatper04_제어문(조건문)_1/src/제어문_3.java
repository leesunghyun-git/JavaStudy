// 문자 1개를 난수 발생 => 대문자 / 소문자
public class 제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int change=(int)(Math.random()*2);
		// 0.00~0.99 => 0.0~1.98..
		// => 정수변경 => 0,1
		char c=' ';
		if(change==0)
			c=(char)((Math.random()*26)+65); //대문자
			//0~25 => 65~80
		else
			c=(char)((Math.random()*26)+97); //소문자
		System.out.println("======== 결과 ==========");
		if(c>='A' && c<='Z')
			System.out.println(c+"는(은) 대문자입니다");
		else
			System.out.println(c+"는(은) 소문자입니다");
		
	}

}
