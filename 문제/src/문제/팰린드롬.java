package 문제;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class 팰린드롬 {

	public static void main(String[] args) 
	throws Exception {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		char[] temp = new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			temp[i]=str.charAt(str.length()-i-1);
		}
		boolean bCheck = true;
		for(int i=0;i<str.length();i++)
		{	
			
			if(temp[i]!=str.charAt(i))
			{
				bCheck=false;
				break;
			}
		}
		if(bCheck==true)
			bw.write(1+"");
		else
			bw.write(0+"");
		bw.close();
		
	}

}
