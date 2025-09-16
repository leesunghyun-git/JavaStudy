package 크롤링;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sist.dao.DataDAO;
import com.sist.vo.DataVO;

public class 크롤링2 {
	static DataDAO dao=DataDAO.newInstance();
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
//         options.addArguments("--headless"); // 창 안 띄우고 싶으면 해제

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        String[] ott = {"netflix", "tving", "coupang", "wavve", "disney", "watcha", "boxoffice"};
        List<DataVO> data = new ArrayList<DataVO>();
        try {
            for (String u : ott) {
                String url = "https://m.kinolights.com/ranking/" + u + "?hideBack=true&period=monthly";
                driver.get(url);

                // 랭킹 리스트 대기
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("li.ranking-item")));
                List<WebElement> items = driver.findElements(By.cssSelector("li.ranking-item"));

                // 1️ 링크 먼저 수집
                List<String> links = new ArrayList<>();
                for (WebElement item : items) {
                    try {
                        String link = item.findElement(By.cssSelector("a.content-list-card__body")).getAttribute("href");
                        if (!link.isEmpty() && link.contains("/title/")) {
                            links.add(link);
                        }
                    } catch (Exception e) {}
                }

                // 2️ 수집한 링크별로 상세페이지 크롤링
                for (String link : links) {
                	DataVO vo = new DataVO(); 
                    driver.get(link);
                    
                    // 제목
                    String name = "";
                    try {
                        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.title-kr")));
                        name = el.getText();
                    } catch (Exception e) {}

                    // 포스터
                    String poster = "";
                    try {
                        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.poster img")));
                        poster = el.getAttribute("src");
                    } catch (Exception e) {}

                    // 평점
                    String score = "";
                    try {
                        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.movie-light-percent")));
                        score = el.getText();
                    } catch (Exception e) {}

                    // 설명
                    String content = "";
                    try {
                        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.synopsis__text-wrap")));
                        content = el.getText();
                    } catch (Exception e) {}

                    // 출연진
                    String casts = "";
                    try {
                        WebElement castContainer = wait.until(
                                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.person__actor"))
                        );
                        List<WebElement> castList = castContainer.findElements(By.cssSelector("div.name"));
                        StringBuilder sb = new StringBuilder();
                        for (WebElement cast : castList) {
                            if (sb.length() > 0) sb.append(", ");
                            sb.append(cast.getText());
                        }
                        casts = sb.toString();
                    } catch (Exception e) {}

                    // 메타데이터 (item__title / item__body)
                    String detail = "";
                    try {
                        List<WebElement> metaItems = driver.findElements(By.cssSelector("li.metadata__item"));
                        StringBuilder sb = new StringBuilder();
                        for (WebElement meta : metaItems) {
                            String metaTitle = "";
                            String metaBody = "";
                            try {
                                metaTitle = meta.findElement(By.cssSelector("span.item__title")).getText();
                                metaBody = meta.findElement(By.cssSelector("span.item__body")).getText().replace("/", ",");
                            } catch (Exception ignored) {}

                            // 내용 없는 항목 제외
                            if (!metaBody.isEmpty()) {
                                if (sb.length() > 0) sb.append("/");
                                sb.append(metaTitle).append(": ").append(metaBody);
                            }
                        }
                        detail = sb.toString();
                    } catch (Exception e) {}
                    // 이미지 
                    String image="";
                    try
                    {
                    	WebElement element = driver.findElement(By.xpath("//link[contains(@href, 'still_cut')]"));
                        image = element.getAttribute("href");
                        System.out.println(image);
//                    	WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("meta[property='og:image']")));
//                    	image = el.getAttribute("href");
//                    	System.out.println(image);
                    }catch(Exception ex)
                    {
                 
                    }
                    
                    /*
                     * public class DataVO {
	private String site;
	private int number;
	private int rank;
	private String name;
	private String score;
	private String content;
	private String cast;
	private String detail;
	private String link;
}
                     */
                    vo.setSite(u);
                    vo.setTitle(name);
                    vo.setScore(score);
                    vo.setPoster(poster);
                    vo.setContent(content);
                    vo.setCast(casts);
                    vo.setDetail(detail);
                    vo.setImage(image);
                    dao.insertData(vo);
                    System.out.println("종료");
                    data.add(vo);
                    
                }
            }
        
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
