package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class LandingPage {

    WebDriver driver;
    private By antiqueClock = By.xpath("//img[@alt='RARE ANTIQUE DUTCH GRANDFATHER CLOCK PORTRE']");
    private By searchField = By.xpath("//input[@id='searchField']");
    private By displaiedItemTitle = By.xpath("//div[@class='card-title']");
    private By products = By.xpath("//div[@class='image-container']");
    private By searchIcon = By.xpath("//input[@id='searchButton']");
    private By electronicsFilter = By.xpath("//li[.='Electronics ']");
    private By shopLink = By.xpath("//a[normalize-space()='SHOP']");
    private By aboutUs = By.linkText("About us");
    private By terms = By.linkText("Terms and conditions");
    private By policy = By.linkText("Privacy and policy");
    private By linkLogin = By.linkText("Log in");
    private By myAccountLink = By.linkText("MY ACCOUNT");
    private By registerLink = By.xpath("//a[normalize-space()='Create an account']");
    public LandingPage(WebDriver driver) {
        this.driver = driver;

    }
    public ProductDetailedPage clickAntiqueClockImg(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1350)");
        driver.findElement(antiqueClock).click();
        return new ProductDetailedPage(driver);
    }
    public void search(String search){
        driver.findElement(searchField).sendKeys(search);
        driver.findElement(searchField).sendKeys(Keys.ENTER);
    }
    public String productTextMatch(){
       String text = driver.findElement(displaiedItemTitle).getText();
       return text;
    }
    public void clickSearchIcon(){
        driver.findElement(searchIcon).click();
    }
    public int isProductDisplaied(){
        List<WebElement> list = driver.findElements(products);
        return list.size();
    }
    public void clickElectronics(){
        driver.findElement(electronicsFilter).click();
    }
    public ShopPage clickShopLink(){
        driver.findElement(shopLink).click();
        System.out.println("asd");
        return new ShopPage(driver);
    }
    public AboutUsPage clickAboutUs() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1700)");
        Thread.sleep(1000);
      driver.findElement(aboutUs).click();
      return new AboutUsPage(driver);
    }
    public TermsAndConditionsPage termsAndConditions() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1750)");
        Thread.sleep(1000);
        driver.findElement(terms).click();
        return new TermsAndConditionsPage(driver);
    }
    public PrivacyPolicyPage privacyAndPolicy() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1750)");
        Thread.sleep(1000);
        driver.findElement(policy).click();
        return new PrivacyPolicyPage(driver);
    }
    public LoginPage clickLoginLink(){
        driver.findElement(linkLogin).click();
        return new LoginPage(driver);
    }
    public MyAccountPage clickMyAccountLink(){
        driver.manage().window().maximize();
        driver.findElement(myAccountLink).click();
        return new MyAccountPage(driver);
    }
    public RegisterPage clickRegLink(){
        driver.findElement(registerLink).click();
        return new RegisterPage(driver);
    }
}
