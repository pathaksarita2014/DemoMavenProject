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

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox"); // Bypass OS security model, MUST BE THE VERY FIRST OPTION
        options.addArguments("headless");
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems


        options.setBinary(System.getProperty("user.dir") + "//src//test//resources//testexe//chrome.exe");
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//src//test//resources//linux//"
                +"chromedriver");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.youtube.com/");
        Assert.assertTrue(true);
    }
}
