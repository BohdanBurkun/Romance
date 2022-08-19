import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationForm extends BaseActions{
    public RegistrationForm(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void clickJoinButton(){
        driver.findElement(Locators.registrationButton).click();
    }
    public void completeFirstPartOfRegistration(){

        driver.findElement(Locators.textFiledEmail).sendKeys(Data.email);
        driver.findElement(Locators.textFiledPassword).sendKeys(Data.password);
        driver.findElement(Locators.nextButton).click();
    }

    public void completeSecondPartOfRegistration(){
            driver.findElement(Locators.nickName).sendKeys(Data.textNickName);
            driver.findElement(Locators.birthDateDropDownDay).click();
            driver.findElement(Locators.birthDateDay).click();
            driver.findElement(Locators.birthDateDropDownMonth).click();
            driver.findElement(Locators.birthDateMonth).click();
            driver.findElement(Locators.birthDateDropDownYear).click();
            driver.findElement(Locators.birthDateYear).click();
            driver.findElement(Locators.phone).sendKeys(Data.textPhone);
            driver.findElement(Locators.confirmationCheckBox).click();
            driver.findElement(Locators.regionNameAutocomplete).clear();
            driver.findElement(Locators.regionNameAutocomplete).sendKeys(Data.city);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.selectedCapitalOfUkraine)));
            driver.findElement(Locators.selectedCapitalOfUkraine).click();
    }


}
