package Section_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMenu {
    public static void main(String[] args) {
        System.setProperty("webdriver.driver.chrome", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk/dropdown.html");
        Select menuItem = new Select(driver.findElement(By.cssSelector("#cars")));
        //menuItem.selectByVisibleText("Honda");
        menuItem.selectByValue("jeep");

    }
}
