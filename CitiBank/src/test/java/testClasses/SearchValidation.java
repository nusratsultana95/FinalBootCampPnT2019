package testClasses;

import org.testng.annotations.Test;
import pages.SearchOnElements;

public class SearchValidation extends SearchOnElements {
    @Test
    public void testOnsearch(){
        search();
    }
}
