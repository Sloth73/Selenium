package Section_04;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {
    public static void main(String[] args) {
        System.setProperty("webdriver.driver.chrome", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk/contactForm.html");

        driver.findElement(By.cssSelector("input[name = 'first_name']")).sendKeys("John");
        driver.findElement(By.cssSelector("input[name = 'last_name']")).sendKeys("Doe");
        driver.findElement(By.cssSelector("input[name = 'email']")).sendKeys("Johndoe@gmail.com");
        driver.findElement(By.cssSelector("textarea")).sendKeys("This is a simple comment");

        WebElement submit = driver.findElement(By.cssSelector("[type='submit']"));
        WebElement reset = driver.findElement(By.cssSelector("[type = 'reset']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click(), arguments[1].click()", reset, submit);
    }
}
