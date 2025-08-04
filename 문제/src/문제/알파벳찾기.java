package 문제;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class 알파벳찾기 {

	public static void main(String[] args) 
	throws Exception {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str=br.readLine();
		
		for(char c='a';c<='z';c++)
		{
			int b=-1;
			for(int i=0;i<str.length();i++)
			{	
				;
				if (str.charAt(i)==c)
				{
					b=str.indexOf(c);
				}
				
			}
			
			bw.write(b+" ");
		}
		bw.close();
	}
		
}
