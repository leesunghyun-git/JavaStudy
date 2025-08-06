package 문제;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class 크로아티아 {

	public static void main(String[] args) 
	throws Exception {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int num=0;
		for(int i=0;i<str.length();i++)
		{
			num++;
			if(str.charAt(i)=='-')
			{
				num--;
			}
			if(str.charAt(i)=='=')
			{
				num--;
				if(i>=2) {
				if(str.charAt(i-1)=='z'&&str.charAt(i-2)=='d')
						num--;
				}
			}
			if(i>=1) {
			if(str.charAt(i)=='j' && (str.charAt(i-1)=='l' || str.charAt(i-1)=='n'))
				num--; }
		}
		bw.write(num+"");
		bw.close();
	}

}
