package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;
    private By firstName = By.xpath("//input[@id='firstName']");
    private By lastName = By.xpath("//input[@id='lastName']");
    private By userEmail = By.xpath("//input[@id='email']");
    private By passwsord = By.xpath("//input[@id='password']");
    private By regButton = By.xpath("//button[@type='button']");
    private By errorMsg = By.xpath("//p[.='Please enter your first name correctly. ']");
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }
    public void sendRegData(String fname, String lname, String email,String pwd){
        driver.findElement(firstName).sendKeys(fname);
        driver.findElement(lastName).sendKeys(lname);
        driver.findElement(userEmail).sendKeys(email);
        driver.findElement(passwsord).sendKeys(pwd);
    }
    public void clickregisterButton() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(1000);
        driver.findElement(regButton).click();
    }
    public Boolean getErrorMsg(){
        Boolean msg = driver.findElement(errorMsg).isDisplayed();
        return msg;
    }
}
