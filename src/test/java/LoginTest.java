import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class LoginTest
{
    @Test
    public void login()
    {
        //webdriver.chrome.driver

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +
                "//src//test//resources//bina//" + "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        Assert.assertTrue(true);
    }
}
