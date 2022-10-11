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
 * Test: C432 Müşteri Temsilcisi İle Listeleme
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Oct 03 15:15:50 GMT 2022.
 */
@DisplayName("C432 Müşteri Temsilcisi İle Listeleme")
public class C432 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C432 Müşteri Temsilcisi İle Listeleme")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
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

    // 5. Move mouse to 'StartDate'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#StartDate");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 6. Clear 'StartDate' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#StartDate");
    driver.findElement(by).clear();

    // 7. Type 'Otomasyon Test' in 'Müşteri temsilcisi select'
    GeneratedUtils.sleep(500);
    by = By.xpath("//*[@class='select2-input select2-default']");
    driver.findElement(by).sendKeys("Otomasyon Test");

    // 8. Click 'Otomasyon Test3'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li/div[. = 'Otomasyon Test']");
    driver.findElement(by).click();

    // 9. Clear 'EndDate' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#EndDate");
    driver.findElement(by).clear();

    // 10. Type '19.08.2021 23:59' in 'EndDate'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#EndDate");
    driver.findElement(by).sendKeys("19.08.2021 23:59");

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
    //    Üye ErpKodu - OtoTestERP555 - Equals
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("Üye ErpKodu","OtoTestERP555","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 14. Click 'Müşteri temsilcisi clear'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[@id='s2id_RepresentativeName']//ul//li//a");
    driver.findElement(by).click();

    // 15. Click 'İşlem Tarihi7'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'İşlem Tarihi']");
    driver.findElement(by).click();

    // 16. Type 'Otomasyon Test' in 'Müşteri temsilcisi select'
    GeneratedUtils.sleep(500);
    by = By.xpath("//*[@class='select2-input select2-default']");
    driver.findElement(by).sendKeys("Otomasyon Test");

    // 17. Click 'Otomasyon Test3'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li/div[. = 'Otomasyon Test']");
    driver.findElement(by).click();

    // 18. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 19. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 20. Run Get Data From Grid
    //    Üye ErpKodu - OtoTestERP555 - Equals
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("Üye ErpKodu","OtoTestERP555","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 21. Click 'Müşteri temsilcisi clear'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[@id='s2id_RepresentativeName']//ul//li//a");
    driver.findElement(by).click();

    // 22. Click 'İşlem Tarihi7'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'İşlem Tarihi']");
    driver.findElement(by).click();

    // 23. Type 'otomasyon@test.com' in 'Müşteri temsilcisi select'
    GeneratedUtils.sleep(500);
    by = By.xpath("//*[@class='select2-input select2-default']");
    driver.findElement(by).sendKeys("otomasyon@test.com");

    // 24. Click 'Otomasyon Test4'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#select2-result-label-4");
    driver.findElement(by).click();

    // 25. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 26. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 27. Run Get Data From Grid
    //    Üye ErpKodu - OtoTestERP555 - Contains
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("Üye ErpKodu","OtoTestERP555","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 28. Click 'Müşteri temsilcisi clear'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[@id='s2id_RepresentativeName']//ul//li//a");
    driver.findElement(by).click();

    // 29. Click 'İşlem Tarihi7'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'İşlem Tarihi']");
    driver.findElement(by).click();

    // 30. Type '44444444440' in 'Müşteri temsilcisi select'
    GeneratedUtils.sleep(500);
    by = By.xpath("//*[@class='select2-input select2-default']");
    driver.findElement(by).sendKeys("44444444440");

    // 31. Click 'Otomasyon Test4'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#select2-result-label-4");
    driver.findElement(by).click();

    // 32. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 33. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 34. Run Get Data From Grid
    //    Üye ErpKodu - OtoTestERP555 - Equals
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("Üye ErpKodu","OtoTestERP555","Equals");
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