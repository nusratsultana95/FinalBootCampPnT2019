package testClasses;

import api.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.NewsFeed;

public class NewsFeedTest extends CommonAPI {
    NewsFeed newsFeed;

    @BeforeMethod
    public void setNewsFeed() {
        newsFeed = PageFactory.initElements(driver, NewsFeed.class);
    }
    @Test
    public void testNewsFeedButton() {
        newsFeed.setNewsFeedButton();
    }
    @Test
    public void testSavedButton() {
        newsFeed.setSaved();
    }
    @Test
    public void testExplore() {
        newsFeed.setExplore();
    }
    @Test
    public void testPages(){
        newsFeed.setPages();
    }
    @Test
    public void testGroups(){
        newsFeed.setGroups();
    }
    @Test
    public void testSeeMoreButton(){
        newsFeed.setSeeMoreButton();
    }
    @Test
    public void tetPostArea(){
        newsFeed.setPostArea();
    }
}
