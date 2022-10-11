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
 * Test: C1898 Geri Ödeme Detayları Sayfasında Çoklu Müşteri Temsilci Seçimi (NTH-14692)
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Oct 10 08:34:29 GMT 2022.
 */
@DisplayName("C1898 Geri Ödeme Detayları Sayfasında Çoklu Müşteri Temsilci Seçimi (NTH-14692)")
public class C1898 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C1898 Geri Ödeme Detayları Sayfasında Çoklu Müşteri Temsilci Seçimi (NTH-14692)")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String password, String currentDateTime, String ElementCount,
      String MusteriTemsilcisiColum, String UserProfile, String sss, String sss2) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogin methodlogin;
    MethodMteriTemsilcisiKontrol methodmteritemsilcisikontrol;
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
    methodlogin.password = password;
    methodlogin.execute(driver);
    currentDateTime = String.valueOf(methodlogin.currentDateTime);

    // 3. Move mouse to 'moveToIslemler'
    by = By.cssSelector("li[class='tag']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 4. Click 'İŞLEMLER'
    by = By.xpath("//a[. = 'İŞLEMLER']");
    driver.findElement(by).click();

    // 5. Click 'ddPosRapor'
    by = By.xpath("//li[2]/ul//img");
    driver.findElement(by).click();

    // 6. Click 'GERİ ÖDEME DETAYLARI'
    by = By.xpath("//a[. = 'GERİ ÖDEME DETAYLARI']");
    driver.findElement(by).click();

    // 7. Is 'Listele' is clickable?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.xpath("//button[. = 'Listele']");
    (new WebDriverWait(driver, 25)).until(ExpectedConditions.elementToBeClickable(by));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 8. Clear 'StartDate' contents
    by = By.cssSelector("#StartDate");
    driver.findElement(by).clear();

    // 9. Select options in 'SelectedVendorTypeId' with text '[NONE]'
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Müşteri");
    by = By.cssSelector("#SelectedVendorTypeId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

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

    // 14. Click 'Listele'
    //    Sayfa değiştiği için bu butona tıklamaya gerek kalmadı
    /* Step is disabled
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    */
    // 15. Is 'Refresh noLoading' visible?
    by = By.xpath("//a[@class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();

    // 16. Click 'Sayfalama Butonu'
    clickAction = JSActions.getClickAction();
    by = By.cssSelector("span[class='t-input']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 17. Click 'Grid 100 Liste'
    clickAction = JSActions.getClickAction();
    by = By.xpath("//div[@class = 't-animation-container' and contains(@style, 'display: block;')]//li[. = '100']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 18. Is 'Refresh Loading' visible?
    by = By.xpath("//a[@class='t-icon t-refresh t-loading']");
    driver.findElement(by).isDisplayed();

    // 19. Is 'Refresh noLoading' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    by = By.xpath("//a[@class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 20. Is 'Listele' is clickable?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.xpath("//button[. = 'Listele']");
    (new WebDriverWait(driver, 25)).until(ExpectedConditions.elementToBeClickable(by));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 21. This test was auto generated from steps of the 'C1898 Geri Ödeme Detayları Sayfasında Çoklu Müşteri Temsilci Seçimi (NTH-14692)' test
    //    This step was auto generated from several steps
    methodmteritemsilcisikontrol = new MethodMteriTemsilcisiKontrol();
    methodmteritemsilcisikontrol.Temsilci1 = "Site Müşteri Temsilcisi 1 / SMT01";
    methodmteritemsilcisikontrol.Temsilci2 = "Site Müşteri Temsilcisi 2 / SMT02";
    methodmteritemsilcisikontrol.Temsilci3 = "!!!!";
    methodmteritemsilcisikontrol.Temsilci4 = "!!!!";
    methodmteritemsilcisikontrol.TabloBaslik = "Müşteri Temsilcisi Adı";
    methodmteritemsilcisikontrol.execute(driver);

    // 22. Get System Environment
    /* Step is disabled
    getSystemEnv = NetahsilatUtills.getSystemEnv("USERPROFILE");
    getSystemEnv = (NetahsilatUtills.GetSystemEnv)((ReportingDriver)driver).addons().execute(getSystemEnv);
    UserProfile = String.valueOf(getSystemEnv.Path);
    */
    // 23. Delete the file from '{{UserProfile}}\Downloads\Geri-Odeme-Plani.xls'
    /* Step is disabled
    deleteFile = ExcelOperations.deleteFile(String.format("%s\Downloads\Geri-Odeme-Plani.xls",UserProfile));
    deleteFile = (ExcelOperations.DeleteFile)((ReportingDriver)driver).addons().execute(deleteFile);
    */
    // 24. Click 'Excel'e Aktar'
    /* Step is disabled
    by = By.cssSelector("#btnExport");
    driver.findElement(by).click();
    */
    // 25. Wait Until The File is Downloaded
    /* Step is disabled
    waitUntilFileDownloaded = CommunityExcelActionsforWindows.waitUntilFileDownloaded(String.format("%s\Downloads\Geri-Odeme-Plani.xls",UserProfile),60);
    waitUntilFileDownloaded = (CommunityExcelActionsforWindows.WaitUntilFileDownloaded)((ReportingDriver)driver).addons().execute(waitUntilFileDownloaded);
    */
    // 26. Search multiple matching in Exel Column
    /* Step is disabled
    multipleMatching = CommunityExcelActionsforWindows.multipleMatching(String.format("%s\Downloads\Geri-Odeme-Plani.xls",UserProfile),1,7,"Site Müşteri Temsilcisi 1,Site Müşteri Temsilcisi 2");
    multipleMatching = (CommunityExcelActionsforWindows.MultipleMatching)((ReportingDriver)driver).addons().execute(multipleMatching);
    */
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
    return Stream.of(Arguments.of("https://otomasyon2.netahsilatdemo.com/","Kd!cyhz4","","","","","",""));
  }
}