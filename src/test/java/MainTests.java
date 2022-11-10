import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;
import java.util.List;

public class MainTests extends BaseUI {
    @Test
    public void registrationTests() {
        mainPage.clickJoinButton();
        registrationForm.completeFirstPartOfRegistration();
        registrationForm.completeSecondPartOfRegistration();
    }

    @Test
    public void testIframe() {
        mainPage.switchToYoutubeFrame();
        mainPage.clickPlayYoutube();

    }

    @Test
    public void testGalleryLink() {
        mainPage.clickGalleryLink();
    }

    @Test
    public void testFooter() {
        mainPage.jsScroll(Locators.PHONE_LINK);
        mainPage.jsClick(Locators.PHONE_LINK);
    }


    @Test
    public void testMainTabs() {
        List<WebElement> tabs = driver.findElements(Locators.TABS_LINK);
        String expectedSearchTitle = "Single Ukrainian women online";
        String expectedSearchUrl = "/users/search";
        String searchPageName = "PRETTY WOMEN";
        String actualTitle = null;
        for (int i = 1; i <= tabs.size(); i++) {
            if (tabs.get(i).isDisplayed()) {
                String nameOfTab = tabs.get(i).getText();
                tabs.get(i).click();
                String currentUrl = driver.getCurrentUrl();
                if (!nameOfTab.contains("GIFTS")) {
                    actualTitle = driver.findElement(By.xpath("//h1")).getText();
                }
                if (nameOfTab.contains(searchPageName)) {
//                    if (!currentUrl.contains(expectedSearchUrl)) {
//                        Assert.fail();
//                    }
                    Assert.assertTrue(actualTitle.contains(expectedSearchTitle), "Title is different: " + actualTitle);
                    Assert.assertTrue(currentUrl.contains(expectedSearchUrl), "Url is different: " + currentUrl);
                }


//            Assert.assertTrue(driver.findElement(By.xpath("//h1"))
//                    .isEnabled(), "This page" + nameOfTab + "doesn`t have title");
                driver.navigate().back();
                tabs = driver.findElements(Locators.TABS_LINK);
            }

        }

    }


}
