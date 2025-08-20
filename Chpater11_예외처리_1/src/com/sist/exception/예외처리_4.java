package com.sist.exception;

// finally 없이 자동 닫기 => 파일에서만 가능
// import java.net java.io, java.sql => CheckException 
import java.io.FileReader;

public class 예외처리_4 {

	public static void main(String[] args) {
		try(FileReader fr=new FileReader("C:\\JavaDev\\JavaStudy\\Chpater11_예외처리_1\\src\\com\\sist\\exception\\예외처리_3.java"))
		{ // 자동 리소스 파일리더를 try시작시 시작, 종료시 삭제
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
