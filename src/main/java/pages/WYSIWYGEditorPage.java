package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WYSIWYGEditorPage {

    private WebDriver driver;

    private String frameId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentButton = By.xpath(".//button[@title='Increase indent']");

    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToTextArea() {
        driver.switchTo().frame(frameId);
    }

    public void cleartextArea() {
        switchToTextArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void switchToMainArea() {
        driver.switchTo().parentFrame();
    }

    public void sendTextToTextArea(String text) {
        switchToTextArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void increseIndent() {
        driver.findElement(increaseIndentButton).click();
    }

    public String getTextAreaContent() {
        switchToTextArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }
}
