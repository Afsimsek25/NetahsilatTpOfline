package netahsilat;

import io.testproject.addon.WebExtensions;
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

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C357 Kullanıcı Adı : (Boş) bırakılır. Giriş Butonuna Basılır.
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Sep 26 13:07:24 GMT 2022.
 */
@DisplayName("C357 Kullanıcı Adı : (Boş) bırakılır. Giriş Butonuna Basılır.")
public class C357 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C357 Kullanıcı Adı : (Boş) bırakılır. Giriş Butonuna Basılır.")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    WebExtensions.GetCssValue getCssValue;

    // 1. Navigate to '{{logOutUrl}}'
    GeneratedUtils.sleep(500);
    driver.navigate().to(ProjectParameters.logOutUrl);

    // 2. Type '{{genelPassword}}' in 'Password'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Password");
    driver.findElement(by).sendKeys(ProjectParameters.genelPassword);

    // 3. Click 'Giris'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#form-submit");
    driver.findElement(by).click();

    // 4. Get value of 'color' CSS property on 'txtUsesrName'
    /* Step is disabled
    GeneratedUtils.sleep(500);
    getCssValue = WebExtensions.getCssValue("color");
    by = By.cssSelector("label[for='UserName']");
    getCssValue = (WebExtensions.GetCssValue)((ReportingDriver)driver).addons().execute(getCssValue, by, -1);
    */
    // 5. Is 'UserName Input Validation Error' visible?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[class='input-validation-error'][id='UserName']");
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
