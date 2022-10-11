package netahsilat;

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
 * Test: C632 Bayi Bilgileri Sekmesi
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Thu Oct 06 07:10:54 GMT 2022.
 */
@DisplayName("C632 Bayi Bilgileri Sekmesi")
public class C632 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C632 Bayi Bilgileri Sekmesi")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String deneme) throws
      Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    WebExtensions.GetCssValue getCssValue;

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

    // 5. Click 'ddYeniUyeTanimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[2]/div/img");
    driver.findElement(by).click();

    // 6. Click 'Yeni Bayi Tanımla'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Yeni Bayi Tanımla']");
    driver.findElement(by).click();

    // 7. Click 'buttonKaydiTamamla'
    for (int i = 1; i <= 2; i++) {
      GeneratedUtils.sleep(500);
      by = By.xpath("//button[. = 'Tamam']");
      driver.findElement(by).click();
    }

    // 8. Get value of 'border-color' CSS property on 'Bayi Adi'
    GeneratedUtils.sleep(500);
    getCssValue = WebExtensions.getCssValue("border-color");
    by = By.cssSelector("#Entity_Name");
    getCssValue = (WebExtensions.GetCssValue)((ReportingDriver)driver).addons().execute(getCssValue, by, -1);

    // 9. Get value of 'border-color' CSS property on 'Entity.Email'
    GeneratedUtils.sleep(500);
    getCssValue = WebExtensions.getCssValue("border-color");
    by = By.cssSelector("#Entity_Email");
    getCssValue = (WebExtensions.GetCssValue)((ReportingDriver)driver).addons().execute(getCssValue, by, -1);

    // 10. Get value of 'border-color' CSS property on 'Entity.TaxNumber'
    GeneratedUtils.sleep(500);
    getCssValue = WebExtensions.getCssValue("border-color");
    by = By.cssSelector("#Entity_TaxNumber");
    getCssValue = (WebExtensions.GetCssValue)((ReportingDriver)driver).addons().execute(getCssValue, by, -1);

    // 11. Get value of 'border-color' CSS property on 'Entity.TaxOffice'
    GeneratedUtils.sleep(500);
    getCssValue = WebExtensions.getCssValue("border-color");
    by = By.cssSelector("#Entity_TaxOffice");
    getCssValue = (WebExtensions.GetCssValue)((ReportingDriver)driver).addons().execute(getCssValue, by, -1);

    // 12. Get value of 'border-color' CSS property on 'Entity.CustomerHelpId'
    GeneratedUtils.sleep(500);
    getCssValue = WebExtensions.getCssValue("border-color");
    by = By.cssSelector("#Entity_CustomerHelpId");
    getCssValue = (WebExtensions.GetCssValue)((ReportingDriver)driver).addons().execute(getCssValue, by, -1);

    // 13. Does 'Firma adı boş geçilemez' contain 'Firma adı boş geçilemez'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'Firma adı boş geçilemez']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Firma adı boş geçilemez"));

    // 14. Does 'Email boş geçilemez1' contain 'Email boş geçilemez'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'Email boş geçilemez']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Email boş geçilemez"));

    // 15. Does 'Vergi numarası boş geçilemez' contain 'Vergi numarası boş geçilemez'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'Vergi numarası boş geçilemez']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Vergi numarası boş geçilemez"));

    // 16. Does 'Vergi dairesi boş geçilemez' contain 'Vergi dairesi boş geçilemez'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'Vergi dairesi boş geçilemez']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Vergi dairesi boş geçilemez"));

    // 17. Does 'Lütfen bir müşteri temsilcisi seçiniz' contain 'Lütfen bir müşteri temsilcisi seçiniz'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'Lütfen bir müşteri temsilcisi seçiniz']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Lütfen bir müşteri temsilcisi seçiniz"));

    // 18. Is 'AktifMi?' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[contains(@class,'checked')]//following-sibling::label[text()='Aktif mi?']");
    driver.findElement(by).isDisplayed();

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
