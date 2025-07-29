import java.util.Scanner;
// import를 생략이 가능 => java.lang.* => 자동 인식
public class 문제6 /*extend Object => 생략 */ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("양의 정수 입력:");
		int num=scan.nextInt();
		int total=0;
		for(;;)
		{
			if (num<0){
			System.err.println("장난치지말고 다시 입력ㄱㄱ:");
			num=scan.nextInt();
			}
			else
				break;
		}
	
		for (int i=1;i<=num;i++)
			total+=i;
		System.out.println("1~"+num+"까지의 합:"+total);
	}

}
