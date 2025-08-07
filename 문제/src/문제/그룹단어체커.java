package 문제;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class 그룹단어체커 {

	public static void main(String[] args) 
	throws Exception {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int check=0;
        
        
		int a=Integer.parseInt(br.readLine());
		for (int i=0;i<a;i++) // 입력받은 a번 반복
		{
            char prev=' ';
            boolean[] ap=new boolean[26];
			String str=br.readLine(); // 문자 읽기
			boolean bCheck=true;
			for(int j=0;j<str.length();j++) // 문자 첫자리부터 비교
			{
                if(prev!=str.charAt(j))
                {
                    if(ap[str.charAt(j)-'a']==true)
                    {
                        bCheck=false;
                        break;
                    }
                    ap[str.charAt(j)-'a']=true;
                    
                }
                prev=str.charAt(j);			
			}
			if(bCheck)
				check++;	
		}
	bw.write(String.valueOf(check));
	bw.close();
	}

}


//for(int j=0;i<str.length();i++)
//{	
//num++;
//if(i<str.length()-1)
//{
//	if(str.charAt(i)==str.charAt(i+1))
//	{
//		num--;
//	}
//	for(int l=i+1;j<str.length();l++)
//	{
//		if(str.charAt(i)==str.charAt(j))
//		{
//			if(j-i!=1)
//				bw.write("검출");
//				break;
//		}
//	}
//}