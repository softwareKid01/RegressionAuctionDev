package automatedTests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterPage;

public class registerError extends BaseTest {
    @Test
    public void registerFail() throws InterruptedException {
        RegisterPage registerPage = landingPage.clickRegLink();
        registerPage.sendRegData("Joh1","D","userdomain.com","Password");
        registerPage.clickregisterButton();
        Assert.assertTrue(registerPage.getErrorMsg(),"Invalid registration data");
    }
}
