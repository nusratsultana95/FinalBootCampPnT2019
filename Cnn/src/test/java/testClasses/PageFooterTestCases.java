package testClasses;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.PageFooter;

import java.util.List;

public class PageFooterTestCases extends PageFooter {
    @Test(enabled = false)
    public void testOnHealth(){
        validateHealthButton();
    }
    @Test(enabled = false)
    public void validateHealthValueDisplayed(){
        validateHealthButton();
    }
    @Test(enabled = false)
    public void testOnTermsAndUse(){
        validateTermsAndUse();
    }
    @Test(enabled = false)
    public void validateTermsValueDisplayed(){
        validateTermsAndUse();
    }
    @Test(enabled = false)
    public void testOnFooterMenu(){
        List<WebElement> footerMenuList=footerMenu();
        System.out.println(footerMenuList.size());
    }
    @Test
    public void testOnPrivacyPolicy(){
        validatePrivacyPolicy();
    }
    @Test
    public void testOnPrivacyPolicyValueEnabled(){
        validatePrivacyPolicy();
    }
    @Test
    public void testOnPageDocumentation(){
        validatePageDocumentation();
    }
    @Test
    public void testOnFooterTurner(){
        validateFooterTurner();
    }
    @Test
    public void testOnLinkedText(){
        validateLinkTextSports();
    }
    @Test
    public void testOnFooterLinktext(){
        validateLinkedtext();
    }
}
