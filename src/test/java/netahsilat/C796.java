package netahsilat;

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
 * Test: C796 Toplu mail order da deptToAmount Tutar alanına sıfır veya hatalı değer girilmesi
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 07:39:00 GMT 2022.
 */
@DisplayName("C796 Toplu mail order da deptToAmount Tutar alanına sıfır veya hatalı değer girilmesi")
public class C796 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C796 Toplu mail order da deptToAmount Tutar alanına sıfır veya hatalı değer girilmesi")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String mail, String startTL,
      String endTL) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;

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

    // 3. Click 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    driver.findElement(by).click();

    // 4. Click 'dropDownOdemeLinki'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[2]/div/img");
    driver.findElement(by).click();

    // 5. Click 'TOPLU E-MAIL ORDER'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'TOPLU E-MAIL ORDER']");
    driver.findElement(by).click();

    // 6. Type '71249112816' in 'VendorName'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#VendorName");
    driver.findElement(by).sendKeys("71249112816");

    // 7. Click 'resultListelenen'
    GeneratedUtils.sleep(500);
    by = By.xpath("//body/ul//div");
    driver.findElement(by).click();

    // 8. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 9. Click 'IsSelected'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[name='IsSelected']");
    driver.findElement(by).click();

    // 10. Click 'strContinue'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[3]/div/button[. = 'strContinue']");
    driver.findElement(by).click();

    // 11. Clear 'inputTutarx' contents
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[3]/input");
    driver.findElement(by).clear();

    // 12. Type '0.75' in 'inputTutarx'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[3]/input");
    driver.findElement(by).sendKeys("0.75");

    // 13. Click 'Tutarlar 0'dan büyük olmalıdır. Lütfe...'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = concat('Tutarlar 0', \"'\", 'dan büyük olmalıdır. Lütfen tutarları kontrol ediniz.')]");
    driver.findElement(by).click();

    // 14. Does 'inputTutarx' contain '75,00'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[3]/input");
    Assertions.assertTrue(driver.findElement(by).getText().contains("75,00"));

    // 15. Clear 'inputTutarx' contents
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[3]/input");
    driver.findElement(by).clear();

    // 16. Type '0.2500' in 'inputTutarx'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[3]/input");
    driver.findElement(by).sendKeys("0.2500");

    // 17. Click 'Tutarlar 0'dan büyük olmalıdır. Lütfe...'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = concat('Tutarlar 0', \"'\", 'dan büyük olmalıdır. Lütfen tutarları kontrol ediniz.')]");
    driver.findElement(by).click();

    // 18. Does 'inputTutarx' contain '2.500,00'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[3]/input");
    Assertions.assertTrue(driver.findElement(by).getText().contains("2.500,00"));

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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","Kd!cyhz4","","",""));
  }
}