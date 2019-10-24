package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * this class is representing WorldSection.I have created obj of HomePage class & brought
 * a method from that class which is neccessary to get proper result of this class.
 * & i have used List to store all the page header element of world section.
 */

public class WorldSection extends CommonAPI {
  HomePage homePage = new HomePage();
  public void detailedElementOfWorldSection(String locatorOfWorldPageHeaderCollection){
      homePage.validateWorldButton();
     getTextByXpath(locatorOfWorldPageHeaderCollection);
  }
  public List<WebElement> getPageHeaderOfWorldPage(){
      return driver.findElements(By.xpath("//*[contains(@class,'nav-linksstyles__NavLink-sc-1tike8v-1 fxRQgN')]"));
  }

}
