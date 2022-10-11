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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C727 ÖDeme seti silme
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 11:28:47 GMT 2022.
 */
@DisplayName("C727 ÖDeme seti silme")
public class C727 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C727 ÖDeme seti silme")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
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

    // 2. Move mouse to 'moveToSiteYönetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='config']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 3. Click 'SİTE YÖNETİMİ'
    GeneratedUtils.sleep(500);
    by = By.cssSelector(".config > a");
    driver.findElement(by).click();

    // 4. Move mouse to 'ddPosAyarlari'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[@title='POS AYARLARI']/..//img");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 5. Click 'ÖDEME SETLERİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'ÖDEME SETLERİ']");
    driver.findElement(by).click();

    // 6. Is 'Refresh' visible?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();

    // 7. Click 'next1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = 'next']");
    driver.findElement(by).click();

    // 8. Is 'Refresh' visible?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();

    // 9. Click 'next1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = 'next']");
    driver.findElement(by).click();

    // 10. Is 'Otomasyon (Silinecek) Güncelle' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='Otomasyon (Silinecek)']/..//a[@title='Güncelle']//img");
    driver.findElement(by).isDisplayed();

    // 11. Click 'Otomasyon (Silinecek) Sil'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='Otomasyon (Silinecek)']/..//a[@title='Sil']//img");
    driver.findElement(by).click();

    // 12. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 13. Is 'Refresh' visible?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();

    // 14. Is 'Otomasyon (Silinecek) Güncelle' not present or invisible?
    by = By.xpath("//td[text()='Otomasyon (Silinecek)']/..//a[@title='Güncelle']//img");
    (new WebDriverWait(driver, 0)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));

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
