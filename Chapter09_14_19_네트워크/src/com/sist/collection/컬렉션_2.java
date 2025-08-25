package com.sist.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 컬렉션_2 {
	public static Set<String> genieMusic() {
		Set<String> set = new HashSet<>();
		try {
			for (int k = 1; k <= 2; k++) {
				Document doc = Jsoup
						.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20250825&hh=17&rtm=Y&pg=" + k).get();
				Elements title = doc.select("table.list-wrap a.title");
				for (int i = 0; i < title.size(); i++) {
					String t = title.get(i).text();
					set.add(t);
				}
			}
		} catch (Exception ex) {
		}
		return set;
	}

	public static Set<String> melonMusic() {
		Set<String> set = new HashSet<>();
		try {
			Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title = doc.select("div.wrap_song_info div.rank01 a");
			for (int i = 0; i < title.size(); i++) {
				set.add(title.get(i).text());
			}
		} catch (Exception ex) {
		}
		return set;
	}

	/*
	 * Set<String> List<Integer> List<int> ---------- X Map<String,Object>
	 * ------------------ | new A() , new B() -------------------------------------
	 * 
	 * => key , value ----------- properties , xml , json -----------------------
	 * xml => spring-boot : yml driver=oracle...
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * T => 임의의 클래스형 (Type) E => 컬렉션 요소 (Element) K => Key V => Value N => Number ?
		 * => wild card <? extends Number>
		 * 
		 * => 타입이 안정화 / 재사용성 => C# , 파이썬 , TypeScript
		 * 
		 * class BoardVO => interface BoardVO
		 */
//		ArrayList list=new ArrayList();
//		list.add("aaa");
//		list.add('A');
//		list.add(10);
//		list.add(10.5);
//		list.add(10.5f);
//		list.add(10L);
//		list.add("aaa");
//		list.add('A');
//		list.add(10);
//		list.add(10.5);
//		list.add(10.5f);
//		list.add(10L);
//		
//		for(Object obj:list)
//		{
//			System.out.println(obj.toString());
//		}
		Set<String> genie = genieMusic();

		int i = 1;
		System.out.println("============== 지니뮤직 Top 100 ===============");
		for (String title : genie) {
			System.out.println(i + "." + title);
			i++;
		}
		i = 1;
		System.out.println("============== 멜론 Top 100 ===============");
		Set<String> melon = melonMusic();
		for (String title : melon) {
			System.out.println(i + "." + title);
			i++;
		}
		// Set<String> genie
//		System.out.println("============== 중복 제거 ===============");
//		melon.removeAll(genie);

		// [1,2,3,4,5].removeAll([3,4,5,6,7]) => 1,2,
//		i = 1;
//		for (String title : melon) {
//			System.out.println(i + "." + title);
//			i++;
//		}
//		System.out.println("============= 노래명(교집합) ==============");
//		genie.retainAll(melon);
		System.out.println("========== Set에 있는 데이터를 List로 이동==========");
//		List<String> list=new ArrayList<>(genie);
		// Set => List로 이동
		// list.addAll(genie)
		List<String> list=new ArrayList<>();
		list.addAll(genie);
		i=1;
		for(String title:list)
		{
			System.out.println(i+"."+title);
			i++;
		}
		System.out.println("=========== 지니뮤직 Top 10 ==============");
		List<String> top=list.subList(0, 10);
		i=1;
		for(String title:top)
		{
			System.out.println(i+"."+title);
			i++;
		}
	}

}
