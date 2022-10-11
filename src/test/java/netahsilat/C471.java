package netahsilat;

import io.testproject.addon.GetDataFromGridWithSpecificLocator;
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
 * Test: C471 Bayi İle Listeleme
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Oct 03 21:03:57 GMT 2022.
 */
@DisplayName("C471 Bayi İle Listeleme")
public class C471 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C471 Bayi İle Listeleme")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodRefreshLoadingControl methodrefreshloadingcontrol;
    MethodLogoutlogin methodlogoutlogin;
    GetDataFromGridWithSpecificLocator.GetData getData;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Move mouse to 'moveToIslemler'
    by = By.cssSelector("li[class='tag']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 3. Click 'İŞLEMLER1'
    by = By.xpath("//a[. = 'İŞLEMLER']");
    driver.findElement(by).click();

    // 4. Move mouse to 'ddPosRapor'
    by = By.xpath("//li[2]/ul//img");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 5. Click 'btnGeriOdemeDetaylari'
    by = By.xpath("//a[. = 'GERİ ÖDEME DETAYLARI']");
    driver.findElement(by).click();

    // 6. This test was auto generated from steps of the 'C1909-Listelerde ki verilerin maskelenmesi' test
    methodrefreshloadingcontrol = new MethodRefreshLoadingControl();
    methodrefreshloadingcontrol.execute(driver);

    // 7. Move mouse to 'StartDate'
    /* Step is disabled
    by = By.cssSelector("#StartDate");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();
    */
    // 8. Clear 'StartDate' contents
    by = By.cssSelector("#StartDate");
    driver.findElement(by).clear();

    // 9. Clear 'EndDate' contents
    by = By.cssSelector("#EndDate");
    driver.findElement(by).clear();

    // 10. Type '1.09.2021 23:59' in 'EndDate'
    by = By.cssSelector("#EndDate");
    driver.findElement(by).sendKeys("1.09.2021 23:59");

    // 11. Type 'anamusteri01' in 'VendorName'
    by = By.cssSelector("#VendorName");
    driver.findElement(by).sendKeys("anamusteri01");

    // 12. Click 'Filtre-Tamamlama Bireysel Yabancı (Değiştirmeyiniz) '
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.xpath("//div[contains(text(),'Bireysel Yabancı (Değiştirmeyiniz) (Otomasyon A.Ş)')]");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 13. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 14. This test was auto generated from steps of the 'C1909-Listelerde ki verilerin maskelenmesi' test
    methodrefreshloadingcontrol = new MethodRefreshLoadingControl();
    methodrefreshloadingcontrol.execute(driver);

    // 15. Get Data From Grid With Specific Locator
    //    Equals : Bayi/Kullanıcı Adı -> "Bireysel Yabancı (Değiştirmeyi"
    getData = GetDataFromGridWithSpecificLocator.getData("div[class='t-widget t-grid'][id='VPosTransactionDetailBankPaymentGrid']","Bayi/Kullanıcı Adı","Bireysel Yabancı (Değiştirmeyi","Equals");
    getData = (GetDataFromGridWithSpecificLocator.GetData)((ReportingDriver)driver).addons().execute(getData);

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