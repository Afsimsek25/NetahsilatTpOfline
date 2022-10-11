package netahsilat;

import io.testproject.addon.DateTimeOperations;
import io.testproject.addon.GridOperations;
import io.testproject.addon.VisibleElementsOperations;
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

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C760 Fake iade yapılmasının kontrolü
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Oct 03 15:44:11 GMT 2022.
 */
@DisplayName("C760 Fake iade yapılmasının kontrolü")
public class C760 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C760 Fake iade yapılmasının kontrolü")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String SatisFromGrid,
      String currentDateTime) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    WebExtensions.SelectOptionbyVisibleText selectOptionbyVisibleText;
    WebExtensions.WaitForAlertPresence waitForAlertPresence;
    DateTimeOperations.SetDays setDays;
    VisibleElementsOperations.ClickIfVisibleWeb clickIfVisibleWeb;
    WebExtensions.AcceptAlert acceptAlert;
    WebExtensions.GetAlertText getAlertText;
    GridOperations.conditionalClick conditionalClick;
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

    // 3. Click 'İŞLEMLER'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[title='İŞLEMLER']");
    driver.findElement(by).click();

    // 4. Move mouse to 'İŞLEM DETAYLARI LİSTESİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'İŞLEM DETAYLARI LİSTESİ']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 5. Click 'İŞLEM DETAYLARI LİSTESİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'İŞLEM DETAYLARI LİSTESİ']");
    driver.findElement(by).click();

    // 6. Select options in 'VPosTransactionTypeId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Satış");
    by = By.cssSelector("#VPosTransactionTypeId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 7. Select options in 'SelectedTransactionStateId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Başarılı İşlemler");
    by = By.cssSelector("#SelectedTransactionStateId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 8. Clear 'StartDate' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#StartDate");
    driver.findElement(by).clear();

    // 9. Clear 'EndDate' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#EndDate");
    driver.findElement(by).clear();

    // 10. Get current date
    GeneratedUtils.sleep(500);
    currentDate = DateTimeOperations.currentDate("dd.MM.yyyy");
    currentDate = (DateTimeOperations.CurrentDate)((ReportingDriver)driver).addons().execute(currentDate);
    currentDateTime = String.valueOf(currentDate.result);

    // 11. Set '-1' days to '{{currentDateTime}}'
    GeneratedUtils.sleep(500);
    setDays = DateTimeOperations.setDays("-1",currentDateTime,"dd.MM.yyyy","");
    setDays = (DateTimeOperations.SetDays)((ReportingDriver)driver).addons().execute(setDays);
    currentDateTime = String.valueOf(setDays.result);

    // 12. Type '{{currentDateTime}} 23:59' in 'EndDate'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#EndDate");
    driver.findElement(by).sendKeys(String.format("%s 23:59",currentDateTime));

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

    // 15. Run Conditional Click
    GeneratedUtils.sleep(500);
    conditionalClick = GridOperations.conditionalClick("#VPosTransactionGrid > table > tbody > tr > td:nth-child(1) > a img[src*='fake']",false);
    by = By.cssSelector("span[class='t-icon t-arrow-next'] ");
    conditionalClick = (GridOperations.conditionalClick)((ReportingDriver)driver).addons().execute(conditionalClick, by, -1);

    // 16. Click 'imgFakeIade' if it's visible
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.cssSelector("#VPosTransactionGrid > table > tbody > tr > td:nth-child(1) > a img[src*='fake'] ");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 17. Clear 'inputSabitTutarFakeIade' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[type='text'][value*=',']");
    driver.findElement(by).clear();

    // 18. Type '1,00' in 'inputSabitTutarFakeIade'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[type='text'][value*=',']");
    driver.findElement(by).sendKeys("1,00");

    // 19. Type '"Test otomasyon ödeme iadesi***"' in 'TransactionDescripton'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#TransactionDescripton");
    driver.findElement(by).sendKeys("\"Test otomasyon ödeme iadesi***\"");

    // 20. Click 'buttonKaydiTamamla'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 21. Is 'txtIslemYapiliyor' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//*[text()='İşlem yapılıyor. Lütfen bekleyiniz...']");
    driver.findElement(by).isDisplayed();

    // 22. Is alert displayed?
    GeneratedUtils.sleep(500);
    waitForAlertPresence = WebExtensions.waitForAlertPresence(50000);
    waitForAlertPresence = (WebExtensions.WaitForAlertPresence)((ReportingDriver)driver).addons().execute(waitForAlertPresence);

    // 23. Get alert text
    GeneratedUtils.sleep(500);
    getAlertText = WebExtensions.getGetAlertText();
    getAlertText = (WebExtensions.GetAlertText)((ReportingDriver)driver).addons().execute(getAlertText);

    // 24. Accept alert
    GeneratedUtils.sleep(500);
    acceptAlert = WebExtensions.acceptAlert(0);
    acceptAlert = (WebExtensions.AcceptAlert)((ReportingDriver)driver).addons().execute(acceptAlert);

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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","Kd!cyhz4","Satış",""));
  }
}
