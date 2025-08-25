package com.sist.map;
import java.util.HashMap;
import java.util.Map;

interface I
{
	public void execute();
	
}
class A implements I
{

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("A:execute() Call...");
	}
	
}
class B implements I
{

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("B:execute() Call...");
	}
	
}
class C implements I
{

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("C:execute() Call...");
	}
	
}
class D implements I
{

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("D:execute() Call...");
	}
	
}
class Container
{
	Map<String, Object> map=new HashMap<String, Object>();
	public Container()
	{
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
		map.put("d", new D()); // XML
	}
	// 클래스 찾기
	public Object getBean(String key)
	{
		return map.get(key);
	}
	
}
public class Map_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container c=new Container();
		A a=(A)c.getBean("a");
		a.execute();
		B b=(B)c.getBean("b");
		b.execute();
		C cc=(C)c.getBean("c");
		cc.execute();
		D d=(D)c.getBean("d");
		d.execute();
	}

}
