package pages;

import api.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LogOut extends CommonAPI {
    @FindBy(xpath = "//div[@id='userNavigationLabel']")
    WebElement navigationLevel;
    @FindBy(xpath = "//span[contains(text(),'Log Out')]")
    WebElement logOutButton;
    public void setNavigationLevel(){
        Assert.assertEquals(navigationLevel.isDisplayed(),true);
        Assert.assertEquals(navigationLevel.isEnabled(),true);
        navigationLevel.click();
    }
    public void setLogOutButton(){
        Assert.assertEquals(logOutButton.isDisplayed(),true);
        Assert.assertEquals(logOutButton.isEnabled(),true);
        logOutButton.click();
    }
}
