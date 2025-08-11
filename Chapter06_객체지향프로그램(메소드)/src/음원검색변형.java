import java.net.URLEncoder;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 음원검색변형 {
	static Scanner scan = new Scanner(System.in);
	private String url = "";
	private String titleSource = "";
	private String artistSource = "";
	private int menu;
	
	public void selectsite() {
		while (true) {
			System.out.print("멜론뮤직(1),지니뮤직(2):");
			int select;
			select = scan.nextInt();
			if (select > 2 && select < 1) {
				System.out.println("1번과 2번중에 선택해 주십시오.");
				continue;
			}
			if (select == 1) {
				this.url = "https://www.melon.com/chart/index.htm";
				this.titleSource = "tr.lst50 div.rank01 a";
				this.artistSource = "tr.lst50 div.rank02 a";
			}
			if (select == 2) {
				this.url = "https://www.genie.co.kr/chart/top200";
				this.titleSource = "table.list-wrap a.title";
				this.artistSource = "table.list-wrap a.artist";
			}

			break;
		}
	}

	public void menu() {
		int selectmenu;
		System.out.println("======= MENU =========");
		System.out.println("1. 목록");
		System.out.println("2. 유튜브 서치");
		System.out.println("3. 곡명 검색");
		System.out.println("4. 가수 검색");
		System.out.println("5. 종료");
		System.out.println("======================");
		System.out.println("메뉴 선택:");
		while (true) {
			selectmenu = scan.nextInt();
			if (selectmenu > 6 || selectmenu < 1) {
				System.out.println("잘못된 입력입니다");
				continue;
			}
			this.menu = selectmenu;
			break;
		}
	}

	public void select1(Document doc, Elements title, Elements artist) {
		for (int i = 0; i < title.size(); i++) {
			System.out.println((i + 1) + "." + title.get(i).text() + " // " + artist.get(i).text());
		}
	}

	public void select2() throws Exception {
		System.out.print("검색어 입력");
		String fd = URLEncoder.encode(scan.next(), "UTF-8");
		Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "
				+ "https://www.youtube.com/results?search_query=" + fd);
	}

	public void select3(Document doc, Elements title, Elements artist) {
		System.out.print("검색어 입력:");
		String fd = scan.next();
		for (int i = 0; i < title.size(); i++) {
			String t = title.get(i).text();
			String a = artist.get(i).text();
			if (t.toLowerCase().contains(fd.toLowerCase())) {
				System.out.println(t + " // " + a);
			}
		}
	}

	public void select4(Document doc, Elements title, Elements artist) {
		System.out.print("검색어 입력:");
		String fd = scan.next();
		for (int i = 0; i < artist.size(); i++) {
			String t = title.get(i).text();
			String a = artist.get(i).text();
			if (a.toLowerCase().contains(fd.toLowerCase())) {
				System.out.println(t + " // " + a);
			}
		}
	}

	public void process() throws Exception {
		selectsite();
		Document doc = Jsoup.connect(url).get();
		Elements title = doc.select(titleSource);
		Elements artist = doc.select(artistSource);
		while (true) {
			menu();
			switch (menu) {
			case 1 -> {
				select1(doc, title, artist);
			}
			case 2 -> {
				select2();
			}
			case 3 -> {
				select3(doc, title, artist);
			}
			case 4 -> {
				select4(doc, title, artist);
			}
			}
			if (menu == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		음원검색변형 xay = new 음원검색변형();
		xay.process();
	}

}
