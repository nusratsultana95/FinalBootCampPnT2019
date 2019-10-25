package testClasses;

import org.testng.annotations.Test;
import pages.Login;

public class LoginTest extends Login {
    @Test
    public void testOnHomePage(){
        loginValues();
    }
}
