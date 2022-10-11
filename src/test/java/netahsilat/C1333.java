package netahsilat;

import io.testproject.addon.JSActions;
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

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C1333 NTH-8854 işi test edilmeli
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 11:06:01 GMT 2022.
 */
@DisplayName("C1333 NTH-8854 işi test edilmeli")
public class C1333 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C1333 NTH-8854 işi test edilmeli")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String currentDate,
      String faturaErpKodu, String faturaNumarasi, String dokumanKodu, String odemeLinki,
      String Tutar) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodGeneldeme methodgeneldeme;
    MethodLogoutlogin methodlogoutlogin;
    String string;
    MethodParametrikdemesadeceKartTypeTextWithDelay methodparametrikdemesadecekarttypetextwithdelay;
    WebExtensions.WaitForAlertPresence waitForAlertPresence;
    JSActions.ClickAction clickAction;
    WebExtensions.GetElementAttribute getElementAttribute;
    WebExtensions.AcceptAlert acceptAlert;
    FileUpload.UploadFileElementAction uploadFileElementAction;
    WebExtensions.GetAlertText getAlertText;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Move mouse to 'moveCariHesapYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector(".accountmanagement");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 3. Click 'moveCariHesapYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector(".accountmanagement");
    driver.findElement(by).click();

    // 4. Click 'BORÇ AKTARIMI'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'BORÇ AKTARIMI']");
    driver.findElement(by).click();

    // 5. Uploads a file to a given element with the 'file' type
    //    C:\TestProject\C737_Borc_aktarim.xlsx
    GeneratedUtils.sleep(500);
    uploadFileElementAction = FileUpload.uploadFileElementAction("C:\\TestProject\\C1333_Borc_aktarim.xlsx");
    by = By.cssSelector("#import");
    uploadFileElementAction = (FileUpload.UploadFileElementAction)((ReportingDriver)driver).addons().execute(uploadFileElementAction, by, -1);

    // 6. Click 'Tamam1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 7. Is alert displayed?
    GeneratedUtils.sleep(500);
    waitForAlertPresence = WebExtensions.waitForAlertPresence(60000);
    waitForAlertPresence = (WebExtensions.WaitForAlertPresence)((ReportingDriver)driver).addons().execute(waitForAlertPresence);

    // 8. Get alert text
    GeneratedUtils.sleep(500);
    getAlertText = WebExtensions.getGetAlertText();
    getAlertText = (WebExtensions.GetAlertText)((ReportingDriver)driver).addons().execute(getAlertText);

    // 9. Accept alert
    GeneratedUtils.sleep(500);
    acceptAlert = WebExtensions.acceptAlert(0);
    acceptAlert = (WebExtensions.AcceptAlert)((ReportingDriver)driver).addons().execute(acceptAlert);

    // 10. Click 'Aktarımı Başlat'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Aktarımı Başlat']");
    driver.findElement(by).click();

    // 11. Move mouse to 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 12. Click 'ustUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[4]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 13. Click 'altUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 14. Type 'anamusteri02' in 'SearchVendorNameVN'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("anamusteri02");

    // 15. Click '//li//div[contains(text(),'Ana Musteri 2')]'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li//div[contains(text(),'Ana Musteri 2')] ");
    driver.findElement(by).click();

    // 16. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 17. Is 'anamusteri02' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//tr[1]//td[. = 'anamusteri02']");
    driver.findElement(by).isDisplayed();

    // 18. Get 'href' attribute value on 'Ödeme1'
    GeneratedUtils.sleep(500);
    getElementAttribute = WebExtensions.getElementAttribute("href");
    by = By.xpath("//a[. = 'Ödeme']");
    getElementAttribute = (WebExtensions.GetElementAttribute)((ReportingDriver)driver).addons().execute(getElementAttribute, by, -1);
    odemeLinki = String.valueOf(getElementAttribute.attributeValue);

    // 19. Navigate to '{{odemeLinki}}'
    GeneratedUtils.sleep(500);
    driver.navigate().to(odemeLinki);

    // 20. Click 'Borç Kapama'
    GeneratedUtils.sleep(500);
    clickAction = JSActions.getClickAction();
    by = By.xpath("//span[. = 'Borç Kapama']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 21. Run Method Parametrik Ödeme (Sadece Kart - Type text with delay)
    GeneratedUtils.sleep(500);
    methodparametrikdemesadecekarttypetextwithdelay = new MethodParametrikdemesadeceKartTypeTextWithDelay();
    methodparametrikdemesadecekarttypetextwithdelay.kartNo = ProjectParameters.genelKartNo;
    methodparametrikdemesadecekarttypetextwithdelay.CVV = ProjectParameters.genelKartCVV;
    methodparametrikdemesadecekarttypetextwithdelay.ayYil = ProjectParameters.genelKartAyYil;
    methodparametrikdemesadecekarttypetextwithdelay.isim = "Test Kartı";
    methodparametrikdemesadecekarttypetextwithdelay.execute(driver);

    // 22. Click 'BorcCheckBox'
    GeneratedUtils.sleep(500);
    clickAction = JSActions.getClickAction();
    by = By.xpath("//*[@id=\"accountTransactions\"]/table/tbody/tr[1]//input[@type='radio' or @type='checkbox']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 23. Get text from 'DummyPureAmount'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#DummyPureAmount");
    string = driver.findElement(by).getAttribute("value");
    Tutar = String.valueOf(string);

    // 24. Is 'Axess 321,00 TL Tek Çekim Posu' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("(//td[contains(@class,'commRate-20')])[1]//div[text()='1 x 321,00 ₺']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 25. Click 'Akbank Tek Çekim Genel Pos'
    GeneratedUtils.sleep(500);
    clickAction = JSActions.getClickAction();
    by = By.xpath("(//td[contains(@class,'commRate-20')])[1]");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 26. Run Method Genel Ödeme
    /* Step is disabled
    GeneratedUtils.sleep(500);
    methodgeneldeme = new MethodGeneldeme();
    methodgeneldeme.ApplicationURL = ApplicationURL;
    methodgeneldeme.execute(driver);
    */
    // 27. Click 'odemeTalimatiOlustur'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[value='ÖDEME TALİMATI OLUŞTUR']");
    driver.findElement(by).click();

    // 28. Click 'btnNormalPayment'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#btnNormalPayment");
    driver.findElement(by).click();

    // 29. Get text from 'txtReferansNumarasi'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("(//p[@class='payment-result-text'])[1]");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertTrue(string.startsWith("İşleminiz Tamamlandı"));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 30. Navigate to 'https://otomasyon.netahsilatdemo.com/Admin/Home'
    GeneratedUtils.sleep(500);
    driver.navigate().to("https://otomasyon.netahsilatdemo.com/Admin/Home");

    // 31. Move mouse to 'moveCariHesapYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector(".accountmanagement");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 32. Click 'moveCariHesapYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector(".accountmanagement");
    driver.findElement(by).click();

    // 33. Click 'BORÇ AKTARIMI'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'BORÇ AKTARIMI']");
    driver.findElement(by).click();

    // 34. Uploads a file to a given element with the 'file' type
    //    C:\TestProject\C737_Borc_aktarim.xlsx
    GeneratedUtils.sleep(500);
    uploadFileElementAction = FileUpload.uploadFileElementAction("C:\\TestProject\\C1333_Borc_aktarim.xlsx");
    by = By.cssSelector("#import");
    uploadFileElementAction = (FileUpload.UploadFileElementAction)((ReportingDriver)driver).addons().execute(uploadFileElementAction, by, -1);

    // 35. Click 'Tamam1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 36. Is alert displayed?
    GeneratedUtils.sleep(500);
    waitForAlertPresence = WebExtensions.waitForAlertPresence(30000);
    waitForAlertPresence = (WebExtensions.WaitForAlertPresence)((ReportingDriver)driver).addons().execute(waitForAlertPresence);

    // 37. Get alert text
    GeneratedUtils.sleep(500);
    getAlertText = WebExtensions.getGetAlertText();
    getAlertText = (WebExtensions.GetAlertText)((ReportingDriver)driver).addons().execute(getAlertText);

    // 38. Accept alert
    GeneratedUtils.sleep(500);
    acceptAlert = WebExtensions.acceptAlert(0);
    acceptAlert = (WebExtensions.AcceptAlert)((ReportingDriver)driver).addons().execute(acceptAlert);

    // 39. Click 'Aktarımı Başlat'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Aktarımı Başlat']");
    driver.findElement(by).click();

    // 40. Move mouse to 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 41. Click 'ustUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[4]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 42. Click 'altUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 43. Type 'anamusteri02' in 'SearchVendorNameVN'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("anamusteri02");

    // 44. Click '//li//div[contains(text(),'Ana Musteri 2')]'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li//div[contains(text(),'Ana Musteri 2')] ");
    driver.findElement(by).click();

    // 45. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 46. Is 'anamusteri02' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//tr[1]//td[. = 'anamusteri02']");
    driver.findElement(by).isDisplayed();

    // 47. Click 'cariHesaplarUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[2]/img");
    driver.findElement(by).click();

    // 48. Click 'Detay'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = '\n                                        Detay\n                                    ']");
    driver.findElement(by).click();

    // 49. Clear 'StartDate1' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#filterDateStart");
    driver.findElement(by).clear();

    // 50. Clear 'EndDate1' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#filterDateEnd");
    driver.findElement(by).clear();

    // 51. Click 'Filtrele'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#filterLink");
    driver.findElement(by).click();

    // 52. Is 'Borç Kapama1' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//img[5]");
    driver.findElement(by).isDisplayed();

    // 53. Click 'Sil5'
    GeneratedUtils.sleep(500);
    by = By.xpath("//img[6]");
    driver.findElement(by).click();

    // 54. Is alert displayed?
    GeneratedUtils.sleep(500);
    waitForAlertPresence = WebExtensions.waitForAlertPresence(30000);
    waitForAlertPresence = (WebExtensions.WaitForAlertPresence)((ReportingDriver)driver).addons().execute(waitForAlertPresence);

    // 55. Accept alert
    GeneratedUtils.sleep(500);
    acceptAlert = WebExtensions.acceptAlert(0);
    acceptAlert = (WebExtensions.AcceptAlert)((ReportingDriver)driver).addons().execute(acceptAlert);

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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","Kd!cyhz4","","","","","",""));
  }
}