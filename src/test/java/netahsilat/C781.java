package netahsilat;

import io.testproject.addon.NetahsilatUtills;
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
 * Test: C781 Alt bayi ve Müşteri ekleme yetki kontrolleri
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 10:59:58 GMT 2022.
 */
@DisplayName("C781 Alt bayi ve Müşteri ekleme yetki kontrolleri")
public class C781 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C781 Alt bayi ve Müşteri ekleme yetki kontrolleri")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    NetahsilatUtills.ClickUntilGone clickUntilGone;
    VisibleElementsOperations.ClickIfVisibleWeb clickIfVisibleWeb;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Move mouse to 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 3. Click 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    driver.findElement(by).click();

    // 4. Click 'altUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 5. Type 'bireyselanabayi@otomasyon.com' in 'SearchVendorName'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("bireyselanabayi@otomasyon.com");

    // 6. Click 'Bireysel Ana Bayi,76162482466'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[contains(text(),',76162482466')]");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 7. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 8. Does '//tr[1]//td[. = 'BireyselAnaBayi']' contain 'BireyselAnaBayi'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//tr[1]//td[. = 'BireyselAnaBayi']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("BireyselAnaBayi"));

    // 9. Click 'EditButton'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='fugue/edit.png']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 10. Click 'Haklar'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='yetki.png']");
    driver.findElement(by).click();

    // 11. Click 'Alt bayi ekleyebilir Unchecked' if it's visible
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("1");
    by = By.xpath("//label[normalize-space()='Alt bayi ekleyebilir']/..//span[@class='jquery-safari-checkbox']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 12. Click 'Müşteri ekleyebilir Unchecked' if it's visible
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("1");
    by = By.xpath("//label[normalize-space()='Müşteri ekleyebilir']/..//span[@class='jquery-safari-checkbox']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 13. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 14. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = "bireyselanabayi@otomasyon.com";
    methodlogoutlogin.password = password;
    methodlogoutlogin.execute(driver);

    // 15. Click 'YÖNETİCİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'YÖNETİCİ']");
    driver.findElement(by).click();

    // 16. Move mouse to 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 17. Click 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    driver.findElement(by).click();

    // 18. Click 'altUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 19. Is 'ddYeniUyeTanimi' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[2]/div/img");
    driver.findElement(by).isDisplayed();

    // 20. Click 'ddYeniUyeTanimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[2]/div/img");
    driver.findElement(by).click();

    // 21. Does 'Yeni Bayi Tanımla' contain 'Yeni Bayi Tanımla'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Yeni Bayi Tanımla']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Yeni Bayi Tanımla"));

    // 22. Does 'Yeni Müşteri Tanımla' contain 'Yeni Müşteri Tanımla'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Yeni Müşteri Tanımla']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Yeni Müşteri Tanımla"));

    // 23. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = userName;
    methodlogoutlogin.password = password;
    methodlogoutlogin.execute(driver);

    // 24. Move mouse to 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 25. Click 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    driver.findElement(by).click();

    // 26. Click 'altUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 27. Type 'bireyselanabayi@otomasyon.com' in 'SearchVendorName'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("bireyselanabayi@otomasyon.com");

    // 28. Click 'Bireysel Ana Bayi,76162482466'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[contains(text(),',76162482466')]");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 29. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 30. Does '//tr[1]//td[. = 'BireyselAnaBayi']' contain 'BireyselAnaBayi'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//tr[1]//td[. = 'BireyselAnaBayi']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("BireyselAnaBayi"));

    // 31. Click 'EditButton'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='fugue/edit.png']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 32. Click 'Haklar'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='yetki.png']");
    driver.findElement(by).click();

    // 33. Click 'Alt bayi ekleyebilir Checked'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[normalize-space()='Alt bayi ekleyebilir']/..//span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']");
    driver.findElement(by).click();

    // 34. Click 'Müşteri ekleyebilir Checked'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[normalize-space()='Müşteri ekleyebilir']/..//span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']");
    driver.findElement(by).click();

    // 35. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 36. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = "bireyselanabayi@otomasyon.com";
    methodlogoutlogin.password = password;
    methodlogoutlogin.execute(driver);

    // 37. Click 'YÖNETİCİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'YÖNETİCİ']");
    driver.findElement(by).click();

    // 38. Move mouse to 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 39. Click 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    driver.findElement(by).click();

    // 40. Click 'altUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 41. Click 'ddYeniUyeTanimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[2]/div/img");
    driver.findElement(by).click();

    // 42. Is 'Yeni Üye Tanımı' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//h1[. = 'Yeni Üye Tanımı']");
    driver.findElement(by).isDisplayed();

    // 43. Is 'Yeni Bayi Tanımla' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Yeni Bayi Tanımla']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 44. Is 'Yeni Müşteri Tanımla' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Yeni Müşteri Tanımla']");
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