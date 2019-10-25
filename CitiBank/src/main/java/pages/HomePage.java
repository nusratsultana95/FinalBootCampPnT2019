package pages;

import api.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends CommonAPI {
    @FindBy(xpath = "//a[@class='active']")
    WebElement featured;
    @FindBy(xpath = "//a[contains(text(),'Rewards')]")
    WebElement rewards;
    @FindBy(xpath = "//a[contains(text(),'Travel')]")
    WebElement travel;
    @FindBy(xpath = "//a[contains(text(),'Cash Back')]")
    WebElement cashBack;
    @FindBy(xpath = "//a[contains(text(),'Low Intro APR')]")
    WebElement APR;
    @FindBy(xpath = "//a[contains(text(),'Business')]")
    WebElement business;
    public void setFeatured(){
        Assert.assertEquals(featured.isDisplayed(),true);
        Assert.assertEquals(featured.isEnabled(),true);
        featured.click();
    }
    public void setRewards(){
        Assert.assertEquals(rewards.isDisplayed(),true);
        Assert.assertEquals(rewards.isEnabled(),true);
        rewards.click();
    }
    public void setTravel(){
        Assert.assertEquals(travel.isDisplayed(),true);
        Assert.assertEquals(travel.isEnabled(),true);
        travel.click();
    }
    public void setCashBack(){
        Assert.assertEquals(cashBack.isDisplayed(),true);
        Assert.assertEquals(cashBack.isEnabled(),true);
        cashBack.click();
    }
    public void setAPR(){
        Assert.assertEquals(APR.isDisplayed(),true);
        Assert.assertEquals(APR.isEnabled(),true);
        APR.click();
    }
    public void setBusiness(){
        Assert.assertEquals(business.isDisplayed(),true);
        Assert.assertEquals(business.isEnabled(),true);
        business.click();
    }

}

