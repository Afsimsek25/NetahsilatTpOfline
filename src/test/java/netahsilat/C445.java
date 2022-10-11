package netahsilat;

import io.testproject.addon.CommunityExcelActionsforWindows;
import io.testproject.addon.DateTimeOperations;
import io.testproject.addon.MathematicalUtilities;
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

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C445 Excel'e Aktarım (tutar ,komisyon oranları doğruluğu kontrol edilmeli)
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Oct 03 15:26:13 GMT 2022.
 */
@DisplayName("C445 Excel'e Aktarım (tutar ,komisyon oranları doğruluğu kontrol edilmeli)")
public class C445 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C445 Excel'e Aktarım (tutar ,komisyon oranları doğruluğu kontrol edilmeli)")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String currentDateTime,
      String threeDaysAgo, String komisyonValue, String tutarBoluKomisyon, String NetTutarValue,
      String rowIndex, String Row, String Col, String TutaValue, String KomisyonOraniValue,
      String deleteStatus) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    CommunityExcelActionsforWindows.deleteFile deleteFile;
    MathematicalUtilities.EvaluateMathExpr evaluateMathExpr;
    DateTimeOperations.SetDays setDays;
    CommunityExcelActionsforWindows.waitUntilFileDownloaded waitUntilFileDownloaded;
    CommunityExcelActionsforWindows.searchData searchData;
    CommunityExcelActionsforWindows.getData getData;
    DateTimeOperations.CurrentDate currentDate;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Move mouse to 'moveToIslemler'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='tag']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 3. Click 'İŞLEMLER1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'İŞLEMLER']");
    driver.findElement(by).click();

    // 4. Click 'İŞLEM DETAYLARI LİSTESİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'İŞLEM DETAYLARI LİSTESİ']");
    driver.findElement(by).click();

    // 5. Get current date
    /* Step is disabled
    GeneratedUtils.sleep(500);
    currentDate = DateTimeOperations.currentDate("dd.MM.yyyy");
    currentDate = (DateTimeOperations.CurrentDate)((ReportingDriver)driver).addons().execute(currentDate);
    currentDateTime = String.valueOf(currentDate.result);
    */
    // 6. Set '-3' days to '{{currentDateTime}}'
    /* Step is disabled
    GeneratedUtils.sleep(500);
    setDays = DateTimeOperations.setDays("-3",currentDateTime,"dd.MM.yyyy","dd.MM.yyyy");
    setDays = (DateTimeOperations.SetDays)((ReportingDriver)driver).addons().execute(setDays);
    threeDaysAgo = String.valueOf(setDays.result);
    */
    // 7. Clear 'StartDate' contents
    /* Step is disabled
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#StartDate");
    driver.findElement(by).clear();
    */
    // 8. Type '{{threeDaysAgo}}' in 'StartDate'
    /* Step is disabled
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#StartDate");
    driver.findElement(by).sendKeys(threeDaysAgo);
    */
    // 9. Move mouse to 'StartDate'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#StartDate");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 10. Clear 'StartDate' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#StartDate");
    driver.findElement(by).clear();

    // 11. Type '76162482466' in 'VendorName'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#VendorName");
    driver.findElement(by).sendKeys("76162482466");

    // 12. Click 'Bireysel Ana Bayi,76162482466'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[contains(text(),',76162482466')]");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 13. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 14. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 15. Delete File (if exist)
    //    %USERPROFILE%\Downloads\C445-Islem-Detaylari.xls
    GeneratedUtils.sleep(500);
    deleteFile = CommunityExcelActionsforWindows.deleteFile("%USERPROFILE%\\Downloads\\Islem-Detaylari.xls");
    deleteFile = (CommunityExcelActionsforWindows.deleteFile)((ReportingDriver)driver).addons().execute(deleteFile);

    // 16. Click 'Excel'e Aktar'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#btnExport");
    driver.findElement(by).click();

    // 17. Wait Until The File is Downloaded
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    waitUntilFileDownloaded = CommunityExcelActionsforWindows.waitUntilFileDownloaded("%USERPROFILE%\\Downloads\\Islem-Detaylari.xls",30);
    waitUntilFileDownloaded = (CommunityExcelActionsforWindows.waitUntilFileDownloaded)((ReportingDriver)driver).addons().execute(waitUntilFileDownloaded);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 18. Search Data From Excel
    //    Search Tutar)
    GeneratedUtils.sleep(500);
    searchData = CommunityExcelActionsforWindows.searchData("%USERPROFILE%\\Downloads\\Islem-Detaylari.xls",2,"Tutar");
    searchData = (CommunityExcelActionsforWindows.searchData)((ReportingDriver)driver).addons().execute(searchData);
    Row = String.valueOf(searchData.Row);
    Col = String.valueOf(searchData.Col);

    // 19. Evaluate '{{Row}} +1'
    GeneratedUtils.sleep(500);
    evaluateMathExpr = MathematicalUtilities.evaluateMathExpr(String.format("%s +1",Row));
    evaluateMathExpr = (MathematicalUtilities.EvaluateMathExpr)((ReportingDriver)driver).addons().execute(evaluateMathExpr);
    Row = String.valueOf(evaluateMathExpr.result);

    // 20. Get Data From Excel
    //    Tutar  Value
    GeneratedUtils.sleep(500);
    getData = CommunityExcelActionsforWindows.getData(2,Integer.parseInt(Row),Integer.parseInt(Col),"%USERPROFILE%\\Downloads\\Islem-Detaylari.xls");
    getData = (CommunityExcelActionsforWindows.getData)((ReportingDriver)driver).addons().execute(getData);
    TutaValue = String.valueOf(getData.Value);

    // 21. Search Data From Excel
    //    Komisyon Oranı)
    GeneratedUtils.sleep(500);
    searchData = CommunityExcelActionsforWindows.searchData("%USERPROFILE%\\Downloads\\Islem-Detaylari.xls",2,"Komisyon Oranı");
    searchData = (CommunityExcelActionsforWindows.searchData)((ReportingDriver)driver).addons().execute(searchData);
    Row = String.valueOf(searchData.Row);
    Col = String.valueOf(searchData.Col);

    // 22. Evaluate '{{Row}} +1'
    GeneratedUtils.sleep(500);
    evaluateMathExpr = MathematicalUtilities.evaluateMathExpr(String.format("%s +1",Row));
    evaluateMathExpr = (MathematicalUtilities.EvaluateMathExpr)((ReportingDriver)driver).addons().execute(evaluateMathExpr);
    Row = String.valueOf(evaluateMathExpr.result);

    // 23. Get Data From Excel
    //    Get Komisyon Oranı Value
    GeneratedUtils.sleep(500);
    getData = CommunityExcelActionsforWindows.getData(2,Integer.parseInt(Row),Integer.parseInt(Col),"%USERPROFILE%\\Downloads\\Islem-Detaylari.xls");
    getData = (CommunityExcelActionsforWindows.getData)((ReportingDriver)driver).addons().execute(getData);
    KomisyonOraniValue = String.valueOf(getData.Value);

    // 24. Search Data From Excel
    //    Search Net Tutar
    GeneratedUtils.sleep(500);
    searchData = CommunityExcelActionsforWindows.searchData("%USERPROFILE%\\Downloads\\Islem-Detaylari.xls",2,"Net Tutar");
    searchData = (CommunityExcelActionsforWindows.searchData)((ReportingDriver)driver).addons().execute(searchData);
    Col = String.valueOf(searchData.Col);
    Row = String.valueOf(searchData.Row);

    // 25. Evaluate '{{Row}} +1'
    GeneratedUtils.sleep(500);
    evaluateMathExpr = MathematicalUtilities.evaluateMathExpr(String.format("%s +1",Row));
    evaluateMathExpr = (MathematicalUtilities.EvaluateMathExpr)((ReportingDriver)driver).addons().execute(evaluateMathExpr);
    Row = String.valueOf(evaluateMathExpr.result);

    // 26. Get Data From Excel
    //    Get Net Tutar Value
    GeneratedUtils.sleep(500);
    getData = CommunityExcelActionsforWindows.getData(2,Integer.parseInt(Row),Integer.parseInt(Col),"%USERPROFILE%\\Downloads\\Islem-Detaylari.xls");
    getData = (CommunityExcelActionsforWindows.getData)((ReportingDriver)driver).addons().execute(getData);
    NetTutarValue = String.valueOf(getData.Value);

    // 27. Evaluate '{{TutaValue}}-  ( {{TutaValue}}* {{KomisyonOraniValue}} /100)'
    GeneratedUtils.sleep(500);
    evaluateMathExpr = MathematicalUtilities.evaluateMathExpr(String.format("%s-  ( %s* %s /100)",TutaValue,TutaValue,KomisyonOraniValue));
    evaluateMathExpr = (MathematicalUtilities.EvaluateMathExpr)((ReportingDriver)driver).addons().execute(evaluateMathExpr);
    tutarBoluKomisyon = String.valueOf(evaluateMathExpr.result);

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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","Kd!cyhz4","","","","","","2","","","","",""));
  }
}