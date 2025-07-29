
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==1)
				total+=i;
			else
				total-=i;
		}
		System.out.println("1-2+3-...-10까지의 합:"+total);
			
	}

}
