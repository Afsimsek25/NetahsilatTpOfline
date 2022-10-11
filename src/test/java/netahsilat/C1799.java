package netahsilat;

import io.testproject.addon.FileUpload;
import io.testproject.addon.NetahsilatUtills;
import io.testproject.addon.WebExtensions;
import io.testproject.addon.WebListOperations;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C1799 Excel yüklemelerinde Default Grupların atanması (Bayi/Müşteri/AltBayi/AltMüşteri)
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Oct 10 07:12:45 GMT 2022.
 */
@DisplayName("C1799 Excel yüklemelerinde Default Grupların atanması (Bayi/Müşteri/AltBayi/AltMüşteri)")
public class C1799 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C1799 Excel yüklemelerinde Default Grupların atanması (Bayi/Müşteri/AltBayi/AltMüşteri)")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String currentDateTime)
      throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogin methodlogin;
    WebExtensions.SelectOptionbyVisibleText selectOptionbyVisibleText;
    NetahsilatUtills.ClickUntilGone clickUntilGone;
    WebListOperations.GetTextFromSelectedItem getTextFromSelectedItem;
    FileUpload.UploadFileElementAction uploadFileElementAction;

    // 1. Navigate to '{{Otomasyon3Logout}}'
    driver.navigate().to(ProjectParameters.Otomasyon3Logout);

    // 2. Run Method Login
    //    otomasyon@test.com
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = "otomasyon@test.com";
    methodlogin.password = ProjectParameters.genelPassword;
    methodlogin.execute(driver);
    currentDateTime = String.valueOf(methodlogin.currentDateTime);

    // 3. Click 'moveUstUyeYonetimi'
    by = By.cssSelector("li[class='content']");
    driver.findElement(by).click();

    // 4. Click 'ustUyeYonetimi'
    by = By.xpath("//li[4]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 5. Click 'ÜYE AKTARIM'
    by = By.xpath("//a[. = 'ÜYE AKTARIM']");
    driver.findElement(by).click();

    // 6. Uploads a file to a given element with the 'file' type
    uploadFileElementAction = FileUpload.uploadFileElementAction("C:\\TestProject\\C1799.xlsx");
    by = By.cssSelector("#import");
    uploadFileElementAction = (FileUpload.UploadFileElementAction)((ReportingDriver)driver).addons().execute(uploadFileElementAction, by, -1);

    // 7. Click 'Tamam1'
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 8. Select options in 'primarykey' with text '[NONE]'
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Code");
    by = By.cssSelector("#primarykey");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 9. Click 'Aktarımı Başlat'
    by = By.xpath("//button[. = 'Aktarımı Başlat']");
    driver.findElement(by).click();

    // 10. Does 'P' contain 'Kaydedilen Toplam Kayıt : 1 Hata Oluşan Toplam Kayıt :0'?
    by = By.xpath("//div/div[1]/p");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Kaydedilen Toplam Kayıt : 1 Hata Oluşan Toplam Kayıt :0"));

    // 11. Click 'altUyeYonetimi'
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 12. Type 'excelbayimail@test.com.tr' in 'SearchVendorName'
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("excelbayimail@test.com.tr");

    // 13. Click 'resultListelenen'
    by = By.xpath("//body/ul//div");
    driver.findElement(by).click();

    // 14. Click 'Listele'
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 15. Is 'Listele' is clickable?
    by = By.xpath("//button[. = 'Listele']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(by));

    // 16. Click 'KullanıcılarıGörüntüleImage'
    by = By.cssSelector("img[src*='fugue/detail.png']");
    driver.findElement(by).click();

    // 17. Click 'Rol Ekle/Çıkar'
    by = By.xpath("//img[contains(@src,'user-silhouette-question.png')]");
    driver.findElement(by).click();

    // 18. Retrieves the text of the currently selected option of a select element
    getTextFromSelectedItem = WebListOperations.getGetTextFromSelectedItem();
    by = By.cssSelector("#roleGroupId");
    getTextFromSelectedItem = (WebListOperations.GetTextFromSelectedItem)((ReportingDriver)driver).addons().execute(getTextFromSelectedItem, by, -1);

    // 19. Click 'Vazgeç'
    by = By.xpath("//button[. = 'Vazgeç']");
    driver.findElement(by).click();

    // 20. Click '23452353  Bayi kullanıcı Trash.png'
    by = By.xpath("//td[contains(text(),'23452353')]//..//img[contains(@src,'trash.png')]");
    driver.findElement(by).click();

    // 21. Run Click Until Gone
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 22. Is 'Gösterilecek Kayıt Bulunamadı.' visible?
    by = By.xpath("//td[. = 'Gösterilecek Kayıt Bulunamadı.']");
    driver.findElement(by).isDisplayed();

    // 23. Click 'ÜYE AKTARIM'
    by = By.xpath("//a[. = 'ÜYE AKTARIM']");
    driver.findElement(by).click();

    // 24. Uploads a file to a given element with the 'file' type
    uploadFileElementAction = FileUpload.uploadFileElementAction("C:\\TestProject\\C1799-1.xlsx");
    by = By.cssSelector("#import");
    uploadFileElementAction = (FileUpload.UploadFileElementAction)((ReportingDriver)driver).addons().execute(uploadFileElementAction, by, -1);

    // 25. Click 'Tamam1'
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 26. Select options in 'primarykey' with text '[NONE]'
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Code");
    by = By.cssSelector("#primarykey");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 27. Click 'Aktarımı Başlat'
    by = By.xpath("//button[. = 'Aktarımı Başlat']");
    driver.findElement(by).click();

    // 28. Does 'P' contain 'Kaydedilen Toplam Kayıt : 1 Hata Oluşan Toplam Kayıt :0'?
    by = By.xpath("//div/div[1]/p");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Kaydedilen Toplam Kayıt : 1 Hata Oluşan Toplam Kayıt :0"));

    // 29. Click 'altUyeYonetimi'
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 30. Type 'kurumsalaltbayiexcel@test.com' in 'SearchVendorName'
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("kurumsalaltbayiexcel@test.com");

    // 31. Click 'resultListelenen'
    by = By.xpath("//body/ul//div");
    driver.findElement(by).click();

    // 32. Click 'Listele'
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 33. Is 'Listele' is clickable?
    by = By.xpath("//button[. = 'Listele']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(by));

    // 34. Click 'KullanıcılarıGörüntüleImage'
    by = By.cssSelector("img[src*='fugue/detail.png']");
    driver.findElement(by).click();

    // 35. Click 'Rol Ekle/Çıkar'
    by = By.xpath("//img[contains(@src,'user-silhouette-question.png')]");
    driver.findElement(by).click();

    // 36. Retrieves the text of the currently selected option of a select element
    getTextFromSelectedItem = WebListOperations.getGetTextFromSelectedItem();
    by = By.cssSelector("#roleGroupId");
    getTextFromSelectedItem = (WebListOperations.GetTextFromSelectedItem)((ReportingDriver)driver).addons().execute(getTextFromSelectedItem, by, -1);

    // 37. Click 'Vazgeç'
    by = By.xpath("//button[. = 'Vazgeç']");
    driver.findElement(by).click();

    // 38. Click 'Alt Bayi Kurumsal trash.png'
    by = By.xpath("//td[contains(text(),'Alt Bayi Kurumsal')]//..//img[contains(@src,'trash.png')]");
    driver.findElement(by).click();

    // 39. Run Click Until Gone
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 40. Is 'Gösterilecek Kayıt Bulunamadı.' visible?
    by = By.xpath("//td[. = 'Gösterilecek Kayıt Bulunamadı.']");
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
    return Stream.of(Arguments.of("https://otomasyon3.netahsilatdemo.com/","otomasyon@test.com","Kd!cyhz4",""));
  }
}