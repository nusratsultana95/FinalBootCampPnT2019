package pages;

import api.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MyProfile extends CommonAPI {
    @FindBy(xpath = "//a[@class='_2nlw _2nlv']")
    WebElement idName;
    @FindBy(xpath = "//a[contains(text(),'About')]")
    WebElement aboutButton;
    @FindBy(xpath = "//a[@class='_42ft _4jy0 _4jy4 _517h _51sy']")
    WebElement activityLog;
    @FindBy(xpath = "//a[@id='u_fetchstream_10_b']")
    WebElement timeline;
    @FindBy(xpath = "//div[@id='fbCoverImageContainer']")
    WebElement coverImageContainer;
    public void setIdName(){
        driver.navigate().to("https://www.facebook.com/profile.php?id=000928090838519");
        Assert.assertEquals(idName.isDisplayed(),true);
        Assert.assertEquals(idName.isEnabled(),true);
        idName.click();
    }
    public void setAboutButton(){
        Assert.assertEquals(aboutButton.isDisplayed(),true);
        Assert.assertEquals(aboutButton.isEnabled(),true);
        aboutButton.click();
    }
    public void setCoverImageContainer(){
        Assert.assertEquals(coverImageContainer.isEnabled(),true);
        Assert.assertEquals(coverImageContainer.isDisplayed(),true);
        coverImageContainer.click();
    }
    public void setActivityLog(){
        activityLog.click();
    }
    public void setTimeline(){
        timeline.click();
    }
}
