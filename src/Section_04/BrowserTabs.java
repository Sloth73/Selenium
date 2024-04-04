package Section_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class BrowserTabs {
    public static void main(String[] args) {
        System.setProperty("webdriver.driver.chrome", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk/browserTabs.html");
        for(int i=0; i<3; i++) {
            driver.findElement(By.xpath("//input[@value='Open Tab']")).click();
        }
        ArrayList<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());
        System.out.println("There are " + windowHandles.size() + " tabs open.");

        for(String item:windowHandles) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.switchTo().window(item);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.switchTo().window(windowHandles.get(0));
    }
}
