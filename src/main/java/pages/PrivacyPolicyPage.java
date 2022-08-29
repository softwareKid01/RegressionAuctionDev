package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrivacyPolicyPage {
    WebDriver driver;
    private By title = By.xpath("//h2[normalize-space()='Privacy And Policy']");
    public PrivacyPolicyPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTitle(){
        return driver.findElement(title).getText();
    }
}
