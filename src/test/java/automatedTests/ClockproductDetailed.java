package automatedTests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LandingPage;
import pages.ProductDetailedPage;

public class ClockproductDetailed extends BaseTest {
    @Test
    public void productdetailedsucceed(){
       ProductDetailedPage productDetailedPage = landingPage.clickAntiqueClockImg();
        Assert.assertTrue(productDetailedPage.getClockText().contains("RARE ANTIQUE DUTCH GRANDFATHER CLOCK PORTRE"));
    }
}
