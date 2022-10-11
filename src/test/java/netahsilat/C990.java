package netahsilat;

import io.testproject.addon.NetahsilatUtills;
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

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C990 Aynı Vadeden ve aynı taksitten girilmesine izin verilmemeli başlangıç bitiş kontrol edilmeli
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 11:29:19 GMT 2022.
 */
@DisplayName("C990 Aynı Vadeden ve aynı taksitten girilmesine izin verilmemeli başlangıç bitiş kontrol edilmeli")
public class C990 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C990 Aynı Vadeden ve aynı taksitten girilmesine izin verilmemeli başlangıç bitiş kontrol edilmeli")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    NetahsilatUtills.ClickUntilGone clickUntilGone;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Move mouse to 'moveToSiteYönetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='config']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 3. Click 'moveToSiteYönetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='config']");
    driver.findElement(by).click();

    // 4. Move mouse to 'ddPosAyarlari'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[@title='POS AYARLARI']/..//img");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 5. Click 'VADELİ FATURA'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'VADELİ FATURA']");
    driver.findElement(by).click();

    // 6. Click 'İlgili Alanlar Otomasyon (Silme) C2107'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='Otomasyon (Silme) C2107']/..//td[1]//a[@title='İlgili alanlar']");
    driver.findElement(by).click();

    // 7. Click 'IMG67'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[1]/div/div[2]/div/div/table/tbody/tr/td[1]/a[3]/img");
    driver.findElement(by).click();

    // 8. Click 'Vade Tanımla'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#a_title_sub_grid");
    driver.findElement(by).click();

    // 9. Type '1' in 'StartDate'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#StartDate");
    driver.findElement(by).sendKeys("1");

    // 10. Type '11' in 'EndDate'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#EndDate");
    driver.findElement(by).sendKeys("11");

    // 11. Type '15.09.2023' in 'ValidityStartDate'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ValidityStartDate");
    driver.findElement(by).sendKeys("15.09.2023");

    // 12. Type '30.09.2023' in 'ValidityEndDate'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ValidityEndDate");
    driver.findElement(by).sendKeys("30.09.2023");

    // 13. Click 'Tamam1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 14. Does 'Vade Tanımlamada hata oluştu lütfen B...' contain 'Vade Tanımlamada hata oluştu lütfen Başlangıç Bitiş Değerlerini doğru giriniz.'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'Vade Tanımlamada hata oluştu lütfen Başlangıç Bitiş Değerlerini doğru giriniz.']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Vade Tanımlamada hata oluştu lütfen Başlangıç Bitiş Değerlerini doğru giriniz."));

    // 15. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Kapat']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 16. Clear 'StartDate' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#StartDate");
    driver.findElement(by).clear();

    // 17. Clear 'EndDate' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#EndDate");
    driver.findElement(by).clear();

    // 18. Type '21' in 'StartDate'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#StartDate");
    driver.findElement(by).sendKeys("21");

    // 19. Type '30' in 'EndDate'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#EndDate");
    driver.findElement(by).sendKeys("30");

    // 20. Click 'Tamam1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 21. Does 'Vade Tanımlamada hata oluştu lütfen B...' contain 'Vade Tanımlamada hata oluştu lütfen Başlangıç Bitiş Değerlerini doğru giriniz.'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'Vade Tanımlamada hata oluştu lütfen Başlangıç Bitiş Değerlerini doğru giriniz.']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Vade Tanımlamada hata oluştu lütfen Başlangıç Bitiş Değerlerini doğru giriniz."));

    // 22. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Kapat']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 23. Clear 'StartDate' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#StartDate");
    driver.findElement(by).clear();

    // 24. Type '22' in 'StartDate'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#StartDate");
    driver.findElement(by).sendKeys("22");

    // 25. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 26. Is '221' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[3][. = '22']");
    driver.findElement(by).isDisplayed();

    // 27. Is '30' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[4][. = '30']");
    driver.findElement(by).isDisplayed();

    // 28. Click '(//h1[text()='Otomasyon (Silme) C2107 Vadeli Tanımları']/..//img[contains(@src,'circle.png')])[2]'
    GeneratedUtils.sleep(500);
    by = By.xpath("(//h1[text()='Otomasyon (Silme) C2107 Vadeli Tanımları']/..//img[contains(@src,'circle.png')])[2]");
    driver.findElement(by).click();

    // 29. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 30. Click 'İlgili Alanlar Otomasyon (Silme) C2107 Vadeli Tanımları'
    GeneratedUtils.sleep(500);
    by = By.xpath("//h1[text()='Otomasyon (Silme) C2107 Vadeli Tanımları']/..//img[contains(@src,'detail.png')]");
    driver.findElement(by).click();

    // 31. Click 'Vade Farkı'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#a_title_sub_grid_diffrence");
    driver.findElement(by).click();

    // 32. Type '5' in 'Installment3'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Installment");
    driver.findElement(by).sendKeys("5");

    // 33. Click 'Tamam1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 34. Does '5 taksiti daha önce tanımlanmış' contain '5 taksiti daha önce tanımlanmış'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = '5 taksiti daha önce tanımlanmış']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("5 taksiti daha önce tanımlanmış"));

    // 35. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Kapat']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 36. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Vazgeç']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

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
