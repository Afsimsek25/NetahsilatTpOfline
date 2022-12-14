package netahsilat;

import io.testproject.addon.CommunityExcelActionsforWindows;
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

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C1914-Excel Aktarımlarında ki Verilerin Maskelenmesi
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Oct 10 08:38:13 GMT 2022.
 */
@DisplayName("C1914-Excel Aktarımlarında ki Verilerin Maskelenmesi")
public class C1914 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C1914-Excel Aktarımlarında ki Verilerin Maskelenmesi")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String password, String userName, String ApplicationURL, String Env,
      String currentDateTime) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodRefreshLoadingControl methodrefreshloadingcontrol;
    MethodLogoutlogin methodlogoutlogin;
    CommunityExcelActionsforWindows.deleteFile deleteFile;
    JSActions.ClickAction clickAction;
    CommunityExcelActionsforWindows.waitUntilFileDownloaded waitUntilFileDownloaded;
    NetahsilatUtills.GetSystemEnv getSystemEnv;
    CommunityExcelActionsforWindows.getData getData;

    // 1. Run Method Logout&Login
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ProjectParameters.Otomasyon3Logout;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);
    currentDateTime = String.valueOf(methodlogoutlogin.currentDateTime);

    // 2. Click 'altUyeYonetimi'
    clickAction = JSActions.getClickAction();
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 3. This test was auto generated from steps of the 'C1909-Listelerde ki verilerin maskelenmesi' test
    methodrefreshloadingcontrol = new MethodRefreshLoadingControl();
    methodrefreshloadingcontrol.execute(driver);

    // 4. Type '2103' in 'SearchVendorNameVN'
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("2103");

    // 5. Click '21**** 21**** (E****, MUS210318_2,3********8,'
    by = By.xpath("//div[. = '21**** 21**** (E****, MUS210318_2,3********8,']");
    driver.findElement(by).click();

    // 6. Get System Environment
    getSystemEnv = NetahsilatUtills.getSystemEnv("USERPROFILE");
    getSystemEnv = (NetahsilatUtills.GetSystemEnv)((ReportingDriver)driver).addons().execute(getSystemEnv);
    Env = String.valueOf(getSystemEnv.Path);

    String path = Env + "/Downloads/Bayiler.xls";
    // 7. Delete File (if exist)
    deleteFile = CommunityExcelActionsforWindows.deleteFile(path);
    deleteFile = (CommunityExcelActionsforWindows.deleteFile)((ReportingDriver)driver).addons().execute(deleteFile);

    // 8. Click 'Basit'
    clickAction = JSActions.getClickAction();
    by = By.xpath("//a[. = 'Basit']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 9. Wait Until The File is Downloaded
    waitUntilFileDownloaded = CommunityExcelActionsforWindows.waitUntilFileDownloaded(path,60);
    waitUntilFileDownloaded = (CommunityExcelActionsforWindows.waitUntilFileDownloaded)((ReportingDriver)driver).addons().execute(waitUntilFileDownloaded);

    // 10. Get Data From Excel
    getData = CommunityExcelActionsforWindows.getData(1,2,1,path);
    getData = (CommunityExcelActionsforWindows.getData)((ReportingDriver)driver).addons().execute(getData);

    // 11. Click 'İŞLEM LİSTESİ1'
    clickAction = JSActions.getClickAction();
    by = By.xpath("//a[. = 'İŞLEM LİSTESİ']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 12. This test was auto generated from steps of the 'C1909-Listelerde ki verilerin maskelenmesi' test
    methodrefreshloadingcontrol = new MethodRefreshLoadingControl();
    methodrefreshloadingcontrol.execute(driver);

    // 13. Clear 'StartDate' contents
    by = By.cssSelector("#StartDate");
    driver.findElement(by).clear();

    // 14. Type '09.03.2022 00:00' in 'StartDate'
    by = By.cssSelector("#StartDate");
    driver.findElement(by).sendKeys("09.03.2022 00:00");

    // 15. Clear 'EndDate' contents
    by = By.cssSelector("#EndDate");
    driver.findElement(by).clear();

    // 16. Type '09.03.2022 23:00' in 'EndDate'
    by = By.cssSelector("#EndDate");
    driver.findElement(by).sendKeys("09.03.2022 23:00");

    // 17. Type '2103' in 'VendorNameTr'
    by = By.cssSelector("#VendorName");
    driver.findElement(by).sendKeys("2103");

    // 18. Click '21**** 21**** (E****, MUS210318_2,3********8,'
    by = By.xpath("//div[. = '21**** 21**** (E****, MUS210318_2,3********8,']");
    driver.findElement(by).click();
    path = Env + "%/Downloads/Islemler.xlsx";

    // 19. Delete File (if exist)
    deleteFile = CommunityExcelActionsforWindows.deleteFile(path);
    deleteFile = (CommunityExcelActionsforWindows.deleteFile)((ReportingDriver)driver).addons().execute(deleteFile);

    // 20. Click 'Excel'e Aktar'
    by = By.cssSelector("#btnExport");
    driver.findElement(by).click();

    // 21. Wait Until The File is Downloaded
    waitUntilFileDownloaded = CommunityExcelActionsforWindows.waitUntilFileDownloaded(path,30);
    waitUntilFileDownloaded = (CommunityExcelActionsforWindows.waitUntilFileDownloaded)((ReportingDriver)driver).addons().execute(waitUntilFileDownloaded);

    // 22. Get Data From Excel
    getData = CommunityExcelActionsforWindows.getData(1,2,24,path);
    getData = (CommunityExcelActionsforWindows.getData)((ReportingDriver)driver).addons().execute(getData);

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
    return Stream.of(Arguments.of("Kd!cyhz4","otomasyon@test.com","https://otomasyon.netahsilatdemo.com/Account/LogOff","",""));
  }
}
