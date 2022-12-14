package netahsilat;

import io.testproject.addon.JSActions;
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

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C1920-Liselerde bayi/kullanıcı adı kısmında kurumsal firma unvanı maskeli gelmemelidir
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Oct 10 08:38:45 GMT 2022.
 */
@DisplayName("C1920-Liselerde bayi/kullanıcı adı kısmında kurumsal firma unvanı maskeli gelmemelidir")
public class C1920 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C1920-Liselerde bayi/kullanıcı adı kısmında kurumsal firma unvanı maskeli gelmemelidir")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String password, String userName, String ApplicationURL, String text,
      String currentDateTime) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodRefreshLoadingControl methodrefreshloadingcontrol;
    MethodLogoutlogin methodlogoutlogin;
    JSActions.ClickAction clickAction;

    // 1. Run Method Logout&Login
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ProjectParameters.Otomasyon3Logout;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);
    currentDateTime = String.valueOf(methodlogoutlogin.currentDateTime);

    // 2. Click 'altUyeYonetimi'
    clickAction = JSActions.getClickAction();
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 3. This test was auto generated from steps of the 'C1909-Listelerde ki verilerin maskelenmesi' test
    methodrefreshloadingcontrol = new MethodRefreshLoadingControl();
    methodrefreshloadingcontrol.execute(driver);

    // 4. Type 'Kurumsal' in 'SearchVendorNameVN'
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("Kurumsal");

    // 5. Click 'Kurumsal Firma'
    by = By.xpath("//div[. = 'Kurumsal Firma (E-Çözüm),,4********6']");
    driver.findElement(by).click();

    // 6. Click 'btnListele'
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 7. This test was auto generated from steps of the 'C1909-Listelerde ki verilerin maskelenmesi' test
    methodrefreshloadingcontrol = new MethodRefreshLoadingControl();
    methodrefreshloadingcontrol.execute(driver);

    // 8. Does 'bayi_kullaniciadiTCELL' contain 'Kurumsal Firma'?
    by = By.xpath("//*[@id=\"VendorListGrid\"]/Table/Tbody/tr[1]/td[4]");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Kurumsal Firma"));

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
    return Stream.of(Arguments.of("Kd!cyhz4","otomasyon@test.com","https://otomasyon.netahsilatdemo.com/Account/LogOff","",""));
  }
}
