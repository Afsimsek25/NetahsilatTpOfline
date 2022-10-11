package netahsilat;

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
 * Test: C834 üye yerine ödeme
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Wed Oct 05 12:01:51 GMT 2022.
 */
@DisplayName("C834 üye yerine ödeme")
public class C834 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C834 üye yerine ödeme")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String password, String userName, String odemeLinki) throws
      Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodGeneldeme methodgeneldeme;
    MethodLogoutlogin methodlogoutlogin;
    WebExtensions.GetElementAttribute getElementAttribute;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Move mouse to 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 3. Click 'ustUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[4]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 4. Click 'altUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 5. Type '{{odemeEmail}}' in 'SearchVendorNameVN'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys(ProjectParameters.odemeEmail);

    // 6. Click 'Bireysel Türk (- Yok)'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[contains(text(),',71249112816')] ");
    driver.findElement(by).click();

    // 7. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 8. Is 'Bireysel türk' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[. = 'Bireysel türk  ']");
    driver.findElement(by).isDisplayed();

    // 9. Get 'href' attribute value on 'Ödeme1'
    GeneratedUtils.sleep(500);
    getElementAttribute = WebExtensions.getElementAttribute("href");
    by = By.xpath("//a[. = 'Ödeme']");
    getElementAttribute = (WebExtensions.GetElementAttribute)((ReportingDriver)driver).addons().execute(getElementAttribute, by, -1);
    odemeLinki = String.valueOf(getElementAttribute.attributeValue);

    // 10. Navigate to '{{odemeLinki}}'
    GeneratedUtils.sleep(500);
    driver.navigate().to(odemeLinki);

    // 11. Clear 'PureAmount' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#PureAmount");
    driver.findElement(by).clear();

    // 12. Type '435' in 'PureAmount'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#PureAmount");
    driver.findElement(by).sendKeys("435");

    // 13. Click 'Taksit Seçimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#installment-selection-text");
    driver.findElement(by).click();

    // 14. Run Method Genel Ödeme
    GeneratedUtils.sleep(500);
    methodgeneldeme = new MethodGeneldeme();
    methodgeneldeme.ApplicationURL = ApplicationURL;
    methodgeneldeme.execute(driver);

    // 15. Type 'Quality Museum' in 'aciklama_10'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[normalize-space()='Açıklama']/..//input");
    driver.findElement(by).sendKeys("Quality Museum");

    // 16. Click 'AXESS Tek Çekim Posu'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("td[class*='commRate-20'] input");
    driver.findElement(by).click();

    // 17. Click 'odemeTalimatiOlustur'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[value='ÖDEME TALİMATI OLUŞTUR']");
    driver.findElement(by).click();

    // 18. Click 'btnNormalPayment'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#btnNormalPayment");
    driver.findElement(by).click();

    // 19. Is 'txtReferansNumarasi' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(115000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("(//p[@class='payment-result-text'])[1]");
    driver.findElement(by).isDisplayed();
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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","Kd!cyhz4","otomasyon@test.com",""));
  }
}
