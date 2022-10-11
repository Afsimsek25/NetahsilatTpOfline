package netahsilat;

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

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C1483   Email order da tek ödeme seçeneği test edilmeli (işaretli ise bir kere ödenmeli,değilse her kullanıcı ayrı ayrı ödeyebilmeli)
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 09:52:37 GMT 2022.
 */
@DisplayName("C1483   Email order da tek ödeme seçeneği test edilmeli (işaretli ise bir kere ödenmeli,değilse her kullanıcı ayrı ayrı ödeyebilmeli)")
public class C1483 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C1483   Email order da tek ödeme seçeneği test edilmeli (işaretli ise bir kere ödenmeli,değilse her kullanıcı ayrı ayrı ödeyebilmeli)")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String mail, String url,
      String referansno, String OdemeLinki) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    WebExtensions.GetElementAttribute getElementAttribute;

    // 1. Navigate to 'file:///C:/TestProject/mail/C1482.html'
    GeneratedUtils.sleep(500);
    driver.navigate().to("file:///C:/TestProject/mail/C1482.html");

    // 2. Get 'href' attribute value on '[id="odemelinki"]'
    GeneratedUtils.sleep(500);
    getElementAttribute = WebExtensions.getElementAttribute("href");
    by = By.cssSelector("#odemelinki");
    getElementAttribute = (WebExtensions.GetElementAttribute)((ReportingDriver)driver).addons().execute(getElementAttribute, by, -1);
    OdemeLinki = String.valueOf(getElementAttribute.attributeValue);

    // 3. Navigate to '{{OdemeLinki}}'
    GeneratedUtils.sleep(500);
    driver.navigate().to(OdemeLinki);

    // 4. Does 'Hata: Bu email order aktif olmadığınd...' contain 'Hata: Bu email order aktif olmadığından ödeme yapılamaz'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//p[. = '\n                            Hata:  Bu email order aktif olmadığından ödeme yapılamaz \n                        ']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Hata: Bu email order aktif olmadığından ödeme yapılamaz"));

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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","Kd!cyhz4","","","",""));
  }
}
