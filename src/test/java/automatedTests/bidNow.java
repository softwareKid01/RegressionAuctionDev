package automatedTests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BidPage;
import pages.LandingPage;
import pages.LoginPage;
import pages.MyAccountPage;

public class bidNow extends BaseTest {

    @Test
    public void bidNow() throws InterruptedException {
       LoginPage loginPage = landingPage.clickLoginLink();
       loginPage.enterEmail("hakalaH@tito.com");
       loginPage.enterPassword("Malta@123");
       Thread.sleep(1000);
       LandingPage landingPage = loginPage.clickLoginButton();
       Thread.sleep(2000);
       MyAccountPage myAccountPage = landingPage.clickMyAccountLink();
       BidPage bidPage = myAccountPage.clickBidNowButton();
       bidPage.enterBid("33");
       bidPage.clickBid();
       Assert.assertEquals(bidPage.bidInputText(),bidPage.bidLabelText());
    }
}
