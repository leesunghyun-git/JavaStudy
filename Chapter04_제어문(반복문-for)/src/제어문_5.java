// 로또 번호 6개 출력
public class 제어문_5 {

	public static void main(String[] args) 
 {
		// TODO Auto-generated method stub
		System.out.println("===== 금주의 로또번호=====");
		for (int i=0;i<=5;i++)
		{
			System.err.print((int)(Math.random()*45)+1+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
