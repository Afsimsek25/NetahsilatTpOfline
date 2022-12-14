package netahsilat;

import io.testproject.addon.ImapMailOperations;
import io.testproject.addon.JSActions;
import io.testproject.addon.RandomDataGenerator;
import io.testproject.addon.StringUtils;
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
 * Test: C2076 Üyelikli - Tanımlı ödeme linki gönderme ekranı geliştirmeleri (NTH-15254)
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Oct 10 08:40:20 GMT 2022.
 */
@DisplayName("C2076 Üyelikli - Tanımlı ödeme linki gönderme ekranı geliştirmeleri (NTH-15254)")
public class C2076 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C2076 Üyelikli - Tanımlı ödeme linki gönderme ekranı geliştirmeleri (NTH-15254)")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String password, String currentDateTime, String RandomNumber,
      String kartNo, String CVV, String ayYil, String ReferansNumarasi) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodParametrikdemesadeceKartTypeTextWithDelayIsimsiz methodparametrikdemesadecekarttypetextwithdelayisimsiz;
    MethodLogin methodlogin;
    String string;
    ImapMailOperations.ReadSpecificsMail readSpecificsMail;
    StringUtils.GetStringSubstring getStringSubstring;
    JSActions.ClickAction clickAction;
    RandomDataGenerator.GenerateNumberInRange generateNumberInRange;
    ImapMailOperations.DeleteAllMails deleteAllMails;

    // 1. Navigate to '{{Otomasyon2Logout}}'
    //    Navigates the specified URL (Auto-generated)
    GeneratedUtils.sleep(500);
    driver.navigate().to(ProjectParameters.Otomasyon2Logout);

    // 2. Delete All Mails
    GeneratedUtils.sleep(500);
    deleteAllMails = ImapMailOperations.deleteAllMails("musteri.otomasyon2@yandex.com",String.format("%s1",password));
    deleteAllMails = (ImapMailOperations.DeleteAllMails)((ReportingDriver)driver).addons().execute(deleteAllMails);

    // 3. Run Method Login
    //    admin@netahsilat.com
    GeneratedUtils.sleep(500);
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = "admin@netahsilat.com";
    methodlogin.password = ProjectParameters.genelPassword;
    methodlogin.execute(driver);
    currentDateTime = String.valueOf(methodlogin.currentDateTime);

    // 4. Click 'altUyeYonetimi'
    GeneratedUtils.sleep(500);
    clickAction = JSActions.getClickAction();
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 5. Type '4660074530' in 'SearchVendorName'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("4660074530");

    // 6. Click 'Müşteri (Otomasyon2 E-Çözüm 4660074530'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[. = 'Müşteri (Otomasyon2 E-Çözüm),,4660074530']");
    driver.findElement(by).click();

    // 7. Is 'Listele' is clickable?
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(by));

    // 8. Click 'Listele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 9. Is '//td[contains(text(),'Müşteri')]' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[contains(text(),'Müşteri')]");
    driver.findElement(by).isDisplayed();

    // 10. Click 'E-mail order gonder'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='mail_replay.png']");
    driver.findElement(by).click();

    // 11. Click 'Tanımlı ödeme RadioBtn'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[@class='colx3']//input[@name='payment-type']");
    driver.findElement(by).click();

    // 12. Click 'Televizyon 500 Tl checkbox'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='Televizyon 500 TL']/..//input[@type='checkbox']");
    driver.findElement(by).click();

    // 13. Get text from 'Televizyon 500 tl tutar'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='Televizyon 500 TL']/..//input[@type='text']");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("500 TL", string);

    // 14. Click 'Tablet 100 Tl Checkbox'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='Tablet 100 TL']/..//input[@type='checkbox']");
    driver.findElement(by).click();

    // 15. Get text from 'Tablet 100 TL'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='Tablet 100 TL']/..//input[@type='text']");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("100 TL", string);

    // 16. Click 'Ödeme Kalemi Diğer Checkbox'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='Diğer']/..//input[@type='checkbox']");
    driver.findElement(by).click();

    // 17. Clear 'Ödeme Kalemi Diğer Tutar alanı' contents
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='Diğer']/..//input[@type='text']");
    driver.findElement(by).clear();

    // 18. Click 'Ödeme Kalemi Diğer Checkbox'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='Diğer']/..//input[@type='checkbox']");
    driver.findElement(by).click();

    // 19. Type '123' in 'Ödeme Kalemi Diğer Tutar alanı'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='Diğer']/..//input[@type='text']");
    driver.findElement(by).sendKeys("123");

    // 20. Click 'Tutar1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = '\n                    Tutar\n                ']");
    driver.findElement(by).click();

    // 21. Get text from 'PureAmount'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#PureAmount");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("723,00", string);

    // 22. Click 'Devam Et Button'
    GeneratedUtils.sleep(500);
    by = By.xpath("//input[@class='big-button']");
    driver.findElement(by).click();

    // 23. Generate random number between '[NONE]' and '[NONE]'
    GeneratedUtils.sleep(500);
    generateNumberInRange = RandomDataGenerator.generateNumberInRange("","");
    generateNumberInRange = (RandomDataGenerator.GenerateNumberInRange)((ReportingDriver)driver).addons().execute(generateNumberInRange);
    RandomNumber = String.valueOf(generateNumberInRange.result);

    // 24. Type '{{RandomNumber}}' in 'Description'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Description");
    driver.findElement(by).sendKeys(RandomNumber);

    // 25. Click 'Responsive Gonder Button'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[value='Gönder']");
    driver.findElement(by).click();

    // 26. Is 'Ödeme linki gönderilmiştir' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//p[. = 'Ödeme linki gönderilmiştir']");
    driver.findElement(by).isDisplayed();

    // 27. Output searched string in specific mail
    GeneratedUtils.sleep(500);
    readSpecificsMail = ImapMailOperations.readSpecificsMail("musteri.otomasyon2@yandex.com",String.format("%s1",password),RandomNumber,"C:/TestProject/mail/C2076.html");
    readSpecificsMail = (ImapMailOperations.ReadSpecificsMail)((ReportingDriver)driver).addons().execute(readSpecificsMail);

    // 28. Navigate to 'file:///C:/TestProject/mail/C2076.html'
    GeneratedUtils.sleep(500);
    driver.navigate().to("file:///C:/TestProject/mail/C2076.html");

    // 29. Click 'Ödeme yapmak için lütfen tıklayınız'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#odemelinki");
    driver.findElement(by).click();

    // 30. Click 'Masterpass close Button2'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[@data-bind=\"visible: masterPassStep() == 'otp-for-update-user'\"]//button[@type='button'][normalize-space()='×']");
    driver.findElement(by).click();

    // 31. Get text from 'Televizyon 500 Tl Tutar2'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='Televizyon 500 TL']/..//td[3]");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("500", string);

    // 32. Get text from 'Tablet 100 Tl Tutar'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='Tablet 100 TL']/..//td[3]");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("100", string);

    // 33. Run Method Parametrik Ödeme (Sadece Kart - Type text with delay)  - İsimsiz
    GeneratedUtils.sleep(500);
    methodparametrikdemesadecekarttypetextwithdelayisimsiz = new MethodParametrikdemesadeceKartTypeTextWithDelayIsimsiz();
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.kartNo = kartNo;
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.CVV = CVV;
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.ayYil = ayYil;
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.adSoyad = "Müşteri new";
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.execute(driver);

    // 34. Click 'Akbank Tek Çekim Genel Pos'
    GeneratedUtils.sleep(500);
    by = By.xpath("(//td[contains(@class,'commRate-20')])[1]");
    driver.findElement(by).click();

    // 35. Click 'btnNormalPayment'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#btnNormalPayment");
    driver.findElement(by).click();

    // 36. Is 'Payment Efekti' visible?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("div[class='spinner']");
    driver.findElement(by).isDisplayed();

    // 37. Get text from 'txtReferansNumarasi'
    GeneratedUtils.sleep(500);
    by = By.xpath("(//p[@class='payment-result-text'])[1]");
    string = driver.findElement(by).getAttribute("value");
    ReferansNumarasi = String.valueOf(string);

    // 38. Get substring of '{{ReferansNumarasi}}' from '42' to '[NONE]'
    GeneratedUtils.sleep(500);
    getStringSubstring = StringUtils.getStringSubstring(42,0,ReferansNumarasi);
    getStringSubstring = (StringUtils.GetStringSubstring)((ReportingDriver)driver).addons().execute(getStringSubstring);
    ReferansNumarasi = String.valueOf(getStringSubstring.result);

    // 39. Navigate to '{{Otomasyon2Logout}}'
    //    Navigates the specified URL (Auto-generated)
    GeneratedUtils.sleep(500);
    driver.navigate().to(ProjectParameters.Otomasyon2Logout);

    // 40. Run Method Login
    //    admin@netahsilat.com
    GeneratedUtils.sleep(500);
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = "admin@netahsilat.com";
    methodlogin.password = password;
    methodlogin.execute(driver);
    currentDateTime = String.valueOf(methodlogin.currentDateTime);

    // 41. Click 'İŞLEM LİSTESİ'
    GeneratedUtils.sleep(500);
    clickAction = JSActions.getClickAction();
    by = By.xpath("//a[. = 'İŞLEM LİSTESİ']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 42. Type '{{ReferansNumarasi}}' in 'ReferenceNumber'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ReferenceNumber");
    driver.findElement(by).sendKeys(ReferansNumarasi);

    // 43. Click 'Listele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 44. Is 'Listele' is clickable?
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(by));

    // 45. Move mouse to 'Grid Ödeme Kalemlerini Göster'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td//div[text()='Ödeme Kalemlerini Göster']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 46. Get text from 'ToolTip :)'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[contains(@class,'tpd-tool')]");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("/ Televizyon 500 TL\n/ Tablet 100 TL\n/ Diğer", string);

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
    return Stream.of(Arguments.of("https://otomasyon2.netahsilatdemo.com/","Kd!cyhz4","","","4355084355084358","000","12/26",""));
  }
}
