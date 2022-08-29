package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    private By emailField = By.xpath("//input[@id='email']");
    private By passwordField = By.xpath("//input[@id='password']");
    private By loginButton = By.xpath("//button[@class='purpleButton userManagment']");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public LandingPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new LandingPage(driver);
    }
}
