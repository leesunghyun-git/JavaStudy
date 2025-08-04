package 문제;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class 평균 {

	public static void main(String[] args) 
	throws Exception {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n=Integer.parseInt(br.readLine());
		double[] score=new double[n];
		st=new StringTokenizer(br.readLine());
		double max=0;
		double total=0;
		for(int i=0;i<score.length;i++)
		{
			score[i]=Double.parseDouble(st.nextToken());
			if(max<score[i])
				max=score[i];
		}
		for(int i=0;i<score.length;i++)
		{
			total+=(score[i]/max)*100.0;
		}
		double avg=total/n;
		bw.write(avg+"");
		bw.close();
	}

}
