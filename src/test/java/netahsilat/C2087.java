package netahsilat;

import io.testproject.addon.VisibleElementsOperations;
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
 * Test: C2087 Açıklama, email, telefon, Bayi ödemelerinde TCKN alınsın parametrelerinin gösterimi kontrolü
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 11:10:32 GMT 2022.
 */
@DisplayName("C2087 Açıklama, email, telefon, Bayi ödemelerinde TCKN alınsın parametrelerinin gösterimi kontrolü")
public class C2087 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C2087 Açıklama, email, telefon, Bayi ödemelerinde TCKN alınsın parametrelerinin gösterimi kontrolü")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    VisibleElementsOperations.ClickIfVisibleWeb clickIfVisibleWeb;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Move mouse to 'moveToSiteYönetimi'
    by = By.cssSelector("li[class='config']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 3. Click 'moveToSiteYönetimi'
    by = By.cssSelector("li[class='config']");
    driver.findElement(by).click();

    // 4. Click 'btnParametreler'
    by = By.cssSelector("a[title='PARAMETRELER']");
    driver.findElement(by).click();

    // 5. Click 'li > a > Ödeme Formu Ayarları'
    by = By.xpath("//a[normalize-space()='Ödeme Formu Ayarları']");
    driver.findElement(by).click();

    // 6. Is 'Taksit Tablosu Değişiklik Uyarıları' visible?
    by = By.xpath("//legend[. = 'Taksit Tablosu Değişiklik Uyarıları']");
    driver.findElement(by).isDisplayed();

    // 7. Click 'Telefon (Unchecked)' if it's visible
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.xpath("//label[normalize-space()='Telefon']/../..//..//span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 8. Click 'E-posta (Unchecked)' if it's visible
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.xpath("//label[normalize-space()='E-Posta']/../..//..//span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 9. Click 'Açıklama (Unchecked)' if it's visible
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.xpath("//label[normalize-space()='Açıklama']/../..//..//span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 10. Click 'Bayi ödemelerinde TCKN alınsın (Unchecked) -Ödeme Formu Ayarları' if it's visible
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.xpath("//label[normalize-space()='Bayi ödemelerinde TCKN alınsın']/../..//../span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 11. Click 'Kaydet1'
    by = By.cssSelector("#kaydet");
    driver.findElement(by).click();

    // 12. Does 'Ödeme Formu Ayarları Başarıyla kayded...' contain 'Ödeme Formu Ayarları Başarıyla kaydedildi.'?
    by = By.xpath("//li[. = 'Ödeme Formu Ayarları Başarıyla kaydedildi.']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Ödeme Formu Ayarları Başarıyla kaydedildi."));

    // 13. Run Method Logout&Login
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = "bireyselanabayi@otomasyon.com";
    methodlogoutlogin.password = password;
    methodlogoutlogin.execute(driver);

    // 14. Click 'ONLINE ÖDEME'
    by = By.xpath("//a[.='ONLINE ÖDEME']");
    driver.findElement(by).click();

    // 15. Is 'Telefon3' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//label[. = 'Telefon*']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 16. Is 'E-Mail' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//label[. = 'E-Mail*']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 17. Is 'Açıklama3' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//label[. = 'Açıklama*']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 18. Is 'TC Kimlik No*' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//label[. = 'TC Kimlik No*']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 19. Run Method Logout&Login
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = userName;
    methodlogoutlogin.password = password;
    methodlogoutlogin.execute(driver);

    // 20. Move mouse to 'moveToSiteYönetimi'
    by = By.cssSelector("li[class='config']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 21. Click 'moveToSiteYönetimi'
    by = By.cssSelector("li[class='config']");
    driver.findElement(by).click();

    // 22. Click 'btnParametreler'
    by = By.cssSelector("a[title='PARAMETRELER']");
    driver.findElement(by).click();

    // 23. Click 'li > a > Ödeme Formu Ayarları'
    by = By.xpath("//a[normalize-space()='Ödeme Formu Ayarları']");
    driver.findElement(by).click();

    // 24. Click 'Telefon (Checked)'
    by = By.xpath("//label[normalize-space()='Telefon']/../..//..//span[@class='jquery-safari-checkbox']");
    driver.findElement(by).click();

    // 25. Click 'E-posta (Checked)'
    by = By.xpath("//label[normalize-space()='E-Posta']/../..//..//span[@class='jquery-safari-checkbox']");
    driver.findElement(by).click();

    // 26. Click 'Açıklama (Checked)'
    by = By.xpath("//label[normalize-space()='Açıklama']/../../following-sibling::div[1]/span[@class='jquery-safari-checkbox']");
    driver.findElement(by).click();

    // 27. Click 'Bayi Ödemelerinde TCKN alınsın (Checked) -Ödeme Formu ayarları'
    by = By.xpath("//input[@name='GetTCKNDealersPaymentVisible']//.. //span[@class='jquery-safari-checkbox']");
    driver.findElement(by).click();

    // 28. Click 'Kaydet1'
    by = By.cssSelector("#kaydet");
    driver.findElement(by).click();

    // 29. Does 'Ödeme Formu Ayarları Başarıyla kayded...' contain 'Ödeme Formu Ayarları Başarıyla kaydedildi.'?
    by = By.xpath("//li[. = 'Ödeme Formu Ayarları Başarıyla kaydedildi.']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Ödeme Formu Ayarları Başarıyla kaydedildi."));

    // 30. Run Method Logout&Login
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = "bireyselanabayi@otomasyon.com";
    methodlogoutlogin.password = password;
    methodlogoutlogin.execute(driver);

    // 31. Click 'ONLINE ÖDEME'
    by = By.xpath("//a[.='ONLINE ÖDEME']");
    driver.findElement(by).click();

    // 32. Does 'Telefon3' contain 'Telefon'?
    by = By.xpath("//label[. = 'Telefon*']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Telefon"));

    // 33. Is 'Telefon Numarası' visible?
    by = By.cssSelector("#Phone");
    driver.findElement(by).isDisplayed();

    // 34. Does 'E-Mail' contain 'E-Mail'?
    by = By.xpath("//label[. = 'E-Mail*']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("E-Mail"));

    // 35. Is 'inputEmailPricinPage' visible?
    by = By.cssSelector("#Email");
    driver.findElement(by).isDisplayed();

    // 36. Does 'Açıklama3' contain 'Açıklama'?
    by = By.xpath("//label[. = 'Açıklama*']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Açıklama"));

    // 37. Is 'TransactionDescription1' visible?
    by = By.cssSelector("#TransactionDescription");
    driver.findElement(by).isDisplayed();

    // 38. Does 'TC Kimlik No*' contain 'TC Kimlik No'?
    by = By.xpath("//label[. = 'TC Kimlik No*']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("TC Kimlik No"));

    // 39. Is 'TKC' visible?
    by = By.cssSelector("#TKC");
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
