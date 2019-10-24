package testClasses;

import api.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTestClass extends CommonAPI {
    HomePage homePage;
    @BeforeMethod
    public void setHomePage(){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }
    @Test
    public void testOnHomepage(){
        homePage.validateHomePage();
    }
    @Test
    public void testONaccountList(){
        homePage.validateAccountList();
    }
    @Test
    public void validateSignIN(){
        homePage.signIn();
    }
}
