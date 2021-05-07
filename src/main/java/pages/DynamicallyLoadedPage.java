package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicallyLoadedPage {

    private WebDriver driver;
    private By example1Link = By.linkText("Example 1: Element on page that is hidden");

    public DynamicallyLoadedPage(WebDriver driver) {
        this.driver = driver;
    }

    public Example1Page clickExample1() {
        driver.findElement(example1Link).click();
        return new Example1Page(driver);
    }

    public class Example1Page {

        private WebDriver driver;
        private By startButton = By.cssSelector("#start button");
        private By loadingIndicator = By.id("loading");
        private By finishText = By.id("finish");


        public Example1Page(WebDriver driver) {

            this.driver = driver;
        }

        //Presentof housework

        public void clickStartButton() {
            driver.findElement(startButton).click();
            WebDriverWait wait = new WebDriverWait(driver, 10);
            /*wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));*/
            wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIndicator));
        }
        public String getFinishText() {

            return driver.findElement(finishText).getText();
        }
    }
}
