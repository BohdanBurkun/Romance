import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseActions {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public  BaseActions(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    public void mouseClick(By locator){
        WebElement element = driver.findElement(locator);
        new Actions(driver)
                .moveToElement(element)
                .click()
                .perform();

    }
    public void mouseScroll(By locator){
        WebElement element = driver.findElement(locator);
        new Actions(driver)
                .scrollToElement(element)
                .perform();

    }

    public void jsClick(By locator){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement element = driver.findElement(locator);
        js.executeScript("arguments[0].click();", element);
    }

    public void jsScrollDown(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,600)");
    }
    public void jsScroll(By locator){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement element = driver.findElement(locator);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
}
