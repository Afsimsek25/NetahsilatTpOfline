package netahsilat;

import io.testproject.addon.DateTimeOperations;
import io.testproject.addon.ImapMailOperations;
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
 * Test: C3239 MS - Kart kayıt linki Email, Sms ve QR özelinde başarılı bir şekilde gönderilmelidir. (Admin Yerine Ödeme Üzerinden)
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 11:31:03 GMT 2022.
 */
@DisplayName("C3239 MS - Kart kayıt linki Email, Sms ve QR özelinde başarılı bir şekilde gönderilmelidir. (Admin Yerine Ödeme Üzerinden)")
public class C3239 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C3239 MS - Kart kayıt linki Email, Sms ve QR özelinde başarılı bir şekilde gönderilmelidir. (Admin Yerine Ödeme Üzerinden)")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String CurrentDate,
      String After59Days) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogin methodlogin;
    String string;
    ImapMailOperations.ReadSpecificsMail readSpecificsMail;
    ImapMailOperations.DeleteAllMails deleteAllMails;
    DateTimeOperations.SetDays setDays;
    VisibleElementsOperations.ClickIfVisibleWeb clickIfVisibleWeb;
    WebExtensions.SetElementAttribute setElementAttribute;
    DateTimeOperations.CurrentDate currentDate;

    // 1. Navigate to '{{Otomasyon3Logout}}'
    driver.navigate().to(ProjectParameters.Otomasyon3Logout);

    // 2. Run Method Login
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = ProjectParameters.genelEmail;
    methodlogin.password = ProjectParameters.genelPassword;
    methodlogin.execute(driver);

    // 3. Delete All Mails
    deleteAllMails = ImapMailOperations.deleteAllMails("netahsilatotomasyon@yandex.com",ProjectParameters.yandexMailKey);
    deleteAllMails = (ImapMailOperations.DeleteAllMails)((ReportingDriver)driver).addons().execute(deleteAllMails);

    // 4. Move mouse to 'moveUstUyeYonetimi'
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 5. Click 'ustUyeYonetimi'
    by = By.xpath("//li[4]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 6. Click 'altUyeYonetimi'
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 7. Type 'netahsilatotomasyon@yandex.com' in 'SearchVendorName'
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("netahsilatotomasyon@yandex.com");

    // 8. Click 'resultListelenen'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    by = By.xpath("//body/ul//div");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

    // 9. Click 'Listele'
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 10. Is 'Listele' is clickable?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    by = By.xpath("//button[. = 'Listele']");
    (new WebDriverWait(driver, 35)).until(ExpectedConditions.elementToBeClickable(by));
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

    // 11. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

    // 12. Set 'target' attribute value on 'Ödeme'
    setElementAttribute = WebExtensions.setElementAttribute("target","_top");
    by = By.xpath("//a[. = 'Ödeme']");
    setElementAttribute = (WebExtensions.SetElementAttribute)((ReportingDriver)driver).addons().execute(setElementAttribute, by, -1);

    // 13. Click 'Ödeme'
    by = By.xpath("//a[. = 'Ödeme']");
    driver.findElement(by).click();

    // 14. Is 'Bireysel türk1' visible?
    by = By.xpath("//strong[. = 'Bireysel türk']");
    driver.findElement(by).isDisplayed();

    // 15. Click 'KART KAYDI LİNKİ'
    by = By.xpath("//a[. = 'KART KAYDI LİNKİ']");
    driver.findElement(by).click();

    // 16. Click 'EmailTypeSelection (Unchecked)'
    by = By.cssSelector("#EmailTypeSelection:not(:checked)");
    driver.findElement(by).click();

    // 17. Does 'netahsilatotomasyon@yandex.com' contain 'netahsilatotomasyon@yandex.com'?
    by = By.xpath("//td[. = 'netahsilatotomasyon@yandex.com']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("netahsilatotomasyon@yandex.com"));

    // 18. Is 'INPUT' visible and selected?
    by = By.xpath("//td/input[1]");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.elementSelectionStateToBe(by, true));

    // 19. Click 'Gönder'
    by = By.xpath("//button[. = 'Gönder']");
    driver.findElement(by).click();

    // 20. Is 'İşleminiz başarıyla tamamlanmıştır' visible?
    by = By.xpath("//h4[. = 'İşleminiz başarıyla tamamlanmıştır']");
    driver.findElement(by).isDisplayed();

    // 21. Is 'Ana Sayfa' visible?
    by = By.xpath("//a[. = 'Ana Sayfa']");
    driver.findElement(by).isDisplayed();

    // 22. Is 'Kart Kayıt Linki Gönder' visible?
    by = By.xpath("//a[. = 'Kart Kayıt Linki Gönder ']");
    driver.findElement(by).isDisplayed();

    // 23. Output searched string in specific mail
    readSpecificsMail = ImapMailOperations.readSpecificsMail("netahsilatotomasyon@yandex.com",ProjectParameters.yandexMailKey,"http://otomasyon3.netahsilatdemo.com/","C:/TestProject/mail/C3239.html");
    readSpecificsMail = (ImapMailOperations.ReadSpecificsMail)((ReportingDriver)driver).addons().execute(readSpecificsMail);

    // 24. Navigate to 'file:///C:/TestProject/mail/C3239.html'
    driver.navigate().to("file:///C:/TestProject/mail/C3239.html");

    // 25. Does 'http://otomasyon3.netahsilatdemo.com/' contain 'http://otomasyon3.netahsilatdemo.com/'?
    by = By.cssSelector("#SITE");
    Assertions.assertTrue(driver.findElement(by).getText().contains("http://otomasyon3.netahsilatdemo.com/"));

    // 26. Does 'E-Çözüm' contain 'E-Çözüm'?
    by = By.cssSelector("#FIRMA");
    Assertions.assertTrue(driver.findElement(by).getText().contains("E-Çözüm"));

    // 27. Get current date
    currentDate = DateTimeOperations.currentDate("dd.MM.yyyy");
    currentDate = (DateTimeOperations.CurrentDate)((ReportingDriver)driver).addons().execute(currentDate);
    CurrentDate = String.valueOf(currentDate.result);

    // 28. Set '61' days to '{{CurrentDate}}'
    setDays = DateTimeOperations.setDays("61",CurrentDate,"dd.MM.yyyy","dd.MM.yyyy");
    setDays = (DateTimeOperations.SetDays)((ReportingDriver)driver).addons().execute(setDays);
    After59Days = String.valueOf(setDays.result);

    // 29. Get text from 'Zaman Asımı2'
    by = By.cssSelector("#ZAMAN_ASIMI");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertTrue(string.startsWith(After59Days));

    // 30. Does 'Unvan (Mail)' contain 'Bireysel türk'?
    by = By.cssSelector("#UNVAN");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Bireysel türk"));

    // 31. Does 'Email' contain 'n********n@y***com'?
    by = By.cssSelector("#Email");
    Assertions.assertTrue(driver.findElement(by).getText().contains("n********n@y***com"));

    // 32. Get text from 'GONDERIM TARIHI (Mail)'
    by = By.cssSelector("#GONDERIM_TARIHI");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertTrue(string.startsWith(CurrentDate));

    // 33. Get text from 'KAYIT_LINKI'
    by = By.cssSelector("#KAYIT_LINKI");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertTrue(string.startsWith("https://thsl.at"));

    // 34. Does 'MOBIL_KOD' contain 'OTOMASYON3'?
    by = By.cssSelector("#MOBIL_KOD");
    Assertions.assertTrue(driver.findElement(by).getText().contains("OTOMASYON3"));

    // 35. Does 'Bayi Kodu ' contain 'OtoTest555'?
    by = By.cssSelector("#BAYI_KODU");
    Assertions.assertTrue(driver.findElement(by).getText().contains("OtoTest555"));

    // 36. Does 'BAYI_ERP_KODU' contain 'OtoTestERP555'?
    by = By.cssSelector("#BAYI_ERP_KODU");
    Assertions.assertTrue(driver.findElement(by).getText().contains("OtoTestERP555"));

    // 37. Does 'Musteri Temsilcisi (Mail)' contain 'admin@netahsilat.com admin'?
    by = By.cssSelector("#MUSTERI_TEMSILCISI");
    Assertions.assertTrue(driver.findElement(by).getText().contains("admin@netahsilat.com admin"));

    // 38. Navigate back
    driver.navigate().back();

    // 39. Click 'KART KAYDI LİNKİ'
    by = By.xpath("//a[. = 'KART KAYDI LİNKİ']");
    driver.findElement(by).click();

    // 40. Click 'EmailTypeSelection (Checked)' if it's visible
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.cssSelector("#EmailTypeSelection:checked");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

    // 41. Click 'SmsTypeSelection (Checked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.cssSelector("#SmsTypeSelection:checked");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 42. Click 'QrTypeSelection (UnChecked)'
    by = By.cssSelector("#QrTypeSelection:not(:checked)");
    driver.findElement(by).click();

    // 43. Click 'Gönder'
    by = By.xpath("//button[. = 'Gönder']");
    driver.findElement(by).click();

    // 44. Is 'QR Kodu İmage' visible?
    by = By.xpath("//img[contains(@src,'data:image/png')]");
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
    return Stream.of(Arguments.of("https://otomasyon3.netahsilatdemo.com/","otomasyon@test.com","Kd!cyhz4","",""));
  }
}