package com.sist.main;
import com.sist.a.Borad;
// 메소드 / 클래스 / 생성자 => 다른 패키지에 있는 클래스와 연결
// => public
// => 변수 : private => public getter/setter
// 여러개의 클래스를 만들어서 => 조립
public class MainClass extends Borad{
	
	public static void main(String[] args) {
		MainClass b=new MainClass();
		b.borad_list();
		b.borad_상세보기(5);
	}

}
