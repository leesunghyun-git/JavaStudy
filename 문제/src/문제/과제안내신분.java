package 문제;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class 과제안내신분 {

	public static void main(String[] args) 
	throws Exception {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		boolean[] arr=new boolean[30];
		for(int i=0;i<28;i++)
		{
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			arr[a-1]=true;
		}
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]==false)
				bw.write((i+1)+"\n");
		}
		bw.close();
		
		


	}

}
