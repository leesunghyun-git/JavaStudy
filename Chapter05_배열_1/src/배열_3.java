// 100개의 난수 발생(0~9) => 빈도수 구하기
public class 배열_3 {
	
		public static void main(String[] args)
		{
			int[] bin=new int[10];
			for(int i=1;i<=100;i++)
			{
				int rand=(int)(Math.random()*10);
				bin[rand]++;
			}
			System.out.print("====== 결과값 ======");
			for(int i=0;i<bin.length;i++)
				System.out.printf("%d : %d\n",i,bin[i]);
		}
}
