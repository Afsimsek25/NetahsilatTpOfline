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
 * Test: C852 Site Kullanıcısına Ödeme Seti Atama
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 11:00:35 GMT 2022.
 */
@DisplayName("C852 Site Kullanıcısına Ödeme Seti Atama")
public class C852 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C852 Site Kullanıcısına Ödeme Seti Atama")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    WebExtensions.SelectOptionbyVisibleText selectOptionbyVisibleText;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Move mouse to 'KULLANICI YÖNETİMİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[@title='KULLANICI YÖNETİMİ']/parent::li");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 3. Click 'KULLANICI YÖNETİMİ1'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[title='KULLANICI YÖNETİMİ']");
    driver.findElement(by).click();

    // 4. Click 'KULLANICI LİSTESİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'KULLANICI LİSTESİ']");
    driver.findElement(by).click();

    // 5. Type 'sitekullanicisi@qualitymuseum.com' in 'inputEmailPricinPage'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Email");
    driver.findElement(by).sendKeys("sitekullanicisi@qualitymuseum.com");

    // 6. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 7. Does 'Kulanıcı Listesi Satır 1' contain 'sitekullanicisi@qualitymuseum.com'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("div[class='table'] tr td:nth-child(3)");
    Assertions.assertTrue(driver.findElement(by).getText().contains("sitekullanicisi@qualitymuseum.com"));

    // 8. Click 'Rol/Ekle Çıkar'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='question.png']");
    driver.findElement(by).click();

    // 9. Select options in 'RoleGroupId' with text '[NONE]'
    //    TopluÖdemeSetiTanımlayamayanAdmin Rolü Tanımlanır
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("TopluÖdemeSetiTanımlayamayanAdmin");
    by = By.cssSelector("[name='RoleGroupId']");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 10. Click 'Tamam1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 11. Click 'EditButton'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='fugue/edit.png']");
    driver.findElement(by).click();

    // 12. Click 'ÖdemeSetiBilgileriButton'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='contact.png']");
    driver.findElement(by).click();

    // 13. Click 'VarsayılanÖdemeSeti'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[normalize-space()='Varsayılan ödeme seti']");
    driver.findElement(by).click();

    // 14. Click 'Fiziksel Pos'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[normalize-space()='Fiziksel Pos']");
    driver.findElement(by).click();

    // 15. Click 'Provizyon2'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[normalize-space()='Provizyon']");
    driver.findElement(by).click();

    // 16. Click 'Tamam1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

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