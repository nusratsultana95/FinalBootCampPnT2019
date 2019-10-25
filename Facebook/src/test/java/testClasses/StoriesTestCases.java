package testClasses;

import api.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Stories;

public class StoriesTestCases extends CommonAPI{
    Stories stories;
    @BeforeMethod
    public void setStories(){
        stories= PageFactory.initElements(driver,Stories.class);
    }
    @Test
    public void testPrivacyControll(){
        stories.setPrivacyControl();
    }
    @Test
    public void testFont(){
        stories.setFont();
    }
    @Test
    public void testSeeAll(){
        stories.setSeeAll();
    }
    @Test
    public void testStories(){
        stories.setStories();
    }
}
