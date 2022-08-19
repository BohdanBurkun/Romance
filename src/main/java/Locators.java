import org.openqa.selenium.By;

public class Locators {
    //Registration
    public static final By registrationButton = By.cssSelector("button[id='show-registration-block']");
    public static final By textFiledEmail = By.xpath("//input[@id='email']");
    public static final By textFiledPassword = By.cssSelector("input[id='password']");
    public static final By nextButton = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By nickName = By.xpath("//input[@name='data[nickname]']");
    public static final By birthDateDropDownDay = By.xpath("//div[@id='daySelect']");
    public static final By birthDateDay = By.xpath("//ul[@class='dropdown-menu show']//a[@data-value='17']");
    public static final By birthDateDropDownMonth = By.xpath("//div[@id='monthSelect']");
    public static final By birthDateMonth = By.xpath("//ul[@class='dropdown-menu show']//a[text()='Mar']");
    public static final By birthDateDropDownYear = By.xpath("//div[@id='yearSelect']");
    public static final By birthDateYear = By.xpath("//ul[@class='dropdown-menu show']//a[text()='1998']");
    public static final By phone = By.xpath("//input[@name='data[phone]']");
    public static final By confirmationCheckBox = By.xpath("//input[@id='confirmation']");
    public static final By regionNameAutocomplete = By.xpath("//input[@name='region_name']");
    public static final By selectedCapitalOfUkraine = By.xpath("//li[text()='Lozova, Ukraine']");
    public static final By youtubeFrameLocator  = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By playYoutubeButton = By.xpath("//button[@aria-label='Смотреть']");
}
