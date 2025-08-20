package com.sist.lang;
// toString => 객체의 주소를 문자열화
// (String)obJ => obj.toString()
// toString 생략이 가능
class Food
{
	int fno=1;
	String title ="맛집";
	@Override
	public String toString() {
		
		return "맛집번호:"+fno+", 맛집명:"+title;
	}
	
}
public class 라이브러리_3 {

	public static void main(String[] args) {
		Food f=new Food();
		System.out.println("f = "+f.toString()); 
		System.out.println("f = "+f); //toString을 생략해도 toString을 자동으로 사용
	}
}
