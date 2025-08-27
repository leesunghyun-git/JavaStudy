package com.sist.io;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class MovieSystem_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			List<MovieVO> list=new ArrayList<MovieVO>();
			FileInputStream fis=new FileInputStream("c:\\JavaDev\\movie.txt");
			BufferedReader in= new BufferedReader(new InputStreamReader(fis));
			while(true)
			{
				String movie=in.readLine();
				if(movie==null)
					break;
				String[] mm=movie.split("\\|");
				MovieVO m1=new MovieVO();
				m1.setMno(Integer.parseInt(mm[0]));
				m1.setTitle(mm[1]);
				m1.setGenre(mm[2]);
				m1.setPoster(mm[3]);
				m1.setActor(mm[4]);
				m1.setRegdate(mm[5]);
				m1.setGrade(mm[6]);
				m1.setDirector(mm[7]);
				list.add(m1);
//				System.out.println(movie);
				
			}
			
			for(MovieVO vo:list)
			{
				System.out.println(vo.getMno()+"."+vo.getTitle());
			}
		}catch(Exception ex) {}
	}

}
