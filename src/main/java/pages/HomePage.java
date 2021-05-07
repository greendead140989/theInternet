package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement clickLink(String linktext) {
        return driver.findElement(By.linkText(linktext));
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication").click();
        return new LoginPage(driver);
    }

    public ShiftingContentPage clickShiftingContent() {
        clickLink("Shifting Content").click();
        return new ShiftingContentPage(driver);
    }

    public DropDownPage clickDropDown() {
        clickLink("Dropdown").click();
        return new DropDownPage(driver);
    }

    public HoversPage clickHovers() {
        clickLink("Hovers").click();
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses() {
        clickLink("Key Presses").click();
        return new KeyPressesPage(driver);
    }

    public JavaScriptAlertsPage clickJavaScriptAlerts() {
        clickLink("JavaScript Alerts").click();
        return new JavaScriptAlertsPage(driver);
    }

    public FileUploadPage clickFileUploader() {
        clickLink("File Upload").click();
        return new FileUploadPage(driver);
    }

    public EntryAdPage clickEntryAd() {
        clickLink("Entry Ad").click();
        return new EntryAdPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword() {
        clickLink("Forgot Password").click();
        return new ForgotPasswordPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlide() {
        clickLink("Horizontal Slider").click();
        return new HorizontalSliderPage(driver);
    }

    public WYSIWYGEditorPage clickWYSIWYGEditor() {
        clickLink("WYSIWYG Editor").click();
        return new WYSIWYGEditorPage(driver);
    }

    public DynamicallyLoadedPage clickDynamicallyLoaded() {
        clickLink("Dynamic Loading").click();
        return new DynamicallyLoadedPage(driver);
    }

    public LargeAndDeepDOMPage clickLargeAndDeepDOM() {
        clickLink("Large & Deep DOM").click();
        return new LargeAndDeepDOMPage(driver);
    }
    public FramesPage clickFramesPage() {
        clickLink("Frames").click();
        return new FramesPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll() {
        clickLink("Infinite Scroll").click();
        return new InfiniteScrollPage(driver);
    }
    public MultipleWindowsPage clickMultipleWindows() {
        clickLink("Multiple Windows").click();
        return new MultipleWindowsPage(driver);
    }
    //Presentof
}
