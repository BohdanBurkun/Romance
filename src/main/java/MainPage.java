import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BaseActions{
    public  MainPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void clickJoinButton(){
        driver.findElement(Locators.registrationButton).click();
    }


    public void switchToYoutubeFrame(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement youtubeIframe = driver.findElement(Locators.youtubeFrameLocator);
        driver.switchTo().frame(youtubeIframe);

    }
    public void clickPlayYoutube(){
        driver.findElement(Locators.playYoutubeButton).click();
    }


}
