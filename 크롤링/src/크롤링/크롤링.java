package 크롤링;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class 크롤링 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        // options.addArguments("--headless"); // 창 안 띄우고 싶으면 주석 해제

        WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver(options);

        String[] ott = {"netflix","tving","coupang","wavve","disney","watcha","boxoffice"};

        try {
            for (String u : ott) {
                String url = "https://m.kinolights.com/ranking/" + u + "?hideBack=true";
                driver.get(url);

                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("li.ranking-item")));

                Thread.sleep(1500); // 스켈레톤 렌더링 대기

                List<WebElement> items = driver.findElements(By.cssSelector("li.ranking-item"));
                List<String> pcLinks = new ArrayList<>();

                // 1️⃣ 모바일 페이지 링크 → PC 페이지 링크 변환
                for (WebElement item : items) {
                    try {
                        String mobileLink = item.findElement(By.cssSelector("a.content-list-card__body"))
                                .getAttribute("href");
                        if (!mobileLink.isEmpty()) {
                            // 모바일 URL: https://m.kinolights.com/title/12345
                            // PC URL:     https://www.kinolights.com/title/12345
                            String pcLink = mobileLink.replace("m.kinolights.com", "www.kinolights.com");
                            pcLinks.add(pcLink);
                        }
                    } catch (Exception e) {
                        // 링크 못가져오면 무시
                    }
                }

                // 2️⃣ PC 페이지에서 데이터 크롤링
                for (String pcLink : pcLinks) {
                    try {
                        driver.get(pcLink);

                        WebDriverWait detailWait = new WebDriverWait(driver, Duration.ofSeconds(10));

                        // 제목
                        String title = "";
                        try {
                            WebElement titleEl = detailWait.until(
                                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.title"))
                            );
                            title = titleEl.getText();
                        } catch (Exception e) {}

                        // 포스터
                        String poster = "";
                        try {
                            poster = driver.findElement(By.cssSelector("div.poster img"))
                                    .getAttribute("src");
                        } catch (Exception e) {}

                        // 평점
                        String rating = "";
                        try {
                            WebElement ratingEl = detailWait.until(
                                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.rating"))
                            );
                            rating = ratingEl.getText();
                        } catch (Exception e) {}

                        // 작품 설명
                        String description = "";
                        try {
                            WebElement descEl = detailWait.until(
                                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.story"))
                            );
                            description = descEl.getText();
                        } catch (Exception e) {}

                        // 작품 정보
                        String info = "";
                        try {
                            List<WebElement> infoEls = driver.findElements(By.cssSelector("ul.info-list li"));
                            StringBuilder sb = new StringBuilder();
                            for (WebElement el : infoEls) {
                                sb.append(el.getText()).append(" | ");
                            }
                            info = sb.toString();
                        } catch (Exception e) {}

                        // 출연진
                        String cast = "";
                        try {
                            List<WebElement> castEls = driver.findElements(By.cssSelector("ul.cast-list li"));
                            StringBuilder sb = new StringBuilder();
                            for (WebElement el : castEls) {
                                sb.append(el.getText()).append(", ");
                            }
                            cast = sb.toString();
                        } catch (Exception e) {}

                        // 출력
                        System.out.println("제목: " + title);
                        System.out.println("포스터: " + poster);
                        System.out.println("평점: " + rating);
                        System.out.println("설명: " + description);
                        System.out.println("정보: " + info);
                        System.out.println("출연진: " + cast);
                        System.out.println("링크: " + pcLink);
                        System.out.println("====================================");

                        Thread.sleep(500); // 페이지 전환 안정화

                    } catch (Exception e) {
                        System.err.println("PC 상세페이지 크롤링 실패: " + pcLink);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
