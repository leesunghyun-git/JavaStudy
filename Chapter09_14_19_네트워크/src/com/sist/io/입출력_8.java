package com.sist.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;
// 웹 => HttpSession	
public class 입출력_8 {
	public static void main(String[] args) {
		try
		{
			FileInputStream fis=new FileInputStream("c:\\upload\\sawon.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			List<Sawon> list=(List<Sawon>)ois.readObject();
			ois.close();
			fis.close();
			for(Sawon s:list)
			{
				System.out.println(s.getSabun()+"|"+s.getName()+"|"+s.getDept()+"|"+s.getJob()+"|"+s.getLoc()+"|"+s.getPay());
			}
		}catch(Exception ex) {}
	}
}
