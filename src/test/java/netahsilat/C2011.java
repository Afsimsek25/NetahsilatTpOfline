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
 * Test: C2011 Ön bilgilendirme formu, Alt bayi parametresi aktif/pasif kontrolü
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 11:16:56 GMT 2022.
 */
@DisplayName("C2011 Ön bilgilendirme formu, Alt bayi parametresi aktif/pasif kontrolü")
public class C2011 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C2011 Ön bilgilendirme formu, Alt bayi parametresi aktif/pasif kontrolü")
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

    // 5. Click 'li > a > Ön Bilgilendirme Formu'
    by = By.xpath("//a[normalize-space()='Ön Bilgilendirme Formu']");
    driver.findElement(by).click();

    // 6. Is 'Alt Bayi (Checked)' visible?
    by = By.xpath("//label[normalize-space()='Alt bayi']//..//following-sibling::div//span[@class='jquery-safari-checkbox']");
    driver.findElement(by).isDisplayed();

    // 7. Click 'Alt Bayi (Checked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("0");
    by = By.xpath("//label[normalize-space()='Alt bayi']//..//following-sibling::div//span[@class='jquery-safari-checkbox']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 8. Is 'editorToolbar' visible?
    by = By.xpath("//div[contains(@id,'toolbargroup') and not(contains(@id,'Locales' ))]");
    driver.findElement(by).isDisplayed();

    // 9. Click 'Kaydet1'
    by = By.cssSelector("#kaydet");
    driver.findElement(by).click();

    // 10. Is 'Ön Bilgilendirme Formu Başarıyla kayd...' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    by = By.xpath("//li[. = 'Ön Bilgilendirme Formu Başarıyla kaydedildi.']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 11. Run Method Logout&Login
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = "bireyselaltbayi@otomasyon.com";
    methodlogoutlogin.password = password;
    methodlogoutlogin.execute(driver);

    // 12. Click 'ONLINE ÖDEME'
    by = By.xpath("//a[.='ONLINE ÖDEME']");
    driver.findElement(by).click();

    // 13. Is 'ön bilgilendirme formu body' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    by = By.xpath("//span[. = 'ön bilgilendirme formu body ']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 14. Click 'ön bilgilendirme formu body'
    by = By.xpath("//span[. = 'ön bilgilendirme formu body ']");
    driver.findElement(by).click();

    // 15. Does 'Türkçe ön bilgilendirme formu' contain 'Türkçe ön bilgilendirme formu'?
    by = By.xpath("//p[. = 'Türkçe ön bilgilendirme formu']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Türkçe ön bilgilendirme formu"));

    // 16. Run Method Logout&Login
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = userName;
    methodlogoutlogin.password = password;
    methodlogoutlogin.execute(driver);

    // 17. Move mouse to 'moveToSiteYönetimi'
    by = By.cssSelector("li[class='config']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 18. Click 'moveToSiteYönetimi'
    by = By.cssSelector("li[class='config']");
    driver.findElement(by).click();

    // 19. Click 'btnParametreler'
    by = By.cssSelector("a[title='PARAMETRELER']");
    driver.findElement(by).click();

    // 20. Click 'li > a > Ön Bilgilendirme Formu'
    by = By.xpath("//a[normalize-space()='Ön Bilgilendirme Formu']");
    driver.findElement(by).click();

    // 21. Is 'Alt Bayi (Unchecked)' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    by = By.xpath("//label[normalize-space()='Alt bayi']//..//following-sibling::div//span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 22. Click 'Alt Bayi (Unchecked)' if it's visible
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.xpath("//label[normalize-space()='Alt bayi']//..//following-sibling::div//span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 23. Is 'editorToolbar' visible?
    by = By.xpath("//div[contains(@id,'toolbargroup') and not(contains(@id,'Locales' ))]");
    driver.findElement(by).isDisplayed();

    // 24. Click 'Kaydet1'
    by = By.cssSelector("#kaydet");
    driver.findElement(by).click();

    // 25. Is 'Ön Bilgilendirme Formu Başarıyla kayd...' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    by = By.xpath("//li[. = 'Ön Bilgilendirme Formu Başarıyla kaydedildi.']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 26. Run Method Logout&Login
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = "bireyselaltbayi@otomasyon.com";
    methodlogoutlogin.password = password;
    methodlogoutlogin.execute(driver);

    // 27. Click 'ONLINE ÖDEME'
    by = By.xpath("//a[.='ONLINE ÖDEME']");
    driver.findElement(by).click();

    // 28. Is 'ön bilgilendirme formu body' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//span[. = 'ön bilgilendirme formu body ']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","Kd!cyhz4"));
  }
}
