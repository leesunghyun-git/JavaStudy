package com.sist.set;
import java.util.HashSet;
import java.util.Objects;
class Sawon
{
	@Override
	public int hashCode() {
		
		return Objects.hash(sabun,name);
	}
	@Override
	public boolean equals(Object obj) {
		Sawon s=(Sawon)obj;
		return this.name.equals(s.name) && this.sabun==(s.sabun);
	}
	String name;
	int sabun;
	public Sawon(int sabun,String name)
	{
		this.sabun=sabun;
		this.name=name;
	}
	public Sawon() {}
}
public class Set_2 {

	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(new Sawon(1,"홍길동"));
		set.add(new Sawon(1,"홍길동"));
		set.add(new Sawon(3,"박문수"));
		set.add(new Sawon(4,"이순신"));
		set.add(new Sawon(5,"강감찬"));
		for(Object obj:set)
		{
			Sawon s=(Sawon)obj;
			System.out.println(s.sabun+"."+s.name);
		}
			
	}

}
