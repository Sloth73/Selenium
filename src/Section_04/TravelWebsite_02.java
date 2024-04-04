package Section_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TravelWebsite_02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.driver.chrome", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.easyjet.com/cs");
        driver.findElement(By.id("ensRejectAll")).click();
        driver.findElement(By.cssSelector("input[name='origin']")).click(); // If the element is not clicked first send keys continue to input characters after placeholder
        driver.findElement(By.cssSelector("input[name='origin']")).sendKeys("Londýn");
        List<WebElement> origins = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#ui-id-1 li>a>span")));
        for(WebElement origin:origins) {
            if(origin.getText().contains("Luton")) {
                origin.click();
            }
        }
        driver.findElement(By.cssSelector("input[name='destination']")).click();
        driver.findElement(By.cssSelector("input[name='destination']")).sendKeys("a");
        List<WebElement> destinations = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#ui-id-2 li>a>span")));
        for(WebElement destination:destinations) {
            if(destination.getText().contains("Antalya")) {
                destination.click();
            }
        }
    }
}
