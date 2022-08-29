package automatedTests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class searchBlankProduct extends BaseTest {
    @Test
    public void searchBlankProduct(){
        landingPage.search("");
        landingPage.clickSearchIcon();
        Assert.assertEquals(landingPage.isProductDisplaied(),9);
    }
}
