package testClasses;

import api.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MyProfile;

public class MyProfileTestCases extends CommonAPI {
    MyProfile myProfile;
    @BeforeMethod
    public void setMyProfile(){
        myProfile= PageFactory.initElements(driver,MyProfile.class);
    }
    @Test
    public void testOnIdName(){
        myProfile.setIdName();
    }
    @Test
    public void testOnAboutButton(){
        myProfile.setAboutButton();
    }
    @Test
    public void testOnActivityLog(){
        myProfile.setActivityLog();
    }
    @Test
    public void testOnTimeLine(){
        myProfile.setTimeline();
    }
    @Test
    public void testCoverImageContainer(){
        myProfile.setCoverImageContainer();
    }
}
