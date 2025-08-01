package 문제;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Main {
		public static void main(String[] agrs)
		throws IOException

		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st;
			int t=Integer.parseInt(br.readLine());
			int[] arr=new int[t];
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(br.readLine());
			for(int i=0;i<t;i++)
			{
				arr[i]=Integer.parseInt(st.nextToken());
			}
			int count=0;
			for(int i=0;i<t;i++)
			{
				if(arr[i]==a)
					count++;
			}
			bw.write(Integer.toString(count));
			bw.close();
		}
}
