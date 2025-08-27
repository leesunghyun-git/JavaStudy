package com.sist.io;
//파일 제어 => 파일 복사 (업로드) *********
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class 입출력_5 {
	public static void main(String[] args) {
		try
		{
			//FileInputStream / FileOutputStream
			File dir=new File("c:\\upload");
			if(!dir.exists()) // 폴더가 없으면
			{
				dir.mkdir();
			}
			File file=new File("C:\\JavaDev\\jsoup-1.21.1.jar");
			// 파일 읽기 => 파일 쓰기
			FileInputStream fis=new FileInputStream(file);
			FileOutputStream fos=new FileOutputStream("c:\\upload\\jsoup.jar");
			int i=0;
			byte[] buffer=new byte[1024];
			while((i=fis.read(buffer, 0, 1024))!=-1)
			{
				fos.write(buffer,0,i);
			}
			fis.close();
			fos.close();
			System.out.println("파일 복사 완료!!");
			
		}catch(Exception ex) {}
	}
}
