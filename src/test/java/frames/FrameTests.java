package frames;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WYSIWYGEditorPage;

import java.util.Base64;

public class FrameTests extends BaseTest {
    @Test
    public void testEditor() {

        String text1 = "Hello ";
        String text2 = "world!";

        WYSIWYGEditorPage wysiwygEditorPage = homePage.clickWYSIWYGEditor();
        wysiwygEditorPage.cleartextArea();
        wysiwygEditorPage.sendTextToTextArea(text1);
        wysiwygEditorPage.increseIndent();
        wysiwygEditorPage.sendTextToTextArea(text2);
        Assert.assertEquals(wysiwygEditorPage.getTextAreaContent(),text1+text2,"Wrong text in text area");
    }
}
