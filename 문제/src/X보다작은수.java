import java.io.*;
import java.util.StringTokenizer;
public class X보다작은수 {

	public static void main(String[] args) 
	throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int t=Integer.parseInt(br.readLine());
		int[] arr=new int[t];
		String b=br.readLine();
		st=new StringTokenizer(b);

		for(int i=0;i<t;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int max=arr[0] ,min=arr[0];
		for(int i=0;i<t;i++)
		{
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		bw.write(min+" "+max);
		bw.close();
		
	}

}
