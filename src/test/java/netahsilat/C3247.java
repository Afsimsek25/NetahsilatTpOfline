package netahsilat;

import io.testproject.addon.CombinedActions;
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
 * Test: C3247
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Sun Oct 09 19:33:37 GMT 2022.
 */
@DisplayName("C3247")
public class C3247 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C3247")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String ApplicationURL3)
      throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogin methodlogin;
    WebExtensions.SelectOptionbyVisibleText selectOptionbyVisibleText;
    CombinedActions.ClearAndTypeAction clearAndTypeAction;
    GridOperations.GetData getData;

    // 1. Navigate to '{{Otomasyon3Logout}}'
    GeneratedUtils.sleep(500);
    driver.navigate().to(ProjectParameters.Otomasyon3Logout);

    // 2. Run Method Login
    GeneratedUtils.sleep(500);
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL3;
    methodlogin.userName = ProjectParameters.genelEmail;
    methodlogin.password = ProjectParameters.genelPassword;
    methodlogin.execute(driver);

    // 3. Move mouse to 'moveToIslemler'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='tag']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 4. Click 'İŞLEMLER1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'İŞLEMLER']");
    driver.findElement(by).click();

    // 5. Click 'KART KAYDETME LINKI LISTELEME1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Kart Kaydetme Linki Listeleme']");
    driver.findElement(by).click();

    // 6. Clear 'RequestStartDate' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#RequestStartDate");
    driver.findElement(by).clear();

    // 7. Run Clear 'RequestStartDate' contents and type '17.01.2022 00:00'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("17.01.2022 00:00");
    by = By.cssSelector("#RequestStartDate");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 8. Run Clear 'RequestEndDate' contents and type '17.01.2022 23:59'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("17.01.2022 23:59");
    by = By.cssSelector("#RequestEndDate");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 9. Select options in 'Status' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("İstek Gönderildi");
    by = By.cssSelector("#Status");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 10. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 11. Run Get Data From Grid
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("İşlem Durumu","İstek Gönderildi","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 12. Is 'IslemButton' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='İstek Gönderildi']/..//a[@title='İşlem']");
    driver.findElement(by);

    // 13. Is 'IstekGonderildiYenidenButton' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='İstek Gönderildi']/..//td//img[@src='/NetahsilatGoldAdmin/Content/images/icons/fugue/arrow-circle.png']");
    driver.findElement(by);

    // 14. Is 'IstekGonderildiIptalButton' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='İstek Gönderildi']/..//td//img[@src='/NetahsilatGoldAdmin/Content/images/icons/fugue/cross-circle.png']");
    driver.findElement(by);

    // 15. Select options in 'Status' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Başarılı");
    by = By.cssSelector("#Status");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 16. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 17. Run Get Data From Grid
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("İşlem Durumu","Başarılı","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 18. Is 'IstekGonderildiYenidenButton' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//td[text()='İstek Gönderildi']/..//td//img[@src='/NetahsilatGoldAdmin/Content/images/icons/fugue/arrow-circle.png']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 19. Is 'IstekGonderildiIptalButton' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//td[text()='İstek Gönderildi']/..//td//img[@src='/NetahsilatGoldAdmin/Content/images/icons/fugue/cross-circle.png']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 20. Select options in 'Status' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Başarısız");
    by = By.cssSelector("#Status");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 21. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 22. Run Get Data From Grid
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("İşlem Durumu","Başarısız","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 23. Is 'IstekGonderildiYenidenButton' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//td[text()='İstek Gönderildi']/..//td//img[@src='/NetahsilatGoldAdmin/Content/images/icons/fugue/arrow-circle.png']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 24. Is 'IstekGonderildiIptalButton' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//td[text()='İstek Gönderildi']/..//td//img[@src='/NetahsilatGoldAdmin/Content/images/icons/fugue/cross-circle.png']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 25. Select options in 'Status' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Hatalı");
    by = By.cssSelector("#Status");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 26. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 27. Run Get Data From Grid
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("İşlem Durumu","Hatalı","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 28. Is 'IstekGonderildiYenidenButton' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//td[text()='İstek Gönderildi']/..//td//img[@src='/NetahsilatGoldAdmin/Content/images/icons/fugue/arrow-circle.png']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 29. Is 'IstekGonderildiIptalButton' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//td[text()='İstek Gönderildi']/..//td//img[@src='/NetahsilatGoldAdmin/Content/images/icons/fugue/cross-circle.png']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 30. Select options in 'Status' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Bekleyen");
    by = By.cssSelector("#Status");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 31. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 32. Run Get Data From Grid
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("İşlem Durumu","Bekleyen","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 33. Is 'IstekGonderildiYenidenButton' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//td[text()='İstek Gönderildi']/..//td//img[@src='/NetahsilatGoldAdmin/Content/images/icons/fugue/arrow-circle.png']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 34. Is 'IstekGonderildiIptalButton' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//td[text()='İstek Gönderildi']/..//td//img[@src='/NetahsilatGoldAdmin/Content/images/icons/fugue/cross-circle.png']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 35. Select options in 'Status' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Bilinmiyor");
    by = By.cssSelector("#Status");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 36. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 37. Run Get Data From Grid
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("İşlem Durumu","Bilinmiyor","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 38. Is 'IstekGonderildiYenidenButton' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//td[text()='İstek Gönderildi']/..//td//img[@src='/NetahsilatGoldAdmin/Content/images/icons/fugue/arrow-circle.png']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 39. Is 'IstekGonderildiIptalButton' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//td[text()='İstek Gönderildi']/..//td//img[@src='/NetahsilatGoldAdmin/Content/images/icons/fugue/cross-circle.png']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 40. Select options in 'Status' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("İstek Gönderildi");
    by = By.cssSelector("#Status");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 41. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 42. Run Get Data From Grid
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("İşlem Durumu","İstek Gönderildi","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 43. Is 'IslemButton' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='İstek Gönderildi']/..//a[@title='İşlem']");
    driver.findElement(by);

    // 44. Is 'IstekGonderildiYenidenButton' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='İstek Gönderildi']/..//td//img[@src='/NetahsilatGoldAdmin/Content/images/icons/fugue/arrow-circle.png']");
    driver.findElement(by);

    // 45. Is 'IstekGonderildiIptalButton' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='İstek Gönderildi']/..//td//img[@src='/NetahsilatGoldAdmin/Content/images/icons/fugue/cross-circle.png']");
    driver.findElement(by);

    // 46. Select options in 'Status' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Maximum Hatalı");
    by = By.cssSelector("#Status");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 47. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 48. Run Get Data From Grid
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("İşlem Durumu","Maximum Hatalı","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 49. Is 'IstekGonderildiYenidenButton' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//td[text()='İstek Gönderildi']/..//td//img[@src='/NetahsilatGoldAdmin/Content/images/icons/fugue/arrow-circle.png']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 50. Is 'IstekGonderildiIptalButton' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//td[text()='İstek Gönderildi']/..//td//img[@src='/NetahsilatGoldAdmin/Content/images/icons/fugue/cross-circle.png']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 51. Select options in 'Status' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("İşlem İptal Edildi");
    by = By.cssSelector("#Status");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 52. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 53. Run Get Data From Grid
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("İşlem Durumu","İşlem İptal Edildi","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 54. Is 'IstekGonderildiYenidenButton' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//td[text()='İstek Gönderildi']/..//td//img[@src='/NetahsilatGoldAdmin/Content/images/icons/fugue/arrow-circle.png']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 55. Is 'IstekGonderildiIptalButton' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//td[text()='İstek Gönderildi']/..//td//img[@src='/NetahsilatGoldAdmin/Content/images/icons/fugue/cross-circle.png']");
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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","Kd!cyhz4","https://otomasyon3.netahsilatdemo.com/"));
  }
}