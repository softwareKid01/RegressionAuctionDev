package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailedPage {

    WebDriver driver;
    private By antiqueClockHeaderText = By.xpath("//div[.='RARE ANTIQUE DUTCH GRANDFATHER CLOCK PORTRE']");
    public ProductDetailedPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getClockText(){
        String text = driver.findElement(antiqueClockHeaderText).getText();
        return text;
    }
}
