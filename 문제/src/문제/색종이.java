package 문제;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class 색종이 {

	public static void main(String[] args) 
	throws Exception {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		boolean[][] white=new boolean[100][100];
		int n=Integer.parseInt(br.readLine());
		int count=0;
		for(int i=0;i<n;i++)
		{
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			for(int j=a;j<a+10;j++)
			{
				for(int l=b;l<b+10;l++)
				{
					white[j][l]=true;
				}
			}
		}
		for(int i=0;i<100;i++)
		{
			for(int j=0;j<100;j++)
			{
				if(white[i][j]==true)
					count++;
			}
		}
		bw.write(String.valueOf(count));
		bw.close();
	

		
	}

}
