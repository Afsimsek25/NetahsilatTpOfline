package netahsilat;

import io.testproject.addon.NetahsilatUtills;
import io.testproject.addon.VisibleElementsOperations;
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
 * Test: C646 Kapalı Saatler Sekmesi
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Thu Oct 06 12:43:26 GMT 2022.
 */
@DisplayName("C646 Kapalı Saatler Sekmesi")
public class C646 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C646 Kapalı Saatler Sekmesi")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    NetahsilatUtills.ClickUntilGone clickUntilGone;
    VisibleElementsOperations.ClickIfVisibleWeb clickIfVisibleWeb;

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

    // 3. Click 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    driver.findElement(by).click();

    // 4. Click 'altUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 5. Type '47304764870' in 'SearchVendorName'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("47304764870");

    // 6. Click 'Kapalı Saatler, 47304764870'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[contains(text(),',47304764870')]");
    driver.findElement(by).click();

    // 7. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 8. Is 'KapaliSaatler01' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//tr[1]//td[. = 'KapaliSaatler01']");
    driver.findElement(by).isDisplayed();

    // 9. Click 'EditButton'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='fugue/edit.png']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 10. Click 'KapalıSaatlerImage'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='closed-hours.png']");
    driver.findElement(by).click();

    // 11. Click 'Tüm Gün Kapalı (Değiştirmeyiniz)' if it's visible
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.xpath("//label[normalize-space()='Tüm Gün Kapalı (Değiştirmeyiniz)']/input[@name='SelectedInactiveHours']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 12. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 13. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = "c646@kapali.saatler";
    methodlogoutlogin.password = password;
    methodlogoutlogin.execute(driver);

    // 14. Is 'Ödeme işlemi yapılamaz' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//h1[. = 'Ödeme işlemi yapılamaz']");
    driver.findElement(by).isDisplayed();

    // 15. Is '17.12.2021 10:00 - 20.10.2030 10:00 tarihleri arası' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//p[. = '17.12.2021 10:00 - 20.10.2030 10:00 tarihleri arası']");
    driver.findElement(by).isDisplayed();

    // 16. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = userName;
    methodlogoutlogin.password = password;
    methodlogoutlogin.execute(driver);

    // 17. Move mouse to 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 18. Click 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    driver.findElement(by).click();

    // 19. Click 'altUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 20. Type '47304764870' in 'SearchVendorName'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("47304764870");

    // 21. Click 'Kapalı Saatler, 47304764870'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[contains(text(),',47304764870')]");
    driver.findElement(by).click();

    // 22. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 23. Is 'KapaliSaatler01' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//tr[1]//td[. = 'KapaliSaatler01']");
    driver.findElement(by).isDisplayed();

    // 24. Click 'EditButton'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='fugue/edit.png']");
    driver.findElement(by).click();

    // 25. Click 'KapalıSaatlerImage'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='closed-hours.png']");
    driver.findElement(by).click();

    // 26. Click 'Tüm Gün Kapalı (Değiştirmeyiniz)'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[normalize-space()='Tüm Gün Kapalı (Değiştirmeyiniz)']/input[@name='SelectedInactiveHours']");
    driver.findElement(by).click();

    // 27. Run Click Until Gone
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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","Kd!cyhz4"));
  }
}
