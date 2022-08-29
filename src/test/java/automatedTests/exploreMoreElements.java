package automatedTests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ShopPage;

public class exploreMoreElements extends BaseTest {
    @Test
    public void exploreMoreProducts() throws InterruptedException {
       ShopPage shopPage = landingPage.clickShopLink();
       Thread.sleep(3000);
       shopPage.clickExploreMoreButton();
       Thread.sleep(1000);
       Assert.assertEquals(landingPage.isProductDisplaied(),12);
    }
}
