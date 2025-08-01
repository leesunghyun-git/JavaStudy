// => 1~100 => 3,5,7 => 가장 많은 배수 , 가장 작은 배수
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a3=0,a5=0,a7=0;
		int i=1;
		while(i<=100)
		{
			if (i%3==0)
				a3++;
			if (i%5==0)
				a5++;
			if (i%7==0)
				a7++;
			i++;
			
		}
		int max=a3 , min=a3;
		
		if (a5>max)
			max=a5;
		if (a7>max)
			max=a7;
		if (a5<min)
			min=a5;
		if (a7<min)
			min=a7;
		
		if (max==a3)
			System.out.println("가장 많은 배수는 3의 배수 " + max + "개");
		if (max==a5)
			System.out.println("가장 많은 배수는 5의 배수 " + max + "개");
		if (max==a7)
			System.out.println("가장 많은 배수는 7의 배수 " + max + "개");
		if (min==a3)
			System.out.println("가장 적은 배수는 3의 배수 " + min + "개");
		if (min==a5)
			System.out.println("가장 적은 배수는 5의 배수 " + min + "개");
		if (min==a7)
			System.out.println("가장 적은 배수는 7의 배수 " + min + "개");
		
		
	}

}
