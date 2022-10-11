package netahsilat;

import io.testproject.addon.ImapMailOperations;
import io.testproject.addon.TypeTextSlowly;
import io.testproject.addon.VisibleElementsOperations;
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
 * Test: C3262
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Sun Oct 09 20:43:49 GMT 2022.
 */
@DisplayName("C3262")
public class C3262 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C3262")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String yonlenecekAdres) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogin methodlogin;
    WebExtensions.DeleteAllCookies deleteAllCookies;
    ImapMailOperations.ReadSpecificsMail readSpecificsMail;
    TypeTextSlowly.TypeTextWithControlledSpeed typeTextWithControlledSpeed;
    ImapMailOperations.DeleteAllMails deleteAllMails;
    WebExtensions.GetElementAttribute getElementAttribute;
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

    // 12. Get 'href' attribute value on 'Ödeme'
    GeneratedUtils.sleep(500);
    getElementAttribute = WebExtensions.getElementAttribute("href");
    by = By.xpath("//a[. = 'Ödeme']");
    getElementAttribute = (WebExtensions.GetElementAttribute)((ReportingDriver)driver).addons().execute(getElementAttribute, by, -1);
    yonlenecekAdres = String.valueOf(getElementAttribute.attributeValue);

    // 13. Navigate to '{{yonlenecekAdres}}'
    GeneratedUtils.sleep(500);
    driver.navigate().to(yonlenecekAdres);

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

    // 22. Delete all cookies
    GeneratedUtils.sleep(500);
    deleteAllCookies = WebExtensions.getDeleteAllCookies();
    deleteAllCookies = (WebExtensions.DeleteAllCookies)((ReportingDriver)driver).addons().execute(deleteAllCookies);

    // 23. Output searched string in specific mail
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    readSpecificsMail = ImapMailOperations.readSpecificsMail(ProjectParameters.odemeEmail,ProjectParameters.yandexMailKey,"E-Çözüm","C:/TestProject/mail/C3262.html");
    readSpecificsMail = (ImapMailOperations.ReadSpecificsMail)((ReportingDriver)driver).addons().execute(readSpecificsMail);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 24. Navigate to '{{Otomasyon2Logout}}'
    GeneratedUtils.sleep(500);
    driver.navigate().to(ProjectParameters.Otomasyon2Logout);

    // 25. Navigate to 'file:///C:/TestProject/mail/C3262.html'
    GeneratedUtils.sleep(500);
    driver.navigate().to("file:///C:/TestProject/mail/C3262.html");

    // 26. Click 'Kart Kaydı yapmak için lütfen tıklayı...'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Kart Kaydı yapmak için lütfen tıklayınız...']");
    driver.findElement(by).click();

    // 27. Click 'Masterpass Close button' if it's visible
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//div[@data-bind=\"visible: masterPassStep() == 'mp-update-identity'\"]//button[@type='button'][normalize-space()='×']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 28. Click 'KAYDET1'
    /* Step is disabled
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[text()='Kaydet']");
    driver.findElement(by).click();
    */
    // 29. Type 'MerchantSafe' in 'Kart üzerindeki isim'
    by = By.cssSelector("#CardHolderName");
    driver.findElement(by).sendKeys("MerchantSafe");

    // 30. Type '44444444440' in 'TKC'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#TKC");
    driver.findElement(by).sendKeys("44444444440");

    // 31. Type '5555555555' in 'Phone'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Phone");
    driver.findElement(by).sendKeys("5555555555");

    // 32. Type 'test@test.com' in 'Email1'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Email");
    driver.findElement(by).sendKeys("test@test.com");

    // 33. Type text to a TextField element with a delay between characters.
    GeneratedUtils.sleep(500);
    typeTextWithControlledSpeed = TypeTextSlowly.typeTextWithControlledSpeed("5571135571135575",0);
    by = By.cssSelector("#CardNumber");
    typeTextWithControlledSpeed = (TypeTextSlowly.TypeTextWithControlledSpeed)((ReportingDriver)driver).addons().execute(typeTextWithControlledSpeed, by, -1);

    // 34. Type text to a TextField element with a delay between characters.
    GeneratedUtils.sleep(500);
    typeTextWithControlledSpeed = TypeTextSlowly.typeTextWithControlledSpeed("1226",0);
    by = By.cssSelector("#CardExpireDate");
    typeTextWithControlledSpeed = (TypeTextSlowly.TypeTextWithControlledSpeed)((ReportingDriver)driver).addons().execute(typeTextWithControlledSpeed, by, -1);

    // 35. Type '123' in 'CVV'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CardCvv");
    driver.findElement(by).sendKeys("123");

    // 36. Click 'MasterpassReadAndConfirmTerms'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[name='MasterpassReadAndConfirmTerms']");
    driver.findElement(by).click();

    // 37. Click 'Kaydet3'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[@class='btn btn-primary btn-success']");
    driver.findElement(by).click();

    // 38. Type '2541' in 'send-otp-via-mfs-input'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[2]/div[2]/input");
    driver.findElement(by).sendKeys("2541");
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 39. Click 'TAMAM1'
    GeneratedUtils.sleep(500);
    by = By.xpath("(//button[text()='TAMAM'])[2]");
    driver.findElement(by).click();

    // 40. Does 'Tek kullanımlık şifre doğrulanamadı.' contain 'Tek kullanımlık şifre doğrulanamadı.'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[contains(text(),'şifre')]");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Tek kullanımlık şifre doğrulanamadı."));

    // 41. Click 'Kaydet3'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[@class='btn btn-primary btn-success']");
    driver.findElement(by).click();

    // 42. Type '3264' in 'send-otp-via-mfs-input'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[2]/div[2]/input");
    driver.findElement(by).sendKeys("3264");

    // 43. Click 'TAMAM1'
    GeneratedUtils.sleep(500);
    by = By.xpath("(//button[text()='TAMAM'])[2]");
    driver.findElement(by).click();

    // 44. Does 'Tek kullanımlık şifre doğrulanamadı.' contain 'Tek kullanımlık şifre doğrulanamadı.'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[contains(text(),'şifre')]");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Tek kullanımlık şifre doğrulanamadı."));

    // 45. Click 'Kaydet3'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[@class='btn btn-primary btn-success']");
    driver.findElement(by).click();

    // 46. Type '5846' in 'send-otp-via-mfs-input'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[2]/div[2]/input");
    driver.findElement(by).sendKeys("5846");

    // 47. Click 'TAMAM1'
    GeneratedUtils.sleep(500);
    by = By.xpath("(//button[text()='TAMAM'])[2]");
    driver.findElement(by).click();

    // 48. Run Method Login
    GeneratedUtils.sleep(500);
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = ProjectParameters.genelEmail;
    methodlogin.password = ProjectParameters.genelPassword;
    methodlogin.execute(driver);

    // 49. Move mouse to 'moveToIslemler'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='tag']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 50. Click 'İŞLEMLER'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'İŞLEMLER']");
    driver.findElement(by).click();

    // 51. Click 'KART KAYDETME LINKI LISTELEME1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Kart Kaydetme Linki Listeleme']");
    driver.findElement(by).click();

    // 52. Does 'Maximum Hatalı' contain 'Maximum Hatalı'?
    GeneratedUtils.sleep(500);
    by = By.xpath("(//td[text()='Maximum Hatalı'])[1]");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Maximum Hatalı"));

    // 53. Does 'Pasif' contain 'Pasif'?
    GeneratedUtils.sleep(500);
    by = By.xpath("(//td[text()='Maximum Hatalı'])[1]//following::td[2]");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Pasif"));

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
    return Stream.of(Arguments.of("https://otomasyon2.netahsilatdemo.com/",""));
  }
}
