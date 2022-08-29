package automatedTests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AboutUsPage;
import pages.TermsAndConditionsPage;

public class footerLinksTermsAndConditions extends BaseTest {
    @Test
    public void openFooterLinks() throws InterruptedException {
     TermsAndConditionsPage termsAndConditionsPage = landingPage.termsAndConditions();
     Assert.assertEquals(termsAndConditionsPage.getTitle(),"Terms and Conditions for Auction");
    }
}
