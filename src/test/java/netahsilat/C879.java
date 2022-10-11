package netahsilat;

import io.testproject.addon.TypeTextSlowly;
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
 * Test: C879 Ödeme sayfası Validasyon Hataları(yanlış kredi kartı girilmesi, ödeme seçeneği seçilmemesi vs.)
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 11:41:33 GMT 2022.
 */
@DisplayName("C879 Ödeme sayfası Validasyon Hataları(yanlış kredi kartı girilmesi, ödeme seçeneği seçilmemesi vs.)")
public class C879 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C879 Ödeme sayfası Validasyon Hataları(yanlış kredi kartı girilmesi, ödeme seçeneği seçilmemesi vs.)")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String randomNumber) throws
      Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodGeneldeme methodgeneldeme;
    MethodLogoutlogin methodlogoutlogin;
    MethodParametrikdemetypeTextWithDelay methodparametrikdemetypetextwithdelay;
    TypeTextSlowly.TypeTextWithControlledSpeed typeTextWithControlledSpeed;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Click 'Ödeme Ekranına Git1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = '\n                \n                Ödeme Ekranına Git\n            ']");
    driver.findElement(by).click();

    // 3. Run Method Genel Ödeme
    GeneratedUtils.sleep(500);
    methodgeneldeme = new MethodGeneldeme();
    methodgeneldeme.ApplicationURL = ApplicationURL;
    methodgeneldeme.execute(driver);

    // 4. Click 'odemeTalimatiOlustur'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[value='ÖDEME TALİMATI OLUŞTUR']");
    driver.findElement(by).click();

    // 5. Is 'Ödenecek tutar 0'dan büyük olmalıdır.' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = concat('Ödenecek tutar 0', \"'\", 'dan büyük olmalıdır.')]");
    driver.findElement(by).isDisplayed();

    // 6. Clear 'PureAmount' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#PureAmount");
    driver.findElement(by).clear();

    // 7. Type '1812,00' in 'PureAmount'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#PureAmount");
    driver.findElement(by).sendKeys("1812,00");

    // 8. Click 'AXESS Tek Çekim Posu'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("td[class*='commRate-20'] input");
    driver.findElement(by).click();

    // 9. Clear 'Kart üzerindeki isim2' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CardHolderName");
    driver.findElement(by).clear();

    // 10. Click 'odemeTalimatiOlustur'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[value='ÖDEME TALİMATI OLUŞTUR']");
    driver.findElement(by).click();

    // 11. Is 'Lütfen geçerli bir isim giriniz' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'Lütfen geçerli bir isim giriniz']");
    driver.findElement(by).isDisplayed();

    // 12. Type 'C879 Netahsilat UI' in 'Kart üzerindeki isim2'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CardHolderName");
    driver.findElement(by).sendKeys("C879 Netahsilat UI");

    // 13. Clear 'Kart No' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CardNumber");
    driver.findElement(by).clear();

    // 14. Type text to a TextField element with a delay between characters.
    GeneratedUtils.sleep(500);
    typeTextWithControlledSpeed = TypeTextSlowly.typeTextWithControlledSpeed("4355 0843 5508 4357",50);
    by = By.cssSelector("#CardNumber");
    typeTextWithControlledSpeed = (TypeTextSlowly.TypeTextWithControlledSpeed)((ReportingDriver)driver).addons().execute(typeTextWithControlledSpeed, by, -1);

    // 15. Move mouse to 'AXESS Tek Çekim Posu'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("td[class*='commRate-20'] input");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 16. Click 'AXESS Tek Çekim Posu'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("td[class*='commRate-20'] input");
    driver.findElement(by).click();

    // 17. Click 'odemeTalimatiOlustur'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[value='ÖDEME TALİMATI OLUŞTUR']");
    driver.findElement(by).click();

    // 18. Is 'Kart bilgileri hatalı veya eksik' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'Kart bilgileri hatalı veya eksik']");
    driver.findElement(by).isDisplayed();

    // 19. Clear 'Kart No' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CardNumber");
    driver.findElement(by).clear();

    // 20. Type text to a TextField element with a delay between characters.
    GeneratedUtils.sleep(500);
    typeTextWithControlledSpeed = TypeTextSlowly.typeTextWithControlledSpeed("4355084355084358",50);
    by = By.cssSelector("#CardNumber");
    typeTextWithControlledSpeed = (TypeTextSlowly.TypeTextWithControlledSpeed)((ReportingDriver)driver).addons().execute(typeTextWithControlledSpeed, by, -1);

    // 21. Clear 'Ay / Yıl' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CardExpireDate");
    driver.findElement(by).clear();

    // 22. Type text to a TextField element with a delay between characters.
    GeneratedUtils.sleep(500);
    typeTextWithControlledSpeed = TypeTextSlowly.typeTextWithControlledSpeed("12/264",50);
    by = By.cssSelector("#CardExpireDate");
    typeTextWithControlledSpeed = (TypeTextSlowly.TypeTextWithControlledSpeed)((ReportingDriver)driver).addons().execute(typeTextWithControlledSpeed, by, -1);

    // 23. Move mouse to 'AXESS Tek Çekim Posu'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("td[class*='commRate-20'] input");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 24. Click 'AXESS Tek Çekim Posu'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("td[class*='commRate-20'] input");
    driver.findElement(by).click();

    // 25. Click 'odemeTalimatiOlustur'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[value='ÖDEME TALİMATI OLUŞTUR']");
    driver.findElement(by).click();

    // 26. Is 'Kredi Kartı Son Kullanma Tarihi Geçer...' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'Kredi Kartı Son Kullanma Tarihi Geçersiz.']");
    driver.findElement(by).isDisplayed();

    // 27. Clear 'Ay / Yıl' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CardExpireDate");
    driver.findElement(by).clear();

    // 28. Type text to a TextField element with a delay between characters.
    GeneratedUtils.sleep(500);
    typeTextWithControlledSpeed = TypeTextSlowly.typeTextWithControlledSpeed("12/30",50);
    by = By.cssSelector("#CardExpireDate");
    typeTextWithControlledSpeed = (TypeTextSlowly.TypeTextWithControlledSpeed)((ReportingDriver)driver).addons().execute(typeTextWithControlledSpeed, by, -1);

    // 29. Clear 'CVV' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CardCvv");
    driver.findElement(by).clear();

    // 30. Type '1234' in 'CVV'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CardCvv");
    driver.findElement(by).sendKeys("1234");

    // 31. Click 'odemeTalimatiOlustur'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[value='ÖDEME TALİMATI OLUŞTUR']");
    driver.findElement(by).click();

    // 32. Is 'Lütfen CVC Numarasını Giriniz' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'Lütfen CVC Numarasını Giriniz']");
    driver.findElement(by).isDisplayed();

    // 33. Refresh
    GeneratedUtils.sleep(500);
    driver.navigate().refresh();

    // 34. Clear 'PureAmount' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#PureAmount");
    driver.findElement(by).clear();

    // 35. Type '1812,00' in 'PureAmount'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#PureAmount");
    driver.findElement(by).sendKeys("1812,00");

    // 36. Run Method Parametrik Ödeme (Type text with delay)
    GeneratedUtils.sleep(500);
    methodparametrikdemetypetextwithdelay = new MethodParametrikdemetypeTextWithDelay();
    methodparametrikdemetypetextwithdelay.kartNo = ProjectParameters.genelKartNo;
    methodparametrikdemetypetextwithdelay.CVV = ProjectParameters.genelKartCVV;
    methodparametrikdemetypetextwithdelay.ayYil = ProjectParameters.genelKartAyYil;
    methodparametrikdemetypetextwithdelay.ApplicationURL = "https://otomasyon.netahsilatdemo.com/Account/LogOff";
    methodparametrikdemetypetextwithdelay.execute(driver);

    // 37. Click 'odemeTalimatiOlustur'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[value='ÖDEME TALİMATI OLUŞTUR']");
    driver.findElement(by).click();

    // 38. Is 'Lütfen taksit seçeneklerinden birini ...' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[. = 'Lütfen taksit seçeneklerinden birini seçiniz.']");
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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","Kd!cyhz4",""));
  }
}
