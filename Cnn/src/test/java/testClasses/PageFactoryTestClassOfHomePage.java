package testClasses;

import api.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PageFactoryOfHomePage;

public class PageFactoryTestClassOfHomePage extends CommonAPI {
    PageFactoryOfHomePage pageFactoryOfHomePage;
    @BeforeMethod
    public void setPageFactoryOfHomePage(){
        pageFactoryOfHomePage=PageFactory.initElements(driver, PageFactoryOfHomePage.class);
    }
    @Test
    public void testOnMenuIcon(){
        pageFactoryOfHomePage.validateMenuIcon();
    }
    @Test
    public void testOnWorldButton(){
        pageFactoryOfHomePage.validateWorldButton2();
    }
    @Test
    public void testOnStyleSection(){
        pageFactoryOfHomePage.validateStyleSection();
    }
    @Test
    public void testOnPoliticssection(){
        pageFactoryOfHomePage.validatePolitics();
    }
}
