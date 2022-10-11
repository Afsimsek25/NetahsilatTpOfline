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
 * Test: C1900 Üye Yönetimi sayfasında Çoklu Müşteri Temsilci Seçimi (NTH-14694)
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Oct 10 08:35:40 GMT 2022.
 */
@DisplayName("C1900 Üye Yönetimi sayfasında Çoklu Müşteri Temsilci Seçimi (NTH-14694)")
public class C1900 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C1900 Üye Yönetimi sayfasında Çoklu Müşteri Temsilci Seçimi (NTH-14694)")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String password, String currentDateTime, String ElementCount,
      String MusteriTemsilcisiColum, String UserProfile) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogin methodlogin;
    WebExtensions.SelectOptionbyVisibleText selectOptionbyVisibleText;
    JSActions.ClickAction clickAction;
    CommunityExcelActionsforWindows.waitUntilFileDownloaded waitUntilFileDownloaded;
    CommunityExcelActionsforWindows.multipleMatching multipleMatching;
    NetahsilatUtills.GetSystemEnv getSystemEnv;
    ExcelOperations.DeleteFile deleteFile;

    // 1. Navigate to '{{Otomasyon2Logout}}'
    //    Navigates the specified URL (Auto-generated)
    driver.navigate().to(ProjectParameters.Otomasyon2Logout);

    // 2. Run Method Login
    //    admin@netahsilat.com
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = "admin@netahsilat.com";
    methodlogin.password = ProjectParameters.genelPassword;
    methodlogin.execute(driver);
    currentDateTime = String.valueOf(methodlogin.currentDateTime);

    // 3. Move mouse to 'moveUstUyeYonetimi'
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 4. Click 'ustUyeYonetimi'
    by = By.xpath("//li[4]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 5. Click 'altUyeYonetimi'
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 6. Select options in 'SearchVendorTypeId' with text '[NONE]'
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Müşteri");
    by = By.cssSelector("#SearchVendorTypeId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 7. Type 'Site Müşteri Temsilcisi 1' in 'Textbox - Müşteri Temsilcisi'
    by = By.xpath("//ul[@class='select2-choices']/..//input");
    driver.findElement(by).sendKeys("Site Müşteri Temsilcisi 1");

    // 8. Click 'Site Müşteri Temsilcisi 1'
    by = By.xpath("//li[1]//span[. = 'Site Müşteri Temsilcisi 1']");
    driver.findElement(by).click();

    // 9. Type 'Site Müşteri Temsilcisi 2' in 'Textbox - Müşteri Temsilcisi'
    by = By.xpath("//ul[@class='select2-choices']/..//input");
    driver.findElement(by).sendKeys("Site Müşteri Temsilcisi 2");

    // 10. Click 'Site Müşteri Temsilcisi 2'
    by = By.xpath("//li[1]//span[. = 'Site Müşteri Temsilcisi 2']");
    driver.findElement(by).click();

    // 11. Click 'Listele'
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 12. Is 'Listele' is clickable?
    by = By.xpath("//button[. = 'Listele']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(by));

    // 13. Get System Environment
    getSystemEnv = NetahsilatUtills.getSystemEnv("USERPROFILE");
    getSystemEnv = (NetahsilatUtills.GetSystemEnv)((ReportingDriver)driver).addons().execute(getSystemEnv);
    UserProfile = String.valueOf(getSystemEnv.Path);

    String path = UserProfile + "%/Downloads/Bayiler.xls";

    // 14. Delete the file from '{{UserProfile}}\Downloads\Bayiler.xls'
    deleteFile = ExcelOperations.deleteFile(path);
    deleteFile = (ExcelOperations.DeleteFile)((ReportingDriver)driver).addons().execute(deleteFile);

    // 15. Click 'Basit'
    clickAction = JSActions.getClickAction();
    by = By.xpath("//a[. = 'Basit']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 16. Wait Until The File is Downloaded
    waitUntilFileDownloaded = CommunityExcelActionsforWindows.waitUntilFileDownloaded(path,60);
    waitUntilFileDownloaded = (CommunityExcelActionsforWindows.waitUntilFileDownloaded)((ReportingDriver)driver).addons().execute(waitUntilFileDownloaded);

    // 17. Search multiple matching in Exel Column
    multipleMatching = CommunityExcelActionsforWindows.multipleMatching(path,1,5,"Site Müşteri Temsilcisi 1,Site Müşteri Temsilcisi 2");
    multipleMatching = (CommunityExcelActionsforWindows.multipleMatching)((ReportingDriver)driver).addons().execute(multipleMatching);

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
    return Stream.of(Arguments.of("https://otomasyon2.netahsilatdemo.com/","Kd!cyhz4","","","",""));
  }
}
