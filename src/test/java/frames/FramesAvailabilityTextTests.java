package frames;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FramesPage;

public class FramesAvailabilityTextTests extends BaseTest {
    @Test
    public void testAvailabilityText(){
        FramesPage framesPage=homePage.clickFramesPage();
       FramesPage.NestedFramesPage nestedFramesPage=framesPage.clickNestedFrames();
    }
}
