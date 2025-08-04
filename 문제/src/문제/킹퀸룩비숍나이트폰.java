package 문제;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class 킹퀸룩비숍나이트폰  {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st=new StringTokenizer(br.readLine());
		int[] a= {
				1,1,
				2,2,2,
				8 };
		
		for(int i=0;i<a.length;i++)
		{
			a[i]-=Integer.parseInt(st.nextToken());
			bw.write(a[i]+" ");
		}
		bw.close();
		
	}

}
