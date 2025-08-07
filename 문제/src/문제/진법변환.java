package 문제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class 진법변환 {

	public static void main(String[] args) 
	throws Exception {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st=new StringTokenizer(br.readLine());
		String a=st.nextToken();
		int[] arr=new int[a.length()];
		int b=Integer.parseInt(st.nextToken());
		for(int i=0;i<a.length();i++)
		{
			arr[i]=(a.charAt(i)-'A'+10);
		}

		
	}

}

