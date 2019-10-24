package testClasses;

import org.testng.annotations.Test;
import pages.SignOut;

public class SignOutTestCases extends SignOut {
    @Test
    public void testOnSignOut(){
        validateSignOut();
        sleepFor(5);
    }
}
