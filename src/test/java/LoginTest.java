import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest
{
    @Test
    public void login()
    {
        //webdriver.chrome.driver
        ChromeOptions option = new ChromeOptions();
        option.addArguments("headless");
        option.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//src//test//resources//linux//"
                +"chromedriver");
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://www.youtube.com/");
        Assert.assertTrue(true);
    }
}
