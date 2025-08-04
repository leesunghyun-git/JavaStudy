package 문제;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class 그대로출력하기 {

	public static void main(String[] args) 
	throws Exception {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while((line=br.readLine())!=null)
		{
			bw.write(line);
			bw.newLine();
		}
		bw.close();
	}

}
