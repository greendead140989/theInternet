package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;

    private String linktext = "Nested Frames";

    public FramesPage(WebDriver driver) {

        this.driver = driver;
    }

    public NestedFramesPage clickNestedFrames() {
        driver.findElement(By.linkText(linktext)).click();
        return new NestedFramesPage(driver);
    }

    public class NestedFramesPage {
        private WebDriver driver;

        public NestedFramesPage(WebDriver driver) {
            this.driver = driver;
        }

    }
}
