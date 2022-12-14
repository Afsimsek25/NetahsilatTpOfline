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
 * Test: C2107 Vadeli Fatura Seti Ekleme
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 11:28:59 GMT 2022.
 */
@DisplayName("C2107 Vadeli Fatura Seti Ekleme")
public class C2107 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C2107 Vadeli Fatura Seti Ekleme")
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

    // 2. Move mouse to 'moveToSiteY??netimi'
    by = By.cssSelector("li[class='config']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 3. Click 'moveToSiteY??netimi'
    by = By.cssSelector("li[class='config']");
    driver.findElement(by).click();

    // 4. Move mouse to 'ddPosAyarlari'
    by = By.xpath("//a[@title='POS AYARLARI']/..//img");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 5. Click 'VADEL?? FATURA'
    by = By.xpath("//a[. = 'VADEL?? FATURA']");
    driver.findElement(by).click();

    // 6. Click 'Set Ekle'
    by = By.xpath("//a[. = 'Set Ekle']");
    driver.findElement(by).click();

    // 7. Type 'Otomasyon (Silme) C2107' in 'Name2'
    by = By.cssSelector("#Name");
    driver.findElement(by).sendKeys("Otomasyon (Silme) C2107");

    // 8. Type 'C2107' in 'input[id='Code']'
    by = By.cssSelector("input[id='Code']");
    driver.findElement(by).sendKeys("C2107");

    // 9. Run Click Until Gone
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 10. Is 'C2107' visible?
    by = By.xpath("//td[. = 'C2107']");
    driver.findElement(by).isDisplayed();

    // 11. Move mouse to 'ddPosAyarlari'
    by = By.xpath("//a[@title='POS AYARLARI']/..//img");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 12. Click '??DEME SETLER??'
    by = By.xpath("//a[. = '??DEME SETLER??']");
    driver.findElement(by).click();

    // 13. Click 'btnNextOnGrid'
    by = By.cssSelector("span[class='t-icon t-arrow-next'] ");
    driver.findElement(by).click();

    // 14. Click 'Detail Vadeli Fatura ??deme Seti'
    by = By.xpath("//td[text()='Vadeli Fatura ??deme Seti']/..//img[contains(@src,'detail')]");
    driver.findElement(by).click();

    // 15. Click 'Edit Akbank1(manuel a????klama)'
    by = By.xpath("//td[text()='Akbank1(manuel a????klama)']/..//img[contains(@src,'edit')]");
    driver.findElement(by).click();

    // 16. Select options in 'TermInvoiceSetId' with text '[NONE]'
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Otomasyon (Silme) C2107");
    by = By.cssSelector("#TermInvoiceSetId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 17. Run Click Until Gone
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 18. Click 'Edit Akbank1(manuel a????klama)'
    by = By.xpath("//td[text()='Akbank1(manuel a????klama)']/..//img[contains(@src,'edit')]");
    driver.findElement(by).click();

    // 19. Does 'TermInvoiceSetId' contain 'Otomasyon (Silme) C2107'?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("#TermInvoiceSetId");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Otomasyon (Silme) C2107"));
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
