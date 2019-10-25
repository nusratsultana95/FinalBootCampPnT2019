package pages;

import api.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Stories extends CommonAPI {
    @FindBy(xpath = "//span[@class='_2ms2']")
    WebElement stories;
    @FindBy(xpath = "//a[@class='_7jbn']")
    WebElement seeAll;
    @FindBy(xpath = "//div[@class='_4vc1 _2j7a']")
    WebElement font;
    @FindBy(xpath = "//span[contains(text(),'Friends except...')]")
    WebElement privacyControl;
    public void setPrivacyControl(){
        Assert.assertEquals(privacyControl.isDisplayed(),true);
        Assert.assertEquals(privacyControl.isEnabled(),true);
    }
    public void setFont(){
        Assert.assertEquals(font.isDisplayed(),true);
        Assert.assertEquals(font.isEnabled(),true);
        font.click();
    }
    public void setSeeAll(){
        Assert.assertEquals(seeAll.isDisplayed(),true);
        Assert.assertEquals(seeAll.isEnabled(),true);
        seeAll.click();
    }
    public void setStories(){
        Assert.assertEquals(stories.isDisplayed(),true);
        stories.click();
    }
}
