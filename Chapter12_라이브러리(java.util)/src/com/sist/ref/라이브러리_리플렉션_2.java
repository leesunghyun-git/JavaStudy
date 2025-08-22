package com.sist.ref;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Sawon
{
		private String name;
		private int age;
		public Sawon() {}
		public Sawon(String name)
		{
			this.name=name;
		}
		public Sawon(String name, int age)
		{
			this.name=name;
			this.age=age;
		}
		
		public void sayHello()
		{
			System.out.println("Sawon:sayHello Call..."+name+" , 살:"+age);
		}
}
public class 라이브러리_리플렉션_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class cls=Class.forName("com.sist.ref.Sawon");

			Constructor con=cls.getConstructor(String.class);  // String의 매개변수를 필요로하는 생성자 호출
			Object obj=con.newInstance("홍길동");
			Method m=cls.getMethod("sayHello");
			m.invoke(obj);
			Constructor con1=cls.getConstructor(String.class,int.class);  // String의 매개변수를 필요로하는 생성자 호출
			Object obj1=con1.newInstance("심청이",20);
			Method c=cls.getMethod("sayHello");
			c.invoke(obj1);
			// 호출

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // 예외 확인
		}
	}

}
