package netahsilat;

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
 * Test: C1694 Kart kaydının bayilere kaydedilmesi
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Oct 10 07:18:08 GMT 2022.
 */
@DisplayName("C1694 Kart kaydının bayilere kaydedilmesi")
public class C1694 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C1694 Kart kaydının bayilere kaydedilmesi")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String currentDateTime)
      throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodParametrikdemesadeceKartTypeTextWithDelayIsimsiz methodparametrikdemesadecekarttypetextwithdelayisimsiz;
    MethodLogoutlogin methodlogoutlogin;

    // 1. Run Method Logout&Login
    //    bayi@kartkaydi.com
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = "bayi@kartkaydi.com";
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);
    currentDateTime = String.valueOf(methodlogoutlogin.currentDateTime);

    // 2. Click 'KREDI KARTLARIM'
    by = By.xpath("//a[. = 'KREDİ KARTLARIM']");
    driver.findElement(by).click();

    // 3. Click 'YENİ KREDİ KARTI TANIMLA'
    by = By.xpath("//a[. = 'YENİ KREDİ KARTI TANIMLA']");
    driver.findElement(by).click();

    // 4. Run Method Parametrik Ödeme (Sadece Kart - Type text with delay)  - İsimsiz
    methodparametrikdemesadecekarttypetextwithdelayisimsiz = new MethodParametrikdemesadeceKartTypeTextWithDelayIsimsiz();
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.kartNo = "4355084355084358";
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.CVV = "000";
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.ayYil = "12/30";
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.adSoyad = "C1694 Akbank";
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.execute(driver);

    // 5. Type '46117562406' in 'TKC'
    by = By.cssSelector("#TKC");
    driver.findElement(by).sendKeys("46117562406");

    // 6. Type '5000000000' in 'Telefon Numarası'
    by = By.cssSelector("#Phone");
    driver.findElement(by).sendKeys("5000000000");

    // 7. Type 'bayi@kartkaydi.com' in 'Email 3'
    by = By.cssSelector("#Email");
    driver.findElement(by).sendKeys("bayi@kartkaydi.com");

    // 8. Click 'Otomatik Ödemede Kullanılsın mı? Checkbox'
    by = By.xpath("//label[normalize-space()='Otomatik Ödemede Kullanılsın mı?']//input");
    driver.findElement(by).click();

    // 9. Is 'Otomatik Ödemede Kullanılsın mı? Checkbox' visible and selected?
    by = By.xpath("//label[normalize-space()='Otomatik Ödemede Kullanılsın mı?']//input");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementSelectionStateToBe(by, true));

    // 10. Click 'Kartınızın 3D özelliği var mı? Checkbox'
    /* Step is disabled
    by = By.xpath("//label[normalize-space()='Kartınızın 3D özelliği var mı?']//input");
    driver.findElement(by).click();
    */
    // 11. Is 'Kartınızın 3D özelliği var mı? Checkbox' visible and selected?
    by = By.xpath("//label[normalize-space()='Kartınızın 3D özelliği var mı?']//input");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementSelectionStateToBe(by, true));

    // 12. Click 'Kaydet'
    by = By.xpath("//button[. = 'Kaydet']");
    driver.findElement(by).click();

    // 13. Is 'submitbutton' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    by = By.xpath("//input[@name='submit']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 14. Type 'a' in 'password2'
    by = By.cssSelector("[name='password']");
    driver.findElement(by).sendKeys("a");

    // 15. Click 'submitbutton'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    by = By.xpath("//input[@name='submit']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 16. Is 'C1*********k' visible?
    by = By.xpath("//td[. = 'C1*********k']");
    driver.findElement(by).isDisplayed();

    // 17. Is '435508******43582' visible?
    by = By.xpath("//td[. = '435508******4358']");
    driver.findElement(by).isDisplayed();

    // 18. Click 'YENİ KREDİ KARTI TANIMLA'
    by = By.xpath("//a[. = 'YENİ KREDİ KARTI TANIMLA']");
    driver.findElement(by).click();

    // 19. Run Method Parametrik Ödeme (Sadece Kart - Type text with delay)  - İsimsiz
    methodparametrikdemesadecekarttypetextwithdelayisimsiz = new MethodParametrikdemesadeceKartTypeTextWithDelayIsimsiz();
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.kartNo = "4546711234567894";
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.CVV = "000";
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.ayYil = "12/30";
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.adSoyad = "C1694 Ziraat";
    methodparametrikdemesadecekarttypetextwithdelayisimsiz.execute(driver);

    // 20. Type '46117562406' in 'TKC'
    by = By.cssSelector("#TKC");
    driver.findElement(by).sendKeys("46117562406");

    // 21. Type '5000000000' in 'Telefon Numarası'
    by = By.cssSelector("#Phone");
    driver.findElement(by).sendKeys("5000000000");

    // 22. Type 'bayi@kartkaydi.com' in 'Email 3'
    by = By.cssSelector("#Email");
    driver.findElement(by).sendKeys("bayi@kartkaydi.com");

    // 23. Is 'Otomatik Ödemede Kullanılsın mı? Checkbox' visible and selected?
    //    INVERT STEP RESULT

    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    try {
      by = By.xpath("//label[normalize-space()='Otomatik Ödemede Kullanılsın mı?']//input");
      (new WebDriverWait(driver, 2)).until(ExpectedConditions.elementSelectionStateToBe(by, true));
      Assertions.fail("Step 'Is 'Otomatik Ödemede Kullanılsın mı? Checkbox' visible and selected?' result inverted, step failed");
    }
    catch (RuntimeException ex) {
    }
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 24. Click 'Kartınızın 3D özelliği var mı? Checkbox'
    by = By.xpath("//label[normalize-space()='Kartınızın 3D özelliği var mı?']//input");
    driver.findElement(by).click();

    // 25. Is 'Kartınızın 3D özelliği var mı? Checkbox' visible and selected?
    //    INVERT STEP RESULT

    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    try {
      by = By.xpath("//label[normalize-space()='Kartınızın 3D özelliği var mı?']//input");
      (new WebDriverWait(driver, 2)).until(ExpectedConditions.elementSelectionStateToBe(by, true));
      Assertions.fail("Step 'Is 'Kartınızın 3D özelliği var mı? Checkbox' visible and selected?' result inverted, step failed");
    }
    catch (RuntimeException ex) {
    }
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 26. Click 'Kaydet'
    by = By.xpath("//button[. = 'Kaydet']");
    driver.findElement(by).click();

    // 27. Is 'C1*********t' visible?
    by = By.xpath("//td[. = 'C1*********t']");
    driver.findElement(by).isDisplayed();

    // 28. Is '454671******7894' visible?
    by = By.xpath("//td[. = '454671******7894']");
    driver.findElement(by).isDisplayed();

    // 29. Click 'Kredi Kartları 435508******4358 Sil'
    by = By.xpath("//td[text()='435508******4358']//..//a[@class='Delete delete-link btn btn-danger btn-small']");
    driver.findElement(by).click();

    // 30. Click '//button[. = 'Sil']'
    by = By.xpath("//button[. = 'Sil']");
    driver.findElement(by).click();

    // 31. Is '435508******43582' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//td[. = '435508******4358']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 32. Click 'Kredi Kartları 454671******7894 Sil'
    by = By.xpath("//td[text()='454671******7894']//..//a[@class='Delete delete-link btn btn-danger btn-small']");
    driver.findElement(by).click();

    // 33. Click '//button[. = 'Sil']'
    by = By.xpath("//button[. = 'Sil']");
    driver.findElement(by).click();

    // 34. Is '454671******7894' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//td[. = '454671******7894']");
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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","Kd!cyhz4",""));
  }
}
