package netahsilat;

import io.testproject.addon.ImapMailOperations;
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
 * Test: C1484 Email orderda gönderilen açıklama değiştirildiğinde ödeme detayında da değişmiş olmalı
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 07:47:16 GMT 2022.
 */
@DisplayName("C1484 Email orderda gönderilen açıklama değiştirildiğinde ödeme detayında da değişmiş olmalı")
public class C1484 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C1484 Email orderda gönderilen açıklama değiştirildiğinde ödeme detayında da değişmiş olmalı")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String mail, String url)
      throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    ImapMailOperations.ReadSpecificsMail readSpecificsMail;
    ImapMailOperations.DeleteAllMails deleteAllMails;
    WebExtensions.AcceptAlert acceptAlert;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Delete All Mails
    //    netahsilatlimitli@yandex.com
    // bxebneuudvaycbbp
    GeneratedUtils.sleep(500);
    deleteAllMails = ImapMailOperations.deleteAllMails("netahsilatlimitli@yandex.com","bxebneuudvaycbbp");
    deleteAllMails = (ImapMailOperations.DeleteAllMails)((ReportingDriver)driver).addons().execute(deleteAllMails);

    // 3. Delete All Mails
    //    netahsilatotomasyon@yandex.com
    // cishmttwpcryalzi
    GeneratedUtils.sleep(500);
    deleteAllMails = ImapMailOperations.deleteAllMails("netahsilatotomasyon@yandex.com","cishmttwpcryalzi");
    deleteAllMails = (ImapMailOperations.DeleteAllMails)((ReportingDriver)driver).addons().execute(deleteAllMails);

    // 4. Move mouse to 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 5. Click 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    driver.findElement(by).click();

    // 6. Click 'dropDownOdemeLinki'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[2]/div/img");
    driver.findElement(by).click();

    // 7. Click 'TOPLU E-MAIL ORDER'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'TOPLU E-MAIL ORDER']");
    driver.findElement(by).click();

    // 8. Type '16797722124' in 'VendorName'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#VendorName");
    driver.findElement(by).sendKeys("16797722124");

    // 9. Click 'resultListelenen'
    GeneratedUtils.sleep(500);
    by = By.xpath("//body/ul//div");
    driver.findElement(by).click();

    // 10. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 11. Click 'IsSelected'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[name='IsSelected']");
    driver.findElement(by).click();

    // 12. Click 'strContinue'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[3]/div/button[. = 'strContinue']");
    driver.findElement(by).click();

    // 13. Click 'Tutara aktar'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#setamountdebt");
    driver.findElement(by).click();

    // 14. Click 'strContinue1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[2][. = 'strContinue']");
    driver.findElement(by).click();

    // 15. Clear 'description1' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#description");
    driver.findElement(by).clear();

    // 16. Type 'testotomasyonOG123' in 'description1'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#description");
    driver.findElement(by).sendKeys("testotomasyonOG123");

    // 17. Click 'Gönder1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Gönder']");
    driver.findElement(by).click();

    // 18. Accept alert
    GeneratedUtils.sleep(500);
    acceptAlert = WebExtensions.acceptAlert(1000);
    acceptAlert = (WebExtensions.AcceptAlert)((ReportingDriver)driver).addons().execute(acceptAlert);

    // 19. Output searched string in specific mail
    GeneratedUtils.sleep(500);
    readSpecificsMail = ImapMailOperations.readSpecificsMail("netahsilatlimitli@yandex.com","bxebneuudvaycbbp","testotomasyonOG123","C:\\TestProject\\mail\\email.html");
    readSpecificsMail = (ImapMailOperations.ReadSpecificsMail)((ReportingDriver)driver).addons().execute(readSpecificsMail);

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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","Kd!cyhz4","",""));
  }
}
