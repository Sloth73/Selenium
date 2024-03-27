package Section_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accordion {
    public static void main(String[] args) {
        System.setProperty("webdriver.driver.chrome", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk/accordion.html");

        for (int i = 0; i < 3; i++) {
            driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();
            driver.findElement(By.cssSelector(".accordion > div:nth-of-type(3)")).click();
            driver.findElement(By.cssSelector(".accordion > div:nth-of-type(5)")).click();

        }

    }
}
