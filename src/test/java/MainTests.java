import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;

public class MainTests extends BaseUI {


    By registrationButton = By.cssSelector("button[id='show-registration-block']");
    By textFiledEmail = By.xpath("//input[@id='email']");
    By textFiledPassword = By.cssSelector("input[id='password']");
    By nextButton = By.xpath("//button[@data-action='next-page'][text()='Next']");
    By nickName = By.xpath("//input[@name='data[nickname]']");
    By birthDateDropDownDay = By.xpath("//a[@data-toggle='dropdown']");
    By birthDateDay = By.xpath("//li[@data-handler='selectDay']");
    By birthDateDropDownMonth = By.xpath("//a[@data-toggle='dropdown']");
    By birthDateMonth = By.xpath("//li[@data-handler='selectMonth']");
    By birthDateDropDownYear = By.xpath("//a[@data-toggle='dropdown']");
    By birthDateYear = By.xpath("//li[@data-handler='selectYear']");
    By phone = By.xpath("//input[@name='data[phone]']");
    By region = By.xpath("//input[@name='region_name']");


    String email = "zzzzzz@gmail.com";
    String password = "123456";
    String textNickName = "Bohdan";
    String textPhone = "+380123456798";
    String textRegion = "Lozova";


    @Test
    public void registrationTests(){
        driver.findElement(registrationButton).click();
        driver.findElement(textFiledEmail).sendKeys(email);
        driver.findElement(textFiledPassword).sendKeys(password);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(nextButton).click();
        driver.findElement(nickName).sendKeys(textNickName);
        driver.findElements(birthDateDropDownDay).get(0).click();
        driver.findElements(birthDateDay).get(1).click();
        driver.findElements(birthDateDropDownMonth).get(1).click();
        driver.findElements(birthDateMonth).get(3).click();
        driver.findElements(birthDateDropDownYear).get(2).click();
        driver.findElements(birthDateYear).get(7).click();
            wait.until(ExpectedConditions.elementToBeClickable(phone));
        driver.findElement(phone).sendKeys(textPhone);
        driver.findElement(region).sendKeys(textRegion);

    }

}
