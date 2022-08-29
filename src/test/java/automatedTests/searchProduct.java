package automatedTests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class searchProduct extends BaseTest {
    @Test
    public void searchProductSuccessfully(){
        landingPage.search("case cover");
        Assert.assertTrue(landingPage.productTextMatch().contains("CASE COVER"));
    }
}
