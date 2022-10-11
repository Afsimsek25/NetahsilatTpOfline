package netahsilat;

import io.testproject.addon.FileUpload;
import io.testproject.addon.*;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C1936 NTH üzerinden iade işlemi yaptırırken fatura seçilmesi ve iade edilen fatura bilgilerinin gösterimi
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Oct 10 08:40:08 GMT 2022.
 */
@DisplayName("C1936 NTH üzerinden iade işlemi yaptırırken fatura seçilmesi ve iade edilen fatura bilgilerinin gösterimi")
public class C1936 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C1936 NTH üzerinden iade işlemi yaptırırken fatura seçilmesi ve iade edilen fatura bilgilerinin gösterimi")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String password, String currentDateTime, String kartNo,
      String CVV, String ayYil, String adSoyad, String ReferansNumarasi, String CurrentTime,
      String ReferansNo, String DateTime, String element, String ReplaceData, String Temsilci2,
      String Temsilci3, String Temsilci4, String GridColumnName, String date1, String date2,
      String date3) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodParametrikdemesadeceKartTypeTextWithDelayIsimsiz methodparametrikdemesadecekarttypetextwithdelayisimsiz;
    MethodLogin methodlogin;
    MethodRefreshLoadingControl methodrefreshloadingcontrol;
    String string;
    MethodJsGetDataFromGrid methodjsgetdatafromgrid;
    WebExtensions.SelectOptionbyVisibleText selectOptionbyVisibleText;
    CombinedActions.ClearAndTypeAction clearAndTypeAction;
    WebExtensions.WaitForAlertPresence waitForAlertPresence;
    JSActions.ClickAction clickAction;
    VisibleElementsOperations.ClickIfVisibleWeb clickIfVisibleWeb;
    WebExtensions.AcceptAlert acceptAlert;
    ExcelOperations.SetCellValue setCellValue;
    FileUpload.UploadFileElementAction uploadFileElementAction;
    GridOperations.GetData getData;
    WebExtensions.GetAlertText getAlertText;
    DateTimeOperations.CurrentDate currentDate;

    // 1. Navigate to '{{Otomasyon2Logout}}'
    driver.navigate().to(ProjectParameters.Otomasyon2Logout);

    // 2. Run Method Login
    //    admin@netahsilat.com
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = "admin@netahsilat.com";
    methodlogin.password = ProjectParameters.genelPassword;
    methodlogin.execute(driver);
    currentDateTime = String.valueOf(methodlogin.currentDateTime);

    // 3. Click 'BORÇ AKTARIMI'
    clickAction = JSActions.getClickAction();
    by = By.xpath("//a[. = 'BORÇ AKTARIMI']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 4. Get current date
    //    Exceldeki veriyi set etmek için oluşturuldu
    currentDate = DateTimeOperations.currentDate("ddMMyyyy_HHmm");
    currentDate = (DateTimeOperations.CurrentDate)((ReportingDriver)driver).addons().execute(currentDate);
    DateTime = String.valueOf(currentDate.result);

    // 5. Set the value ' IadeCokluFatura_C1936_1_{{DateTime}}' to cell '2','3'
    setCellValue = ExcelOperations.setCellValue("C:\\TestProject\\C1936_Borc_aktarim.xlsx","Sheet1","3","2",String.format(" IadeCokluFatura_C1936_1_%s",DateTime));
    setCellValue = (ExcelOperations.SetCellValue)((ReportingDriver)driver).addons().execute(setCellValue);

    // 6. Set the value ' IadeCokluFatura_C1936_2_{{DateTime}}' to cell '3','3'
    setCellValue = ExcelOperations.setCellValue("C:\\TestProject\\C1936_Borc_aktarim.xlsx","Sheet1","3","3",String.format(" IadeCokluFatura_C1936_2_%s",DateTime));
    setCellValue = (ExcelOperations.SetCellValue)((ReportingDriver)driver).addons().execute(setCellValue);

    // 7. Set the value ' IadeCokluFatura_C1936_3_{{DateTime}}' to cell '4','3'
    setCellValue = ExcelOperations.setCellValue("C:\\TestProject\\C1936_Borc_aktarim.xlsx","Sheet1","3","4",String.format(" IadeCokluFatura_C1936_3_%s",DateTime));
    setCellValue = (ExcelOperations.SetCellValue)((ReportingDriver)driver).addons().execute(setCellValue);

    // 8. Uploads a file to a given element with the 'file' type
    uploadFileElementAction = FileUpload.uploadFileElementAction("C:\\TestProject\\C1936_Borc_aktarim.xlsx");
    by = By.cssSelector("#import");
    uploadFileElementAction = (FileUpload.UploadFileElementAction)((ReportingDriver)driver).addons().execute(uploadFileElementAction, by, -1);

    // 9. Is 'Tamam' is clickable?
    by = By.xpath("//button[. = 'Tamam']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(by));

    // 10. Click 'Tamam'
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 11. Click 'Aktarımı Başlat'
    by = By.cssSelector("#importData");
    driver.findElement(by).click();

    // 12. Is 'dvSuccessMessage' visible?
    by = By.cssSelector("#dvSuccessMessage");
    driver.findElement(by).isDisplayed();

    // 13. Navigate to '{{Otomasyon2Logout}}'
    driver.navigate().to(ProjectParameters.Otomasyon2Logout);

    // 14. Run Method Login
    //    c1936@coklufatura.iade
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = "c1936@coklufatura.iade";
    methodlogin.password = password;
    methodlogin.execute(driver);
    currentDateTime = String.valueOf(methodlogin.currentDateTime);

    // 15. Click 'Masterpass Close button' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.xpath("//div[@data-bind=\"visible: masterPassStep() == 'mp-update-identity'\"]//button[@type='button'][normalize-space()='×']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 16. Click 'Borç Kapama'
    by = By.xpath("//span[. = 'Borç Kapama']");
    driver.findElement(by).click();

    // 17. Click ' IadeCokluFatura_C1936_1 Checkbox'
    by = By.xpath("//span[text()=' IadeCokluFatura_C1936_1']//..//..//input");
    driver.findElement(by).click();

    // 18. Click ' IadeCokluFatura_C1936_2 Checkbox'
    by = By.xpath("//span[text()=' IadeCokluFatura_C1936_2']//..//..//input");
    driver.findElement(by).click();

    // 19. Click 'IadeCokluFatura_C1936_3  Checkbox'
    by = By.xpath("//span[text()=' IadeCokluFatura_C1936_3']//..//..//input");
    driver.findElement(by).click();

    // 20. Run Method Parametrik Ödeme (Sadece Kart - Type text with delay)  - İsimsiz
    methodparametrikdemesadecekarttypetextwithdelayisimsiz = new MethodParametrikdemesadeceKartTypeTextWithDelayIsimsiz();
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.kartNo = kartNo;
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.CVV = CVV;
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.ayYil = ayYil;
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.adSoyad = adSoyad;
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.execute(driver);

    // 21. Type 'C1936' in 'TransactionDescription'
    by = By.cssSelector("#TransactionDescription");
    driver.findElement(by).sendKeys("C1936");

    // 22. Click 'Akbank Tek Çekim Genel Pos'
    by = By.xpath("(//td[contains(@class,'commRate-20')])[1]");
    driver.findElement(by).click();

    // 23. Click 'btnNormalPayment'
    by = By.cssSelector("#btnNormalPayment");
    driver.findElement(by).click();

    // 24. Is 'Payment Efekti' visible?
    by = By.cssSelector("div[class='spinner']");
    driver.findElement(by).isDisplayed();

    // 25. Is 'txtReferansNumarasi' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    by = By.xpath("(//p[@class='payment-result-text'])[1]");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 26. Navigate to '{{Otomasyon2Logout}}'
    driver.navigate().to(ProjectParameters.Otomasyon2Logout);

    // 27. Run Method Login
    //    admin@netahsilat.com
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = "admin@netahsilat.com";
    methodlogin.password = password;
    methodlogin.execute(driver);
    currentDateTime = String.valueOf(methodlogin.currentDateTime);

    // 28. Click 'İŞLEM LİSTESİ'
    clickAction = JSActions.getClickAction();
    by = By.xpath("//a[. = 'İŞLEM LİSTESİ']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 29. Is 'Listele' is clickable?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    by = By.xpath("//button[. = 'Listele']");
    (new WebDriverWait(driver, 35)).until(ExpectedConditions.elementToBeClickable(by));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 30. Clear 'StartDate' contents
    by = By.cssSelector("#StartDate");
    driver.findElement(by).clear();

    // 31. Get current date
    currentDate = DateTimeOperations.currentDate("dd.MM.yyyy");
    currentDate = (DateTimeOperations.CurrentDate)((ReportingDriver)driver).addons().execute(currentDate);
    CurrentTime = String.valueOf(currentDate.result);

    // 32. Run Clear 'EndDate' contents and type '{{CurrentTime}} 00:00'
    clearAndTypeAction = CombinedActions.clearAndTypeAction(String.format("%s 00:00",CurrentTime));
    by = By.cssSelector("#EndDate");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 33. Type 'c1936@coklufatura.iade' in 'VendorName'
    by = By.cssSelector("#VendorName");
    driver.findElement(by).sendKeys("c1936@coklufatura.iade");

    // 34. Click 'C1936 İade de Çoklu Fatura (Otomasyon2 E-Çözüm),31938060156,, c1936@coklufatura.iade'
    by = By.xpath("//div[text()='C1936 İade de Çoklu Fatura (Otomasyon2 E-Çözüm),31938060156,, c1936@coklufatura.iade']");
    driver.findElement(by).click();

    // 35. Select options in 'CancelledRefundedStatusId' with text '[NONE]'
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("İptal ya da iade edilmemiş transactions");
    by = By.cssSelector("#CancelledRefundedStatusId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 36. Click 'Listele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 37. Is 'Listele' is clickable?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    by = By.xpath("//button[. = 'Listele']");
    (new WebDriverWait(driver, 35)).until(ExpectedConditions.elementToBeClickable(by));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 38. Is 'Fatura Erp Code IadeCokluFatura_C1936' visible?
    by = By.xpath("//tr//../td[contains(text(),'IadeCokluFatura_C1936_1')  and contains(text(),'IadeCokluFatura_C1936_2') and contains(text(),'IadeCokluFatura_C1936_3') ]");
    driver.findElement(by).isDisplayed();

    // 39. Get text from 'gridden başarılı referans kolonu'
    by = By.xpath("((//td[text()='Başarılı'])[1]//following-sibling::td)[26]");
    string = driver.findElement(by).getAttribute("value");
    ReferansNo = String.valueOf(string);

    // 40. Type '{{ReferansNo}}' in 'ReferenceNumber'
    by = By.cssSelector("#ReferenceNumber");
    driver.findElement(by).sendKeys(ReferansNo);

    // 41. Select options in 'CancelledRefundedStatusId' with text '[NONE]'
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Hepsi");
    by = By.cssSelector("#CancelledRefundedStatusId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 42. Click 'Listele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 43. Is 'Listele' is clickable?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    by = By.xpath("//button[. = 'Listele']");
    (new WebDriverWait(driver, 35)).until(ExpectedConditions.elementToBeClickable(by));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 44. Run Get Data From Grid
    getData = GridOperations.getData("Referans",ReferansNo,"Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 45. Click 'İadeİmg'
    by = By.xpath("//img[contains(@src,'iade.png')]");
    driver.findElement(by).click();

    // 46. Get text from 'C1936 iade 1.Satır Textbox'
    //    FaturaErp codunu trimle ve kontrol et

    /* Step is disabled
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_0__Amount']");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("236,74", string);
    */
    // 47. Get text from 'C1936 iade 1.Satır Textbox'
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_0__Amount']");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("236,74", string);

    // 48. Get text from 'C1936 iade 1.Satır Bakiye'
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_0__Amount']/..//..//td[3]");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("236,74 TL", string);

    // 49. Get text from 'C1936 iade 1.Satır Textbox'
    //    FaturaErp codunu trimle ve kontrol et

    /* Step is disabled
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_0__Amount']");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("236,74", string);
    */
    // 50. Get text from 'C1936 iade 2.Satır Textbox'
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_1__Amount']");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("123,44", string);

    // 51. Get text from 'C1936 iade 2.Satır Bakiye'
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_1__Amount']/..//..//td[3]");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("123,44 TL", string);

    // 52. Get text from 'C1936 iade 1.Satır Textbox'
    //    FaturaErp codunu trimle ve kontrol et

    /* Step is disabled
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_0__Amount']");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("236,74", string);
    */
    // 53. Get text from 'C1936 iade 3.Satır Textbox'
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_2__Amount']");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("523,39", string);

    // 54. Get text from 'C1936 iade 3.Satır Bakiye'
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_2__Amount']/..//..//td[3]");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("523,39 TL", string);

    // 55. Run Clear 'C1936 iade 2.Satır Textbox' contents and type '0'
    clearAndTypeAction = CombinedActions.clearAndTypeAction("0");
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_1__Amount']");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 56. Run Clear 'C1936 iade 3.Satır Textbox' contents and type '0'
    clearAndTypeAction = CombinedActions.clearAndTypeAction("0");
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_2__Amount']");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 57. Click 'Tamam'
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 58. Is alert displayed?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    waitForAlertPresence = WebExtensions.waitForAlertPresence(40000);
    waitForAlertPresence = (WebExtensions.WaitForAlertPresence)((ReportingDriver)driver).addons().execute(waitForAlertPresence);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 59. Get alert text
    getAlertText = WebExtensions.getGetAlertText();
    getAlertText = (WebExtensions.GetAlertText)((ReportingDriver)driver).addons().execute(getAlertText);

    // 60. Accept alert
    acceptAlert = WebExtensions.acceptAlert(0);
    acceptAlert = (WebExtensions.AcceptAlert)((ReportingDriver)driver).addons().execute(acceptAlert);

    // 61. This test was auto generated from steps of the 'C1909-Listelerde ki verilerin maskelenmesi' test
    methodrefreshloadingcontrol = new MethodRefreshLoadingControl();
    methodrefreshloadingcontrol.execute(driver);

    // 62. Run Get Data From Grid
    getData = GridOperations.getData("Tutar","883,57","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 63. Run Get Data From Grid
    getData = GridOperations.getData("Bakiye","646,83","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 64. Click 'İadeİmg'
    by = By.xpath("//img[contains(@src,'iade.png')]");
    driver.findElement(by).click();

    // 65. Get text from 'C1936 iade 1.Satır Textbox'
    //    FaturaErp codunu trimle ve kontrol et

    /* Step is disabled
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_0__Amount']");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("236,74", string);
    */
    // 66. Get text from 'C1936 iade 2.Satır Textbox'
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_1__Amount']");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("123,44", string);

    // 67. Get text from 'C1936 iade 2.Satır Bakiye'
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_1__Amount']/..//..//td[3]");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("123,44 TL", string);

    // 68. Get text from 'C1936 iade 1.Satır Textbox'
    //    FaturaErp codunu trimle ve kontrol et

    /* Step is disabled
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_0__Amount']");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("236,74", string);
    */
    // 69. Get text from 'C1936 iade 3.Satır Textbox'
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_2__Amount']");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("523,39", string);

    // 70. Get text from 'C1936 iade 3.Satır Bakiye'
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_2__Amount']/..//..//td[3]");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("523,39 TL", string);

    // 71. Run Clear 'C1936 iade 2.Satır Textbox' contents and type '124'
    clearAndTypeAction = CombinedActions.clearAndTypeAction("124");
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_1__Amount']");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 72. Run Clear 'C1936 iade 3.Satır Textbox' contents and type '520'
    clearAndTypeAction = CombinedActions.clearAndTypeAction("520");
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_2__Amount']");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 73. Click 'Tamam'
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 74. Does 'İade tutarı işlem tutarından büyük olamaz' contain 'İade tutarı işlem tutarından büyük olamaz'?
    by = By.xpath("//li[. = 'İade tutarı işlem tutarından büyük olamaz']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("İade tutarı işlem tutarından büyük olamaz"));

    // 75. Click 'Kapat'
    by = By.xpath("//button[. = 'Kapat']");
    driver.findElement(by).click();

    // 76. Run Clear 'C1936 iade 2.Satır Textbox' contents and type '120'
    clearAndTypeAction = CombinedActions.clearAndTypeAction("120");
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_1__Amount']");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 77. Run Clear 'C1936 iade 3.Satır Textbox' contents and type '524'
    clearAndTypeAction = CombinedActions.clearAndTypeAction("524");
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_2__Amount']");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 78. Click 'Tamam'
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 79. Does 'İade tutarı işlem tutarından büyük olamaz' contain 'İade tutarı işlem tutarından büyük olamaz'?
    by = By.xpath("//li[. = 'İade tutarı işlem tutarından büyük olamaz']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("İade tutarı işlem tutarından büyük olamaz"));

    // 80. Click 'Kapat'
    by = By.xpath("//button[. = 'Kapat']");
    driver.findElement(by).click();

    // 81. Click 'Vazgeç'
    by = By.xpath("//button[. = 'Vazgeç']");
    driver.findElement(by).click();

    // 82. Click 'İadeİmg'
    by = By.xpath("//img[contains(@src,'iade.png')]");
    driver.findElement(by).click();

    // 83. Run Clear 'C1936 iade 3.Satır Textbox' contents and type '0'
    clearAndTypeAction = CombinedActions.clearAndTypeAction("0");
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_2__Amount']");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 84. Click 'Tamam'
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 85. Is alert displayed?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    waitForAlertPresence = WebExtensions.waitForAlertPresence(40000);
    waitForAlertPresence = (WebExtensions.WaitForAlertPresence)((ReportingDriver)driver).addons().execute(waitForAlertPresence);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 86. Get alert text
    getAlertText = WebExtensions.getGetAlertText();
    getAlertText = (WebExtensions.GetAlertText)((ReportingDriver)driver).addons().execute(getAlertText);

    // 87. Accept alert
    acceptAlert = WebExtensions.acceptAlert(0);
    acceptAlert = (WebExtensions.AcceptAlert)((ReportingDriver)driver).addons().execute(acceptAlert);

    // 88. This test was auto generated from steps of the 'C1909-Listelerde ki verilerin maskelenmesi' test
    methodrefreshloadingcontrol = new MethodRefreshLoadingControl();
    methodrefreshloadingcontrol.execute(driver);

    // 89. Run Get Data From Grid
    getData = GridOperations.getData("Bakiye","523,39","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 90. Click 'İadeİmg'
    by = By.xpath("//img[contains(@src,'iade.png')]");
    driver.findElement(by).click();

    // 91. Get text from 'C1936 iade 3.Satır Textbox'
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_2__Amount']");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("523,39", string);

    // 92. Get text from 'C1936 iade 3.Satır Bakiye'
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_2__Amount']/..//..//td[3]");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("523,39 TL", string);

    // 93. Run Clear 'C1936 iade 3.Satır Textbox' contents and type '200'
    clearAndTypeAction = CombinedActions.clearAndTypeAction("200");
    by = By.xpath("//td/..//input[@id='VPosTransactionCurrentAccount_2__Amount']");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 94. Click 'Tamam'
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 95. Is alert displayed?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    waitForAlertPresence = WebExtensions.waitForAlertPresence(40000);
    waitForAlertPresence = (WebExtensions.WaitForAlertPresence)((ReportingDriver)driver).addons().execute(waitForAlertPresence);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 96. Get alert text
    getAlertText = WebExtensions.getGetAlertText();
    getAlertText = (WebExtensions.GetAlertText)((ReportingDriver)driver).addons().execute(getAlertText);

    // 97. Accept alert
    acceptAlert = WebExtensions.acceptAlert(0);
    acceptAlert = (WebExtensions.AcceptAlert)((ReportingDriver)driver).addons().execute(acceptAlert);

    // 98. This test was auto generated from steps of the 'C1909-Listelerde ki verilerin maskelenmesi' test
    methodrefreshloadingcontrol = new MethodRefreshLoadingControl();
    methodrefreshloadingcontrol.execute(driver);

    // 99. Run Get Data From Grid
    getData = GridOperations.getData("Bakiye","323,39","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 100. Click 'İadeİmg'
    by = By.xpath("//img[contains(@src,'iade.png')]");
    driver.findElement(by).click();

    // 101. Click 'Tamam'
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 102. Is alert displayed?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    waitForAlertPresence = WebExtensions.waitForAlertPresence(40000);
    waitForAlertPresence = (WebExtensions.WaitForAlertPresence)((ReportingDriver)driver).addons().execute(waitForAlertPresence);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 103. Get alert text
    getAlertText = WebExtensions.getGetAlertText();
    getAlertText = (WebExtensions.GetAlertText)((ReportingDriver)driver).addons().execute(getAlertText);

    // 104. Accept alert
    acceptAlert = WebExtensions.acceptAlert(0);
    acceptAlert = (WebExtensions.AcceptAlert)((ReportingDriver)driver).addons().execute(acceptAlert);

    // 105. This test was auto generated from steps of the 'C1909-Listelerde ki verilerin maskelenmesi' test
    methodrefreshloadingcontrol = new MethodRefreshLoadingControl();
    methodrefreshloadingcontrol.execute(driver);

    // 106. Is 'İadeİmg' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
    by = By.xpath("//img[contains(@src,'iade.png')]");
    (new WebDriverWait(driver, 1)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 107. Click 'BORÇ TAKİBİ'
    //    İADE EDİLEN BORÇLAR TEKRAR AKTİF OLDUĞU İÇİN GEÇMİŞ KAYITLAR SİLİNİYOR.
    clickAction = JSActions.getClickAction();
    by = By.xpath("//a[. = 'BORÇ TAKİBİ']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 108. Is 'Borç Listesi' visible?
    by = By.xpath("//h1[. = 'Borç Listesi']");
    driver.findElement(by).isDisplayed();

    // 109. Type 'C1936' in 'FilterVendorName'
    by = By.cssSelector("#FilterVendorName");
    driver.findElement(by).sendKeys("C1936");

    // 110. Click 'Listele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 111. This test was auto generated from steps of the 'C1898 Geri Ödeme Detayları Sayfasında Çoklu Müşteri Temsilci Seçimi (NTH-14692)' test
    methodjsgetdatafromgrid = new MethodJsGetDataFromGrid();
    methodjsgetdatafromgrid.ColumnName = "Bayi ERP Kodu";
    methodjsgetdatafromgrid.SearchData = "IadeCokluFatura";
    methodjsgetdatafromgrid.execute(driver);

    // 112. Click 'selectall'
    by = By.cssSelector("#selectall");
    driver.findElement(by).click();

    // 113. Click 'Sil1'
    by = By.xpath("//button[. = 'Sil']");
    driver.findElement(by).click();

    // 114. Accept alert
    acceptAlert = WebExtensions.acceptAlert(0);
    acceptAlert = (WebExtensions.AcceptAlert)((ReportingDriver)driver).addons().execute(acceptAlert);

    // 115. Is 'No records to display.' visible?
    by = By.xpath("//td[. = 'No records to display.']");
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
    return Stream.of(Arguments.of("https://otomasyon2.netahsilatdemo.com/","Kd!cyhz4","","4355084355084358","000","12/26","Test Kartı","","","","","","","","!!","!!","","","",""));
  }
}
