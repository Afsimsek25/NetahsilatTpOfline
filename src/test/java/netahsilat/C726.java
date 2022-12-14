package netahsilat;

import io.testproject.addon.NetahsilatUtills;
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

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C726 Ödeme seti ekleme/güncelleme
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 11:27:31 GMT 2022.
 */
@DisplayName("C726 Ödeme seti ekleme/güncelleme")
public class C726 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C726 Ödeme seti ekleme/güncelleme")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    WebExtensions.SelectOptionbyVisibleText selectOptionbyVisibleText;
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

    // 3. Click 'SİTE YÖNETİMİ'
    GeneratedUtils.sleep(500);
    by = By.cssSelector(".config > a");
    driver.findElement(by).click();

    // 4. Move mouse to 'ddPosAyarlari'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[@title='POS AYARLARI']/..//img");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 5. Click 'ÖDEME SETLERİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'ÖDEME SETLERİ']");
    driver.findElement(by).click();

    // 6. Click 'Yeni Ödeme Seti Ekle'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Yeni Ödeme Seti Ekle']");
    driver.findElement(by).click();

    // 7. Type 'Otomasyon (Silinecek)' in 'Name'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Name");
    driver.findElement(by).sendKeys("Otomasyon (Silinecek)");

    // 8. Select options in 'TransactionTypeId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Provizyon");
    by = By.cssSelector("#TransactionTypeId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 9. Select options in 'CommApplyTypeId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Dışında");
    by = By.cssSelector("#CommApplyTypeId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 10. Type '28472387642' in 'ErpCode'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ErpCode");
    driver.findElement(by).sendKeys("28472387642");

    // 11. Click 'Komisyon Tipi Değiştirilebilir'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[@for='CanUserChangeCommApplyType']/..//..//img");
    driver.findElement(by).click();

    // 12. Clear 'InstallmentLowerLimit' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#InstallmentLowerLimit");
    driver.findElement(by).clear();

    // 13. Type '60' in 'InstallmentLowerLimit'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#InstallmentLowerLimit");
    driver.findElement(by).sendKeys("60");

    // 14. Clear 'ThreeDLimit' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ThreeDLimit");
    driver.findElement(by).clear();

    // 15. Type '70' in 'ThreeDLimit'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ThreeDLimit");
    driver.findElement(by).sendKeys("70");

    // 16. Click 'Aktif'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[@for='IsActive']/..//..//img");
    driver.findElement(by).click();

    // 17. Click 'Ödeme formunda kom. oranları görünsün?'
    GeneratedUtils.sleep(500);
    by = By.xpath("//input[@id='AreCommRatesVisibleOnPaymentForm']/..//img");
    driver.findElement(by).click();

    // 18. Click 'Ödeme formunda toplam tutar görünsün?'
    GeneratedUtils.sleep(500);
    by = By.xpath("//input[@id='AreTotalAmountVisibleOnPaymentForm']/..//img");
    driver.findElement(by).click();

    // 19. Click 'Banka kartları aktif mi?'
    GeneratedUtils.sleep(500);
    by = By.xpath("//input[@id='IsDebitActive']/..//img");
    driver.findElement(by).click();

    // 20. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 21. Click 'next1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = 'next']");
    driver.findElement(by).click();

    // 22. Click 'Otomasyon (Silinecek) Güncelle'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='Otomasyon (Silinecek)']/..//a[@title='Güncelle']//img");
    driver.findElement(by).click();

    // 23. Does 'Name' contain 'Otomasyon (Silinecek)'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Name");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Otomasyon (Silinecek)"));

    // 24. Does 'TransactionTypeId' contain 'Provizyon'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#TransactionTypeId");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Provizyon"));

    // 25. Does 'CommApplyTypeId' contain 'Dışında'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CommApplyTypeId");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Dışında"));

    // 26. Does 'ErpCode' contain '28472387642'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ErpCode");
    Assertions.assertTrue(driver.findElement(by).getText().contains("28472387642"));

    // 27. Select options in 'TransactionTypeId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Satış");
    by = By.cssSelector("#TransactionTypeId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 28. Select options in 'CommApplyTypeId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("İçinde");
    by = By.cssSelector("#CommApplyTypeId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 29. Clear 'ErpCode' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ErpCode");
    driver.findElement(by).clear();

    // 30. Type '5464564564646' in 'ErpCode'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ErpCode");
    driver.findElement(by).sendKeys("5464564564646");

    // 31. Clear 'InstallmentLowerLimit' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#InstallmentLowerLimit");
    driver.findElement(by).clear();

    // 32. Type '80' in 'InstallmentLowerLimit'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#InstallmentLowerLimit");
    driver.findElement(by).sendKeys("80");

    // 33. Clear 'ThreeDLimit' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ThreeDLimit");
    driver.findElement(by).clear();

    // 34. Type '90' in 'ThreeDLimit'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ThreeDLimit");
    driver.findElement(by).sendKeys("90");

    // 35. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 36. Is 'Otomasyon (Silinecek) Güncelle' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='Otomasyon (Silinecek)']/..//a[@title='Güncelle']//img");
    driver.findElement(by).isDisplayed();

    // 37. Click 'Otomasyon (Silinecek) Güncelle'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='Otomasyon (Silinecek)']/..//a[@title='Güncelle']//img");
    driver.findElement(by).click();

    // 38. Does 'TransactionTypeId' contain 'Satış'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#TransactionTypeId");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Satış"));

    // 39. Does 'CommApplyTypeId' contain 'İçinde'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CommApplyTypeId");
    Assertions.assertTrue(driver.findElement(by).getText().contains("İçinde"));

    // 40. Does 'ErpCode' contain '5464564564646'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ErpCode");
    Assertions.assertTrue(driver.findElement(by).getText().contains("5464564564646"));

    // 41. Does 'InstallmentLowerLimit' contain '80,00'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#InstallmentLowerLimit");
    Assertions.assertTrue(driver.findElement(by).getText().contains("80,00"));

    // 42. Does 'ThreeDLimit' contain '90,00'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ThreeDLimit");
    Assertions.assertTrue(driver.findElement(by).getText().contains("90,00"));

    // 43. Run Click Until Gone
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
