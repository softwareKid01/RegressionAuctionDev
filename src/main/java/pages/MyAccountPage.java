package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
    WebDriver driver;
    private By bidNowButton = By.xpath("//button[@class='bidding']");
    public MyAccountPage(WebDriver driver) {
        this.driver = driver;

    }
    public BidPage clickBidNowButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1250)");
        driver.findElement(bidNowButton).click();
        return new BidPage(driver);
    }
}
