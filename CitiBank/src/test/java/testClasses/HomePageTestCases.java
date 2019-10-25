package testClasses;

import api.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTestCases extends CommonAPI {
   HomePage homePage;
   @BeforeMethod
    public void setHomePage(){
       homePage= PageFactory.initElements(driver,HomePage.class);
   }
   @Test
    public void testOnFeatures(){
       homePage.setFeatured();
   }
   @Test
    public void testOnRewards(){
       homePage.setRewards();
   }
   @Test
    public void testOnTravel(){
       homePage.setTravel();
   }
   @Test
    public void testOnCashBack(){
       homePage.setCashBack();
   }
   @Test
    public void testOnAPR(){
       homePage.setAPR();
   }
   @Test
    public void testOnBusiness(){
       homePage.setBusiness();
   }
}
