package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {

    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack() {
        navigate.back();
    }

    public void goForward() {
        navigate.forward();
    }

    public void refresh() {
        navigate.refresh();
    }

    public void goTo(String url) {
        navigate.to(url);
    }

    public void switchToTab(String tabTitle) {
        Set<String> windwows = driver.getWindowHandles();
        System.out.println("Number of tabs: " + windwows.size());
        System.out.println("Tabs titles ");
        windwows.forEach(System.out::println);
        for (String window : windwows) {
            System.out.println("Switching to tab " + window);
            driver.switchTo().window(window);
            System.out.println("Tab title is " + driver.getTitle());
            if (tabTitle.equals(driver.getTitle())) {
                break;
            }
        }
    }
}
