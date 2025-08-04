package 문제;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class 바구니뒤집기 {

	public static void main(String[] args) 
	throws Exception {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=i+1;
		}
		for(int i=0;i<m;i++)
		{
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int[] arr1=new int[b-a+1];
			for(int j=0;j<arr1.length;j++)
			{
				arr1[j]=arr[a+j-1];
			}
			for(int j=b-1;j>=a-1;j--)
			{
				arr[j]=arr1[b-1-j];
			}		
		}
		for(int c:arr)
			bw.write(c+" ");
		bw.close();
	}

}
