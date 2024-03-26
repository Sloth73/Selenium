package Section_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Popups {
    public static void main(String[] args) {
        System.setProperty("webdriver.driver.chrome", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk/popups.html");
        driver.findElement(By.cssSelector("[onclick='popup\\(\\)']")).click();
        String mainWindow = driver.getWindowHandle();
        Set <String> handles = driver.getWindowHandles();
        Iterator <String> iterate = handles.iterator();
        while(iterate.hasNext()) {
            String child = iterate.next();

            if(!mainWindow.equalsIgnoreCase(child)) {
                driver.switchTo().window(child);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                driver.close();
            }
        }
        driver.switchTo().window(mainWindow);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector("[onclick='alertTrigger\\(\\)']")).click();


    }
}
