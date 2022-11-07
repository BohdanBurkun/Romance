import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;
import java.util.List;

public class MainTests extends BaseUI {
    @Test
    public void registrationTests(){
        mainPage.clickJoinButton();
        registrationForm.completeFirstPartOfRegistration();
        registrationForm.completeSecondPartOfRegistration();
    }
    @Test
    public void testIframe(){
        mainPage.switchToYoutubeFrame();
        mainPage.clickPlayYoutube();

    }
    @Test
    public void testGalleryLink(){
        mainPage.clickGalleryLink();
    }

    @Test
    public void testFooter(){
        mainPage.jsScroll(Locators.PHONE_LINK);
        mainPage.jsClick(Locators.PHONE_LINK);
    }

    @Test
    public void testMainTabs() {
        List<WebElement> tabs = driver.findElements(Locators.TABS_LINK);
        for (int i = 0; i <= tabs.size(); i++) {
            String text = tabs.get(i).getText();
            tabs.get(i).click();
            System.out.println(text);
            driver.navigate().back();
            tabs = driver.findElements(Locators.TABS_LINK);

        }
    }




}
