package netahsilat;

import io.testproject.addon.CombinedActions;
import io.testproject.addon.VisibleElementsOperations;
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
 * Test: C2022 Email Order Tanımları - Müşteri&İşlem No Zorunluluğu ve Alıcılar seçili gelsin mi Kontrolü
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 11:24:25 GMT 2022.
 */
@DisplayName("C2022 Email Order Tanımları - Müşteri&İşlem No Zorunluluğu ve Alıcılar seçili gelsin mi Kontrolü")
public class C2022 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C2022 Email Order Tanımları - Müşteri&İşlem No Zorunluluğu ve Alıcılar seçili gelsin mi Kontrolü")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    CombinedActions.ClearAndTypeAction clearAndTypeAction;
    VisibleElementsOperations.ClickIfVisibleWeb clickIfVisibleWeb;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
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

    // 5. Click 'li > a > E-Mail Order Tanımları'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[normalize-space()='E-Mail Order Tanımları']");
    driver.findElement(by).click();

    // 6. Click 'Alıcılar seçili gelsin mi? (Checked)' if it's visible
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.xpath("//label[normalize-space()='Alıcılar seçili gelsin mi?']//..//following-sibling::div//span[@class='jquery-safari-checkbox']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 7. Click 'Müşteri No Zorunlu Mu? (Checked)' if it's visible
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.xpath("//label[normalize-space()='Müşteri No Zorunlu Mu?']//..//following-sibling::div//span[@class='jquery-safari-checkbox']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 8. Click 'İşlem No Zorunlu Mu? (Checked)' if it's visible
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.xpath("//label[normalize-space()='İşlem No Zorunlu Mu?']//..//following-sibling::div//span[@class='jquery-safari-checkbox']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 9. Is 'Kaydet1' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#kaydet");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 10. Click 'Kaydet1'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#kaydet");
    driver.findElement(by).click();

    // 11. Is 'E-Mail Order Tanımları Başarıyla kayd...' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'E-Mail Order Tanımları Başarıyla kaydedildi.']");
    driver.findElement(by).isDisplayed();

    // 12. Move mouse to 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 13. Click 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    driver.findElement(by).click();

    // 14. Click 'dropDownOdemeLinki'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[2]/div/img");
    driver.findElement(by).click();

    // 15. Click 'ÜYELİKSİZ ÖDEME LİNKİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'ÜYELİKSİZ ÖDEME LİNKİ']");
    driver.findElement(by).click();

    // 16. Run Clear 'PureAmount' contents and type '100'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("100");
    by = By.cssSelector("#PureAmount");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 17. Click 'Devam Et Button'
    GeneratedUtils.sleep(500);
    by = By.xpath("//input[@class='big-button']");
    driver.findElement(by).click();

    // 18. Is 'Müşteri No alanı gereklidir.' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'Müşteri No alanı gereklidir.']");
    driver.findElement(by).isDisplayed();

    // 19. Is 'İşlem No alanı gereklidir.' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'İşlem No alanı gereklidir.']");
    driver.findElement(by).isDisplayed();

    // 20. Run Clear 'ReferenceNumber' contents and type '12345678910'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("12345678910");
    by = By.cssSelector("#ReferenceNumber");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 21. Run Clear 'CustomerId' contents and type '12345678910'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("12345678910");
    by = By.cssSelector("#CustomerId");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 22. Click 'Devam Et Button'
    GeneratedUtils.sleep(500);
    by = By.xpath("//input[@class='big-button']");
    driver.findElement(by).click();

    // 23. Run Clear 'EMail' contents and type 'a@a.com'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("a@a.com");
    by = By.cssSelector("#EMail");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 24. Click 'Ekle3'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Ekle']");
    driver.findElement(by).click();

    // 25. Is 'Checked' visible?
    GeneratedUtils.sleep(500);
    by = By.cssSelector(".showUserSelection input:checked[type='checkbox']");
    driver.findElement(by).isDisplayed();

    // 26. Move mouse to 'moveToSiteYönetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='config']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 27. Click 'moveToSiteYönetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='config']");
    driver.findElement(by).click();

    // 28. Click 'btnParametreler'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[title='PARAMETRELER']");
    driver.findElement(by).click();

    // 29. Click 'li > a > E-Mail Order Tanımları'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[normalize-space()='E-Mail Order Tanımları']");
    driver.findElement(by).click();

    // 30. Click 'Alıcılar seçili gelsin mi? (Unhecked)'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[normalize-space()='Alıcılar seçili gelsin mi?']//..//following-sibling::div//span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']");
    driver.findElement(by).click();

    // 31. Click 'Müşteri No Zorunlu Mu? (Unchecked)'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[normalize-space()='Müşteri No Zorunlu Mu?']//..//following-sibling::div//span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']");
    driver.findElement(by).click();

    // 32. Click 'İşlem No Zorunlu Mu? (Unhecked)'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[normalize-space()='İşlem No Zorunlu Mu?']//..//following-sibling::div//span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']");
    driver.findElement(by).click();

    // 33. Is 'Kaydet1' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#kaydet");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 34. Click 'Kaydet1'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#kaydet");
    driver.findElement(by).click();

    // 35. Is 'E-Mail Order Tanımları Başarıyla kayd...' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'E-Mail Order Tanımları Başarıyla kaydedildi.']");
    driver.findElement(by).isDisplayed();

    // 36. Move mouse to 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 37. Click 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    driver.findElement(by).click();

    // 38. Click 'dropDownOdemeLinki'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[2]/div/img");
    driver.findElement(by).click();

    // 39. Click 'ÜYELİKSİZ ÖDEME LİNKİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'ÜYELİKSİZ ÖDEME LİNKİ']");
    driver.findElement(by).click();

    // 40. Run Clear 'PureAmount' contents and type '100,00'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("100,00");
    by = By.cssSelector("#PureAmount");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 41. Click 'Devam Et Button'
    GeneratedUtils.sleep(500);
    by = By.xpath("//input[@class='big-button']");
    driver.findElement(by).click();

    // 42. Is 'Müşteri No alanı gereklidir.' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'Müşteri No alanı gereklidir.']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 43. Is 'İşlem No alanı gereklidir.' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'İşlem No alanı gereklidir.']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 44. Run Clear 'EMail' contents and type 'a@a.com'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("a@a.com");
    by = By.cssSelector("#EMail");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 45. Click 'Ekle Button (Enable)'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[@type='button' and @data-bind='click: addItem']");
    driver.findElement(by).click();

    // 46. Is 'Not Checked' visible?
    GeneratedUtils.sleep(500);
    by = By.cssSelector(".showUserSelection input:not(:checked)[type='checkbox']");
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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","Kd!cyhz4"));
  }
}