package netahsilat;

import io.testproject.addon.VisibleElementsOperations;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C758 Yeni Kayıt Formu Ayarları (Seçenekli)-Görünsün Seçeneği Kontrolü
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 11:22:23 GMT 2022.
 */
@DisplayName("C758 Yeni Kayıt Formu Ayarları (Seçenekli)-Görünsün Seçeneği Kontrolü")
public class C758 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C758 Yeni Kayıt Formu Ayarları (Seçenekli)-Görünsün Seçeneği Kontrolü")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    WebExtensions.SelectOptionbyVisibleText selectOptionbyVisibleText;
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

    // 5. Click 'li > a > Yeni Kayıt Formu Ayarları'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[normalize-space()='Yeni Kayıt Formu Ayarları']");
    driver.findElement(by).click();

    // 6. Select options in 'MusteriTypeSelection' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Seçenekli");
    by = By.cssSelector("#MusteriTypeSelection");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 7. Click 'TCKN Görünsün (Unchecked)'
    GeneratedUtils.sleep(500);
    by = By.xpath("//input[@id='IndividualVendorFormFieldSetting_IsTCKNVisible']//.. //span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']");
    driver.findElement(by).click();

    // 8. Click 'Kaydet1'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#kaydet");
    driver.findElement(by).click();

    // 9. Navigate to '{{ApplicationURL}}'
    GeneratedUtils.sleep(500);
    driver.navigate().to(ApplicationURL);

    // 10. Click 'Yeni Kayıt'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Yeni Kayıt']");
    driver.findElement(by).click();

    // 11. Is 'Name2' visible?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Name");
    driver.findElement(by).isDisplayed();

    // 12. Is 'Firma Adı' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Firma Adı *']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 13. Is 'TC Kimlik No' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'TC Kimlik No *']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 14. Is 'Vergi Dairesi1' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Vergi Dairesi *']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 15. Is 'Vergi Numarası2' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Vergi Numarası *']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 16. Is 'Telefon2' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Telefon *']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 17. Is 'Telefon21' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Telefon2 *']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 18. Is 'Faks1' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Faks *']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 19. Is 'GSM' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'GSM *']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 20. Is 'Adres1' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Adres *']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 21. Is 'İl' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'İl *']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 22. Is 'İlçe1' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'İlçe *']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 23. Is 'Semt1' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Semt *']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 24. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = userName;
    methodlogoutlogin.password = password;
    methodlogoutlogin.execute(driver);

    // 25. Move mouse to 'moveToSiteYönetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='config']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 26. Click 'moveToSiteYönetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='config']");
    driver.findElement(by).click();

    // 27. Click 'btnParametreler'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[title='PARAMETRELER']");
    driver.findElement(by).click();

    // 28. Click 'li > a > Yeni Kayıt Formu Ayarları'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[normalize-space()='Yeni Kayıt Formu Ayarları']");
    driver.findElement(by).click();

    // 29. Select options in 'MusteriTypeSelection' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Seçenekli");
    by = By.cssSelector("#MusteriTypeSelection");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 30. Click 'Yeni Kayıt Formu (Checked for all checbox)'
    for (int i = 1; i <= 12; i++) {
      GeneratedUtils.sleep(500);
      by = By.xpath("//tr//td[2]//span[@class='jquery-safari-checkbox']");
      driver.findElement(by).click();
    }

    // 31. Click 'Kaydet1'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#kaydet");
    driver.findElement(by).click();

    // 32. Navigate to '{{ApplicationURL}}'
    GeneratedUtils.sleep(500);
    driver.navigate().to(ApplicationURL);

    // 33. Click 'Yeni Kayıt'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Yeni Kayıt']");
    driver.findElement(by).click();

    // 34. Is 'Bireysel CheckBox (KayıtFormu)' visible and selected?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[name='IsCompany'][value='false']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementSelectionStateToBe(by, true));

    // 35. Does 'TC Kimlik No' contain 'TC Kimlik No'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'TC Kimlik No *']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("TC Kimlik No"));

    // 36. Click 'Kurumsal CheckBox (Kayıt Formu)' if it's visible
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.cssSelector("input[name='IsCompany'][value='true']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 37. Does 'Firma Adı' contain 'Firma Adı'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Firma Adı *']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Firma Adı"));

    // 38. Does 'Vergi Dairesi1' contain 'Vergi Dairesi'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Vergi Dairesi *']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Vergi Dairesi"));

    // 39. Does 'Vergi Numarası2' contain 'Vergi Numarası'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Vergi Numarası *']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Vergi Numarası"));

    // 40. Does 'Telefon2' contain 'Telefon'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Telefon *']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Telefon"));

    // 41. Does 'Telefon21' contain 'Telefon2'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Telefon2 *']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Telefon2"));

    // 42. Does 'Faks1' contain 'Faks'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Faks *']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Faks"));

    // 43. Does 'GSM' contain 'GSM'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'GSM *']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("GSM"));

    // 44. Does 'Adres1' contain 'Adres'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Adres *']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Adres"));

    // 45. Does 'İl' contain 'İl'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'İl *']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("İl"));

    // 46. Does 'İlçe1' contain 'İlçe'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'İlçe *']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("İlçe"));

    // 47. Does 'Semt1' contain 'Semt'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Semt *']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Semt"));

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
