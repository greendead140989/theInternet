package javaScript;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;
import pages.LargeAndDeepDOMPage;

public class JavaScriptTests extends BaseTest {
    @Test
    public void testJS() {
        LargeAndDeepDOMPage largeEndDeepDOMPage = homePage.clickLargeAndDeepDOM();
        largeEndDeepDOMPage.scrollToTable();
    }

    @Test
    public void testScrollToParagraph() {
        InfiniteScrollPage infiniteScrollPage=homePage.clickInfiniteScroll();
        infiniteScrollPage.scrollToParagraph(5);
    }
}
