package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.LandingPage;
import pages.LandingPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private WebDriver driver;
   protected LandingPage landingPage;
   @BeforeClass
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://auctionapp2022.herokuapp.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        landingPage = new LandingPage(driver);
    }




}
