package automatedTests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class searchInvalidProduct extends BaseTest {
    @Test
    public void searchProductSuccessfully(){
        landingPage.search("Golf2");
        Assert.assertTrue(landingPage.productTextMatch().contains("GOLF2"));
    }
}
