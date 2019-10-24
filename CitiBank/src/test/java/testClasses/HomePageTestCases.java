package testClasses;

import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTestCases extends HomePage {
    @Test
    public void testOnHomePage(){
        loginValues();
    }
}
