package 문제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bufferpractic {
	public static void main(String[] args)
	throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a=br.read();
		bw.write(a);
		bw.flush();
		bw.newLine();
		// int 형 데이터 입력 및 출력
		String b=br.readLine();
		bw.write(b);
		bw.flush();
		
	}
}
