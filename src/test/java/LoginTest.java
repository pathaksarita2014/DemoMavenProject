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
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//src//test//resources//newbinary//"
                +"chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox"); // Bypass OS security model, MUST BE THE VERY FIRST OPTION
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.setHeadless(true);
        options.setBinary(System.getProperty("user.dir") + "//src//test//resources//testexe//chrome.exe");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.youtube.com/");
        Assert.assertTrue(true);
    }
}
