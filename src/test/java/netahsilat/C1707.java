package netahsilat;

import io.testproject.addon.*;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C1707 Tali Bayi Posu Aktif - Altbayiye üyelikli email order gönderme
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Oct 10 07:19:25 GMT 2022.
 */
@DisplayName("C1707 Tali Bayi Posu Aktif - Altbayiye üyelikli email order gönderme")
public class C1707 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C1707 Tali Bayi Posu Aktif - Altbayiye üyelikli email order gönderme")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String password, String currentDateTime, String RandomTutar1,
      String RandomTutar2, String adSoyad, String ReferansNumber, String Tutar) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodParametrikdemesadeceKartTypeTextWithDelayIsimsiz methodparametrikdemesadecekarttypetextwithdelayisimsiz;
    MethodVakfbankIlemDurumuSorgulama methodvakfbankilemdurumusorgulama;
    MethodLogin methodlogin;
    String string;
    WebExtensions.SelectOptionbyVisibleText selectOptionbyVisibleText;
    ImapMailOperations.ReadSpecificsMail readSpecificsMail;
    CombinedActions.ClearAndTypeAction clearAndTypeAction;
    StringUtils.GetStringSubstring getStringSubstring;
    RandomDataGenerator.GenerateNumberInRange generateNumberInRange;
    VisibleElementsOperations.ClickIfVisibleWeb clickIfVisibleWeb;

    // 1. Navigate to '{{Otomasyon2Logout}}'
    driver.navigate().to(ProjectParameters.Otomasyon2Logout);

    // 2. Run Method Login
    //    otomasyon@test.com
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = "otomasyon@test.com";
    methodlogin.password = ProjectParameters.genelPassword;
    methodlogin.execute(driver);
    currentDateTime = String.valueOf(methodlogin.currentDateTime);

    // 3. Move mouse to 'moveToSiteYönetimi'
    by = By.cssSelector("li[class='config']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 4. Click 'SİTE YÖNETİMİ1'
    by = By.xpath("//a[. = 'SİTE YÖNETİMİ']");
    driver.findElement(by).click();

    // 5. Click 'PARAMETRELER'
    by = By.xpath("//a[. = 'PARAMETRELER']");
    driver.findElement(by).click();

    // 6. Is 'Ödemelerde BIN numarası kontrol edils...' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.xpath("//label[. = 'Ödemelerde BIN numarası kontrol edilsin']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 7. Click 'Tali Bayi Posu Aktif mi? (Unchecked)' if it's visible
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//label[normalize-space()='Tali Bayi Posu Aktif mi?']//..//following-sibling::div//span[@class='jquery-safari-checkbox']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 8. Click 'Kaydet2' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.cssSelector("#kaydet");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 9. Is 'Genel parametreler Başarıyla kaydedildi.' visible?
    by = By.xpath("//li[. = 'Genel parametreler Başarıyla kaydedildi.']");
    driver.findElement(by).isDisplayed();

    // 10. Move mouse to 'moveUstUyeYonetimi'
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 11. Click 'ustUyeYonetimi2'
    by = By.xpath("//li/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 12. Click 'altUyeYonetimi'
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 13. Type 'talibayipos@yandex.com' in 'SearchVendorName'
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("talibayipos@yandex.com");

    // 14. Click 'resultListelenen'
    by = By.xpath("//body/ul//div");
    driver.findElement(by).click();

    // 15. Click 'Listele'
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 16. Is 'Listele' is clickable?
    by = By.xpath("//button[. = 'Listele']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(by));

    // 17. Is '1. Satır talibayipos@yandex.com' visible?
    by = By.xpath("//tr[1]/td[text()='talibayipos@yandex.com'] ");
    driver.findElement(by).isDisplayed();

    // 18. Click 'E-mail order gonder'
    by = By.cssSelector("img[src*='mail_replay.png']");
    driver.findElement(by).click();

    // 19. Generate random number between '1' and '9999'
    generateNumberInRange = RandomDataGenerator.generateNumberInRange("1","9999");
    generateNumberInRange = (RandomDataGenerator.GenerateNumberInRange)((ReportingDriver)driver).addons().execute(generateNumberInRange);
    RandomTutar1 = String.valueOf(generateNumberInRange.result);

    // 20. Generate random number between '1' and '99'
    generateNumberInRange = RandomDataGenerator.generateNumberInRange("1","99");
    generateNumberInRange = (RandomDataGenerator.GenerateNumberInRange)((ReportingDriver)driver).addons().execute(generateNumberInRange);
    RandomTutar2 = String.valueOf(generateNumberInRange.result);

    // 21. Clear 'PureAmount' contents
    by = By.cssSelector("#PureAmount");
    driver.findElement(by).clear();

    // 22. Type '{{RandomTutar1}},{{RandomTutar2}}' in 'PureAmount'
    by = By.cssSelector("#PureAmount");
    driver.findElement(by).sendKeys(String.format("%s,%s",RandomTutar1,RandomTutar2));

    // 23. Get text from 'PureAmount'
    by = By.cssSelector("#PureAmount");
    string = driver.findElement(by).getAttribute("value");
    Tutar = String.valueOf(string);

    // 24. Select options in 'PaymentSetId' with text '[NONE]'
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Alt Bayi Posu");
    by = By.cssSelector("#PaymentSetId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 25. Click 'Devam Et Button'
    by = By.xpath("//input[@class='big-button']");
    driver.findElement(by).click();

    // 26. Run Clear 'DisplayName' contents and type 'C1707'
    /* Step is disabled
    clearAndTypeAction = CombinedActions.clearAndTypeAction("C1707");
    by = By.cssSelector("#DisplayName");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);
    */
    // 27. Type 'netahsilatotomasyon@yandex.com' in 'send-otp-via-mfs-input'
    /* Step is disabled
    by = By.xpath("//div[2]/div[2]/input");
    driver.findElement(by).sendKeys("netahsilatotomasyon@yandex.com");
    */
    // 28. Type 'C1707' in 'Description'
    by = By.cssSelector("#Description");
    driver.findElement(by).sendKeys("C1707");

    // 29. Click 'Ekle'
    /* Step is disabled
    by = By.xpath("//button[. = 'Ekle']");
    driver.findElement(by).click();
    */
    // 30. Click 'Responsive Gonder Button'
    by = By.cssSelector("input[value='Gönder']");
    driver.findElement(by).click();

    // 31. Is 'Ödeme linki gönderilmiştir' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.xpath("//p[. = 'Ödeme linki gönderilmiştir']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 32. Output searched string in specific mail
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(360000, TimeUnit.MILLISECONDS);
    readSpecificsMail = ImapMailOperations.readSpecificsMail("talibayipos@yandex.com",password,Tutar,"C:/TestProject/mail/C1707.html");
    readSpecificsMail = (ImapMailOperations.ReadSpecificsMail)((ReportingDriver)driver).addons().execute(readSpecificsMail);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 33. Navigate to 'file:///C:/TestProject/mail/C1707.html'
    driver.navigate().to("file:///C:/TestProject/mail/C1707.html");

    // 34. Click 'Ödeme yapmak için lütfen tıklayınız'
    by = By.cssSelector("#odemelinki");
    driver.findElement(by).click();

    // 35. Run Method Parametrik Ödeme (Sadece Kart - Type text with delay)  - İsimsiz
    methodparametrikdemesadecekarttypetextwithdelayisimsiz = new MethodParametrikdemesadeceKartTypeTextWithDelayIsimsiz();
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.kartNo = "4938460158754205";
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.CVV = "715";
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.ayYil = "11/24";
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.adSoyad = adSoyad;
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.execute(driver);

    // 36. Click 'Vakıfbank Tek Çekim Posu'
    by = By.cssSelector("td[class*='commRate-4050'] input");
    driver.findElement(by).click();

    // 37. Click 'btnNormalPayment'
    by = By.cssSelector("#btnNormalPayment");
    driver.findElement(by).click();

    // 38. Is 'Payment Efekti' visible?
    by = By.cssSelector("div[class='spinner']");
    driver.findElement(by).isDisplayed();

    // 39. Is 'txtReferansNumarasi' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    by = By.xpath("(//p[@class='payment-result-text'])[1]");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 40. Get text from 'txtReferansNumarasi'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    by = By.xpath("(//p[@class='payment-result-text'])[1]");
    string = driver.findElement(by).getAttribute("value");
    ReferansNumber = String.valueOf(string);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 41. Get substring of '{{ReferansNumber}}' from '42' to '[NONE]'
    getStringSubstring = StringUtils.getStringSubstring(42,0,ReferansNumber);
    getStringSubstring = (StringUtils.GetStringSubstring)((ReportingDriver)driver).addons().execute(getStringSubstring);
    ReferansNumber = String.valueOf(getStringSubstring.result);

    // 42. Run Method Vakıfbank İşlem Durumu Sorgulama
    methodvakfbankilemdurumusorgulama = new MethodVakfbankIlemDurumuSorgulama();
    methodvakfbankilemdurumusorgulama.HostSubMerchantId = "000100000012847";
    methodvakfbankilemdurumusorgulama.OrderId = ReferansNumber;
    methodvakfbankilemdurumusorgulama.execute(driver);

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
    return Stream.of(Arguments.of("https://otomasyon2.netahsilatdemo.com/","Kd!cyhz4","","","","Test Kartı","",""));
  }
}
