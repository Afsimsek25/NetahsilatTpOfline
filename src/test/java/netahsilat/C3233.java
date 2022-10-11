package netahsilat;

import io.testproject.addon.ImapMailOperations;
import io.testproject.addon.VisibleElementsOperations;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.web.RemoteWebDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
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

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C3233
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Sun Oct 09 20:59:27 GMT 2022.
 */
@DisplayName("C3233")
public class C3233 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C3233")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogin methodlogin;
    ImapMailOperations.ReadSpecificsMail readSpecificsMail;
    ImapMailOperations.DeleteAllMails deleteAllMails;
    VisibleElementsOperations.ClickIfVisibleWeb clickIfVisibleWeb;

    // 1. Navigate to '{{Otomasyon2Logout}}'
    GeneratedUtils.sleep(500);
    driver.navigate().to(ProjectParameters.Otomasyon2Logout);

    // 2. Run Method Login
    GeneratedUtils.sleep(500);
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = ProjectParameters.genelEmail;
    methodlogin.password = ProjectParameters.genelPassword;
    methodlogin.execute(driver);

    // 3. Delete All Mails
    GeneratedUtils.sleep(500);
    deleteAllMails = ImapMailOperations.deleteAllMails(ProjectParameters.odemeEmail,ProjectParameters.yandexMailKey);
    deleteAllMails = (ImapMailOperations.DeleteAllMails)((ReportingDriver)driver).addons().execute(deleteAllMails);

    // 4. Move mouse to 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 5. Click 'ustUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[4]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 6. Click 'altUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 7. Type 'netahsilatotomasyon@yandex.com' in 'SearchVendorName'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("netahsilatotomasyon@yandex.com");

    // 8. Click 'SearchVendorName'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).click();

    // 9. Click 'Bireysel türk (Otomasyon2 E-Çözüm),71...'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[. = 'Bireysel türk (Otomasyon2 E-Çözüm),71249112816,, netahsilatotomasyon@yandex.com']");
    driver.findElement(by).click();

    // 10. Click 'Listele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 11. Is 'Listele' is clickable?
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(by));

    // 12. Click 'Ödeme'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Ödeme']");
    driver.findElement(by).click();

    // 13. Switch to window '1'
    GeneratedUtils.sleep(500);
    driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[1]);

    // 14. Click 'Masterpass Close button' if it's visible
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//div[@data-bind=\"visible: masterPassStep() == 'mp-update-identity'\"]//button[@type='button'][normalize-space()='×']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 15. Click 'KART KAYDI LİNKİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'KART KAYDI LİNKİ']");
    driver.findElement(by).click();

    // 16. Click 'EmailTypeSelection'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#EmailTypeSelection");
    driver.findElement(by).click();

    // 17. Does 'netahsilatotomasyon@yandex.com' contain 'netahsilatotomasyon@yandex.com'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[. = 'netahsilatotomasyon@yandex.com']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("netahsilatotomasyon@yandex.com"));

    // 18. Click 'Gönder'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Gönder']");
    driver.findElement(by).click();

    // 19. Is 'İşleminiz başarıyla tamamlanmıştır' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//h4[. = 'İşleminiz başarıyla tamamlanmıştır']");
    driver.findElement(by);

    // 20. Is 'Ana Sayfa' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Ana Sayfa']");
    driver.findElement(by);

    // 21. Is 'Kart Kayıt Linki Gönder' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Kart Kayıt Linki Gönder ']");
    driver.findElement(by);

    // 22. Output searched string in specific mail
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    readSpecificsMail = ImapMailOperations.readSpecificsMail(ProjectParameters.odemeEmail,ProjectParameters.yandexMailKey,"E-Çözüm","C:/TestProject/mail/C3233.html");
    readSpecificsMail = (ImapMailOperations.ReadSpecificsMail)((ReportingDriver)driver).addons().execute(readSpecificsMail);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 23. Navigate to 'file:///C:/TestProject/mail/C3233.html'
    GeneratedUtils.sleep(500);
    driver.navigate().to("file:///C:/TestProject/mail/C3233.html");

    // 24. Click 'Kart Kaydı yapmak için lütfen tıklayı...'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Kart Kaydı yapmak için lütfen tıklayınız...']");
    driver.findElement(by).click();

    // 25. Click 'Masterpass Close button' if it's visible
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//div[@data-bind=\"visible: masterPassStep() == 'mp-update-identity'\"]//button[@type='button'][normalize-space()='×']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 26. Click 'KAYDET1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[text()='Kaydet']");
    driver.findElement(by).click();

    // 27. Is 'Lütfen Masterpass kullanıcı sözleşmes...' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'Lütfen Masterpass kullanıcı sözleşmesini onaylayınız.']");
    driver.findElement(by);

    // 28. Is 'Kart üzerindeki isim boş geçilemez' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'Kart üzerindeki isim boş geçilemez']");
    driver.findElement(by);

    // 29. Is 'Kart numarası boş geçilemez' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'Kart numarası boş geçilemez']");
    driver.findElement(by);

    // 30. Is 'Son kullanma tarihi boş geçilemez' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'Son kullanma tarihi boş geçilemez']");
    driver.findElement(by);

    // 31. Is 'CVV boş geçilemez' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'CVV boş geçilemez']");
    driver.findElement(by);

    // 32. Does 'Masterpass kart saklama alt yapısı sözleşme' contain 'Masterpass kart saklama alt yapısı kullanım şartlarını okudum, onaylıyorum'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[contains(text(),'şart')]");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Masterpass kart saklama alt yapısı kullanım şartlarını okudum, onaylıyorum"));

    // 33. Is 'IMG' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label/img");
    driver.findElement(by);

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
    return Stream.of(Arguments.of("https://otomasyon2.netahsilatdemo.com/"));
  }
}