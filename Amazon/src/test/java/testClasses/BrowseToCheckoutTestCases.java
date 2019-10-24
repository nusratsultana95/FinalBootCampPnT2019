package testClasses;

import org.testng.annotations.Test;
import pages.BrowseToCheckouts;

public class BrowseToCheckoutTestCases extends BrowseToCheckouts {
    @Test
    public void testOnbrowsingProducts(){
        validateSearch();
        validateSubmitSearch();
        sleepFor(5);
        validateSearchResult();
        validateProducts();
        validateShoppingCart();
    }
}
