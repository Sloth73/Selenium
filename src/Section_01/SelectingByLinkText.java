package Section_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingByLinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.driver.chrome", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk");
        driver.findElement(By.linkText("ACTIONS")).click(); //ACTIONS need to be capitalized because it selects an actual text on webpage, not "code text"

    }
}
