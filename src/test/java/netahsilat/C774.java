package netahsilat;

import io.testproject.addon.GridOperations;
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
 * Test: C774 Bayi olarak giriş yapıp toplu bilgilendirme de gelen liste kontrolü
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 09:55:41 GMT 2022.
 */
@DisplayName("C774 Bayi olarak giriş yapıp toplu bilgilendirme de gelen liste kontrolü")
public class C774 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C774 Bayi olarak giriş yapıp toplu bilgilendirme de gelen liste kontrolü")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    GridOperations.GetData getData;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Click 'YÖNETİCİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'YÖNETİCİ']");
    driver.findElement(by).click();

    // 3. Move mouse to 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 4. Click 'ÜYE YÖNETİMİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[5]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 5. Click 'TOPLU BİLGİLENDİRME'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'TOPLU BİLGİLENDİRME']");
    driver.findElement(by).click();

    // 6. Run Get Data From Grid
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("Ana Bayi","Bireysel Ana Bayi (Silmeyiniz-Değiştirmeyiniz)","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 7. Get Data From Grid With Specific Locator
    /* Step is disabled
    GeneratedUtils.sleep(500);
    getData = GetDataFromGridWithSpecificLocator.getData("div[class='t-widget t-grid'][id='VendorList']","Ana Bayi","Bireysel Ana Bayi (Silmeyiniz-Değiştirmeyiniz)","Equals");
    getData = (GetDataFromGridWithSpecificLocator.GetData)((ReportingDriver)driver).addons().execute(getData);
    */
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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff"));
  }
}
