package 문제;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class 나머지 {

	public static void main(String[] args) 
	throws Exception {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int count=0;
		int[] arr=new int[10];
		for(int i=0;i<10;i++)
		{
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			arr[i]=a%42;
		}
		for(int i=0;i<10;i++)
		{	
			boolean x=false;
			for(int j=i+1;j<10;j++)
			{
				if(arr[i]==arr[j])
				{
					x=true;
				}
			}
			if(x==false)
				count++;
		}
		bw.write(count+"");
		bw.close();

	}

}
