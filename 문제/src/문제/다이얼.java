package 문제;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class 다이얼 {

	public static void main(String[] args) 
	throws Exception {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		int time=0;
//		for(int i=0;i<input.length();i++)
//		{
//			switch(input.charAt(i))
//			{
//			case 'A': case 'B': case 'C': {
//				time+=3;
//				break;
//			}
//			case 'D': case 'E': case 'F': {
//				time+=4;
//				break;
//			}
//			case 'G': case 'H': case 'I': {
//				time+=5;
//				break;
//			}
//			case 'J': case 'K': case 'L': {
//				time+=6;
//				break;
//			}
//			case 'M': case 'N': case 'O': {
//				time+=7;
//				break;
//			}
//			case 'P': case 'Q': case 'R':case 'S': {
//				time+=8;
//				break;
//			}
//			case 'T': case 'U': case 'V': {
//				time+=9;
//				break;
//			}
//			case 'W': case 'X': case 'Y': case 'Z': {
//				time+=10;
//				break;
//			
//			}
//			
//			}
//		}
		int[] dial = {
				3, 3, 3,
				4, 4, 4,
				5, 5, 5,
				6, 6, 6,
				7, 7, 7,
				8, 8, 8, 8,
				9, 9, 9,
				10, 10, 10, 10
		};
		for(int i=0;i<input.length();i++)
		{
			char ch = input.charAt(i);
			time += dial[ch-'A'];
		}
		bw.write(time+"");
		bw.close();
		
		
	}

}
