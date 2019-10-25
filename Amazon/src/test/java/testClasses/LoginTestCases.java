package testClasses;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTestCases extends LoginPage {
    HomePage homePage = new HomePage();
    @Test
    public void testOnlogIn(){
        homePage.signIn();
        validateLoginField("username");
        continueButton();
        validatePasswordField("password");
        clickOnSignInButton();
    }
}
