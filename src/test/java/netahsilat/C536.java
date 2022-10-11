package netahsilat;

import io.testproject.addon.*;
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
 * Test: C536 Ödeme linki gönderme & Ödeme Yapma & İlgili ödemeyi filtreleme
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Tue Oct 04 07:58:15 GMT 2022.
 */
@DisplayName("C536 Ödeme linki gönderme & Ödeme Yapma & İlgili ödemeyi filtreleme")
public class C536 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C536 Ödeme linki gönderme & Ödeme Yapma & İlgili ödemeyi filtreleme")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String email,
      String emailPassword, String islemNo, String customerID, String referansNo) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodGeneldeme methodgeneldeme;
    MethodLogoutlogin methodlogoutlogin;
    String string;
    MethodParametrikdemesadeceKartTypeTextWithDelay methodparametrikdemesadecekarttypetextwithdelay;
    WebExtensions.GetNumbersOnly getNumbersOnly;
    ImapMailOperations.ReadSpecificsMail readSpecificsMail;
    StringUtils.GetStringSubstring getStringSubstring;
    JSActions.ClickAction clickAction;
    RandomDataGenerator.GenerateNumberInRange generateNumberInRange;
    ImapMailOperations.DeleteAllMails deleteAllMails;
    GridOperations.GetData getData;

    // 1. Delete All Mails
    deleteAllMails = ImapMailOperations.deleteAllMails(ProjectParameters.odemeEmail,ProjectParameters.yandexMailKey);
    deleteAllMails = (ImapMailOperations.DeleteAllMails)((ReportingDriver)driver).addons().execute(deleteAllMails);

    // 2. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 3. Move mouse to 'moveUstUyeYonetimi'
    /* Step is disabled
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();
    */
    // 4. Click 'ustUyeYonetimi'
    /* Step is disabled
    by = By.xpath("//li[4]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();
    */
    // 5. Move mouse to 'dropDownOdemeLinki'
    /* Step is disabled
    by = By.xpath("//li[2]/div/img");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();
    */
    // 6. Click 'ÜYELİKSİZ ÖDEME LİNKİ'
    clickAction = JSActions.getClickAction();
    by = By.xpath("//a[. = 'ÜYELİKSİZ ÖDEME LİNKİ']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 7. Is 'PureAmount' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("#PureAmount");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 8. Does 'MailSendCount' contain '1'?
    by = By.cssSelector("#MailSendCount");
    Assertions.assertTrue(driver.findElement(by).getText().contains("1"));

    // 9. Clear 'PureAmount' contents
    by = By.cssSelector("#PureAmount");
    driver.findElement(by).clear();

    // 10. Type '75,00' in 'PureAmount'
    by = By.cssSelector("#PureAmount");
    driver.findElement(by).sendKeys("75,00");

    // 11. Generate random number between '[NONE]' and '999999999'
    generateNumberInRange = RandomDataGenerator.generateNumberInRange("","999999999");
    generateNumberInRange = (RandomDataGenerator.GenerateNumberInRange)((ReportingDriver)driver).addons().execute(generateNumberInRange);
    islemNo = String.valueOf(generateNumberInRange.result);

    // 12. Type '{{islemNo}}' in 'ReferenceNumber'
    by = By.cssSelector("#ReferenceNumber");
    driver.findElement(by).sendKeys(islemNo);

    // 13. Generate random number between '[NONE]' and '999999999'
    generateNumberInRange = RandomDataGenerator.generateNumberInRange("","999999999");
    generateNumberInRange = (RandomDataGenerator.GenerateNumberInRange)((ReportingDriver)driver).addons().execute(generateNumberInRange);
    customerID = String.valueOf(generateNumberInRange.result);

    // 14. Type '{{customerID}}' in 'CustomerId'
    by = By.cssSelector("#CustomerId");
    driver.findElement(by).sendKeys(customerID);

    // 15. Click 'btnDevamEt'
    by = By.cssSelector("input[type='button'][value='Devam Et']");
    driver.findElement(by).click();

    // 16. Type 'qa' in 'inputUnvan'
    by = By.cssSelector("#DisplayName");
    driver.findElement(by).sendKeys("qa");

    // 17. Type 'furkan' in 'FullName'
    by = By.cssSelector("#FullName");
    driver.findElement(by).sendKeys("furkan");

    // 18. Type '{{odemeEmail}}' in 'EMail'
    by = By.cssSelector("#EMail");
    driver.findElement(by).sendKeys(ProjectParameters.odemeEmail);

    // 19. Type '5555555555' in 'Phone'
    by = By.cssSelector("#Phone");
    driver.findElement(by).sendKeys("5555555555");

    // 20. Click 'Ekle'
    by = By.xpath("//button[. = 'Ekle']");
    driver.findElement(by).click();

    // 21. Move mouse to 'UnvanEkleCheckbox'
    by = By.xpath("//td[text()='netahsilatotomasyon@yandex.com']//../td/input[@type='checkbox']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 22. Click 'UnvanEkleCheckbox'
    by = By.xpath("//td[text()='netahsilatotomasyon@yandex.com']//../td/input[@type='checkbox']");
    driver.findElement(by).click();

    // 23. Type 'e-mail order deneme' in 'Description'
    by = By.cssSelector("#Description");
    driver.findElement(by).sendKeys("e-mail order deneme");

    // 24. Click 'emailGonder'
    by = By.xpath("//div[5]/div[1]/input");
    driver.findElement(by).click();

    // 25. Is 'Ödeme linki gönderilmiştir' visible?
    by = By.xpath("//p[. = 'Ödeme linki gönderilmiştir']");
    driver.findElement(by).isDisplayed();

    // 26. Output searched string in specific mail
    readSpecificsMail = ImapMailOperations.readSpecificsMail(ProjectParameters.odemeEmail,ProjectParameters.yandexMailKey,islemNo,"C:/TestProject/mail/C536.html");
    readSpecificsMail = (ImapMailOperations.ReadSpecificsMail)((ReportingDriver)driver).addons().execute(readSpecificsMail);

    // 27. Navigate to 'file:///C:/TestProject/mail/C536.html'
    driver.navigate().to("file:///C:/TestProject/mail/C536.html");

    // 28. Return only numbers from the text
    getNumbersOnly = WebExtensions.getGetNumbersOnly();
    by = By.cssSelector("#tutar");
    getNumbersOnly = (WebExtensions.GetNumbersOnly)((ReportingDriver)driver).addons().execute(getNumbersOnly, by, -1);

    // 29. Does '[id="islemno"]' contain '{{islemNo}}'?
    by = By.cssSelector("#islemno");
    Assertions.assertTrue(driver.findElement(by).getText().contains(islemNo));

    // 30. Click 'dogrulamaLinki'
    by = By.xpath("//a");
    driver.findElement(by).click();

    // 31. Run Method Genel Ödeme
    /* Step is disabled
    methodgeneldeme = new MethodGeneldeme();
    methodgeneldeme.ApplicationURL = ApplicationURL;
    methodgeneldeme.execute(driver);
    */
    // 32. Run Method Parametrik Ödeme (Sadece Kart - Type text with delay)
    methodparametrikdemesadecekarttypetextwithdelay = new MethodParametrikdemesadeceKartTypeTextWithDelay();
    methodparametrikdemesadecekarttypetextwithdelay.kartNo = ProjectParameters.genelKartNo;
    methodparametrikdemesadecekarttypetextwithdelay.CVV = ProjectParameters.genelKartCVV;
    methodparametrikdemesadecekarttypetextwithdelay.ayYil = ProjectParameters.genelKartAyYil;
    methodparametrikdemesadecekarttypetextwithdelay.isim = "Test C536";
    methodparametrikdemesadecekarttypetextwithdelay.execute(driver);

    // 33. Click 'genelOdemeTaksitSecenegi'
    clickAction = JSActions.getClickAction();
    by = By.xpath("(//td[contains(@class,'commRate-20')])[1]");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 34. Click 'odemeTalimatıOlustur'
    by = By.xpath("//div[4]/span/input");
    driver.findElement(by).click();

    // 35. Click 'btnNormalPayment'
    by = By.cssSelector("#btnNormalPayment");
    driver.findElement(by).click();

    // 36. Is 'txtReferansNumarasi' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(160000, TimeUnit.MILLISECONDS);
    by = By.xpath("(//p[@class='payment-result-text'])[1]");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 37. Get text from 'txtReferansNumarasi'
    by = By.xpath("(//p[@class='payment-result-text'])[1]");
    string = driver.findElement(by).getAttribute("value");
    referansNo = String.valueOf(string);

    // 38. Get substring of '{{referansNo}}' from '42' to '[NONE]'
    getStringSubstring = StringUtils.getStringSubstring(42,0,referansNo);
    getStringSubstring = (StringUtils.GetStringSubstring)((ReportingDriver)driver).addons().execute(getStringSubstring);
    referansNo = String.valueOf(getStringSubstring.result);

    // 39. Run Method Logout&Login
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = userName;
    methodlogoutlogin.password = password;
    methodlogoutlogin.execute(driver);

    // 40. Move mouse to 'moveToIslemler'
    by = By.cssSelector("li[class='tag']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 41. Click 'İŞLEMLER1'
    by = By.xpath("//a[. = 'İŞLEMLER']");
    driver.findElement(by).click();

    // 42. Click 'ÖDEME LİNKİ LİSTESİ'
    by = By.xpath("//a[. = 'ÖDEME LİNKİ LİSTESİ']");
    driver.findElement(by).click();

    // 43. Type '{{referansNo}}' in 'ReferenceNumber'
    by = By.cssSelector("#ReferenceNumber");
    driver.findElement(by).sendKeys(referansNo);

    // 44. Type '{{islemNo}}' in 'inputIsyeriReferansi'
    by = By.cssSelector("#ClientReferenceNumber");
    driver.findElement(by).sendKeys(islemNo);

    // 45. Type '{{customerID}}' in 'CustomerId'
    by = By.cssSelector("#CustomerId");
    driver.findElement(by).sendKeys(customerID);

    // 46. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 47. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 48. Does 'columnIslemDurumu' contain 'Başarılı'?
    by = By.xpath("//div[2]//td[2]");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Başarılı"));

    // 49. Run Get Data From Grid
    //    Müşteri No - {CustomerID} - Equals
    getData = GridOperations.getData("Müşteri No",customerID,"Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 50. Run Get Data From Grid
    //    İşlem No - {islemNo} - Equals
    getData = GridOperations.getData("İşlem No",islemNo,"Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","","otomasyon@e-cozum.com","kY2*m5J","","",""));
  }
}
