package Section_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.driver.chrome", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk/popups.html");
        driver.findElement(By.cssSelector("[onclick='alertTrigger\\(\\)']")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } // Autogenerated try-catch block
        driver.switchTo().alert().accept();
        //driver.switchTo().alert().dismiss();

    }
}