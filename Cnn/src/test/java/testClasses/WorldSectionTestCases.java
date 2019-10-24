package testClasses;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.WorldSection;

import java.util.List;

/**
 * this class is using to implement all the methods from WorldSection class
 */
public class WorldSectionTestCases extends WorldSection {
    @Test
    public void worldSectionPageTest(){
       detailedElementOfWorldSection("//div[@class='Cell-i0zvfi-0 headerstyles__NavBarContent-sc-1vh4dor-4 gcRmuT']");
       List<WebElement> worldElementList=getPageHeaderOfWorldPage();
        System.out.println(worldElementList.size());
        for(int j=0;j<worldElementList.size();j++){
            System.out.println(worldElementList.get(j).getText());
        }
    }
}
