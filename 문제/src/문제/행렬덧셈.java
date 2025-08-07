package 문제;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class 행렬덧셈 {

	public static void main(String[] args) 
	throws Exception {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
		int[][] arr1=new int[n][m];
		int[][] arr2=new int[n][m];
		for(int i=0;i<n;i++)
		{
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++)
			{
				arr1[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0;i<n;i++)
		{
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++)
			{
				arr2[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		int[][] sumarr=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				sumarr[i][j]=arr1[i][j]+arr2[i][j];
				bw.write(sumarr[i][j]+" ");
			}
			bw.newLine();
		}
		bw.close();
		
	}

}
