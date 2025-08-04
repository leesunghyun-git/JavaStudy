// 문자저장
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[15];
		int counta=0;
		int countb=0;
		int con1=0;
		int con2=0;
		for(int i=0;i<alpha.length;i++)
		{
			int a=(int)(Math.random()*2);
			if(a==0)
			{
				alpha[i]=(char)((Math.random()*26)+65);
				counta++;
			}
			else
			{
				alpha[i]=(char)((Math.random()*26)+97);
				countb++;
			}
			System.out.print(alpha[i]+" ");
			if(alpha[i]>='A' && alpha[i]<='Z')
				con1++;
			else
				con2++;
		}
		System.out.println();
		System.out.println("대문자의 갯수:"+counta);
		System.out.println("소문자의 갯수:"+countb);
		System.out.println("다른방법 대문자:"+con1);
		System.out.println("다른방법 소문자:"+con2);
		
	}

}
