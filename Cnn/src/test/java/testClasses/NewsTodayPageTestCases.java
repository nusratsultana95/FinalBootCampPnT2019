package testClasses;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.NewsTodayPage;

import java.util.List;

/**
 * implementing NewsTodayPage methods
 */
public class NewsTodayPageTestCases extends NewsTodayPage {
    @Test
    public void testDropDown() {
        List<WebElement> faceList =getAllElementFromList();
        System.out.println(faceList.size());
        for (int i = 0; i < faceList.size(); i++) {
            System.out.println(faceList.get(i).getText());
        }
    }
}
