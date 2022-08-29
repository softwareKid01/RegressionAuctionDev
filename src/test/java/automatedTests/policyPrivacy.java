package automatedTests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AboutUsPage;
import pages.PrivacyPolicyPage;

public class policyPrivacy extends BaseTest {
    @Test
    public void openFooterLinks() throws InterruptedException {
     PrivacyPolicyPage privacyPolicyPage = landingPage.privacyAndPolicy();
     Assert.assertEquals(privacyPolicyPage.getTitle(),"Privacy And Policy");
    }
}
