package wait;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicallyLoadedPage;

public class WaitTests extends BaseTest {

    @Test
    public void testWaits(){
        DynamicallyLoadedPage dynamicallyLoadedPage=homePage.clickDynamicallyLoaded();
        DynamicallyLoadedPage.Example1Page example1Page= dynamicallyLoadedPage.clickExample1();

        example1Page.clickStartButton();
        Assert.assertEquals(example1Page.getFinishText(),"Hello World!","Wrong finish text");
    }
}
