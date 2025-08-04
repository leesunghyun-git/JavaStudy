package 문제;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class 공바꾸기 {
		public static void main(String[] agrs)
		throws IOException

		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st;
			st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=i+1;
			for(int i=0;i<m;i++)
			{	
				st=new StringTokenizer(br.readLine());
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				int temp_a=arr[a-1];
				arr[a-1]=arr[b-1];
				arr[b-1]=temp_a;
				
			}
			for(int i=0;i<n;i++)
			{
				bw.write(arr[i]+" ");
			}
			bw.close();
		}
}
