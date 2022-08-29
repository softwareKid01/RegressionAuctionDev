package automatedTests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class electronicsFilter extends BaseTest {
    @Test
    public void filterProductsSuccessfully() throws InterruptedException {
        landingPage.clickElectronics();
        Thread.sleep(1000);
        Assert.assertEquals(landingPage.productTextMatch(),"Iron Man Avengers Endgame Marvel Action Figure");
    }
}
