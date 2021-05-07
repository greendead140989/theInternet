package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By range = By.id("range");
    private By horizontalSlider = By.cssSelector("#content > div > div > input[type=range]");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

  /*  public void clickSlider() {
        driver.findElement(horizontalSlider).click();
    }*/
/////обавить сдвиг
    public void moveRightHorizontalSlider() {
        for (int i = 0; i < 8; i++) {
            driver.findElement(horizontalSlider).sendKeys(Keys.RIGHT);
        }
    }

    public String getRange() {
        return driver.findElement(range).getText();
    }
}
