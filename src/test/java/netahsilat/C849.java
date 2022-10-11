package netahsilat;

import io.testproject.addon.RandomDataGenerator;
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
 * Test: C849 Bayi giriş yaparak üyeliksiz email order göndermesi,işlem sonrası listedeki durumu kontrol edilmeli
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 07:43:13 GMT 2022.
 */
@DisplayName("C849 Bayi giriş yaparak üyeliksiz email order göndermesi,işlem sonrası listedeki durumu kontrol edilmeli")
public class C849 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C849 Bayi giriş yaparak üyeliksiz email order göndermesi,işlem sonrası listedeki durumu kontrol edilmeli")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String mail, String url,
      String randomNumber) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    RandomDataGenerator.GenerateNumberInRange generateNumberInRange;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Move mouse to 'ÖDEME LİNKİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'ÖDEME LİNKİ']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 3. Click 'ÖDEME LİNKİ GÖNDER'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'ÖDEME LİNKİ GÖNDER']");
    driver.findElement(by).click();

    // 4. Is 'Üyeliksiz Ödeme Linki1' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//legend[. = '\nÜyeliksiz Ödeme Linki                ']");
    driver.findElement(by).isDisplayed();

    // 5. Clear 'PureAmount' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#PureAmount");
    driver.findElement(by).clear();

    // 6. Type '85,85' in 'PureAmount'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#PureAmount");
    driver.findElement(by).sendKeys("85,85");

    // 7. Click 'Mail Order Devam Et'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[value='Devam Et']");
    driver.findElement(by).click();

    // 8. Generate random number between '0' and '999999999'
    GeneratedUtils.sleep(500);
    generateNumberInRange = RandomDataGenerator.generateNumberInRange("0","999999999");
    generateNumberInRange = (RandomDataGenerator.GenerateNumberInRange)((ReportingDriver)driver).addons().execute(generateNumberInRange);
    randomNumber = String.valueOf(generateNumberInRange.result);

    // 9. Type '{{randomNumber}}' in 'inputUnvan'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#DisplayName");
    driver.findElement(by).sendKeys(randomNumber);

    // 10. Type 'otomasyon' in 'FullName'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#FullName");
    driver.findElement(by).sendKeys("otomasyon");

    // 11. Type 'netahsilatotomasyon@yandex.com' in 'EMail'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#EMail");
    driver.findElement(by).sendKeys("netahsilatotomasyon@yandex.com");

    // 12. Type '5555555555' in 'Telefon Numarası'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Phone");
    driver.findElement(by).sendKeys("5555555555");

    // 13. Type 'Quality Museum' in 'Description'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Description");
    driver.findElement(by).sendKeys("Quality Museum");

    // 14. Click 'Ekle3'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Ekle']");
    driver.findElement(by).click();

    // 15. Is 'netahsilatotomasyon@yandex.com1' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[. = 'netahsilatotomasyon@yandex.com']");
    driver.findElement(by).isDisplayed();

    // 16. Click 'unvanEkle'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[1]/input[@type=\"checkbox\"][@data-bind=\"visible: emailOrSmsCheckEnable(), checked: isChecked\"]");
    driver.findElement(by).click();

    // 17. Click 'emailGonder'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[5]/div[1]/input");
    driver.findElement(by).click();

    // 18. Is 'Ödeme linki gönderilmiştir' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//p[. = 'Ödeme linki gönderilmiştir']");
    driver.findElement(by).isDisplayed();

    // 19. Click 'Ödeme Linki Listesi 2'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[text()='Ödeme Linki Listesi']");
    driver.findElement(by).click();

    // 20. Click 'IsOwnTransactions'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#IsOwnTransactions");
    driver.findElement(by).click();

    // 21. Click 'btnGetirOdemeLinki'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[Value='Getir']");
    driver.findElement(by).click();

    // 22. Is 'randomOdemeLinki' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath(String.format("//th[text()='%s']",randomNumber));
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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","Kd!cyhz4","","",""));
  }
}