package netahsilat;

import io.testproject.addon.CommunityExcelActionsforWindows;
import io.testproject.addon.DateTimeOperations;
import io.testproject.addon.NetahsilatUtills;
import io.testproject.addon.WebExtensions;
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
 * Test: C1896 İşlem Listesi Sayfasında Çoklu Müşteri Temsilci Seçimi (NTH-14690)
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Tue Oct 11 07:22:28 GMT 2022.
 */
@DisplayName("C1896 İşlem Listesi Sayfasında Çoklu Müşteri Temsilci Seçimi (NTH-14690)")
public class C1896 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C1896 İşlem Listesi Sayfasında Çoklu Müşteri Temsilci Seçimi (NTH-14690)")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String password, String currentDateTime, String ElementCount,
      String MusteriTemsilcisiColum, String USERPROFILE, String Date, String element,
      String ReplaceData) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogin methodlogin;
    MethodMteriTemsilcisiKontrol methodmteritemsilcisikontrol;
    CommunityExcelActionsforWindows.deleteFile deleteFile;
    WebExtensions.SelectOptionbyVisibleText selectOptionbyVisibleText;
    CommunityExcelActionsforWindows.waitUntilFileDownloaded waitUntilFileDownloaded;
    CommunityExcelActionsforWindows.multipleMatching multipleMatching;
    DateTimeOperations.SetMonths setMonths;
    NetahsilatUtills.GetSystemEnv getSystemEnv;
    DateTimeOperations.CurrentDate currentDate;

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

    // 3. Move mouse to 'moveToIslemler'
    by = By.cssSelector("li[class='tag']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 4. Click 'İŞLEMLER'
    by = By.xpath("//a[. = 'İŞLEMLER']");
    driver.findElement(by).click();

    // 5. Click 'İŞLEM LİSTESİ'
    by = By.xpath("//a[. = 'İŞLEM LİSTESİ']");
    driver.findElement(by).click();

    // 6. Is 'Listele' is clickable?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.xpath("//button[. = 'Listele']");
    (new WebDriverWait(driver, 25)).until(ExpectedConditions.elementToBeClickable(by));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 7. Clear 'StartDate' contents
    by = By.cssSelector("#StartDate");
    driver.findElement(by).clear();

    // 8. Get current date
    currentDate = DateTimeOperations.currentDate("dd.MM.yyyy");
    currentDate = (DateTimeOperations.CurrentDate)((ReportingDriver)driver).addons().execute(currentDate);
    Date = String.valueOf(currentDate.result);

    // 9. Set '-1' months to '{{Date}}'
    setMonths = DateTimeOperations.setMonths("-1",Date,"dd.MM.yyyy","");
    setMonths = (DateTimeOperations.SetMonths)((ReportingDriver)driver).addons().execute(setMonths);
    Date = String.valueOf(setMonths.result);

    // 10. Type '{{Date}} 00:00' in 'StartDate'
    by = By.cssSelector("#StartDate");
    driver.findElement(by).sendKeys(String.format("%s 00:00",Date));

    // 11. Select options in 'VendorTypeId' with text '[NONE]'
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Müşteri");
    by = By.cssSelector("#VendorTypeId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 12. Type 'Site Müşteri Temsilcisi 1' in 'Müşteri temsilcisi select'
    by = By.xpath("//*[@class='select2-input select2-default']");
    driver.findElement(by).sendKeys("Site Müşteri Temsilcisi 1");

    // 13. Click 'Site Müşteri Temsilcisi 1'
    by = By.xpath("//li[1]//span[. = 'Site Müşteri Temsilcisi 1']");
    driver.findElement(by).click();

    // 14. Type 'Site Müşteri Temsilcisi 2' in 's2id_autogen1'
    by = By.cssSelector("#s2id_autogen1");
    driver.findElement(by).sendKeys("Site Müşteri Temsilcisi 2");

    // 15. Click 'Site Müşteri Temsilcisi 2'
    by = By.xpath("//li[1]//span[. = 'Site Müşteri Temsilcisi 2']");
    driver.findElement(by).click();

    // 16. Click 'Sayfalama Butonu'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("span[class='t-input']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 17. Click 'Grid 500 Liste'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.xpath("//div[@class = 't-animation-container' and contains(@style, 'display: block;')]//li[. = '500']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 18. Is 'Refresh Loading' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.xpath("//a[@class='t-icon t-refresh t-loading']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 19. Is 'Refresh noLoading' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.xpath("//a[@class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 20. This test was auto generated from steps of the 'C1898 Geri Ödeme Detayları Sayfasında Çoklu Müşteri Temsilci Seçimi (NTH-14692)' test
    methodmteritemsilcisikontrol = new MethodMteriTemsilcisiKontrol();
    methodmteritemsilcisikontrol.Temsilci1 = "Site Müşteri Temsilcisi / SMT01";
    methodmteritemsilcisikontrol.Temsilci2 = "Site Müşteri Temsilcisi / SMT02";
    methodmteritemsilcisikontrol.Temsilci3 = "!!!!!";
    methodmteritemsilcisikontrol.Temsilci4 = "!!!!!!!";
    methodmteritemsilcisikontrol.execute(driver);
    ReplaceData = String.valueOf(methodmteritemsilcisikontrol.ReplaceData);
    element = String.valueOf(methodmteritemsilcisikontrol.element);

    // 21. Get System Environment
    getSystemEnv = NetahsilatUtills.getSystemEnv("USERPROFILE");
    getSystemEnv = (NetahsilatUtills.GetSystemEnv)((ReportingDriver)driver).addons().execute(getSystemEnv);
    USERPROFILE = String.valueOf(getSystemEnv.Path);

    String path = USERPROFILE + "/Downloads/Islemler.xls";

    // 22. Delete File (if exist)
    deleteFile = CommunityExcelActionsforWindows.deleteFile(path);
    deleteFile = (CommunityExcelActionsforWindows.deleteFile)((ReportingDriver)driver).addons().execute(deleteFile);

    // 23. Click 'Excel'e Aktar'
    by = By.cssSelector("#btnExport");
    driver.findElement(by).click();

    // 24. Wait Until The File is Downloaded
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(80000, TimeUnit.MILLISECONDS);
    waitUntilFileDownloaded = CommunityExcelActionsforWindows.waitUntilFileDownloaded(path,120);
    waitUntilFileDownloaded = (CommunityExcelActionsforWindows.waitUntilFileDownloaded)((ReportingDriver)driver).addons().execute(waitUntilFileDownloaded);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 25. Search multiple matching in Exel Column
    multipleMatching = CommunityExcelActionsforWindows.multipleMatching(path,1,35,"Site Müşteri Temsilcisi:SMT01,Site Müşteri Temsilcisi:SMT02");
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
    return Stream.of(Arguments.of("https://otomasyon2.netahsilatdemo.com/","Kd!cyhz4","","","","","","",""));
  }
}