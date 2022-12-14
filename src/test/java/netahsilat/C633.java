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
 * Test: C633 Ödeme Seti ve Limit Bilgileri Sekmesi
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Thu Oct 06 07:12:05 GMT 2022.
 */
@DisplayName("C633 Ödeme Seti ve Limit Bilgileri Sekmesi")
public class C633 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C633 Ödeme Seti ve Limit Bilgileri Sekmesi")
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

    // 5. Click 'SearchVendorNameVN'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).click();

    // 6. Type '181212' in 'SearchVendorNameVN'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("181212");

    // 7. Click 'resultListelenen'
    GeneratedUtils.sleep(500);
    by = By.xpath("//body/ul//div");
    driver.findElement(by).click();

    // 8. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 9. Is 'Refresh' visible?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();

    // 10. Is 'test bayi' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[contains(text(),'test bayi')] ");
    driver.findElement(by).isDisplayed();

    // 11. Click 'EditButton'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='fugue/edit.png']");
    driver.findElement(by).click();

    // 12. Click 'Ödeme Seti ve Limit Bilgileri'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='paymentset.png']");
    driver.findElement(by).click();

    // 13. Click 'btnLimitBelirlensin'
    GeneratedUtils.sleep(500);
    by = By.xpath("//input[@id='Entity_IsUseLimit']/../span//img");
    driver.findElement(by).click();

    // 14. Type '1111' in 'Entity.Anlik'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_Anlik");
    driver.findElement(by).sendKeys("1111");

    // 15. Click 'Günlük İşlem Limiti'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Günlük İşlem Limiti']");
    driver.findElement(by).click();

    // 16. Type '2222' in 'Entity.Gunluk'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_Gunluk");
    driver.findElement(by).sendKeys("2222");

    // 17. Click 'Aylık İşlem Limiti'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Aylık İşlem Limiti']");
    driver.findElement(by).click();

    // 18. Type '3333' in 'Entity.Aylik'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_Aylik");
    driver.findElement(by).sendKeys("3333");

    // 19. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 20. Click 'EditButton'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='fugue/edit.png']");
    driver.findElement(by).click();

    // 21. Click 'Ödeme Seti ve Limit Bilgileri'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='paymentset.png']");
    driver.findElement(by).click();

    // 22. Does 'Entity.Anlik' contain '1.111,00'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_Anlik");
    Assertions.assertTrue(driver.findElement(by).getText().contains("1.111,00"));

    // 23. Click 'Günlük İşlem Limiti'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Günlük İşlem Limiti']");
    driver.findElement(by).click();

    // 24. Does 'Entity.Gunluk' contain '2.222,00'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_Gunluk");
    Assertions.assertTrue(driver.findElement(by).getText().contains("2.222,00"));

    // 25. Click 'Aylık İşlem Limiti'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Aylık İşlem Limiti']");
    driver.findElement(by).click();

    // 26. Does 'Entity.Aylik' contain '3.333,00'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_Aylik");
    Assertions.assertTrue(driver.findElement(by).getText().contains("3.333,00"));

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
