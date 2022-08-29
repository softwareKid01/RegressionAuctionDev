package automatedTests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AboutUsPage;

public class footerLinks extends BaseTest {
    @Test
    public void openFooterLinks() throws InterruptedException {
     AboutUsPage aboutUsPage = landingPage.clickAboutUs();
     Assert.assertEquals(aboutUsPage.getTitle(),"About Us");
    }
}
