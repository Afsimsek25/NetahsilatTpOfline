package netahsilat;

import io.testproject.addon.NetahsilatUtills;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.web.RemoteWebDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C635 Haklar Sekmesi
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Thu Oct 06 07:15:43 GMT 2022.
 */
@DisplayName("C635 Haklar Sekmesi")
public class C635 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C635 Haklar Sekmesi")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String randomERP) throws
      Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    NetahsilatUtills.ClickUntilGone clickUntilGone;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Move mouse to 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 3. Click 'ustUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[4]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 4. Click 'altUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 5. Click 'SearchVendorNameVN'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).click();

    // 6. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 7. Type '181212' in 'SearchVendorNameVN'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("181212");

    // 8. Click 'resultListelenen'
    GeneratedUtils.sleep(500);
    by = By.xpath("//body/ul//div");
    driver.findElement(by).click();

    // 9. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 10. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 11. Is 'test bayi' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[contains(text(),'test bayi')] ");
    driver.findElement(by).isDisplayed();

    // 12. Click 'EditButton'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='fugue/edit.png']");
    driver.findElement(by).click();

    // 13. Click 'HaklarImage'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='yetki.png']");
    driver.findElement(by).click();

    // 14. Click 'Alt bayi ekleyebilir'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[normalize-space()='Alt bayi ekleyebilir']/..//span[@class='mark']");
    driver.findElement(by).click();

    // 15. Click 'Müşteri ekleyebilir'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[normalize-space()='Müşteri ekleyebilir']/..//span[@class='mark']");
    driver.findElement(by).click();

    // 16. Click 'Ödeme iptali yapabilir'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[normalize-space()='Ödeme iptali yapabilir']/..//span[@class='mark']");
    driver.findElement(by).click();

    // 17. Click ' Bayi Ödeme Servisini Kullanabilir'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[normalize-space()='Bayi Ödeme Servisini Kullanabilir']/..//span[@class='mark']");
    driver.findElement(by).click();

    // 18. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 19. Click 'EditButton'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='fugue/edit.png']");
    driver.findElement(by).click();

    // 20. Click 'HaklarImage'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='yetki.png']");
    driver.findElement(by).click();

    // 21. Click 'Alt bayi ekleyebilir'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[normalize-space()='Alt bayi ekleyebilir']/..//span[@class='mark']");
    driver.findElement(by).click();

    // 22. Click 'Müşteri ekleyebilir'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[normalize-space()='Müşteri ekleyebilir']/..//span[@class='mark']");
    driver.findElement(by).click();

    // 23. Click 'Ödeme iptali yapabilir'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[normalize-space()='Ödeme iptali yapabilir']/..//span[@class='mark']");
    driver.findElement(by).click();

    // 24. Click ' Bayi Ödeme Servisini Kullanabilir'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[normalize-space()='Bayi Ödeme Servisini Kullanabilir']/..//span[@class='mark']");
    driver.findElement(by).click();

    // 25. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }

  @AfterAll
  static void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  private static Stream provideParameters() throws Exception {
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","","",""));
  }
}
