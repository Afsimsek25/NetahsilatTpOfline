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
 * Test: C1322 Cari hesaplarda çoklu bayi aktif ise varolan hesabı ekleme çalışıyor mu
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Thu Oct 06 08:09:28 GMT 2022.
 */
@DisplayName("C1322 Cari hesaplarda çoklu bayi aktif ise varolan hesabı ekleme çalışıyor mu")
public class C1322 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C1322 Cari hesaplarda çoklu bayi aktif ise varolan hesabı ekleme çalışıyor mu")
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

    // 5. Type '7616248246' in 'SearchVendorNameVN'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("7616248246");

    // 6. Click 'Bireysel Ana Bayi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[contains(text(),'76162482466')]  ");
    driver.findElement(by).click();

    // 7. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 8. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 9. Is 'BireyselAnaBayi' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[. = 'BireyselAnaBayi'][1]");
    driver.findElement(by).isDisplayed();

    // 10. Click 'EditButton'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='fugue/edit.png']");
    driver.findElement(by).click();

    // 11. Click 'btnCariHesaplar'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='Paper-Money-icon.png']");
    driver.findElement(by).click();

    // 12. Type 'halil' in 'erpCodeAutoComplete'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#erpCodeAutoComplete");
    driver.findElement(by).sendKeys("halil");

    // 13. Click 'haliltest12'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ui-id-25");
    driver.findElement(by).click();

    // 14. Click 'Varolan Hesap Ekle'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#btnInsertExistingCurrentAccount");
    driver.findElement(by).click();

    // 15. Click 'Tick Image'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='tick.png']");
    driver.findElement(by).click();

    // 16. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 17. Click 'EditButton'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='fugue/edit.png']");
    driver.findElement(by).click();

    // 18. Click 'btnCariHesaplar'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='Paper-Money-icon.png']");
    driver.findElement(by).click();

    // 19. Click 'Sil Image'
    GeneratedUtils.sleep(500);
    by = By.xpath("//*[@id=\"currentAccountsVendor\"]/tbody/tr[3]/td[1]/div[1]/a[2]/img[contains(@src, 'cross-circle.png')]");
    driver.findElement(by).click();

    // 20. Run Click Until Gone
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
