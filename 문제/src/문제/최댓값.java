package 문제;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class 최댓값 {

	public static void main(String[] args) 
	throws Exception {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[][] arr=new int[9][9];
		int max=-1;
		int[] postion = new int[2];
		
		for(int i=0;i<9;i++)
		{
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<9;j++)
			{
				arr[i][j]=Integer.parseInt(st.nextToken());
				if(max<arr[i][j])
				{
					max=arr[i][j];
					postion[0]=i+1;
					postion[1]=j+1;
				}
			}
		}
		bw.write(max+"\n");
		bw.write(postion[0]+" "+postion[1]);
		bw.close();
		
	}

}
