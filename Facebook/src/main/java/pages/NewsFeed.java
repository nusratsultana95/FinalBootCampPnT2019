package pages;

import api.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class NewsFeed extends CommonAPI {
    @FindBy(xpath = "//div[contains(text(),'News Feed')]")
    WebElement newsFeedButton;
    @FindBy(xpath = "//textarea[@id='js_1b']")
    WebElement postArea;
    @FindBy(xpath = "//div[@id='appsNav']")
    WebElement explore;
    @FindBy(xpath = "//li[@id='navItem_1434659290104689']//div[@class='linkWrap noCount'][contains(text(),'Groups')]")
    WebElement groups;
    @FindBy(xpath = "//div[contains(text(),'Saved')]")
    WebElement saved;
    @FindBy(xpath = "//div[@class='linkWrap hasCount'][contains(text(),'Pages')]")
    WebElement pages;
    @FindBy(xpath = "//div[@class='linkWrap hasCount'][contains(text(),'Pages')]")
    WebElement seeMoreButton;
    public void setNewsFeedButton(){
        Assert.assertEquals(newsFeedButton.isDisplayed(),true);
        Assert.assertEquals(newsFeedButton.isEnabled(),true);
        newsFeedButton.click();
    }
    public void setPostArea(){
        postArea.sendKeys("Nice Weather!!");
    }
    public void setGroups(){
        Assert.assertEquals(groups.isDisplayed(),true);
        Assert.assertEquals(groups.isEnabled(),true);
        groups.click();
    }
    public void setSaved(){
        Assert.assertEquals(saved.isDisplayed(),true);
        Assert.assertEquals(saved.isEnabled(),true);
        saved.click();
    }
    public void setPages(){
        Assert.assertEquals(pages.isDisplayed(),true);
        Assert.assertEquals(pages.isEnabled(),true);
        pages.click();
    }
    public void setSeeMoreButton(){
        Assert.assertEquals(seeMoreButton.isDisplayed(),true);
        Assert.assertEquals(seeMoreButton.isEnabled(),true);
        seeMoreButton.click();
    }
    public void setExplore(){
        Assert.assertEquals(explore.isDisplayed(),true);
    }

}
