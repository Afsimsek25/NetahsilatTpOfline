package netahsilat;

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

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C3296 Kullanıcı sözleşmesi eski haline getirme
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 11:09:26 GMT 2022.
 */
@DisplayName("C3296 Kullanıcı sözleşmesi eski haline getirme")
public class C3296 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C3296 Kullanıcı sözleşmesi eski haline getirme")
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
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = userName;
    methodlogoutlogin.password = password;
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

    // 5. Click 'Kullanıcı Sözleşmesi'
    by = By.xpath("//a[. = '\n            Kullanıcı Sözleşmesi\n        ']");
    driver.findElement(by).click();

    // 6. Click 'Kullanıcılar ilk girişlerinde, şifrelerini değiştirsinler(Unchecked)' if it's visible
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("0");
    by = By.xpath("//label[normalize-space()='Kullanıcılar ilk girişlerinde, şifrelerini değiştirsinler']/../..//..//span[@class='jquery-safari-checkbox']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 7. Click 'Kullanıcılar ilk girişlerinde, üyelik talimat formunu onaylasınlar (Checked)' if it's visible
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("0");
    by = By.xpath("//label[normalize-space()='Kullanıcılar ilk girişlerinde, üyelik talimat formunu onaylasınlar']/../..//..//span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 8. Click 'Kaydet1'
    by = By.cssSelector("#kaydet");
    driver.findElement(by).click();

    // 9. Is 'Kullanıcı Sözleşmesi Başarıyla kayded...' visible?
    by = By.xpath("//li[. = 'Kullanıcı Sözleşmesi Başarıyla kaydedildi.']");
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
