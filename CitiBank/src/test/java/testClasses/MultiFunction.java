package testClasses;

import api.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultiFunction extends CommonAPI {
    @Test
    public void testDropDown() {
        WebElement element = elementByXpath("//a[@id='banking']");
        Select select = new Select(element);
        select.selectByIndex(3);
        sleepFor(5);
    }
   @Test
    public void testMouseHover() {
        WebElement element = elementByLinkedText("Careers");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        clickOnElementByLinkedText("Rewards");
        sleepFor(5);
    }
   @Test
    public void scrollToView() {
        WebElement element = elementByLinkedText("Citi Priority");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        sleepFor(10);
    }
  @Test
    public void testScrolling() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,1000)");
        sleepFor(10);
    }
}
