package netahsilat;


import io.testproject.addon.ImapMailOperations;
import io.testproject.addon.MailOperations;
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

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C345	Şifremi Unuttum fonksiyon kontrolü
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Tue Sep 27 16:49:47 GMT 2022.
 */
@DisplayName("C345\tŞifremi Unuttum fonksiyon kontrolü")
public class C345 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C345 Şifremi Unuttum fonksiyon kontrolü")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String email, String emailPassword) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    String string;
    ImapMailOperations.ReadSpecificsMail readSpecificsMail;
    ImapMailOperations.DeleteAllMails deleteAllMails;

    // 1. Delete All Mails
    MailOperations mailOperations = new MailOperations();
    mailOperations.deleteAllMail("netahsilatotomasyon@yandex.com","welukfoxtqirhuhy");

    // 2. Navigate to '{{ApplicationURL}}'
    //    Navigates the specified URL (Auto-generated)
    GeneratedUtils.sleep(500);
    driver.navigate().to(ApplicationURL);

    // 3. Click 'Şifremi Unuttum'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Şifremi Unuttum']");
    driver.findElement(by).click();

    // 4. Type '{{odemeEmail}}' in 'id=[recovery-mail]'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#recovery-mail");
    driver.findElement(by).sendKeys(ProjectParameters.odemeEmail);

    // 5. Click 'Email Gönder'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#submit-button");
    driver.findElement(by).click();

    // 6. Does 'txtScreen' contain 'Girdiğiniz e-mail adresine kayıtlı bir kullanıcı hesabınız var ise onay linki adresinize gönderilmiştir.'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#TextScreen");
    GeneratedUtils.sleep(1000);
    Assertions.assertTrue(driver.findElement(by).getText().contains("Girdiğiniz e-mail adresine kayıtlı bir kullanıcı hesabınız var ise onay linki adresinize gönderilmiştir."));

    // 7. Pause for '6000'ms
    GeneratedUtils.sleep(6000);

    // 8. Get current URL
    GeneratedUtils.sleep(500);
    string = driver.getCurrentUrl();
    Assertions.assertEquals("https://otomasyon.netahsilatdemo.com/", string);

    // 9. Output searched string in specific mail
    GeneratedUtils.sleep(500);
    mailOperations.getMails(ProjectParameters.odemeEmail,ProjectParameters.yandexMailKey,"VerificationPassword","C:/TestProject/mail/C345.html");

    // 10. Navigate to 'file:///C:/TestProject/mail/C345.html'
    GeneratedUtils.sleep(500);
    driver.navigate().to("file:///C:/TestProject/mail/C345.html");

    // 11. Click 'dogrulamaLinki'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a");
    driver.findElement(by).click();

    // 12. Type '{{genelPassword}}!!!' in 'Password'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Password");
    driver.findElement(by).sendKeys(String.format("%s!!!",ProjectParameters.genelPassword));

    // 13. Type '{{genelPassword}}!!!' in 'RepeatPassword'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#RepeatPassword");
    driver.findElement(by).sendKeys(String.format("%s!!!",ProjectParameters.genelPassword));

    // 14. Click 'Kaydet'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Kaydet']");
    driver.findElement(by).click();

    // 15. Type '{{odemeEmail}}' in 'UserName'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#UserName");
    driver.findElement(by).sendKeys(ProjectParameters.odemeEmail);

    // 16. Type '{{genelPassword}}!!!' in 'Password'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Password");
    driver.findElement(by).sendKeys(String.format("%s!!!",ProjectParameters.genelPassword));

    // 17. Click 'GİRİŞ'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#form-submit");
    driver.findElement(by).click();

    // 18. Click 'Bilgi Güncelle'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Bilgi Güncelle']");
    driver.findElement(by).click();

    // 19. Type '{{genelPassword}}!!!' in 'OldPassword'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#OldPassword");
    driver.findElement(by).sendKeys(String.format("%s!!!",ProjectParameters.genelPassword));

    // 20. Type '{{genelPassword}}' in 'Password1'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Password");
    driver.findElement(by).sendKeys(ProjectParameters.genelPassword);

    // 21. Type '{{genelPassword}}' in 'RePassword'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#RePassword");
    driver.findElement(by).sendKeys(ProjectParameters.genelPassword);

    // 22. Click 'btnKaydetProfilPage'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[value=\"KAYDET\"][class*=\"user-register-button\"]");
    driver.findElement(by).click();

    // 23. Type '{{odemeEmail}}' in 'UserName'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#UserName");
    driver.findElement(by).sendKeys(ProjectParameters.odemeEmail);

    // 24. Type '{{genelPassword}}' in 'Password'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Password");
    driver.findElement(by).sendKeys(ProjectParameters.genelPassword);

    // 25. Click 'GİRİŞ'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#form-submit");
    driver.findElement(by).click();

    // 26. Is 'Bilgi Güncelle' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Bilgi Güncelle']");
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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@e-cozum.com","kY2*m5J"));
  }
}