package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By inputEmail = By.id("email");
    private By buttonRetrievePassword = By.id("form_submit");
    private By openLink = By.cssSelector("body > h1");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterEmail(String email){
        driver.findElement(inputEmail).sendKeys(email);
    }
    public void clickButtonRetrievePassword(){
        driver.findElement(buttonRetrievePassword).click();
    }
    public String getTitle() {
        return driver.findElement(openLink).getText();
    }

}
