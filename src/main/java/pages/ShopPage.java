package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShopPage {
    WebDriver driver;
    private By exploreMoreButton = By.xpath("//button[.='EXPLORE MORE']");
    private By products = By.cssSelector("button[class='purpleButton']");
    public ShopPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickExploreMoreButton(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1400)");
        driver.findElement(exploreMoreButton).click();
    }
    public int isProductDisplaied(){
        List<WebElement> list = driver.findElements(products);
        return list.size();
    }
}
