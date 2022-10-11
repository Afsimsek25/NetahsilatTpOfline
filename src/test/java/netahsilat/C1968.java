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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C1968 Excel ile site kullanıcı aktarımı - TCKN ve Pasaport Aynı anda kullanmama Validasyonu
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 10:32:45 GMT 2022.
 */
@DisplayName("C1968 Excel ile site kullanıcı aktarımı - TCKN ve Pasaport Aynı anda kullanmama Validasyonu")
public class C1968 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C1968 Excel ile site kullanıcı aktarımı - TCKN ve Pasaport Aynı anda kullanmama Validasyonu")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    WebExtensions.SelectOptionbyVisibleText selectOptionbyVisibleText;
    FileUpload.UploadFileElementAction uploadFileElementAction;

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

    // 4. Click 'KULLANICI AKTARIM'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'KULLANICI AKTARIM']");
    driver.findElement(by).click();

    // 5. Uploads a file to a given element with the 'file' type
    GeneratedUtils.sleep(500);
    uploadFileElementAction = FileUpload.uploadFileElementAction("C:\\TestProject\\C1968.xlsx");
    by = By.cssSelector("#import");
    uploadFileElementAction = (FileUpload.UploadFileElementAction)((ReportingDriver)driver).addons().execute(uploadFileElementAction, by, -1);

    // 6. Click 'Tamam1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 7. Select options in 'primarykey' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Code");
    by = By.cssSelector("#primarykey");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 8. Is 'Aktarımı Başlat' is clickable?
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Aktarımı Başlat']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(by));

    // 9. Click 'Aktarımı Başlat'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Aktarımı Başlat']");
    driver.findElement(by).click();

    // 10. Does 'Uyruk TR iken Pasaport alanı dolu ola...' contain 'Uyruk TR iken Pasaport alanı dolu olamaz Satır : 1 Stun : 6'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//p[. = 'Uyruk TR iken Pasaport alanı dolu olamaz Satır : 1 Stun : 6']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Uyruk TR iken Pasaport alanı dolu olamaz Satır : 1 Stun : 6"));

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
