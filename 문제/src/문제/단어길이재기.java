package 문제;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class 단어길이재기 {

	public static void main(String[] args) 
	throws Exception {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++)
		{
			String str=br.readLine();
			bw.write(str.substring(0,1));
			bw.write(str.substring(str.length()-1,str.length()));
			bw.newLine();
		}
		bw.close();
		
	
	}

}
