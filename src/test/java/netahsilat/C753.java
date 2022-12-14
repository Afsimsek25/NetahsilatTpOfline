package netahsilat;

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
 * Test: C753 Excel ile bayi kullanıcı aktarımı
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 10:30:11 GMT 2022.
 */
@DisplayName("C753 Excel ile bayi kullanıcı aktarımı")
public class C753 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C753 Excel ile bayi kullanıcı aktarımı")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    WebExtensions.SelectOptionbyVisibleText selectOptionbyVisibleText;
    FileUpload.UploadFileElementAction uploadFileElementAction;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Move mouse to 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 3. Click 'ustUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[4]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 4. Click 'KULLANICI AKTARIM'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'KULLANICI AKTARIM']");
    driver.findElement(by).click();

    // 5. Uploads a file to a given element with the 'file' type
    GeneratedUtils.sleep(500);
    uploadFileElementAction = FileUpload.uploadFileElementAction("C:\\TestProject\\C753-Val1.xlsx");
    by = By.cssSelector("#import");
    uploadFileElementAction = (FileUpload.UploadFileElementAction)((ReportingDriver)driver).addons().execute(uploadFileElementAction, by, -1);

    // 6. Click 'Tamam1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 7. Select options in 'primarykey' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Code");
    by = By.cssSelector("#primarykey");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 8. Is 'Aktarımı Başlat' is clickable?
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Aktarımı Başlat']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(by));

    // 9. Click 'Aktarımı Başlat'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Aktarımı Başlat']");
    driver.findElement(by).click();

    // 10. Does 'messageEror' contain 'Uyruk TR iken Pasaport alanı dolu olamaz Satır : 2 Stun : 9'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("p[class='message error']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Uyruk TR iken Pasaport alanı dolu olamaz Satır : 2 Stun : 9"));

    // 11. Uploads a file to a given element with the 'file' type
    GeneratedUtils.sleep(500);
    uploadFileElementAction = FileUpload.uploadFileElementAction("C:\\TestProject\\C753-Val2.xlsx");
    by = By.cssSelector("#import");
    uploadFileElementAction = (FileUpload.UploadFileElementAction)((ReportingDriver)driver).addons().execute(uploadFileElementAction, by, -1);

    // 12. Click 'Tamam1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 13. Select options in 'primarykey' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Code");
    by = By.cssSelector("#primarykey");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 14. Is 'Aktarımı Başlat' is clickable?
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Aktarımı Başlat']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(by));

    // 15. Click 'Aktarımı Başlat'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Aktarımı Başlat']");
    driver.findElement(by).click();

    // 16. Does 'TCKN alanı 11 Karakter olmalıdır. Sat...' contain 'TCKN alanı 11 Karakter olmalıdır. Satır : 1 Stun : 7'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//p[. = 'TCKN alanı 11 Karakter olmalıdır. Satır : 1 Stun : 7']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("TCKN alanı 11 Karakter olmalıdır. Satır : 1 Stun : 7"));

    // 17. Uploads a file to a given element with the 'file' type
    GeneratedUtils.sleep(500);
    uploadFileElementAction = FileUpload.uploadFileElementAction("C:\\TestProject\\C753-Val3.xlsx");
    by = By.cssSelector("#import");
    uploadFileElementAction = (FileUpload.UploadFileElementAction)((ReportingDriver)driver).addons().execute(uploadFileElementAction, by, -1);

    // 18. Click 'Tamam1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 19. Select options in 'primarykey' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Code");
    by = By.cssSelector("#primarykey");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 20. Is 'Aktarımı Başlat' is clickable?
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Aktarımı Başlat']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(by));

    // 21. Click 'Aktarımı Başlat'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Aktarımı Başlat']");
    driver.findElement(by).click();

    // 22. Does 'messageEror' contain 'Kullanıcıya atanacak bayi bulunamadı Satır : 1 Stun : 8'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("p[class='message error']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Kullanıcıya atanacak bayi bulunamadı Satır : 1 Stun : 8"));

    // 23. Uploads a file to a given element with the 'file' type
    GeneratedUtils.sleep(500);
    uploadFileElementAction = FileUpload.uploadFileElementAction("C:\\TestProject\\C753-Comp.xlsx");
    by = By.cssSelector("#import");
    uploadFileElementAction = (FileUpload.UploadFileElementAction)((ReportingDriver)driver).addons().execute(uploadFileElementAction, by, -1);

    // 24. Click 'Tamam1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 25. Select options in 'primarykey' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Code");
    by = By.cssSelector("#primarykey");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 26. Is 'Aktarımı Başlat' is clickable?
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Aktarımı Başlat']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(by));

    // 27. Click 'Aktarımı Başlat'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Aktarımı Başlat']");
    driver.findElement(by).click();

    // 28. Does 'P3' contain 'Kaydedilen Toplam Kayıt : 2 Hata Oluşan Toplam Kayıt :0'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//div/div[1]/p");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Kaydedilen Toplam Kayıt : 2 Hata Oluşan Toplam Kayıt :0"));

    // 29. Click 'altUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 30. Type '761624' in 'SearchVendorNameVN'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("761624");

    // 31. Click 'Bireysel Ana Bayi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[contains(text(),'76162482466')]  ");
    driver.findElement(by).click();

    // 32. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 33. Is '//tr[1]//td[. = 'BireyselAnaBayi']' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//tr[1]//td[. = 'BireyselAnaBayi']");
    driver.findElement(by).isDisplayed();

    // 34. Click 'KullanıcılarıGörüntüleImage'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='fugue/detail.png']");
    driver.findElement(by).click();

    // 35. Click 'btnPencil'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='fugue/pencil.png']");
    driver.findElement(by).click();

    // 36. Does 'Bayi Adi' contain 'Bireysel'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_Name");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Bireysel"));

    // 37. Does 'Entity.Surname' contain 'Ana Bayi'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_Surname");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Ana Bayi"));

    // 38. Does 'Entity.Email' contain 'bireyselanabayi@otomasyon.com'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_Email");
    Assertions.assertTrue(driver.findElement(by).getText().contains("bireyselanabayi@otomasyon.com"));

    // 39. Does 'Entity.MobilePhone' contain '(555)6655551'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_MobilePhone");
    Assertions.assertTrue(driver.findElement(by).getText().contains("(555)6655551"));

    // 40. Does 'Entity.SelectedCountry' contain 'Turkey'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_SelectedCountry");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Turkey"));

    // 41. Does 'Entity.Tckn' contain '76162482466'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_Tckn");
    Assertions.assertTrue(driver.findElement(by).getText().contains("76162482466"));

    // 42. Does 'Entity.Code' contain 'BireyselAnaBayi'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_Code");
    Assertions.assertTrue(driver.findElement(by).getText().contains("BireyselAnaBayi"));

    // 43. Is 'Aktif mi?' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//div/p//img");
    driver.findElement(by).isDisplayed();

    // 44. Click 'Vazgeç3'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div/div/div[1]//button[. = 'Vazgeç']");
    driver.findElement(by).click();

    // 45. Click '((//td[contains(text(),'KulSurname1')] /..//td)[2]//a)[2]'
    //    Delete BayiKul Name1 Bayi KulSurname1
    GeneratedUtils.sleep(500);
    by = By.xpath("((//td[contains(text(),'KulSurname1')] /..//td)[2]//a)[2]");
    driver.findElement(by).click();

    // 46. Click 'Tamam1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 47. Click '((//td[contains(text(),'KulSurname2')] /..//td)[2]//a)[2]'
    //    Delete BayiKul Name1 Bayi KulSurname2
    GeneratedUtils.sleep(500);
    by = By.xpath("((//td[contains(text(),'KulSurname2')] /..//td)[2]//a)[2]");
    driver.findElement(by).click();

    // 48. Click 'Tamam1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","Kd!cyhz4"));
  }
}
