package testClasses;

import api.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PageFooter;

public class PageFooterTestClass extends CommonAPI {
    PageFooter pageFooter;
    @BeforeMethod
    public void setPageFooter(){
        pageFooter= PageFactory.initElements(driver,PageFooter.class);
    }
    @Test
    public void testOnGlossary(){
        pageFooter.validateglossary();
    }
    @Test
    public void testOnCignaAccess(){
        pageFooter.validateCignaAccess();
    }
    @Test
    public void testOnSupplies(){
        pageFooter.validateSupplies();
    }
    @Test
    public void testOnClaims(){
        pageFooter.validateClaims();
    }
}
