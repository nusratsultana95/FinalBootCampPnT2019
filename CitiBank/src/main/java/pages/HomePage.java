package pages;

import api.CommonAPI;

public class HomePage extends CommonAPI {

    public void loginValues() {
        typeOnElementByXpath("/html//input[@id='username']","username");
        typeOnElementByXpath("/html//input[@id='password']","password");
        clickOnElementByXpath("//input[@id='signInBtn']");
    }
}

