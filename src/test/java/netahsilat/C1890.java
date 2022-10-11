package netahsilat;

import io.testproject.addon.CommunityExcelActionsforWindows;
import io.testproject.addon.ExcelOperations;
import io.testproject.addon.JSActions;
import io.testproject.addon.NetahsilatUtills;
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
 * Test: C1890 Bayi Ödeme Toplamları Raporunda Çoklu Müşteri Temsilci Seçimi (NTH-14685)
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Tue Oct 11 07:21:43 GMT 2022.
 */
@DisplayName("C1890 Bayi Ödeme Toplamları Raporunda Çoklu Müşteri Temsilci Seçimi (NTH-14685)")
public class C1890 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C1890 Bayi Ödeme Toplamları Raporunda Çoklu Müşteri Temsilci Seçimi (NTH-14685)")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String password, String currentDateTime, String ElementCount,
      String UserProfile) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogin methodlogin;
    MethodMteriTemsilcisiKontrol methodmteritemsilcisikontrol;
    CommunityExcelActionsforWindows.deleteFile deleteFile;
    JSActions.ClickAction clickAction;
    CommunityExcelActionsforWindows.multipleMatching multipleMatching;
    NetahsilatUtills.GetSystemEnv getSystemEnv;
    ExcelOperations.WaitForDownloadedFile waitForDownloadedFile;

    // 1. Navigate to '{{Otomasyon2Logout}}'
    //    Navigates the specified URL (Auto-generated)
    driver.navigate().to(ProjectParameters.Otomasyon2Logout);

    // 2. Run Method Login
    //    otomasyon@test.com
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = "otomasyon@test.com";
    methodlogin.password = ProjectParameters.genelPassword;
    methodlogin.execute(driver);
    currentDateTime = String.valueOf(methodlogin.currentDateTime);

    // 3. Move mouse to 'moveToRaporlar'
    by = By.cssSelector("li[class='states']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 4. Click 'RAPORLAR'
    by = By.xpath("//a[. = 'RAPORLAR']");
    driver.findElement(by).click();

    // 5. Click 'GENEL RAPORLAR'
    by = By.xpath("//a[. = 'GENEL RAPORLAR']");
    driver.findElement(by).click();

    // 6. Click 'Bayi ödeme toplamları'
    by = By.xpath("//a[contains(text(),'Bayi ödeme toplamları')]/../a");
    driver.findElement(by).click();

    // 7. Is 'Bayi Ödeme Toplamları1' visible?
    by = By.xpath("//h1[. = 'Bayi Ödeme Toplamları']");
    driver.findElement(by).isDisplayed();

    // 8. Is 'loading' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(7000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("a[class='t-icon t-refresh t-loading']");
    (new WebDriverWait(driver, 7)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 9. Click ' Müşteri Temsilcisi RadioButton'
    clickAction = JSActions.getClickAction();
    by = By.xpath("//input[@id='filteredByRepresentative']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 10. Type 'Site Müşteri Temsilcisi 1' in 'Textbox - Müşteri Temsilcisi'
    by = By.xpath("//ul[@class='select2-choices']/..//input");
    driver.findElement(by).sendKeys("Site Müşteri Temsilcisi 1");

    // 11. Click 'Site Müşteri Temsilcisi 1'
    by = By.xpath("//li[1]//span[. = 'Site Müşteri Temsilcisi 1']");
    driver.findElement(by).click();

    // 12. Type 'Site Müşteri Temsilcisi 2' in 'Textbox - Müşteri Temsilcisi'
    by = By.xpath("//ul[@class='select2-choices']/..//input");
    driver.findElement(by).sendKeys("Site Müşteri Temsilcisi 2");

    // 13. Click 'Site Müşteri Temsilcisi 2'
    by = By.xpath("//li[1]//span[. = 'Site Müşteri Temsilcisi 2']");
    driver.findElement(by).click();

    // 14. Click 'Rapor Oluştur'
    by = By.cssSelector("#createReport");
    driver.findElement(by).click();

    // 15. Is 'loading' not present or invisible?
    by = By.cssSelector("a[class='t-icon t-refresh t-loading']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));

    // 16. This test was auto generated from steps of the 'C1898 Geri Ödeme Detayları Sayfasında Çoklu Müşteri Temsilci Seçimi (NTH-14692)' test
    methodmteritemsilcisikontrol = new MethodMteriTemsilcisiKontrol();
    methodmteritemsilcisikontrol.Temsilci1 = "Site Müşteri Temsilcisi 1";
    methodmteritemsilcisikontrol.Temsilci2 = "Site Müşteri Temsilcisi 2";
    methodmteritemsilcisikontrol.Temsilci3 = "Genel Toplam";
    methodmteritemsilcisikontrol.Temsilci4 = "!!!!!!!";
    methodmteritemsilcisikontrol.TabloBaslik = "Müşteri Temsilcisi";
    methodmteritemsilcisikontrol.execute(driver);

    // 17. Get System Environment
    getSystemEnv = NetahsilatUtills.getSystemEnv("USERPROFILE");
    getSystemEnv = (NetahsilatUtills.GetSystemEnv)((ReportingDriver)driver).addons().execute(getSystemEnv);
    UserProfile = String.valueOf(getSystemEnv.Path);

    String path = UserProfile + "/Downloads/Bayi Ödeme Toplamları.xls";
    // 18. Delete File (if exist)
    deleteFile = CommunityExcelActionsforWindows.deleteFile(path);
    deleteFile = (CommunityExcelActionsforWindows.deleteFile)((ReportingDriver)driver).addons().execute(deleteFile);

    // 19. Click 'Excel'e Aktar1'
    by = By.cssSelector("#exportReport");
    driver.findElement(by).click();

    // 20. Wait for the file '{{UserProfile}}\Downloads\Bayi Ödeme Toplamları.xls' to be downloaded up to '40'
    waitForDownloadedFile = ExcelOperations.waitForDownloadedFile(path,"40");
    waitForDownloadedFile = (ExcelOperations.WaitForDownloadedFile)((ReportingDriver)driver).addons().execute(waitForDownloadedFile);

    // 21. Search multiple matching in Exel Column
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
    return Stream.of(Arguments.of("https://otomasyon2.netahsilatdemo.com/","Kd!cyhz4","","",""));
  }
}
