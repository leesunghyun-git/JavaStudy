package 문제;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class 단어공부 {

	public static void main(String[] args) 
	throws Exception {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine().toUpperCase();
		int[] b=new int[26];
		char[] c=new char[26];
		for(int i=0;i<26;i++)
			c[i]=(char)('A'+i);
		for(int i=0;i<26;i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(c[i]==str.charAt(j))
					b[i]++;
			}
		}
		int max=b[0], max_num=0;
		for(int i=0;i<b.length;i++)
		{
			if(max<b[i])
			{
				max=b[i];
				max_num=i;
			}
		}
		boolean bCheck=false;
		if(max_num<b.length-1)
		{
		for(int i=max_num+1;i<b.length;i++)
		{
			if(max==b[i])
			{
				bCheck=true;
				break;
			}
		}
			if(bCheck==true)
				bw.write("?");
			else
				bw.write(c[max_num]+"");
		}
		else
			bw.write(c[max_num]+"");
		bw.close();
		
		
		
			
	}

}
