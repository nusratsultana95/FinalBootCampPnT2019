package testClasses;

import api.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LogOut;

public class LogOutTest extends CommonAPI {
    LogOut logOut;
    @BeforeMethod
    public void setLogOut(){
        logOut= PageFactory.initElements(driver,LogOut.class);
    }
    @Test
    public void testnavigationLevel(){
        logOut.setNavigationLevel();
    }
    @Test
    public void testLogOutButton(){
        logOut.setLogOutButton();
    }
}
