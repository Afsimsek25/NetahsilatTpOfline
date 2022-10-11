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

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C2092 Artı taksidi, taksitle toplayarak göster
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 11:11:33 GMT 2022.
 */
@DisplayName("C2092 Artı taksidi, taksitle toplayarak göster")
public class C2092 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C2092 Artı taksidi, taksitle toplayarak göster")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password,
      String fiveInstallmentPlusInstallment, String fiveInstallmentTotalInstallment, String total)
      throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    String string;
    MathematicalUtilities.EvaluateMathExpr evaluateMathExpr;
    CombinedActions.ClearAndTypeAction clearAndTypeAction;
    JSActions.ClickAction clickAction;
    NetahsilatUtills.ClickUntilGone clickUntilGone;
    VisibleElementsOperations.ClickIfVisibleWeb clickIfVisibleWeb;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = "otomasyon@musteri.temsilcisi";
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Move mouse to 'moveToSiteYönetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='config']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 3. Click 'moveToSiteYönetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='config']");
    driver.findElement(by).click();

    // 4. Click 'btnParametreler'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[title='PARAMETRELER']");
    driver.findElement(by).click();

    // 5. Click 'li > a > Ödeme Formu Ayarları'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[normalize-space()='Ödeme Formu Ayarları']");
    driver.findElement(by).click();

    // 6. Click 'Artı taksidi, taksitle toplayarak göster (Checked)- Ödeme Formu Ayarları' if it's visible
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.xpath("//label[normalize-space()='Artı taksidi, taksitle toplayarak göster']/../..//..//span[@class='jquery-safari-checkbox']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 7. Click 'Kaydet1'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#kaydet");
    driver.findElement(by).click();

    // 8. Does 'Ödeme Formu Ayarları Başarıyla kayded...' contain 'Ödeme Formu Ayarları Başarıyla kaydedildi.'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'Ödeme Formu Ayarları Başarıyla kaydedildi.']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Ödeme Formu Ayarları Başarıyla kaydedildi."));

    // 9. Click 'SANAL POSLAR'
    GeneratedUtils.sleep(500);
    clickAction = JSActions.getClickAction();
    by = By.xpath("//a[. = 'SANAL POSLAR']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 10. Click 'Akbank1 Sanal Pos Güncelle'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[normalize-space()='Akbank1']//preceding-sibling::td/a[contains(@href, 'VendorVPos/AddEdit/')]");
    driver.findElement(by).click();

    // 11. Click 'Komisyon Oranları'
    GeneratedUtils.sleep(500);
    clickAction = JSActions.getClickAction();
    by = By.cssSelector("a[href='#tab-comission']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 12. Get text from '5 Taksit Komşusu +Taksit'
    GeneratedUtils.sleep(500);
    by = By.xpath("//input[@value='5' and @name='Installment']/../..//input[@name='PlusInstalment']");
    string = driver.findElement(by).getAttribute("value");
    fiveInstallmentPlusInstallment = String.valueOf(string);

    // 13. Get text from '5TaksitKomsuToplamTaksit'
    GeneratedUtils.sleep(500);
    by = By.xpath("//input[@value='5' and @name='Installment']/../../div/span[@class='Rank integer ratebox']");
    string = driver.findElement(by).getAttribute("value");
    fiveInstallmentTotalInstallment = String.valueOf(string);

    // 14. Evaluate '{{fiveInstallmentPlusInstallment}}+5'
    GeneratedUtils.sleep(500);
    evaluateMathExpr = MathematicalUtilities.evaluateMathExpr(String.format("%s+5",fiveInstallmentPlusInstallment));
    evaluateMathExpr = (MathematicalUtilities.EvaluateMathExpr)((ReportingDriver)driver).addons().execute(evaluateMathExpr);

    // 15. Run Click Until Gone
    //    Vazgeç
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Vazgeç']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 16. Click 'Ödeme Ekranına Git1'
    GeneratedUtils.sleep(500);
    clickAction = JSActions.getClickAction();
    by = By.xpath("//a[. = '\n                \n                Ödeme Ekranına Git\n            ']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 17. Run Clear 'PureAmount' contents and type '10'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("10");
    by = By.cssSelector("#PureAmount");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 18. Is '//td[contains(@class,'commRate-120 best-commrate')]//div[text()='11 x 0,00 ₺']' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[contains(@class,'commRate-120 best-commrate')]//div[text()='11 x 0,00 ₺']");
    driver.findElement(by).isDisplayed();

    // 19. Move mouse to 'YÖNETİCİ1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'YÖNETİCİ']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 20. Click 'YÖNETİCİ1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'YÖNETİCİ']");
    driver.findElement(by).click();

    // 21. Move mouse to 'moveToSiteYönetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='config']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 22. Click 'moveToSiteYönetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='config']");
    driver.findElement(by).click();

    // 23. Click 'btnParametreler'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[title='PARAMETRELER']");
    driver.findElement(by).click();

    // 24. Click 'li > a > Ödeme Formu Ayarları'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[normalize-space()='Ödeme Formu Ayarları']");
    driver.findElement(by).click();

    // 25. Click 'Artı taksidi, taksitle toplayarak göster (Unchecked)- Ödeme Formu Ayarları' if it's visible
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.xpath("//label[normalize-space()='Artı taksidi, taksitle toplayarak göster']/../..//..//span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 26. Click 'Kaydet1'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#kaydet");
    driver.findElement(by).click();

    // 27. Does 'Ödeme Formu Ayarları Başarıyla kayded...' contain 'Ödeme Formu Ayarları Başarıyla kaydedildi.'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'Ödeme Formu Ayarları Başarıyla kaydedildi.']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Ödeme Formu Ayarları Başarıyla kaydedildi."));

    // 28. Click 'Ödeme Ekranına Git1'
    GeneratedUtils.sleep(500);
    clickAction = JSActions.getClickAction();
    by = By.xpath("//a[. = '\n                \n                Ödeme Ekranına Git\n            ']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 29. Run Clear 'PureAmount' contents and type '100'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("100");
    by = By.cssSelector("#PureAmount");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 30. Click 'Taksit Seçimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#installment-selection-text");
    driver.findElement(by).click();

    // 31. Is '//td[contains(@class,'commRate-120 pluses plus6-120 best-commrate')]//div[text()='5 x 9,09 ₺']' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[contains(@class,'commRate-120 pluses plus6-120 best-commrate')]//div[text()='5 x 9,09 ₺']");
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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","Kd!cyhz4","","","10"));
  }
}