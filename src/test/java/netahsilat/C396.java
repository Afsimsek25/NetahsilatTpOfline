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
 * Test: C396 Pos Adı İle Listeleme
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Wed Sep 28 15:08:25 GMT 2022.
 */
@DisplayName("C396 Pos Adı İle Listeleme")
public class C396 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C396 Pos Adı İle Listeleme")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    WebExtensions.ClickAndHold clickAndHold;
    WebExtensions.ReleaseClick releaseClick;
    GridOperations.GetData getData;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail2;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Move mouse to 'moveToIslemler'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='tag']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 3. Click 'İŞLEMLER'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[title='İŞLEMLER']");
    driver.findElement(by).click();

    // 4. Click 'İŞLEM LİSTESİ'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[title='İŞLEM LİSTESİ']");
    driver.findElement(by).click();

    // 5. Move mouse to 'Akbank1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//option[. = 'Akbank1']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 6. Click and hold
    GeneratedUtils.sleep(500);
    clickAndHold = WebExtensions.getClickAndHold();
    clickAndHold = (WebExtensions.ClickAndHold)((ReportingDriver)driver).addons().execute(clickAndHold);

    // 7. Release left mouse button
    GeneratedUtils.sleep(500);
    releaseClick = WebExtensions.getReleaseClick();
    releaseClick = (WebExtensions.ReleaseClick)((ReportingDriver)driver).addons().execute(releaseClick);

    // 8. Move mouse to 'StartDate'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#StartDate");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 9. Clear 'StartDate' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#StartDate");
    driver.findElement(by).clear();

    // 11. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 10. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(1000);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 11. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 12. Run Get Data From Grid
    //    Banka - Akbank1 - Equals
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("Banka","Akbank1","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","",""));
  }
}
