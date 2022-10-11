package netahsilat;

import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.web.RemoteWebDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
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
 * Test: C550 İşlem Detayları
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Tue Oct 04 07:28:25 GMT 2022.
 */
@DisplayName("C550 İşlem Detayları")
public class C550 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C550 İşlem Detayları")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String gridHeaders) throws
      Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Move mouse to 'moveToIslemler'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='tag']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 3. Click 'İŞLEMLER1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'İŞLEMLER']");
    driver.findElement(by).click();

    // 4. Click 'ÇEK SENET LİSTESİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'ÇEK SENET LİSTESİ']");
    driver.findElement(by).click();

    // 5. Move mouse to 'ExpiryDateStart'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ExpiryDateStart");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 6. Clear 'ExpiryDateStart' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ExpiryDateStart");
    driver.findElement(by).clear();

    // 7. Move mouse to 'ExpiryDateEnd'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ExpiryDateEnd");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 8. Clear 'ExpiryDateEnd' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ExpiryDateEnd");
    driver.findElement(by).clear();

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

    // 11. Click 'islemDetaylariCekSenet'
    GeneratedUtils.sleep(500);
    by = By.xpath("//tr/td[1]//img");
    driver.findElement(by).click();

    // 12. Does 'İşlem Detayları' contain 'İşlem Detayları'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//h1[. = 'İşlem Detayları']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("İşlem Detayları"));

    // 13. Does 'Belge Numarası' contain 'Belge Numarası'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Belge Numarası']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Belge Numarası"));

    // 14. Does 'Hesap No' contain 'Hesap No'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Hesap No']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Hesap No"));

    // 15. Does 'Tutar2' contain 'Tutar'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Tutar']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Tutar"));

    // 16. Does 'Ödeme Tipi' contain 'Ödeme Tipi'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td//label[. = 'Ödeme Tipi']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Ödeme Tipi"));

    // 17. Does 'İşlem Tarihi2' contain 'İşlem Tarihi'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'İşlem Tarihi']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("İşlem Tarihi"));

    // 18. Does 'Referans No1' contain 'Referans No'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td//label[. = 'Referans No']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Referans No"));

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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","Kd!cyhz4",""));
  }
}
