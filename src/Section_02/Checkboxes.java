package Section_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.driver.chrome", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk/dropdown.html");
        System.out.println(driver.findElement(By.cssSelector("input#cb_red")).isSelected());
        System.out.println(driver.findElement(By.cssSelector("input#cb_green")).isSelected());
    }
}
