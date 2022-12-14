package netahsilat;

import io.testproject.addon.GetDataFromGridWithSpecificLocator;
import io.testproject.addon.JSActions;
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

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C1909-Listelerde ki verilerin maskelenmesi
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Oct 10 08:39:37 GMT 2022.
 */
@DisplayName("C1909-Listelerde ki verilerin maskelenmesi")
public class C1909 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C1909-Listelerde ki verilerin maskelenmesi")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String password, String userName, String ApplicationURL, String text,
      String currentDateTime) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodRefreshLoadingControl methodrefreshloadingcontrol;
    MethodLogoutlogin methodlogoutlogin;
    JSActions.ClickAction clickAction;
    GetDataFromGridWithSpecificLocator.GetData getData;

    // 1. Run Method Logout&Login
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ProjectParameters.Otomasyon3Logout;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);
    currentDateTime = String.valueOf(methodlogoutlogin.currentDateTime);

    // 2. Click 'altUyeYonetimi'
    clickAction = JSActions.getClickAction();
    by = By.xpath("//li[1]/a[. = '??YE Y??NET??M??']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 3. This test was auto generated from steps of the 'C1909-Listelerde ki verilerin maskelenmesi' test
    //    This step was auto generated from several steps
    methodrefreshloadingcontrol = new MethodRefreshLoadingControl();
    methodrefreshloadingcontrol.execute(driver);

    // 4. Type '2103' in 'SearchVendorNameVN'
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("2103");

    // 5. Click '21**** 21**** (E****, MUS210318_2,3********8,'
    by = By.xpath("//div[. = '21**** 21**** (E****, MUS210318_2,3********8,']");
    driver.findElement(by).click();

    // 6. Click 'btnListele'
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 7. This test was auto generated from steps of the 'C1909-Listelerde ki verilerin maskelenmesi' test
    //    This step was auto generated from several steps
    methodrefreshloadingcontrol = new MethodRefreshLoadingControl();
    methodrefreshloadingcontrol.execute(driver);

    // 8. Get Data From Grid With Specific Locator
    getData = GetDataFromGridWithSpecificLocator.getData("div[class='t-widget t-grid'][id='VendorListGrid']","E-Posta","E********2@e***com,","Equals");
    getData = (GetDataFromGridWithSpecificLocator.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 9. Click '????LEM L??STES??1'
    clickAction = JSActions.getClickAction();
    by = By.xpath("//a[. = '????LEM L??STES??']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 10. This test was auto generated from steps of the 'C1909-Listelerde ki verilerin maskelenmesi' test
    //    This step was auto generated from several steps
    methodrefreshloadingcontrol = new MethodRefreshLoadingControl();
    methodrefreshloadingcontrol.execute(driver);

    // 11. Clear 'StartDate' contents
    by = By.cssSelector("#StartDate");
    driver.findElement(by).clear();

    // 12. Type '09.03.2022 00:00' in 'StartDate'
    by = By.cssSelector("#StartDate");
    driver.findElement(by).sendKeys("09.03.2022 00:00");

    // 13. Clear 'EndDate' contents
    by = By.cssSelector("#EndDate");
    driver.findElement(by).clear();

    // 14. Type '09.03.2022 23:00' in 'EndDate'
    by = By.cssSelector("#EndDate");
    driver.findElement(by).sendKeys("09.03.2022 23:00");

    // 15. Type '2103' in 'VendorNameTr'
    by = By.cssSelector("#VendorName");
    driver.findElement(by).sendKeys("2103");

    // 16. Click '21**** 21**** (E****, MUS210318_2,3********8,'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    by = By.xpath("//div[. = '21**** 21**** (E****, MUS210318_2,3********8,']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 17. Click 'btnListele'
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 18. This test was auto generated from steps of the 'C1909-Listelerde ki verilerin maskelenmesi' test
    //    This step was auto generated from several steps
    methodrefreshloadingcontrol = new MethodRefreshLoadingControl();
    methodrefreshloadingcontrol.execute(driver);

    // 19. Get Data From Grid With Specific Locator
    getData = GetDataFromGridWithSpecificLocator.getData("div[class='t-widget t-grid'][id='VPosTransactionGrid']","Bayi/Kullan??c?? Ad??","21**** 21****","Equals");
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
    return Stream.of(Arguments.of("Kd!cyhz4","otomasyon@test.com","https://otomasyon.netahsilatdemo.com/Account/LogOff","",""));
  }
}
