package 문제;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class 숫자의합 {

	public static void main(String[] args) 
	throws Exception {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n=Integer.parseInt(br.readLine());
		String str=br.readLine();
		int sum=0;
		for(int i=0;i<str.length();i++)
			{
				sum+=str.charAt(i)-'0';
			}
		bw.write(String.valueOf(sum));
		bw.close();
	

		
	}

}
