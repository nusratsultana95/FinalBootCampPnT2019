package testClasses;

import api.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LogInFB;

public class LoginTest extends CommonAPI {
    LogInFB logInFB;
    @BeforeMethod
    public void setLogInFB(){
        logInFB= PageFactory.initElements(driver,LogInFB.class);
    }
    @Test(enabled = false)
    public void testOnLogIndisplay(){
        logInFB.validateLogInDisplayed();
    }
    @Test
    public void testOnEmailField(){
        logInFB.typeOnEmailfield("username");
    }
    @Test
    public void testOnPassField(){
        logInFB.typeOnPassField("12345");
    }
    @Test
    public void testOnLoginButton(){
        logInFB.validateLogInButton();
    }
}
