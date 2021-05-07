package horizontalSlider;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class HorizontalSliderTests extends BaseTest {
    @Test
    public void testHorizontalSlider() {
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSlide();
        /*horizontalSliderPage.clickSlider();*/
        horizontalSliderPage.moveRightHorizontalSlider();
        Assert.assertEquals(horizontalSliderPage.getRange(), "4", "Wrong range");
    }
}
