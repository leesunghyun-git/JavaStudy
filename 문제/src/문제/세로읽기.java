package 문제;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class 세로읽기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		char[][] arr=new char[5][15];
		for(int i=0;i<5;i++)
		{
			String str= br.readLine().trim();
			for(int j=0;j<str.length();j++)
			{
					arr[i][j]=str.charAt(j);
			}
		}
		for(int i=0;i<15;i++)
		{
			for(int j=0;j<5;j++)
			{
				if((arr[j][i]>='a' && arr[j][i]<='z')||(arr[j][i]>='A' && arr[j][i]<='Z')||(arr[j][i]>='0' && arr[j][i]<='9'))
					bw.write(String.valueOf(arr[j][i]));
			}
		}
		bw.close();
	}

}
