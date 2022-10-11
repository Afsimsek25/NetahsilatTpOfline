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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C533 İşlem Durumu İle Listeleme
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Tue Oct 04 09:15:20 GMT 2022.
 */
@DisplayName("C533 İşlem Durumu İle Listeleme")
public class C533 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C533 İşlem Durumu İle Listeleme")
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

    // 4. Click 'ÖDEME LİNKİ LİSTESİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'ÖDEME LİNKİ LİSTESİ']");
    driver.findElement(by).click();

    // 5. Clear 'ResponseStartDate' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ResponseStartDate");
    driver.findElement(by).clear();

    // 6. Select options in 'SelectedMailOrderStatusId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Başarılı");
    by = By.cssSelector("#SelectedMailOrderStatusId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

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

    // 9. Run Get Data From Grid
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("İşlem Durumu","Başarılı","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 10. Select options in 'SelectedMailOrderStatusId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("İstek Gönderildi");
    by = By.cssSelector("#SelectedMailOrderStatusId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 11. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 12. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 13. Run Get Data From Grid
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("İşlem Durumu","İstek Gönderildi","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 14. Select options in 'SelectedMailOrderStatusId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Bekleyen");
    by = By.cssSelector("#SelectedMailOrderStatusId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 15. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 16. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 17. Run Get Data From Grid
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("İşlem Durumu","Bekleyen","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 18. Select options in 'SelectedMailOrderStatusId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("İşlem İptal Edildi");
    by = By.cssSelector("#SelectedMailOrderStatusId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 19. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 20. Is 'loading' not present or invisible?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh t-loading']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));

    // 21. Run Get Data From Grid
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("İşlem Durumu","İşlem İptal Edildi","Equals");
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
