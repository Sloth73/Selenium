package Section_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
    public static void main(String[] args) {
        System.setProperty("webdriver.driver.chrome", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk/iframes.html");
        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector(".toggle")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.switchTo().parentFrame();
        driver.findElement(By.cssSelector(".toggle")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.switchTo().frame(1);
        driver.findElement(By.cssSelector("[aria-label='Přehrát']")).click();


    }
}
