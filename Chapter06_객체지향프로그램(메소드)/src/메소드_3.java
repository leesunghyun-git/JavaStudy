import java.net.URLEncoder;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 메소드_3 {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("멜론뮤직(1),지니뮤직(2):");
		int select = scan.nextInt();

		while (true) {
			System.out.println("======= MENU =========");
			System.out.println("1. 목록");
			System.out.println("2. 곡명 상세보기");
			System.out.println("3. 곡명 검색");
			System.out.println("4. 가수 검색");
			System.out.println("5. 종료");
			System.out.println("======================");
			System.out.println("메뉴 선택:");
			int menu = scan.nextInt();
			if (menu == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			if (select == 1) { // 소스 읽기
				Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get();
				Elements title = doc.select("tr.lst50 div.rank01 a");
				Elements singer = doc.select("tr.lst50 div.rank02 a");

				switch (menu) {
				case 1 -> {

				}
				case 2 -> {
					System.out.print("1~50 번호 선택");
					int s = scan.nextInt();
					String t = title.get(s - 1).text();
					System.out.println(t);
					String url = "https://www.youtube.com/results?search_query=" + URLEncoder.encode(t, "UTF-8");
					Document doc2 = Jsoup.connect(url).get();
					Pattern p = Pattern.compile("/w	atch\\?v=[^가-힣]+"); // youtube에서 동영상키 가져오기
					Matcher m = p.matcher(doc2.toString());
					String key = "";
					while (m.find()) {
						String ss = m.group();
						key = ss.substring(ss.indexOf("=") + 1, ss.indexOf("\""));
						break;
					}
					// 정규식
					Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "
							+ "http://youtube.com/embed/" + key);
				}

				case 3 -> {
					System.out.print("검색어 입력:");
					String fd = scan.next();
					for (int i = 0; i < title.size(); i++) {
						String t = title.get(i).text();
						if (t.toLowerCase().contains(fd.toLowerCase())) {
							System.out.println(t);
						}
					}
				}
				case 4 -> {
					System.out.print("검색어 입력:");
					String fd = scan.next();
					for (int i = 0; i < title.size(); i++) {
						String t = singer.get(i).text();
						if (t.toLowerCase().contains(fd.toLowerCase())) {
							System.out.println(title.get(i).text() + " // " + t);
						}
					}
				}
				default -> {
					System.out.println("잘못된 선택입니다.");
					continue;
				}
				}
			} else {
				Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
				Elements title = doc.select("table.list-wrap a.title");
				Elements singer = doc.select("table.list-wrap a.title");

				switch (menu) {
				case 1 -> {

					for (int i = 0; i < title.size(); i++) {
						System.out.println((i + 1) + "." + title.get(i).text() + " // " + singer.get(i).text());
					}
				}
				case 2 -> {
					System.out.print("1~50 번호 선택");
					int s = scan.nextInt();
					String t = title.get(s - 1).text();
					System.out.println(t);
					String url = "https://www.youtube.com/results?search_query=" + URLEncoder.encode(t, "UTF-8");
					Document doc2 = Jsoup.connect(url).get();
					Pattern p = Pattern.compile("/watch\\?v=[^가-힣]+"); // youtube에서 동영상키 가져오기
					Matcher m = p.matcher(doc2.toString());
					String key = "";
					while (m.find()) {
						String ss = m.group();
						key = ss.substring(ss.indexOf("=") + 1, ss.indexOf("\""));
						break;
					}
					// 정규식
					Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "
							+ "http://youtube.com/embed/" + key);
				}

				case 3 -> {
					System.out.print("검색어 입력:");
					String fd = scan.next();
					for (int i = 0; i < title.size(); i++) {
						String t = title.get(i).text();
						if (t.toLowerCase().contains(fd.toLowerCase())) {
							System.out.println(t);
						}
					}
				}
				case 4 -> {
					System.out.print("검색어 입력:");
					String fd = scan.next();
					for (int i = 0; i < title.size(); i++) {
						String t = singer.get(i).text();
						if (t.toLowerCase().contains(fd.toLowerCase())) {
							System.out.println(title.get(i).text() + " // " + t);
						}
					}
				}
				default -> {
					System.out.println("잘못된 선택입니다.");
					continue;
				}
				}

			}

		}

	}

}
