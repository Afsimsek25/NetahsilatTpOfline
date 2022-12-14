package netahsilat;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C1397 Vade başlangıç bitiş tarihi dışında bir günde denenmesi
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 11:30:21 GMT 2022.
 */
@DisplayName("C1397 Vade başlangıç bitiş tarihi dışında bir günde denenmesi")
public class C1397 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C1397 Vade başlangıç bitiş tarihi dışında bir günde denenmesi")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String currentDate,
      String faturaErpKodu, String faturaNumarasi, String dokumanKodu, String odemeLinki,
      String twoWeekLater, String kartNo, String CVV, String ayYil) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    MethodParametrikdemesadeceKartTypeTextWithDelay methodparametrikdemesadecekarttypetextwithdelay;
    CombinedActions.ClearAndTypeAction clearAndTypeAction;
    NetahsilatUtills.ClickUntilGone clickUntilGone;
    JSActions.ClickAction clickAction;
    RandomDataGenerator.GenerateNumberInRange generateNumberInRange;
    DateTimeOperations.CurrentDate cdt;
    DateTimeOperations.SetWeeks setWeeks;

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

    // 5. Type 'Vadeli Fatura' in 'CurrentAcccountName'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CurrentAcccountName");
    driver.findElement(by).sendKeys("Vadeli Fatura");

    // 6. Click '//li//div[text()='Vadeli Fatura']'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//li//div[text()='Vadeli Fatura']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 7. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 8. Is 'Vadeli Fatura1' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[. = 'Vadeli Fatura']");
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
    cdt = DateTimeOperations.currentDate("dd.MM.yyyy");
    cdt = (DateTimeOperations.CurrentDate)((ReportingDriver)driver).addons().execute(cdt);
    // 12. Set '1' weeks to '{{currentDate}}'
    GeneratedUtils.sleep(500);
    setWeeks = DateTimeOperations.setWeeks("1",currentDate,"dd.MM.yyyy","dd.MM.yyyy");
    setWeeks = (DateTimeOperations.SetWeeks)((ReportingDriver)driver).addons().execute(setWeeks);
    twoWeekLater = String.valueOf(setWeeks.result);

    // 13. Type '{{twoWeekLater}}' in 'DebtDueDate'
    //    one week later
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#DebtDueDate");
    driver.findElement(by).sendKeys(twoWeekLater);

    // 14. Type '{{currentDate}}' in 'DebtTransactionDate'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#DebtTransactionDate");
    driver.findElement(by).sendKeys(currentDate);

    // 15. Click 'Amount'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Amount");
    driver.findElement(by).click();

    // 16. Run Clear 'Amount' contents and type '430'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("430");
    by = By.cssSelector("#Amount");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 17. Generate random number between '0' and '999999999'
    GeneratedUtils.sleep(500);
    generateNumberInRange = RandomDataGenerator.generateNumberInRange("0","999999999");
    generateNumberInRange = (RandomDataGenerator.GenerateNumberInRange)((ReportingDriver)driver).addons().execute(generateNumberInRange);
    faturaErpKodu = String.valueOf(generateNumberInRange.result);

    // 18. Type '{{faturaErpKodu}}' in 'ErpCode'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ErpCode");
    driver.findElement(by).sendKeys(faturaErpKodu);

    // 19. Generate random number between '0' and '999999999'
    GeneratedUtils.sleep(500);
    generateNumberInRange = RandomDataGenerator.generateNumberInRange("0","999999999");
    generateNumberInRange = (RandomDataGenerator.GenerateNumberInRange)((ReportingDriver)driver).addons().execute(generateNumberInRange);
    dokumanKodu = String.valueOf(generateNumberInRange.result);

    // 20. Type '{{dokumanKodu}}' in 'DocumentId'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#DocumentId");
    driver.findElement(by).sendKeys(dokumanKodu);

    // 21. Generate random number between '0' and '999999999'
    GeneratedUtils.sleep(500);
    generateNumberInRange = RandomDataGenerator.generateNumberInRange("0","999999999");
    generateNumberInRange = (RandomDataGenerator.GenerateNumberInRange)((ReportingDriver)driver).addons().execute(generateNumberInRange);
    faturaNumarasi = String.valueOf(generateNumberInRange.result);

    // 22. Type '{{faturaNumarasi}}' in 'InvoiceNumber'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#InvoiceNumber");
    driver.findElement(by).sendKeys(faturaNumarasi);

    // 23. Type 'C1397 Vade başlangıç bitiş tarihi dışında bir günde denenmesi' in 'Description2'
    GeneratedUtils.sleep(500);
    by = By.xpath("//textarea");
    driver.findElement(by).sendKeys("C1397 Vade başlangıç bitiş tarihi dışında bir günde denenmesi");

    // 24. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 25. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = "vadeli@fatura.com";
    methodlogoutlogin.password = password;
    methodlogoutlogin.execute(driver);

    // 26. Click 'Borç Kapama'
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = 'Borç Kapama']");
    driver.findElement(by).click();

    // 27. Click 'Dinamik CheckBox'
    GeneratedUtils.sleep(500);
    by = By.xpath(String.format("//span[text()='%s']/../..//input[@type='radio' or @type='checkbox']",faturaNumarasi));
    driver.findElement(by).click();

    // 28. Run Method Parametrik Ödeme (Sadece Kart - Type text with delay)
    GeneratedUtils.sleep(500);
    methodparametrikdemesadecekarttypetextwithdelay = new MethodParametrikdemesadeceKartTypeTextWithDelay();
    methodparametrikdemesadecekarttypetextwithdelay.kartNo = ProjectParameters.genelKartNo;
    methodparametrikdemesadecekarttypetextwithdelay.CVV = ProjectParameters.genelKartCVV;
    methodparametrikdemesadecekarttypetextwithdelay.ayYil = ProjectParameters.genelKartAyYil;
    methodparametrikdemesadecekarttypetextwithdelay.execute(driver);

    // 29. Move mouse to '//td[contains(@class,'commRate-20')]//div[text()='1 x 430,00 ₺']'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[contains(@class,'commRate-20')]//div[text()='1 x 430,00 ₺']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 30. Click '//td[contains(@class,'commRate-20')]//div[text()='1 x 430,00 ₺']'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[contains(@class,'commRate-20')]//div[text()='1 x 430,00 ₺']");
    driver.findElement(by).click();

    // 31. Does 'textProcessMessage' contain 'Akbank1(manuel açıklama): 1 x 430,00 = 430,00 ₺'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ProcessMessage");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Akbank1(manuel açıklama): 1 x 430,00 = 430,00 ₺"));

    // 32. Click '//td[contains(@class,'commRate-20')]//div[text()='1 x 430,00 ₺']'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[contains(@class,'commRate-20')]//div[text()='1 x 430,00 ₺']");
    driver.findElement(by).click();

    // 33. Click 'odemeTalimatiOlustur'
    GeneratedUtils.sleep(500);
    clickAction = JSActions.getClickAction();
    by = By.cssSelector("input[value='ÖDEME TALİMATI OLUŞTUR']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 34. Is 'btnOdemeyiTamamla' is clickable?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#btnNormalPayment");
    (new WebDriverWait(driver, 35)).until(ExpectedConditions.elementToBeClickable(by));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 35. Click 'btnOdemeyiTamamla'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#btnNormalPayment");
    driver.findElement(by).click();

    // 36. Is 'txtReferansNumarasi' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(55000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("(//p[@class='payment-result-text'])[1]");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","Kd!cyhz4","","","","","","","","",""));
  }
}
