package navigation;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DynamicallyLoadedPage;

public class NavigationTest extends BaseTest {
    @Test
    public void testNavigation() {
        DynamicallyLoadedPage dynamicallyLoadedPage = homePage.clickDynamicallyLoaded();
        DynamicallyLoadedPage.Example1Page example1Page = dynamicallyLoadedPage.clickExample1();

        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForward();
        getWindowManager().goTo("https://tut.by");
    }
    @Test
    public void testSwitchToTab(){
        homePage.clickMultipleWindows().setClickHereLink();
        getWindowManager().switchToTab("New Window");
    }
}
