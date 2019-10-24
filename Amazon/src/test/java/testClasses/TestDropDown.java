package testClasses;

import api.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestDropDown extends CommonAPI {
    @Test(enabled = false)
    public void testDropDown(){
        WebElement elementOfDropDown= elementByXpath("//select[@id='gh-cat']");
        Select select = new Select(elementOfDropDown);
        select.selectByIndex(6);
    }
}
