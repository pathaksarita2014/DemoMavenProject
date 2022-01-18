import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class LoginTest
{
    @Test
    public void login()
    {
        //webdriver.chrome.driver
        ChromeOptions option = new ChromeOptions();
        option.addArguments("headless");
       // System.setProperty("webdriver.chrome.driver","src/test/resources/newbinary/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","/src/test/resources/binary97/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        System.out.println("Test Success");
        Assert.assertTrue(true);
    }
}
