package testClasses;

import org.testng.annotations.Test;
import pages.HomePage;

/**
 * this class is implementing all the methods from HomePage Class
 */
public class HomePageTestCases extends HomePage {
    @Test(enabled = false)
    public void headerContent(){
        isElementDisplayed("//div[@class='Cell-i0zvfi-0 headerstyles__NavBarContent-sc-1vh4dor-4 gcRmuT']");
    }
    @Test(enabled = false)
    public void validateSearch(){
        clickOnSearchButton();
        typeOnSearchBar("News Today");
        clickOnSearch();
        validateSearchPageDisplayed();
        sleepFor(3);
    }
    @Test(enabled = false)
    public void testOnEditionButton(){
        validateEditionButton();
    }
    @Test(enabled = false)
    public void testOnWorldButton(){
        validateWorldButton();
    }
    @Test(enabled = false)
    public void testOnBusinessButton(){
        validateBusinessButton();
    }
    @Test(enabled = false)
    public void testOnTrending(){
        validateTrending();
    }
    @Test(enabled = false)
    public void testOnMenuIcon(){
        menuIcon();
    }
    @Test(enabled = false)
    public void testOnLiveTV(){
        validateLiveTv();
    }
    @Test
    public void testOntechLocator(){
        validateTechLocator();
    }
    @Test
    public void testOnScienceAndTest(){
        validateScienceAndHealth();
    }
    @Test
    public void testOnVideo(){
        validateVideo();
    }
}
