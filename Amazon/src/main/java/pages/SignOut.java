package pages;

import api.CommonAPI;

public class SignOut extends CommonAPI {
    LoginPage loginPage= new LoginPage();
    HomePage homePage= new HomePage();
    public void validateSignOut(){
        homePage.signIn();
        loginPage.validateLoginField("nusratsultana1995@gmail.com");
        loginPage.continueButton();
        loginPage.validatePasswordField("Bangladesh11");
        loginPage.clickOnSignInButton();
        clickOnElementByXpath("//a[@id='nav-link-accountList']");
        clickOnElementByXpath("//a[@id='nav-item-signout']");
    }
}
