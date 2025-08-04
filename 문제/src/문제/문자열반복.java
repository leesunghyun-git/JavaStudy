package 문제;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class 문자열반복 {

	public static void main(String[] args) 
	throws Exception {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
		st=new StringTokenizer(br.readLine());
		int a=Integer.parseInt(st.nextToken());
		String str=st.nextToken();
		for(int j =0;j<str.length();j++)
		{
			for(int l=0;l<a;l++)
			{
				bw.write(str.charAt(j));
			}
		}
		bw.newLine();
		}
		bw.close();
	}

}
