package 문제;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class 상수 {

	public static void main(String[] args) 
	throws Exception {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] input=br.readLine().split(" ");
		int a = Integer.parseInt(new StringBuilder(input[0]).reverse().toString());
		int b = Integer.parseInt(new StringBuilder(input[1]).reverse().toString());
		bw.write(String.valueOf(Math.max(a, b)));
		bw.close();
		
		
		
	}

}
