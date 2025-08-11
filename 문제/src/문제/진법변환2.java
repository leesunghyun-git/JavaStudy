package 문제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class 진법변환2 {

	public static void main(String[] args) 
	throws Exception {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st=new StringTokenizer(br.readLine());
		int a=Integer.parseInt(st.nextToken());
		int n=Integer.parseInt(st.nextToken());
		while(true)
		{
			int b=a%n;
			if(b>9)
			{
				bw.write(b+'A'-10);
			}
			else
				bw.write(b+"");
			a/=n;
			if(a==0)
				break;
		}
		bw.close();

		
	}

}

