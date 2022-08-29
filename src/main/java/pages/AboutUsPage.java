package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutUsPage {
    WebDriver driver;
    private By title = By.xpath("//h2[normalize-space()='About Us']");
    public AboutUsPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTitle(){
       return driver.findElement(title).getText();
    }
}
