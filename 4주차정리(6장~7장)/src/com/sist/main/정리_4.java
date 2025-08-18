package com.sist.main;

class GenieMusic{
	public void dataIn() {
		System.out.println("지니 뮤직 크롤링");
	}
	public void list()
	{
		System.out.println("목록 출력");
	}
	public String titleFind(String fd)
	{
		System.out.println("제목으로 검색");
		return fd;
	}
	// 가수 / 상세 / 동영상 etc...
}
class Melon extends GenieMusic{
	GenieMusic g=new GenieMusic();
	public void dataIn() {
		System.out.println("멜론 크롤링");
	}
}

public class 정리_4 {
	public static void main(String[] args) {
			Melon m = new Melon();
			m.dataIn();
			m.list();
	}

}
