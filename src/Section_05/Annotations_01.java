package Section_05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Annotations_01 {
    WebDriver driver;
    @BeforeSuite
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.driver.chrome", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
        @Test
        public void test() throws InterruptedException {
            driver.get("https://automationtesting.co.uk");
        }
        @AfterSuite
        public void end() {
            driver.close();
            driver.quit();
        }

}
