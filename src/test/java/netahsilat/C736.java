package netahsilat;

import io.testproject.addon.CombinedActions;
import io.testproject.addon.DateTimeOperations;
import io.testproject.addon.RandomDataGenerator;
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

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C736 Bir cari hesap borçlandırılıp başka çari hesap seçildiğinde bir öncekine kaydoluyor mu
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 11:05:26 GMT 2022.
 */
@DisplayName("C736 Bir cari hesap borçlandırılıp başka çari hesap seçildiğinde bir öncekine kaydoluyor mu")
public class C736 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C736 Bir cari hesap borçlandırılıp başka çari hesap seçildiğinde bir öncekine kaydoluyor mu")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String currentDate,
      String faturaErpKodu, String faturaNumarasi, String dokumanKodu, String odemeLinki) throws
      Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    String string;
    WebExtensions.SelectOptionbyVisibleText selectOptionbyVisibleText;
    CombinedActions.ClearAndTypeAction clearAndTypeAction;
    RandomDataGenerator.GenerateNumberInRange generateNumberInRange;
    WebExtensions.AcceptAlert acceptAlert;
    DateTimeOperations.CurrentDate cdata;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Move mouse to 'moveCariHesapYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector(".accountmanagement");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 3. Click 'moveCariHesapYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector(".accountmanagement");
    driver.findElement(by).click();

    // 4. Click 'BORÇLANDIRMA'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'BORÇLANDIRMA']");
    driver.findElement(by).click();

    // 5. Type 'anamusteri02' in 'CurrentAcccountName'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CurrentAcccountName");
    driver.findElement(by).sendKeys("anamusteri02");

    // 6. Click '//li//div[text()='#AnaMusteri2']'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//li//div[text()='#AnaMusteri2']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 7. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 8. Is 'anamusteri02' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//tr[1]//td[. = 'anamusteri02']");
    driver.findElement(by).isDisplayed();

    // 9. Click 'selection2'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[name='selection']");
    driver.findElement(by).click();

    // 10. Click 'Borçlandır'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#DebtId");
    driver.findElement(by).click();

    // 11. Get current date
    GeneratedUtils.sleep(500);
    cdata = DateTimeOperations.currentDate("dd.MM.yyyy");
    cdata = (DateTimeOperations.CurrentDate)((ReportingDriver)driver).addons().execute(cdata);


    // 12. Type '{{currentDate}}' in 'DebtDueDate'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#DebtDueDate");
    driver.findElement(by).sendKeys(currentDate);

    // 13. Type '{{currentDate}}' in 'DebtTransactionDate'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#DebtTransactionDate");
    driver.findElement(by).sendKeys(currentDate);

    // 14. Click 'Amount'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Amount");
    driver.findElement(by).click();

    // 15. Run Clear 'Amount' contents and type '1812'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("1812");
    by = By.cssSelector("#Amount");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 16. Run Clear 'PaidAmount' contents and type '1800'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("1800");
    by = By.cssSelector("#PaidAmount");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 17. Select options in 'PaymentSetId1' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Varsayılan ödeme seti");
    by = By.xpath("//div[1]/p/select");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 18. Type '2' in 'MaxInstalment'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[4]/div[2]/p/input");
    driver.findElement(by).sendKeys("2");

    // 19. Type '[NONE]' in 'ErpCode'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ErpCode");
    driver.findElement(by).sendKeys("");

    // 20. Generate random number between '0' and '999999999'
    GeneratedUtils.sleep(500);
    generateNumberInRange = RandomDataGenerator.generateNumberInRange("0","999999999");
    generateNumberInRange = (RandomDataGenerator.GenerateNumberInRange)((ReportingDriver)driver).addons().execute(generateNumberInRange);
    faturaErpKodu = String.valueOf(generateNumberInRange.result);

    // 21. Type '{{faturaErpKodu}}' in 'ErpCode'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ErpCode");
    driver.findElement(by).sendKeys(faturaErpKodu);

    // 22. Generate random number between '0' and '999999999'
    GeneratedUtils.sleep(500);
    generateNumberInRange = RandomDataGenerator.generateNumberInRange("0","999999999");
    generateNumberInRange = (RandomDataGenerator.GenerateNumberInRange)((ReportingDriver)driver).addons().execute(generateNumberInRange);
    dokumanKodu = String.valueOf(generateNumberInRange.result);

    // 23. Type '{{dokumanKodu}}' in 'DocumentId'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#DocumentId");
    driver.findElement(by).sendKeys(dokumanKodu);

    // 24. Generate random number between '0' and '999999999'
    GeneratedUtils.sleep(500);
    generateNumberInRange = RandomDataGenerator.generateNumberInRange("0","999999999");
    generateNumberInRange = (RandomDataGenerator.GenerateNumberInRange)((ReportingDriver)driver).addons().execute(generateNumberInRange);
    faturaNumarasi = String.valueOf(generateNumberInRange.result);

    // 25. Type '{{faturaNumarasi}}' in 'InvoiceNumber'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#InvoiceNumber");
    driver.findElement(by).sendKeys(faturaNumarasi);

    // 26. Type 'C736' in 'Description2'
    GeneratedUtils.sleep(500);
    by = By.xpath("//textarea");
    driver.findElement(by).sendKeys("C736");

    // 27. Click 'Tamam1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 28. Clear 'CurrentAcccountName' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CurrentAcccountName");
    driver.findElement(by).clear();

    // 29. Type 'BireyselAnaBayi' in 'CurrentAcccountName'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CurrentAcccountName");
    driver.findElement(by).sendKeys("BireyselAnaBayi");

    // 30. Click 'Bireysel Ana Bayi (Silmeyiniz-Değişti...'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[. = 'Bireysel Ana Bayi (Silmeyiniz-Değiştirmeyiniz),76162482466,']");
    driver.findElement(by).click();

    // 31. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 32. Is '//tr[1]//td[. = 'BireyselAnaBayi']' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//tr[1]//td[. = 'BireyselAnaBayi']");
    driver.findElement(by).isDisplayed();

    // 33. Click 'selection2'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[name='selection']");
    driver.findElement(by).click();

    // 34. Click 'Borçlandır'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#DebtId");
    driver.findElement(by).click();

    // 35. Get current date
    GeneratedUtils.sleep(500);
    cdata = DateTimeOperations.currentDate("dd.MM.yyyy");
    cdata = (DateTimeOperations.CurrentDate)((ReportingDriver)driver).addons().execute(cdata);


    // 36. Type '{{currentDate}}' in 'DebtDueDate'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#DebtDueDate");
    driver.findElement(by).sendKeys(currentDate);

    // 37. Type '{{currentDate}}' in 'DebtTransactionDate'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#DebtTransactionDate");
    driver.findElement(by).sendKeys(currentDate);

    // 38. Click 'Amount'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Amount");
    driver.findElement(by).click();

    // 39. Run Clear 'Amount' contents and type '1812'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("1812");
    by = By.cssSelector("#Amount");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 40. Run Clear 'PaidAmount' contents and type '1800'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("1800");
    by = By.cssSelector("#PaidAmount");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 41. Select options in 'PaymentSetId1' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Varsayılan ödeme seti");
    by = By.xpath("//div[1]/p/select");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 42. Type '2' in 'MaxInstalment'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[4]/div[2]/p/input");
    driver.findElement(by).sendKeys("2");

    // 43. Type '[NONE]' in 'ErpCode'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ErpCode");
    driver.findElement(by).sendKeys("");

    // 44. Generate random number between '0' and '999999999'
    GeneratedUtils.sleep(500);
    generateNumberInRange = RandomDataGenerator.generateNumberInRange("0","999999999");
    generateNumberInRange = (RandomDataGenerator.GenerateNumberInRange)((ReportingDriver)driver).addons().execute(generateNumberInRange);
    faturaErpKodu = String.valueOf(generateNumberInRange.result);

    // 45. Type '{{faturaErpKodu}}' in 'ErpCode'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ErpCode");
    driver.findElement(by).sendKeys(faturaErpKodu);

    // 46. Generate random number between '0' and '999999999'
    GeneratedUtils.sleep(500);
    generateNumberInRange = RandomDataGenerator.generateNumberInRange("0","999999999");
    generateNumberInRange = (RandomDataGenerator.GenerateNumberInRange)((ReportingDriver)driver).addons().execute(generateNumberInRange);
    dokumanKodu = String.valueOf(generateNumberInRange.result);

    // 47. Type '{{dokumanKodu}}' in 'DocumentId'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#DocumentId");
    driver.findElement(by).sendKeys(dokumanKodu);

    // 48. Generate random number between '0' and '999999999'
    GeneratedUtils.sleep(500);
    generateNumberInRange = RandomDataGenerator.generateNumberInRange("0","999999999");
    generateNumberInRange = (RandomDataGenerator.GenerateNumberInRange)((ReportingDriver)driver).addons().execute(generateNumberInRange);
    faturaNumarasi = String.valueOf(generateNumberInRange.result);

    // 49. Type '{{faturaNumarasi}}' in 'InvoiceNumber'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#InvoiceNumber");
    driver.findElement(by).sendKeys(faturaNumarasi);

    // 50. Type 'C736' in 'Description2'
    GeneratedUtils.sleep(500);
    by = By.xpath("//textarea");
    driver.findElement(by).sendKeys("C736");

    // 51. Click 'Tamam1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 52. Click 'BORÇ TAKİBİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'BORÇ TAKİBİ']");
    driver.findElement(by).click();

    // 53. Type 'C736' in 'FilterDescription'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#FilterDescription");
    driver.findElement(by).sendKeys("C736");

    // 54. Select options in 'FilterCurrentAccountPaymentStatusType...' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Kısmi Ödenen");
    by = By.cssSelector("#FilterCurrentAccountPaymentStatusTypeId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 55. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 56. Get text from 'Displaying items 1 - 2 of 2'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[. = 'Displaying items 1 - 2 of 2']");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertTrue(string.endsWith("2"));

    // 57. Click 'selectall'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#selectall");
    driver.findElement(by).click();

    // 58. Click 'Sil4'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#deleteDebt");
    driver.findElement(by).click();

    // 59. Accept alert
    GeneratedUtils.sleep(500);
    acceptAlert = WebExtensions.acceptAlert(2000);
    acceptAlert = (WebExtensions.AcceptAlert)((ReportingDriver)driver).addons().execute(acceptAlert);

    // 60. Does 'Seçmiş olduğunuz hesap hareketleri ba...' contain 'Seçmiş olduğunuz hesap hareketleri başarıyla silindi.'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'Seçmiş olduğunuz hesap hareketleri başarıyla silindi.']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Seçmiş olduğunuz hesap hareketleri başarıyla silindi."));

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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","Kd!cyhz4","","","","",""));
  }
}
