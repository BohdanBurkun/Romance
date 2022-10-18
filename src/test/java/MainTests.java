import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;

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




}
