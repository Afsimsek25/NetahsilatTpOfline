package netahsilat;

import io.testproject.addon.CombinedActions;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C2096 Taksit Tablosu Değişiklik Uyarıları ( Komisyon oranı, Artı taksit, Taksit erteleme )
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 11:12:14 GMT 2022.
 */
@DisplayName("C2096 Taksit Tablosu Değişiklik Uyarıları ( Komisyon oranı, Artı taksit, Taksit erteleme )")
public class C2096 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C2096 Taksit Tablosu Değişiklik Uyarıları ( Komisyon oranı, Artı taksit, Taksit erteleme )")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    CombinedActions.ClearAndTypeAction clearAndTypeAction;
    JSActions.TypeTextAction typeTextAction;

    // 1. Navigate to '{{UyeliksizOdemeURL}}'
    GeneratedUtils.sleep(500);
    driver.navigate().to(ProjectParameters.UyeliksizOdemeURL);

    // 2. Type '49885221' in 'Kart No'
    GeneratedUtils.sleep(500);
    typeTextAction = JSActions.typeTextAction("49885221");
    by = By.cssSelector("#CardNumber");
    typeTextAction = (JSActions.TypeTextAction)((ReportingDriver)driver).addons().execute(typeTextAction, by, -1);

    // 3. Click 'Kart No'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CardNumber");
    driver.findElement(by).click();

    // 4. Send 'ENTER' key(s)
    GeneratedUtils.sleep(500);
    (new Actions(driver)).sendKeys(GeneratedUtils.getKeys("ENTER")).build().perform();

    // 5. Run Clear 'PureAmount' contents and type '100'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("100");
    by = By.cssSelector("#PureAmount");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 6. Click 'Taksit Seçimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#installment-selection-text");
    driver.findElement(by).click();

    // 7. Is 'Halkbank 52 x 0,00' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[starts-with(text(),'52 x ')]/../../td[contains(@class,'commRate-60')]");
    driver.findElement(by).isDisplayed();

    // 8. Click 'Halkbank 5 Taksit'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[starts-with(text(),'5 x ')]/../../td[contains(@class,'commRate-60')]");
    driver.findElement(by).click();

    // 9. Is '0 olan Artı taksit bu kart tipi için ...' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//p[. = '0 olan Artı taksit bu kart tipi için 3 olarak uygulanacaktır']");
    driver.findElement(by).isDisplayed();

    // 10. Is '0 olan Taksit erteleme bu kart tipi i...' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//p[. = '0 olan Taksit erteleme bu kart tipi için 6 olarak uygulanacaktır']");
    driver.findElement(by).isDisplayed();

    // 11. Is '0 olan Komisyon oranı bu kart tipi iç...1' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//p[. = '0 olan Komisyon oranı bu kart tipi için 30 olarak uygulanacaktır']");
    driver.findElement(by).isDisplayed();

    // 12. Click 'installmentTableChangesNotifyModal Close'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[@id='installmentTableChangesNotifyModal']//button[@class='close']");
    driver.findElement(by).click();

    // 13. Is 'installmentTableChangesNotifyModal Close' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[@id='installmentTableChangesNotifyModal']//button[@class='close']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","Kd!cyhz4"));
  }
}
