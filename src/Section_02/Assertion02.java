package Section_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Assertion02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.driver.chrome", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://teststore.automationtesting.co.uk/index.php");
        //driver.findElement(By.linkText("TEST STORE")).click();
        driver.findElement(By.cssSelector("img[alt='Hummingbird printed t-shirt']")).click();
        driver.findElement(By.cssSelector(".add-to-cart.btn.btn-primary")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String total = driver.findElement(By.cssSelector(".product-total > .value")).getText();
        assertEquals("$26.12", total);

    }
}
