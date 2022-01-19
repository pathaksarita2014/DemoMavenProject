import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class LoginTest
{
    @Test
    public void login()
    {
        //webdriver.chrome.driver

        ChromeOptions option = new ChromeOptions();

        option.addArguments("headless");
        option.setBinary(System.getProperty("user.dir") + "//src//test//resources//testexe//chrome.exe");
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//src//test//resources//linux//"
                +"chromedriver");
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://www.youtube.com/");
        Assert.assertTrue(true);
    }
}
