package netahsilat;

import io.testproject.addon.GridOperations;
import io.testproject.addon.WebExtensions;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C556 İptal
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Wed Oct 05 07:52:48 GMT 2022.
 */
@DisplayName("C556 İptal")
public class C556 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C556 İptal")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodRefreshLoadingControl methodrefreshloadingcontrol;
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
    by = By.cssSelector("li[class='tag']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 3. Click 'İŞLEMLER1'
    by = By.xpath("//a[. = 'İŞLEMLER']");
    driver.findElement(by).click();

    // 4. Click 'ÖDEME LİNKİ LİSTESİ'
    by = By.xpath("//a[. = 'ÖDEME LİNKİ LİSTESİ']");
    driver.findElement(by).click();

    // 5. This test was auto generated from steps of the 'C1909-Listelerde ki verilerin maskelenmesi' test
    methodrefreshloadingcontrol = new MethodRefreshLoadingControl();
    methodrefreshloadingcontrol.execute(driver);

    // 6. Clear 'ResponseStartDate' contents
    by = By.cssSelector("#ResponseStartDate");
    driver.findElement(by).clear();

    // 7. Select options in 'SelectedMailOrderStatusId' with text '[NONE]'
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("İstek Gönderildi");
    by = By.cssSelector("#SelectedMailOrderStatusId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 8. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 9. This test was auto generated from steps of the 'C1909-Listelerde ki verilerin maskelenmesi' test
    methodrefreshloadingcontrol = new MethodRefreshLoadingControl();
    methodrefreshloadingcontrol.execute(driver);

    // 10. Run Get Data From Grid
    getData = GridOperations.getData("İşlem Durumu","İstek Gönderildi","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 11. Click 'imgİptal'
    by = By.cssSelector("img[src*='fugue/cross-circle.png']");
    driver.findElement(by).click();

    // 12. Does 'FullName1' contain 'FullName'?
    by = By.xpath("//label[. = 'FullName']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("FullName"));

    // 13. Does 'PureAmount1' contain 'PureAmount'?
    by = By.xpath("//label[. = 'PureAmount']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("PureAmount"));

    // 14. Does 'FullName' contain '[NONE]'?
    by = By.cssSelector("#FullName");
    Assertions.assertTrue(driver.findElement(by).getText().contains(""));

    // 15. Does 'PureAmount' contain '[NONE]'?
    by = By.cssSelector("#PureAmount");
    Assertions.assertTrue(driver.findElement(by).getText().contains(""));

    // 16. Is 'Vazgeç' is clickable?
    by = By.xpath("//button[. = 'Vazgeç']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(by));

    // 17. Click 'Vazgeç'
    by = By.xpath("//button[. = 'Vazgeç']");
    driver.findElement(by).click();

    // 18. Click 'imgİptal'
    by = By.cssSelector("img[src*='fugue/cross-circle.png']");
    driver.findElement(by).click();

    // 19. Is 'buttonKaydiTamamla' is clickable?
    by = By.xpath("//button[. = 'Tamam']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(by));

    // 20. Click 'buttonKaydiTamamla'
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

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
