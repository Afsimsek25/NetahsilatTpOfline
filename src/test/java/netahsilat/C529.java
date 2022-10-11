package netahsilat;

import io.testproject.addon.GridOperations;
import io.testproject.addon.WebExtensions;
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
 * Test: C529 Tüm Filtreler Aktif Listeleme
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Tue Oct 04 07:06:37 GMT 2022.
 */
@DisplayName("C529 Tüm Filtreler Aktif Listeleme")
public class C529 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C529 Tüm Filtreler Aktif Listeleme")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    WebExtensions.SelectOptionbyVisibleText selectOptionbyVisibleText;
    GridOperations.GetData getData;

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

    // 9. Select options in 'InstallmentTypeId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Çek ile Ödeme");
    by = By.cssSelector("#InstallmentTypeId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 10. Select options in 'CityId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("İstanbul");
    by = By.cssSelector("#CityId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 11. Select options in 'NetahBankId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("AKBANK T.A.Ş.");
    by = By.cssSelector("#NetahBankId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 12. Select options in 'StatusId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Beklemede");
    by = By.cssSelector("#StatusId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 13. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 14. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 15. Run Get Data From Grid
    //    Onay Durumu - Beklemede - Equals
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("Onay Durumu","Beklemede","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 16. Run Get Data From Grid
    //    Ödeme Tipi - Çek ile Ödeme - Equals
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("Ödeme Tipi","Çek ile Ödeme","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

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
