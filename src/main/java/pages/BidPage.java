package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BidPage {
    WebDriver driver;
    private By bidInput = By.xpath("//input[@id='placeBid']");
    private By bidButton = By.xpath("//button[@class='Button bidding']");
    private By maxBidLabel = By.xpath("//p[normalize-space()='$31']");
    public BidPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterBid(String num){
        driver.findElement(bidInput).sendKeys(num);
    }
    public String bidLabelText(){
       String text = driver.findElement(maxBidLabel).getText();
       return text;
    }
    public String bidInputText(){
        String text = driver.findElement(bidInput).getText();
        return text;
    }
    public void clickBid(){
        driver.findElement(bidButton).click();
    }
}
