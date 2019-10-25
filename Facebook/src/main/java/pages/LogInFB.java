package pages;

import api.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LogInFB extends CommonAPI {
    @FindBy(xpath = "//div[@class='_6luw']")
    WebElement logo;
    @FindBy(xpath = "//div[@class='_8esn']//div[2]")
    WebElement emailField;
    @FindBy(xpath = "//div[@class='_8esn']//div[3]")
    WebElement passField;
    @FindBy(xpath = "//button[@name='login']")
    WebElement loginButton;
    public void validateLogInButton(){
        Assert.assertEquals(loginButton.isDisplayed(),true);
        Assert.assertEquals(loginButton.isEnabled(),true);
        loginButton.click();
    }
    public void typeOnPassField(String password){
        passField.sendKeys(password);
    }
    public void typeOnEmailfield(String value){
        emailField.sendKeys(value);
    }
    public void validateLogInDisplayed(){
        Assert.assertEquals(logo.isDisplayed(),true);
    }
}
