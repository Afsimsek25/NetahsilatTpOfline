package netahsilat;

import io.testproject.addon.NetahsilatUtills;
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
 * Test: C752 Excel ile site kullanıcı aktarımı
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 10:26:28 GMT 2022.
 */
@DisplayName("C752 Excel ile site kullanıcı aktarımı")
public class C752 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C752 Excel ile site kullanıcı aktarımı")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    WebExtensions.SelectOptionbyVisibleText selectOptionbyVisibleText;
    NetahsilatUtills.ClickUntilGone clickUntilGone;
    WebExtensions.GetElementAttribute getElementAttribute;
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
    uploadFileElementAction = FileUpload.uploadFileElementAction("C:\\TestProject\\C752-Comp.xlsx");
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

    // 10. Does 'P3' contain 'Kaydedilen Toplam Kayıt : 2 Hata Oluşan Toplam Kayıt :0'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//div/div[1]/p");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Kaydedilen Toplam Kayıt : 2 Hata Oluşan Toplam Kayıt :0"));

    // 11. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = "excel12@test.com";
    methodlogoutlogin.password = "Aa1234Aa1234!";
    methodlogoutlogin.execute(driver);

    // 12. Move mouse to 'Otomasyon1 Otomasyon2'
    GeneratedUtils.sleep(500);
    by = By.xpath("//strong[. = 'Otomasyon1 Otomasyon2']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 13. Click 'HESABIMI GÜNCELLE'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[title = 'HESABIMI GÜNCELLE']");
    driver.findElement(by).click();

    // 14. Does 'Bayi Adi' contain 'Otomasyon1'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_Name");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Otomasyon1"));

    // 15. Does 'Entity.Email' contain 'excel12@test.com'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_Email");
    Assertions.assertTrue(driver.findElement(by).getText().contains("excel12@test.com"));

    // 16. Does 'Entity.SelectedCountry' contain 'Turkey'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_SelectedCountry");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Turkey"));

    // 17. Does 'Entity.Surname' contain 'Otomasyon2'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_Surname");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Otomasyon2"));

    // 18. Does 'Entity.Tckn' contain '29032279116'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_Tckn");
    Assertions.assertTrue(driver.findElement(by).getText().contains("29032279116"));

    // 19. Does 'Entity.Code' contain 'Kul001'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_Code");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Kul001"));

    // 20. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = userName;
    methodlogoutlogin.password = password;
    methodlogoutlogin.execute(driver);

    // 21. Move mouse to 'moveToKullaniciYönetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='user']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 22. Click 'KULLANICI YÖNETİMİ2'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'KULLANICI YÖNETİMİ']");
    driver.findElement(by).click();

    // 23. Click 'KULLANICI LİSTESİ1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'KULLANICI LİSTESİ']");
    driver.findElement(by).click();

    // 24. Type 'Kul001' in 'CodeKullaniciListesi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Code");
    driver.findElement(by).sendKeys("Kul001");

    // 25. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 26. Does 'excel12@test.com' contain 'excel12@test.com'?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[. = 'excel12@test.com']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("excel12@test.com"));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 27. Get 'src' attribute value on 'IMG40'
    GeneratedUtils.sleep(500);
    getElementAttribute = WebExtensions.getElementAttribute("src");
    by = By.xpath("//td[5]/img");
    getElementAttribute = (WebExtensions.GetElementAttribute)((ReportingDriver)driver).addons().execute(getElementAttribute, by, -1);

    // 28. Get 'src' attribute value on 'IMG41'
    GeneratedUtils.sleep(500);
    getElementAttribute = WebExtensions.getElementAttribute("src");
    by = By.xpath("//td[6]/img");
    getElementAttribute = (WebExtensions.GetElementAttribute)((ReportingDriver)driver).addons().execute(getElementAttribute, by, -1);

    // 29. Click 'Rol/Ekle Çıkar'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='question.png']");
    driver.findElement(by).click();

    // 30. Does 'RoleGroupId' contain 'KulEkleSilmeyin'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[name='RoleGroupId']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("KulEkleSilmeyin"));

    // 31. Click 'Vazgeç'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Vazgeç']");
    driver.findElement(by).click();

    // 32. Click 'Kullanıcı Silme'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src$$='/trash.png']");
    driver.findElement(by).click();

    // 33. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 34. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(80000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 35. Does 'Gösterilecek Kayıt Bulunamadı.' contain 'Gösterilecek Kayıt Bulunamadı.'?
    //    Bu case  sadece TaxNumber'ın 11 hane olduğunu kontrol için yapıldığı için diğer stepler kullanılmadı.
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[. = 'Gösterilecek Kayıt Bulunamadı.']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Gösterilecek Kayıt Bulunamadı."));

    // 36. Clear 'CodeKullaniciListesi' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Code");
    driver.findElement(by).clear();

    // 37. Type 'Kul002' in 'CodeKullaniciListesi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Code");
    driver.findElement(by).sendKeys("Kul002");

    // 38. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 39. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(80000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 40. Click 'Rol/Ekle Çıkar'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='question.png']");
    driver.findElement(by).click();

    // 41. Does 'RoleGroupId' contain 'Site Admin'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[name='RoleGroupId']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Site Admin"));

    // 42. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//div/div/div[1]//button[. = 'Vazgeç']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 43. Click 'Kullanıcı Silme'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src$$='/trash.png']");
    driver.findElement(by).click();

    // 44. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 45. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(80000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 46. Does 'Gösterilecek Kayıt Bulunamadı.' contain 'Gösterilecek Kayıt Bulunamadı.'?
    //    Bu case  sadece TaxNumber'ın 11 hane olduğunu kontrol için yapıldığı için diğer stepler kullanılmadı.
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[. = 'Gösterilecek Kayıt Bulunamadı.']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Gösterilecek Kayıt Bulunamadı."));

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
