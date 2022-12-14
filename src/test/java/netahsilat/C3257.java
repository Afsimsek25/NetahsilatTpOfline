package netahsilat;

import io.testproject.addon.GridOperations;
import io.testproject.addon.VisibleElementsOperations;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.web.RemoteWebDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
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

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C3257
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Sun Oct 09 20:52:57 GMT 2022.
 */
@DisplayName("C3257")
public class C3257 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C3257")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogin methodlogin;
    VisibleElementsOperations.ClickIfVisibleWeb clickIfVisibleWeb;
    GridOperations.GetData getData;

    // 1. Navigate to '{{Otomasyon2Logout}}'
    driver.navigate().to(ProjectParameters.Otomasyon2Logout);

    // 2. Run Method Login
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = ProjectParameters.genelEmail;
    methodlogin.password = ProjectParameters.genelPassword;
    methodlogin.execute(driver);

    // 3. Move mouse to 'moveUstUyeYonetimi'
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 4. Click 'ustUyeYonetimi'
    by = By.xpath("//li[4]/a[. = '??YE Y??NET??M??']");
    driver.findElement(by).click();

    // 5. Click '??YE Y??NET??M??'
    by = By.xpath("//li[1]/a[. = '??YE Y??NET??M??']");
    driver.findElement(by).click();

    // 6. Type 'netahsilatotomasyon@yandex.com' in 'SearchVendorName'
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("netahsilatotomasyon@yandex.com");

    // 7. Click 'resultListelenen'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//body/ul//div");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 8. Click 'Listele'
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 9. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 10. Click '??deme'
    by = By.xpath("//a[. = '??deme']");
    driver.findElement(by).click();

    // 11. Switch to window '1'
    driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[1]);

    // 12. Click 'Masterpass Close button' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//div[@data-bind=\"visible: masterPassStep() == 'mp-update-identity'\"]//button[@type='button'][normalize-space()='??']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 13. Is 'Bireysel t??rk' visible?
    by = By.xpath("//strong[. = 'Bireysel t??rk']");
    driver.findElement(by).isDisplayed();

    // 14. Click 'KART KAYDI L??NK??'
    by = By.xpath("//a[. = 'KART KAYDI L??NK??']");
    driver.findElement(by).click();

    // 15. Click 'EmailTypeSelection (Unchecked)'
    by = By.cssSelector("#EmailTypeSelection:not(:checked)");
    driver.findElement(by).click();

    // 16. Click 'G??nder'
    by = By.xpath("//button[. = 'G??nder']");
    driver.findElement(by).click();

    // 17. Navigate to '{{Otomasyon2Logout}}'
    driver.navigate().to(ProjectParameters.Otomasyon2Logout);

    // 18. Run Method Login
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = "bireyselanabayi@otomasyon.com";
    methodlogin.password = password;
    methodlogin.execute(driver);

    // 19. Click 'KART KAYDI L??NK??'
    by = By.xpath("//a[. = 'KART KAYDI L??NK??']");
    driver.findElement(by).click();

    // 20. Click 'EmailTypeSelection (Unchecked)'
    by = By.cssSelector("#EmailTypeSelection:not(:checked)");
    driver.findElement(by).click();

    // 21. Click 'G??nder'
    by = By.xpath("//button[. = 'G??nder']");
    driver.findElement(by).click();

    // 22. Is '????leminiz ba??ar??yla tamamlanm????t??r' visible?
    by = By.xpath("//h4[. = '????leminiz ba??ar??yla tamamlanm????t??r']");
    driver.findElement(by).isDisplayed();

    // 23. Click 'Y??NET??C??'
    by = By.xpath("//a[. = 'Y??NET??C??']");
    driver.findElement(by).click();

    // 24. Move mouse to 'moveToIslemler'
    by = By.cssSelector("li[class='tag']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 25. Click '????LEMLER'
    by = By.cssSelector("a[title='????LEMLER']");
    driver.findElement(by).click();

    // 26. Click 'KART KAYDETME LINKI LISTELEME'
    by = By.xpath("//a[. = 'Kart Kaydetme Linki Listeleme']");
    driver.findElement(by).click();

    // 27. Run Get Data From Grid
    getData = GridOperations.getData("G??nderen","Bireysel","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

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
    return Stream.of(Arguments.of("https://otomasyon2.netahsilatdemo.com/","otomasyon@test.com","Kd!cyhz4"));
  }
}
