package 문제;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class 너의평점은 {

	public static void main(String[] args) 
	throws Exception {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int num=20;
		double scoresum=0;
		double sum=0;
		
		String[] title=new String[20];
		double[] score=new double[20];
		String[] grad=new String[20];
		double[] sbavg=new double[20];
		for(int i=0;i<20;i++)
		{
			st=new StringTokenizer(br.readLine());
			title[i]=st.nextToken();
			score[i]=Double.parseDouble(st.nextToken());
			grad[i]=st.nextToken();
		}
		for(int i=0;i<20;i++)
		{
			switch (grad[i])
			{
				case "A+" : {
					sbavg[i]=4.5;
					break;
				}
				case "A0" : {
					sbavg[i]=4.0;
					break;
				}
				case "B+" : {
					sbavg[i]=3.5;
					break;
				}
				case "B0" : {
					sbavg[i]=3.0;
					break;
				}
				case "C+" : {
					sbavg[i]=2.5;
					break;
				}
				case "C0" : {
					sbavg[i]=2.0;
					break;
				}
				case "D+" : {
					sbavg[i]=1.5;
					break;
				}
				case "D0" : {
					sbavg[i]=1.0;
					break;
				}
				case "F" : {
					sbavg[i]=0.0;
					break;
				}
				case "P" : {
					sbavg[i]=0.0;
					score[i]=0.0;
					num--;
				}
			}
		scoresum+=score[i];
		sum+=(score[i]*sbavg[i]);
		}
		double avg=(sum)/scoresum;
		bw.write(String.valueOf(avg));
		bw.close();
		
		
	}

}
