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
 * Test: C499 Müşteri Temsilcisi İle Listeleme
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Oct 03 21:27:21 GMT 2022.
 */
@DisplayName("C499 Müşteri Temsilcisi İle Listeleme")
public class C499 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C499 Müşteri Temsilcisi İle Listeleme")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password,
      String MusteriTemsilcisiKodu) throws Exception {
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

    // 4. Move mouse to 'ddPosRapor'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[2]/ul//img");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 5. Click 'btnGeriOdemeDetaylari'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'GERİ ÖDEME DETAYLARI']");
    driver.findElement(by).click();

    // 6. Is 'StartDate' visible?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#StartDate");
    driver.findElement(by).isDisplayed();

    // 7. Clear 'StartDate' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#StartDate");
    driver.findElement(by).clear();

    // 8. Type 'otomasyon@test.com' in 'RepresentativeFullName2'
    GeneratedUtils.sleep(500);
    by = By.xpath("//input[@id='s2id_autogen1']");
    driver.findElement(by).sendKeys("otomasyon@test.com");

    // 9. Click 'otomasyonTestTamamla'
    /* Step is disabled
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//*[text()='Otomasyon Test, otomasyon@test.com']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    */
    // 10. Click 'Otomasyon Test4'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#select2-result-label-4");
    driver.findElement(by).click();

    // 11. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 12. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 13. Move mouse to 'DIV47'
    GeneratedUtils.sleep(500);
    by = By.xpath("//tr[1]/td/div");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 14. Is 'Müşteri temsilcisi kodu - Tooltip' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[@class='tpd-content'] //b[text()='otomasyon']");
    driver.findElement(by).isDisplayed();

    // 15. Run Get Data From Grid
    //    Müşteri Temsilcisi Kodu - otomasyon - Contains
    /* Step is disabled
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("Müşteri Temsilcisi Kodu","otomasyon","Contains");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);
    */
    // 16. Click 'Multiselect Close Button'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[@class='select2-search-choice-close']");
    driver.findElement(by).click();

    // 17. Type 'otomasyon' in 'RepresentativeFullName2'
    GeneratedUtils.sleep(500);
    by = By.xpath("//input[@id='s2id_autogen1']");
    driver.findElement(by).sendKeys("otomasyon");

    // 18. Click 'Otomasyon test seçimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//*[text()=' Test']");
    driver.findElement(by).click();

    // 19. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 20. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(80000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 21. Move mouse to 'DIV47'
    GeneratedUtils.sleep(500);
    by = By.xpath("//tr[1]/td/div");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 22. Is 'Müşteri temsilcisi kodu - Tooltip' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[@class='tpd-content'] //b[text()='otomasyon']");
    driver.findElement(by).isDisplayed();

    // 23. Run Get Data From Grid
    //    Müşteri Temsilcisi Kodu - otomasyon - Contains
    /* Step is disabled
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("Müşteri Temsilcisi Kodu","otomasyon","Contains");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    */
    // 24. Click 'Multiselect Close Button'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[@class='select2-search-choice-close']");
    driver.findElement(by).click();

    // 25. Type 'otomasyon@test.com' in 'RepresentativeFullName2'
    GeneratedUtils.sleep(500);
    by = By.xpath("//input[@id='s2id_autogen1']");
    driver.findElement(by).sendKeys("otomasyon@test.com");

    // 26. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 27. Click 'Otomasyon Test5'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#select2-result-label-9");
    driver.findElement(by).click();

    // 28. Click 'Otomasyon Test, otomasyon@test.com'
    /* Step is disabled
    GeneratedUtils.sleep(500);
    by = By.xpath("//*[text()='Otomasyon Test, otomasyon@test.com']");
    driver.findElement(by).click();
    */
    // 29. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 30. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 31. Run Get Data From Grid
    //    Müşteri Temsilcisi Kodu - otomasyon - Contains
    /* Step is disabled
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("Müşteri Temsilcisi Kodu","otomasyon","Contains");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);
    */
    // 32. Move mouse to 'DIV47'
    GeneratedUtils.sleep(500);
    by = By.xpath("//tr[1]/td/div");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 33. Is 'Müşteri temsilcisi kodu - Tooltip' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[@class='tpd-content'] //b[text()='otomasyon']");
    driver.findElement(by).isDisplayed();

    // 34. Click 'Multiselect Close Button'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[@class='select2-search-choice-close']");
    driver.findElement(by).click();

    // 35. Type '44444444440' in 'RepresentativeFullName2'
    GeneratedUtils.sleep(500);
    by = By.xpath("//input[@id='s2id_autogen1']");
    driver.findElement(by).sendKeys("44444444440");

    // 36. Click 'Otomasyon Test5'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#select2-result-label-9");
    driver.findElement(by).click();

    // 37. Click 'Otomasyon Test, 44444444440'
    /* Step is disabled
    GeneratedUtils.sleep(500);
    by = By.xpath("//*[text()='Otomasyon Test, 44444444440']");
    driver.findElement(by).click();
    */
    // 38. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 39. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 40. Move mouse to 'DIV47'
    GeneratedUtils.sleep(500);
    by = By.xpath("//tr[1]/td/div");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 41. Is 'Müşteri temsilcisi kodu - Tooltip' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[@class='tpd-content'] //b[text()='otomasyon']");
    driver.findElement(by).isDisplayed();

    // 42. Run Get Data From Grid
    //    Müşteri Temsilcisi Kodu - otomasyon - Contains
    /* Step is disabled
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("Müşteri Temsilcisi Kodu","otomasyon","Contains");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);
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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","","",""));
  }
}
