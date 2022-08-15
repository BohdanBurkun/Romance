import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;

public class MainTests extends BaseUI {
    By registrationButton = By.cssSelector("button[id='show-registration-block']");
    By textFiledEmail = By.xpath("//input[@id='email']");
    By textFiledPassword = By.cssSelector("input[id='password']");
    By nextButton = By.xpath("//button[@data-action='next-page'][text()='Next']");
    By nickName = By.xpath("//input[@name='data[nickname]']");
    By birthDateDropDownDay = By.xpath("//div[@id='daySelect']");
    By birthDateDay = By.xpath("//ul[@class='dropdown-menu show']//a[@data-value='17']");
    By birthDateDropDownMonth = By.xpath("//div[@id='monthSelect']");
    By birthDateMonth = By.xpath("//ul[@class='dropdown-menu show']//a[text()='Mar']");
    By birthDateDropDownYear = By.xpath("//div[@id='yearSelect']");
    By birthDateYear = By.xpath("//ul[@class='dropdown-menu show']//a[text()='1998']");
    By phone = By.xpath("//input[@name='data[phone]']");
    By confirmationCheckBox = By.xpath("//input[@id='confirmation']");
    By regionNameAutocomplete = By.xpath("//input[@name='region_name']");
    By selectedCapitalOfUkraine = By.xpath("//li[text()='Lozova, Ukraine']");
    By youtubeFrameLocator  = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    By playYoutubeButton = By.xpath("//button[@aria-label='Смотреть']");



    String email = "zzzzzz@gmail.com";
    String password = "123456";
    String textNickName = "Bohdan";
    String textPhone = "+380123456798";
    String city = "Lozova";


    @Test
    public void registrationTests(){
        driver.findElement(registrationButton).click();
        driver.findElement(textFiledEmail).sendKeys(email);
        driver.findElement(textFiledPassword).sendKeys(password);
        driver.findElement(nextButton).click();
        driver.findElement(nickName).sendKeys(textNickName);
        driver.findElement(birthDateDropDownDay).click();
        driver.findElement(birthDateDay).click();
        driver.findElement(birthDateDropDownMonth).click();
        driver.findElement(birthDateMonth).click();
        driver.findElement(birthDateDropDownYear).click();
        driver.findElement(birthDateYear).click();
        driver.findElement(phone).sendKeys(textPhone);
        driver.findElement(confirmationCheckBox).click();
        driver.findElement(regionNameAutocomplete).clear();
        driver.findElement(regionNameAutocomplete).sendKeys(city);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(selectedCapitalOfUkraine)));
        driver.findElement(selectedCapitalOfUkraine).click();
    }

    @Test
    public void testIframe(){
        WebElement youtubeIframe = driver.findElement(youtubeFrameLocator);
        driver.switchTo().frame(youtubeIframe);
        driver.findElement(playYoutubeButton).click();
    }

}
