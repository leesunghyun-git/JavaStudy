// 정수를 입력받아서 2진법 출력
// => 10 => 0000 0000 0000 1010
import java.util.Scanner;
public class 메소드_2 {
	
	public  int input ()
	{
		System.out.println("양의 정수를 입력");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		return num;
	}
	public int length (int num)
	{
		int length=1;
		while(num/2!=0)
		{
			length++;
			num/=2;
		}
		return length;
	}
	public int[] bin (int num,int length)
	{
		int[] bin =new int[length];
		int index=bin.length-1;
		while (true)
		{
			bin[index]=num%2;
			num/=2;
			index--;
			if(num==0)
				break;
		}
		return bin;
	}
	public void output(int[] bin)
	{
		for(int i=0;i<bin.length;i++)
		{
			System.out.print(bin[i]);
			if((bin.length-i-1)%4==0)
			{
				System.out.print(" ");
			}
		}
	System.out.println();
	}
	public int reverse(int[] bin)
	{	
		int num=0;
		for(int i=0;i<bin.length;i++)
		{	
			int a=bin[i];
			for(int j=i+1;j<bin.length;j++)
			{
				a*=2;
			}
			num+=a;
		}
		return num;
	}
	public void process()
	{
		
		int num=input();
		int[] bin=bin(num,length(num));
		output(bin);
		System.out.println(reverse(bin));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		메소드_2 a=new 메소드_2();
		a.process();
		
		
	}

}
