package Section_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingData {
    public static void main(String[] args) {
        System.setProperty("webdriver.driver.chrome", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk/contactForm.html");
        driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("John");
        driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Doe");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("johndoe@gmail.com");
        driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys("This is message.");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }
}
