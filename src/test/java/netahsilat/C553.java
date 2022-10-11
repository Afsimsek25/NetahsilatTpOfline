package netahsilat;

import io.testproject.addon.GridOperations;
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
 * Test: C553 İşlem
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Wed Oct 05 07:43:41 GMT 2022.
 */
@DisplayName("C553 İşlem")
public class C553 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C553 İşlem")
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

    // 6. Type 'NT56154P0000013005' in 'ReferenceNumber'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ReferenceNumber");
    driver.findElement(by).sendKeys("NT56154P0000013005");

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

    // 9. Click 'imgIslem'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='fugue/salesdetail.png']");
    driver.findElement(by).click();

    // 10. Does 'Yapan1' contain 'Yapan'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//strong[. = 'Yapan ']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Yapan"));

    // 11. Does 'Son Ödeme Tarihi' contain 'Son Ödeme Tarihi'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//strong[. = 'Son Ödeme Tarihi']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Son Ödeme Tarihi"));

    // 12. Does 'Gönderen:' contain 'Gönderen:'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//strong[. = 'Gönderen:']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Gönderen:"));

    // 13. Does '1. Alıcı :' contain '1. Alıcı :'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//strong[. = '1. Alıcı :']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("1. Alıcı :"));

    // 14. Does 'Tutar3' contain 'Tutar'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//strong[. = 'Tutar']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Tutar"));

    // 15. Does 'Durum' contain 'Durum'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//strong[. = 'Durum']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Durum"));

    // 16. Does 'Gönderim Tipi' contain 'Gönderim Tipi'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td/strong[. = 'Gönderim Tipi']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Gönderim Tipi"));

    // 17. Does 'Açıklama1' contain 'Açıklama'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//strong[. = 'Açıklama']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Açıklama"));

    // 18. Does 'YapanSibling' contain ':Altt-Musteri'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[normalize-space()='Yapan']//following-sibling::td");
    Assertions.assertTrue(driver.findElement(by).getText().contains(":Altt-Musteri"));

    // 19. Does 'SonÖdemeTarihiSibling' contain ':12.03.2021 10:53:09'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[normalize-space()='Son Ödeme Tarihi']//following-sibling::td");
    Assertions.assertTrue(driver.findElement(by).getText().contains(":12.03.2021 10:53:09"));

    // 20. Does 'GönderenSibling' contain 'Ata Demir - bayi@bayi.com'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[normalize-space()='Gönderen:']//following-sibling::td");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Ata Demir - bayi@bayi.com"));

    // 21. Does '1.AlıcıSibling' contain 'Altt Musteri | emre.sahin@ecozum.com | (021)5252452'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[normalize-space()='1. Alıcı :']//following-sibling::td  ");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Altt Musteri | emre.sahin@ecozum.com | (021)5252452"));

    // 22. Does 'TutarSibling' contain ':12,00₺'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[normalize-space()='Tutar']//following-sibling::td  ");
    Assertions.assertTrue(driver.findElement(by).getText().contains(":12,00₺"));

    // 23. Does 'DurumSibling' contain ':Başarılı'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[normalize-space()='Durum']//following-sibling::td  ");
    Assertions.assertTrue(driver.findElement(by).getText().contains(":Başarılı"));

    // 24. Does 'GönderimTipiSibling' contain ':Email Order'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[normalize-space()='Gönderim Tipi']//following-sibling::td ");
    Assertions.assertTrue(driver.findElement(by).getText().contains(":Email Order"));

    // 25. Does 'AçıklamaSibling' contain ':test'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[normalize-space()='Açıklama']//following-sibling::td");
    Assertions.assertTrue(driver.findElement(by).getText().contains(":test"));

    // 26. Click 'Kapat1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Kapat']");
    driver.findElement(by).click();

    // 27. Run Get Data From Grid
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("Tutar","12,00₺","Equals");
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