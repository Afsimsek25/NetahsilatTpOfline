package netahsilat;

import io.testproject.addon.CombinedActions;
import io.testproject.addon.TabActions;
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
 * Test: C3234
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Sun Oct 09 19:30:21 GMT 2022.
 */
@DisplayName("C3234")
public class C3234 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C3234")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogin methodlogin;
    CombinedActions.ClearAndTypeAction clearAndTypeAction;
    TabActions.CloseLastTab closeLastTab;

    // 1. Navigate to '{{Otomasyon3Logout}}'
    GeneratedUtils.sleep(500);
    driver.navigate().to(ProjectParameters.Otomasyon3Logout);

    // 2. Run Method Login
    GeneratedUtils.sleep(500);
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = ProjectParameters.genelEmail;
    methodlogin.password = ProjectParameters.genelPassword;
    methodlogin.execute(driver);

    // 3. Move mouse to 'moveToSiteY??netimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='config']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 4. Click 'btnSiteY??netimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[title='S??TE Y??NET??M??']");
    driver.findElement(by).click();

    // 5. Click 'PARAMETRELER'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'PARAMETRELER']");
    driver.findElement(by).click();

    // 6. Click 'Kart Kay??t Linki Parametreleri'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = '\n            Kart Kay??t Linki Parametreleri\n        ']");
    driver.findElement(by).click();

    // 7. Click 'Url shortener aktif (Checked)'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[normalize-space()='Url shortener aktif']//..//..//span[@class='jquery-safari-checkbox']");
    driver.findElement(by).click();

    // 8. Click 'Kaydet1'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#kaydet");
    driver.findElement(by).click();

    // 9. Is 'Kart Kay??t Linki Parametreleri Ba??ar??...' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'Kart Kay??t Linki Parametreleri Ba??ar??yla kaydedildi.']");
    driver.findElement(by).isDisplayed();

    // 10. Move mouse to 'moveToIslemler'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='tag']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 11. Click '????LEMLER'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[title='????LEMLER']");
    driver.findElement(by).click();

    // 12. Is 'KART KAYDETME LINKI LISTELEME1' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Kart Kaydetme Linki Listeleme']");
    driver.findElement(by).isDisplayed();

    // 13. Move mouse to 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 14. Click 'ustUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[4]/a[. = '??YE Y??NET??M??']");
    driver.findElement(by).click();

    // 15. Click 'altUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[1]/a[. = '??YE Y??NET??M??']");
    driver.findElement(by).click();

    // 16. Type 'netahsilatotomasyon@yandex.com' in 'SearchVendorNameVN'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("netahsilatotomasyon@yandex.com");

    // 17. Click 'resultListelenen'
    GeneratedUtils.sleep(500);
    by = By.xpath("//body/ul//div");
    driver.findElement(by).click();

    // 18. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 19. Is 'Refresh' visible?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();

    // 20. Click '??deme1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = '??deme']");
    driver.findElement(by).click();

    // 21. Switch to window '1'
    GeneratedUtils.sleep(500);
    driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[1]);

    // 22. Is 'Bireysel t??rk7' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//strong[. = 'Bireysel t??rk']");
    driver.findElement(by).isDisplayed();

    // 23. Is 'KART KAYDI L??NK??' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'KART KAYDI L??NK??']");
    driver.findElement(by).isDisplayed();

    // 24. Switch to window '0'
    GeneratedUtils.sleep(500);
    driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[0]);

    // 25. Close the last tab opened in the browser
    GeneratedUtils.sleep(500);
    closeLastTab = TabActions.getCloseLastTab();
    closeLastTab = (TabActions.CloseLastTab)((ReportingDriver)driver).addons().execute(closeLastTab);

    // 26. Run Clear 'SearchVendorNameVN' contents and type 'bireyselanabayi@otomasyon.com'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("bireyselanabayi@otomasyon.com");
    by = By.cssSelector("#SearchVendorName");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 27. Click 'resultListelenen'
    GeneratedUtils.sleep(500);
    by = By.xpath("//body/ul//div");
    driver.findElement(by).click();

    // 28. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 29. Is 'Refresh' visible?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();

    // 30. Click '??deme1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = '??deme']");
    driver.findElement(by).click();

    // 31. Switch to window '1'
    GeneratedUtils.sleep(500);
    driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[1]);

    // 32. Is 'Bireysel Ana Bayi (Silmeyiniz-De??i??ti...7' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//strong[. = 'Bireysel Ana Bayi (Silmeyiniz-De??i??tirmeyiniz)']");
    driver.findElement(by).isDisplayed();

    // 33. Is 'KART KAYDI L??NK??' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'KART KAYDI L??NK??']");
    driver.findElement(by).isDisplayed();

    // 34. Switch to window '0'
    GeneratedUtils.sleep(500);
    driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[0]);

    // 35. Close the last tab opened in the browser
    GeneratedUtils.sleep(500);
    closeLastTab = TabActions.getCloseLastTab();
    closeLastTab = (TabActions.CloseLastTab)((ReportingDriver)driver).addons().execute(closeLastTab);

    // 36. Run Clear 'SearchVendorNameVN' contents and type 'bireyselaltbayi@otomasyon.com'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("bireyselaltbayi@otomasyon.com");
    by = By.cssSelector("#SearchVendorName");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 37. Click 'resultListelenen'
    GeneratedUtils.sleep(500);
    by = By.xpath("//body/ul//div");
    driver.findElement(by).click();

    // 38. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 39. Is 'Refresh' visible?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();

    // 40. Click '??deme1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = '??deme']");
    driver.findElement(by).click();

    // 41. Switch to window '1'
    GeneratedUtils.sleep(500);
    driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[1]);

    // 42. Is 'Bireysel Alt Bayi (Silmeyiniz-De??i??ti...4' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//strong[. = 'Bireysel Alt Bayi (Silmeyiniz-De??i??tirmeyiniz)']");
    driver.findElement(by).isDisplayed();

    // 43. Is 'KART KAYDI L??NK??' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'KART KAYDI L??NK??']");
    driver.findElement(by).isDisplayed();

    // 44. Switch to window '0'
    GeneratedUtils.sleep(500);
    driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[0]);

    // 45. Close the last tab opened in the browser
    GeneratedUtils.sleep(500);
    closeLastTab = TabActions.getCloseLastTab();
    closeLastTab = (TabActions.CloseLastTab)((ReportingDriver)driver).addons().execute(closeLastTab);

    // 46. Run Clear 'SearchVendorNameVN' contents and type 'bireyselaltmusteri@otomasyon.com'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("bireyselaltmusteri@otomasyon.com");
    by = By.cssSelector("#SearchVendorName");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 47. Click 'resultListelenen'
    GeneratedUtils.sleep(500);
    by = By.xpath("//body/ul//div");
    driver.findElement(by).click();

    // 48. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 49. Is 'Refresh' visible?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();

    // 50. Click '??deme1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = '??deme']");
    driver.findElement(by).click();

    // 51. Switch to window '1'
    GeneratedUtils.sleep(500);
    driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[1]);

    // 52. Is 'Bireysel Alt M????teri (Silmeyiniz-De??i...2' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//strong[. = 'Bireysel Alt M????teri  (Silmeyiniz-De??i??tirmeyiniz)']");
    driver.findElement(by).isDisplayed();

    // 53. Is 'KART KAYDI L??NK??' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'KART KAYDI L??NK??']");
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
    return Stream.of(Arguments.of("https://otomasyon3.netahsilatdemo.com/","otomasyon@test.com","Kd!cyhz4"));
  }
}
